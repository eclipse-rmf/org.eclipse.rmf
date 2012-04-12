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
package org.eclipse.rmf.reqif10.datatypes;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.rmf.reqif10.datatypes.DatatypesFactory
 * @model kind="package"
 * @generated
 */
public interface DatatypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datatypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/1999/xhtml/datatypes/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "datatypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatatypesPackage eINSTANCE = org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0 <em>Frame Target Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember0()
	 * @generated
	 */
	int FRAME_TARGET_MEMBER0 = 0;

	/**
	 * The meta object id for the '<em>CDATA</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCDATA()
	 * @generated
	 */
	int CDATA = 1;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 2;

	/**
	 * The meta object id for the '<em>Charset</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharset()
	 * @generated
	 */
	int CHARSET = 3;

	/**
	 * The meta object id for the '<em>Charsets</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharsets()
	 * @generated
	 */
	int CHARSETS = 4;

	/**
	 * The meta object id for the '<em>Color</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 5;

	/**
	 * The meta object id for the '<em>Color Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getColorMember1()
	 * @generated
	 */
	int COLOR_MEMBER1 = 6;

	/**
	 * The meta object id for the '<em>Content Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 7;

	/**
	 * The meta object id for the '<em>Content Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getContentTypes()
	 * @generated
	 */
	int CONTENT_TYPES = 8;

	/**
	 * The meta object id for the '<em>CURIE</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCURIE()
	 * @generated
	 */
	int CURIE = 9;

	/**
	 * The meta object id for the '<em>CURI Es</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCURIEs()
	 * @generated
	 */
	int CURI_ES = 10;

	/**
	 * The meta object id for the '<em>Datetime</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 11;

	/**
	 * The meta object id for the '<em>FPI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFPI()
	 * @generated
	 */
	int FPI = 12;

	/**
	 * The meta object id for the '<em>Frame Target</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTarget()
	 * @generated
	 */
	int FRAME_TARGET = 13;

	/**
	 * The meta object id for the '<em>Frame Target Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember0Object()
	 * @generated
	 */
	int FRAME_TARGET_MEMBER0_OBJECT = 14;

	/**
	 * The meta object id for the '<em>Frame Target Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember1()
	 * @generated
	 */
	int FRAME_TARGET_MEMBER1 = 15;

	/**
	 * The meta object id for the '<em>Language Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLanguageCode()
	 * @generated
	 */
	int LANGUAGE_CODE = 16;

	/**
	 * The meta object id for the '<em>Language Codes</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLanguageCodes()
	 * @generated
	 */
	int LANGUAGE_CODES = 17;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 18;

	/**
	 * The meta object id for the '<em>Length Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLengthMember1()
	 * @generated
	 */
	int LENGTH_MEMBER1 = 19;

	/**
	 * The meta object id for the '<em>Link Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLinkTypes()
	 * @generated
	 */
	int LINK_TYPES = 20;

	/**
	 * The meta object id for the '<em>Media Desc</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMediaDesc()
	 * @generated
	 */
	int MEDIA_DESC = 21;

	/**
	 * The meta object id for the '<em>Multi Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLength()
	 * @generated
	 */
	int MULTI_LENGTH = 22;

	/**
	 * The meta object id for the '<em>Multi Length Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLengthMember1()
	 * @generated
	 */
	int MULTI_LENGTH_MEMBER1 = 23;

	/**
	 * The meta object id for the '<em>Multi Lengths</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLengths()
	 * @generated
	 */
	int MULTI_LENGTHS = 24;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 25;

	/**
	 * The meta object id for the '<em>Pixels</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getPixels()
	 * @generated
	 */
	int PIXELS = 26;

	/**
	 * The meta object id for the '<em>Safe CURIE</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getSafeCURIE()
	 * @generated
	 */
	int SAFE_CURIE = 27;

	/**
	 * The meta object id for the '<em>Safe CURI Es</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getSafeCURIEs()
	 * @generated
	 */
	int SAFE_CURI_ES = 28;

	/**
	 * The meta object id for the '<em>Script</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 29;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 30;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURI()
	 * @generated
	 */
	int URI = 31;

	/**
	 * The meta object id for the '<em>UR Ior Safe CURIE</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIorSafeCURIE()
	 * @generated
	 */
	int UR_IOR_SAFE_CURIE = 32;

	/**
	 * The meta object id for the '<em>UR Ior Safe CURI Es</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIorSafeCURIEs()
	 * @generated
	 */
	int UR_IOR_SAFE_CURI_ES = 33;

	/**
	 * The meta object id for the '<em>URIREF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIREF()
	 * @generated
	 */
	int URIREF = 34;

	/**
	 * The meta object id for the '<em>UR Is</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIs()
	 * @generated
	 */
	int UR_IS = 35;


	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0 <em>Frame Target Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frame Target Member0</em>'.
	 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
	 * @generated
	 */
	EEnum getFrameTargetMember0();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>CDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CDATA</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CDATA' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCDATA();

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
	 * Returns the meta object for data type '{@link java.util.List <em>Charsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charsets</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Charsets' itemType='Charset'"
	 * @generated
	 */
	EDataType getCharsets();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Color' memberTypes='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN Color_._member_._1'"
	 * @generated
	 */
	EDataType getColor();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Color_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='#[0-9a-fA-F]{3}([0-9a-fA-F]{3})?'"
	 * @generated
	 */
	EDataType getColorMember1();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>CURIE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CURIE</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='CURIE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' pattern='(([\\i-[:]][\\c-[:]]*)?:)?.+'"
	 * @generated
	 */
	EDataType getCURIE();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>CURI Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>CURI Es</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='CURIEs' itemType='CURIE'"
	 * @generated
	 */
	EDataType getCURIEs();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>FPI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>FPI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FPI' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
	 * @generated
	 */
	EDataType getFPI();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Frame Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frame Target</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='FrameTarget' memberTypes='FrameTarget_._member_._0 FrameTarget_._member_._1'"
	 * @generated
	 */
	EDataType getFrameTarget();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0 <em>Frame Target Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frame Target Member0 Object</em>'.
	 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
	 * @model instanceClass="org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0"
	 *        extendedMetaData="name='FrameTarget_._member_._0:Object' baseType='FrameTarget_._member_._0'"
	 * @generated
	 */
	EDataType getFrameTargetMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Frame Target Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frame Target Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='FrameTarget_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[a-zA-Z].*'"
	 * @generated
	 */
	EDataType getFrameTargetMember1();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>Language Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Codes</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LanguageCodes' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getLanguageCodes();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='Length' memberTypes='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger Length_._member_._1'"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Length Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Length_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\d+[%25]|\\d*\\.\\d+[%25]'"
	 * @generated
	 */
	EDataType getLengthMember1();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Link Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Link Types</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='LinkTypes' itemType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN'"
	 * @generated
	 */
	EDataType getLinkTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Media Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Media Desc</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MediaDesc' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getMediaDesc();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Multi Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Length</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='MultiLength' memberTypes='Length MultiLength_._member_._1'"
	 * @generated
	 */
	EDataType getMultiLength();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Multi Length Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Length Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MultiLength_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='\\d*\\*'"
	 * @generated
	 */
	EDataType getMultiLengthMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Multi Lengths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Lengths</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MultiLengths' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getMultiLengths();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Number' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
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
	 * Returns the meta object for data type '{@link java.lang.String <em>Safe CURIE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Safe CURIE</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SafeCURIE' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='3' pattern='\\[(([\\i-[:]][\\c-[:]]*)?:)?.+\\]'"
	 * @generated
	 */
	EDataType getSafeCURIE();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Safe CURI Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Safe CURI Es</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='SafeCURIEs' itemType='SafeCURIE'"
	 * @generated
	 */
	EDataType getSafeCURIEs();

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
	 * Returns the meta object for data type '{@link java.lang.String <em>UR Ior Safe CURIE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UR Ior Safe CURIE</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URIorSafeCURIE' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI SafeCURIE'"
	 * @generated
	 */
	EDataType getURIorSafeCURIE();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>UR Ior Safe CURI Es</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UR Ior Safe CURI Es</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='URIorSafeCURIEs' itemType='URIorSafeCURIE'"
	 * @generated
	 */
	EDataType getURIorSafeCURIEs();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URIREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URIREF</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URIREF' baseType='http://www.eclipse.org/emf/2003/XMLType#string' minLength='1' pattern='#\\c*'"
	 * @generated
	 */
	EDataType getURIREF();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>UR Is</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='URIs' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getURIs();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatatypesFactory getDatatypesFactory();

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
		 * The meta object literal for the '{@link org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0 <em>Frame Target Member0</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember0()
		 * @generated
		 */
		EEnum FRAME_TARGET_MEMBER0 = eINSTANCE.getFrameTargetMember0();

		/**
		 * The meta object literal for the '<em>CDATA</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCDATA()
		 * @generated
		 */
		EDataType CDATA = eINSTANCE.getCDATA();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Charset</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharset()
		 * @generated
		 */
		EDataType CHARSET = eINSTANCE.getCharset();

		/**
		 * The meta object literal for the '<em>Charsets</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCharsets()
		 * @generated
		 */
		EDataType CHARSETS = eINSTANCE.getCharsets();

		/**
		 * The meta object literal for the '<em>Color</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getColor()
		 * @generated
		 */
		EDataType COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '<em>Color Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getColorMember1()
		 * @generated
		 */
		EDataType COLOR_MEMBER1 = eINSTANCE.getColorMember1();

		/**
		 * The meta object literal for the '<em>Content Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getContentType()
		 * @generated
		 */
		EDataType CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em>Content Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getContentTypes()
		 * @generated
		 */
		EDataType CONTENT_TYPES = eINSTANCE.getContentTypes();

		/**
		 * The meta object literal for the '<em>CURIE</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCURIE()
		 * @generated
		 */
		EDataType CURIE = eINSTANCE.getCURIE();

		/**
		 * The meta object literal for the '<em>CURI Es</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getCURIEs()
		 * @generated
		 */
		EDataType CURI_ES = eINSTANCE.getCURIEs();

		/**
		 * The meta object literal for the '<em>Datetime</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getDatetime()
		 * @generated
		 */
		EDataType DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '<em>FPI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFPI()
		 * @generated
		 */
		EDataType FPI = eINSTANCE.getFPI();

		/**
		 * The meta object literal for the '<em>Frame Target</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTarget()
		 * @generated
		 */
		EDataType FRAME_TARGET = eINSTANCE.getFrameTarget();

		/**
		 * The meta object literal for the '<em>Frame Target Member0 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember0Object()
		 * @generated
		 */
		EDataType FRAME_TARGET_MEMBER0_OBJECT = eINSTANCE.getFrameTargetMember0Object();

		/**
		 * The meta object literal for the '<em>Frame Target Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getFrameTargetMember1()
		 * @generated
		 */
		EDataType FRAME_TARGET_MEMBER1 = eINSTANCE.getFrameTargetMember1();

		/**
		 * The meta object literal for the '<em>Language Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLanguageCode()
		 * @generated
		 */
		EDataType LANGUAGE_CODE = eINSTANCE.getLanguageCode();

		/**
		 * The meta object literal for the '<em>Language Codes</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLanguageCodes()
		 * @generated
		 */
		EDataType LANGUAGE_CODES = eINSTANCE.getLanguageCodes();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Length Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLengthMember1()
		 * @generated
		 */
		EDataType LENGTH_MEMBER1 = eINSTANCE.getLengthMember1();

		/**
		 * The meta object literal for the '<em>Link Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getLinkTypes()
		 * @generated
		 */
		EDataType LINK_TYPES = eINSTANCE.getLinkTypes();

		/**
		 * The meta object literal for the '<em>Media Desc</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMediaDesc()
		 * @generated
		 */
		EDataType MEDIA_DESC = eINSTANCE.getMediaDesc();

		/**
		 * The meta object literal for the '<em>Multi Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLength()
		 * @generated
		 */
		EDataType MULTI_LENGTH = eINSTANCE.getMultiLength();

		/**
		 * The meta object literal for the '<em>Multi Length Member1</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLengthMember1()
		 * @generated
		 */
		EDataType MULTI_LENGTH_MEMBER1 = eINSTANCE.getMultiLengthMember1();

		/**
		 * The meta object literal for the '<em>Multi Lengths</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getMultiLengths()
		 * @generated
		 */
		EDataType MULTI_LENGTHS = eINSTANCE.getMultiLengths();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Pixels</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getPixels()
		 * @generated
		 */
		EDataType PIXELS = eINSTANCE.getPixels();

		/**
		 * The meta object literal for the '<em>Safe CURIE</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getSafeCURIE()
		 * @generated
		 */
		EDataType SAFE_CURIE = eINSTANCE.getSafeCURIE();

		/**
		 * The meta object literal for the '<em>Safe CURI Es</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getSafeCURIEs()
		 * @generated
		 */
		EDataType SAFE_CURI_ES = eINSTANCE.getSafeCURIEs();

		/**
		 * The meta object literal for the '<em>Script</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getScript()
		 * @generated
		 */
		EDataType SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>UR Ior Safe CURIE</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIorSafeCURIE()
		 * @generated
		 */
		EDataType UR_IOR_SAFE_CURIE = eINSTANCE.getURIorSafeCURIE();

		/**
		 * The meta object literal for the '<em>UR Ior Safe CURI Es</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIorSafeCURIEs()
		 * @generated
		 */
		EDataType UR_IOR_SAFE_CURI_ES = eINSTANCE.getURIorSafeCURIEs();

		/**
		 * The meta object literal for the '<em>URIREF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIREF()
		 * @generated
		 */
		EDataType URIREF = eINSTANCE.getURIREF();

		/**
		 * The meta object literal for the '<em>UR Is</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.reqif10.datatypes.impl.DatatypesPackageImpl#getURIs()
		 * @generated
		 */
		EDataType UR_IS = eINSTANCE.getURIs();

	}

} //DatatypesPackage
