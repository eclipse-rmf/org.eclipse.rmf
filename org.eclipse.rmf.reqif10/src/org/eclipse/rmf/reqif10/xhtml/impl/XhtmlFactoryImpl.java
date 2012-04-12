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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.rmf.reqif10.xhtml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlFactoryImpl extends EFactoryImpl implements XhtmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XhtmlFactory init() {
		try {
			XhtmlFactory theXhtmlFactory = (XhtmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.w3.org/1999/xhtml"); 
			if (theXhtmlFactory != null) {
				return theXhtmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XhtmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XhtmlPackage.XHTML_ABBR_TYPE: return createXhtmlAbbrType();
			case XhtmlPackage.XHTML_ACRONYM_TYPE: return createXhtmlAcronymType();
			case XhtmlPackage.XHTML_ADDRESS_TYPE: return createXhtmlAddressType();
			case XhtmlPackage.XHTML_ATYPE: return createXhtmlAType();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE: return createXhtmlBlockquoteType();
			case XhtmlPackage.XHTML_BR_TYPE: return createXhtmlBrType();
			case XhtmlPackage.XHTML_CAPTION_TYPE: return createXhtmlCaptionType();
			case XhtmlPackage.XHTML_CITE_TYPE: return createXhtmlCiteType();
			case XhtmlPackage.XHTML_CODE_TYPE: return createXhtmlCodeType();
			case XhtmlPackage.XHTML_COLGROUP_TYPE: return createXhtmlColgroupType();
			case XhtmlPackage.XHTML_COL_TYPE: return createXhtmlColType();
			case XhtmlPackage.XHTML_DD_TYPE: return createXhtmlDdType();
			case XhtmlPackage.XHTML_DFN_TYPE: return createXhtmlDfnType();
			case XhtmlPackage.XHTML_DIV_TYPE: return createXhtmlDivType();
			case XhtmlPackage.XHTML_DL_TYPE: return createXhtmlDlType();
			case XhtmlPackage.XHTML_DT_TYPE: return createXhtmlDtType();
			case XhtmlPackage.XHTML_EDIT_TYPE: return createXhtmlEditType();
			case XhtmlPackage.XHTML_EM_TYPE: return createXhtmlEmType();
			case XhtmlPackage.XHTML_H1_TYPE: return createXhtmlH1Type();
			case XhtmlPackage.XHTML_H2_TYPE: return createXhtmlH2Type();
			case XhtmlPackage.XHTML_H3_TYPE: return createXhtmlH3Type();
			case XhtmlPackage.XHTML_H4_TYPE: return createXhtmlH4Type();
			case XhtmlPackage.XHTML_H5_TYPE: return createXhtmlH5Type();
			case XhtmlPackage.XHTML_H6_TYPE: return createXhtmlH6Type();
			case XhtmlPackage.XHTML_HEADING_TYPE: return createXhtmlHeadingType();
			case XhtmlPackage.XHTML_HR_TYPE: return createXhtmlHrType();
			case XhtmlPackage.XHTML_INL_PRES_TYPE: return createXhtmlInlPresType();
			case XhtmlPackage.XHTML_KBD_TYPE: return createXhtmlKbdType();
			case XhtmlPackage.XHTML_LI_TYPE: return createXhtmlLiType();
			case XhtmlPackage.XHTML_OBJECT_TYPE: return createXhtmlObjectType();
			case XhtmlPackage.XHTML_OL_TYPE: return createXhtmlOlType();
			case XhtmlPackage.XHTML_PARAM_TYPE: return createXhtmlParamType();
			case XhtmlPackage.XHTML_PRE_TYPE: return createXhtmlPreType();
			case XhtmlPackage.XHTML_PTYPE: return createXhtmlPType();
			case XhtmlPackage.XHTML_QTYPE: return createXhtmlQType();
			case XhtmlPackage.XHTML_SAMP_TYPE: return createXhtmlSampType();
			case XhtmlPackage.XHTML_SPAN_TYPE: return createXhtmlSpanType();
			case XhtmlPackage.XHTML_STRONG_TYPE: return createXhtmlStrongType();
			case XhtmlPackage.XHTML_TABLE_TYPE: return createXhtmlTableType();
			case XhtmlPackage.XHTML_TBODY_TYPE: return createXhtmlTbodyType();
			case XhtmlPackage.XHTML_TD_TYPE: return createXhtmlTdType();
			case XhtmlPackage.XHTML_TFOOT_TYPE: return createXhtmlTfootType();
			case XhtmlPackage.XHTML_THEAD_TYPE: return createXhtmlTheadType();
			case XhtmlPackage.XHTML_TH_TYPE: return createXhtmlThType();
			case XhtmlPackage.XHTML_TR_TYPE: return createXhtmlTrType();
			case XhtmlPackage.XHTML_UL_TYPE: return createXhtmlUlType();
			case XhtmlPackage.XHTML_VAR_TYPE: return createXhtmlVarType();
			case XhtmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.DECLARE_TYPE:
				return createDeclareTypeFromString(eDataType, initialValue);
			case XhtmlPackage.FRAME_TYPE:
				return createFrameTypeFromString(eDataType, initialValue);
			case XhtmlPackage.RULES_TYPE:
				return createRulesTypeFromString(eDataType, initialValue);
			case XhtmlPackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case XhtmlPackage.VALUETYPE_TYPE:
				return createValuetypeTypeFromString(eDataType, initialValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.DECLARE_TYPE_OBJECT:
				return createDeclareTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.FRAME_TYPE_OBJECT:
				return createFrameTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.RULES_TYPE_OBJECT:
				return createRulesTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			case XhtmlPackage.VALUETYPE_TYPE_OBJECT:
				return createValuetypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XhtmlPackage.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.DECLARE_TYPE:
				return convertDeclareTypeToString(eDataType, instanceValue);
			case XhtmlPackage.FRAME_TYPE:
				return convertFrameTypeToString(eDataType, instanceValue);
			case XhtmlPackage.RULES_TYPE:
				return convertRulesTypeToString(eDataType, instanceValue);
			case XhtmlPackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case XhtmlPackage.VALUETYPE_TYPE:
				return convertValuetypeTypeToString(eDataType, instanceValue);
			case XhtmlPackage.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.DECLARE_TYPE_OBJECT:
				return convertDeclareTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.FRAME_TYPE_OBJECT:
				return convertFrameTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.RULES_TYPE_OBJECT:
				return convertRulesTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			case XhtmlPackage.VALUETYPE_TYPE_OBJECT:
				return convertValuetypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAbbrType createXhtmlAbbrType() {
		XhtmlAbbrTypeImpl xhtmlAbbrType = new XhtmlAbbrTypeImpl();
		return xhtmlAbbrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAcronymType createXhtmlAcronymType() {
		XhtmlAcronymTypeImpl xhtmlAcronymType = new XhtmlAcronymTypeImpl();
		return xhtmlAcronymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAddressType createXhtmlAddressType() {
		XhtmlAddressTypeImpl xhtmlAddressType = new XhtmlAddressTypeImpl();
		return xhtmlAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlAType createXhtmlAType() {
		XhtmlATypeImpl xhtmlAType = new XhtmlATypeImpl();
		return xhtmlAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlBlockquoteType createXhtmlBlockquoteType() {
		XhtmlBlockquoteTypeImpl xhtmlBlockquoteType = new XhtmlBlockquoteTypeImpl();
		return xhtmlBlockquoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlBrType createXhtmlBrType() {
		XhtmlBrTypeImpl xhtmlBrType = new XhtmlBrTypeImpl();
		return xhtmlBrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlCaptionType createXhtmlCaptionType() {
		XhtmlCaptionTypeImpl xhtmlCaptionType = new XhtmlCaptionTypeImpl();
		return xhtmlCaptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlCiteType createXhtmlCiteType() {
		XhtmlCiteTypeImpl xhtmlCiteType = new XhtmlCiteTypeImpl();
		return xhtmlCiteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlCodeType createXhtmlCodeType() {
		XhtmlCodeTypeImpl xhtmlCodeType = new XhtmlCodeTypeImpl();
		return xhtmlCodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlColgroupType createXhtmlColgroupType() {
		XhtmlColgroupTypeImpl xhtmlColgroupType = new XhtmlColgroupTypeImpl();
		return xhtmlColgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlColType createXhtmlColType() {
		XhtmlColTypeImpl xhtmlColType = new XhtmlColTypeImpl();
		return xhtmlColType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlDdType createXhtmlDdType() {
		XhtmlDdTypeImpl xhtmlDdType = new XhtmlDdTypeImpl();
		return xhtmlDdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlDfnType createXhtmlDfnType() {
		XhtmlDfnTypeImpl xhtmlDfnType = new XhtmlDfnTypeImpl();
		return xhtmlDfnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlDivType createXhtmlDivType() {
		XhtmlDivTypeImpl xhtmlDivType = new XhtmlDivTypeImpl();
		return xhtmlDivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlDlType createXhtmlDlType() {
		XhtmlDlTypeImpl xhtmlDlType = new XhtmlDlTypeImpl();
		return xhtmlDlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlDtType createXhtmlDtType() {
		XhtmlDtTypeImpl xhtmlDtType = new XhtmlDtTypeImpl();
		return xhtmlDtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlEditType createXhtmlEditType() {
		XhtmlEditTypeImpl xhtmlEditType = new XhtmlEditTypeImpl();
		return xhtmlEditType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlEmType createXhtmlEmType() {
		XhtmlEmTypeImpl xhtmlEmType = new XhtmlEmTypeImpl();
		return xhtmlEmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH1Type createXhtmlH1Type() {
		XhtmlH1TypeImpl xhtmlH1Type = new XhtmlH1TypeImpl();
		return xhtmlH1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH2Type createXhtmlH2Type() {
		XhtmlH2TypeImpl xhtmlH2Type = new XhtmlH2TypeImpl();
		return xhtmlH2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH3Type createXhtmlH3Type() {
		XhtmlH3TypeImpl xhtmlH3Type = new XhtmlH3TypeImpl();
		return xhtmlH3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH4Type createXhtmlH4Type() {
		XhtmlH4TypeImpl xhtmlH4Type = new XhtmlH4TypeImpl();
		return xhtmlH4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH5Type createXhtmlH5Type() {
		XhtmlH5TypeImpl xhtmlH5Type = new XhtmlH5TypeImpl();
		return xhtmlH5Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlH6Type createXhtmlH6Type() {
		XhtmlH6TypeImpl xhtmlH6Type = new XhtmlH6TypeImpl();
		return xhtmlH6Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlHeadingType createXhtmlHeadingType() {
		XhtmlHeadingTypeImpl xhtmlHeadingType = new XhtmlHeadingTypeImpl();
		return xhtmlHeadingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlHrType createXhtmlHrType() {
		XhtmlHrTypeImpl xhtmlHrType = new XhtmlHrTypeImpl();
		return xhtmlHrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlInlPresType createXhtmlInlPresType() {
		XhtmlInlPresTypeImpl xhtmlInlPresType = new XhtmlInlPresTypeImpl();
		return xhtmlInlPresType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlKbdType createXhtmlKbdType() {
		XhtmlKbdTypeImpl xhtmlKbdType = new XhtmlKbdTypeImpl();
		return xhtmlKbdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlLiType createXhtmlLiType() {
		XhtmlLiTypeImpl xhtmlLiType = new XhtmlLiTypeImpl();
		return xhtmlLiType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlObjectType createXhtmlObjectType() {
		XhtmlObjectTypeImpl xhtmlObjectType = new XhtmlObjectTypeImpl();
		return xhtmlObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlOlType createXhtmlOlType() {
		XhtmlOlTypeImpl xhtmlOlType = new XhtmlOlTypeImpl();
		return xhtmlOlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlParamType createXhtmlParamType() {
		XhtmlParamTypeImpl xhtmlParamType = new XhtmlParamTypeImpl();
		return xhtmlParamType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlPreType createXhtmlPreType() {
		XhtmlPreTypeImpl xhtmlPreType = new XhtmlPreTypeImpl();
		return xhtmlPreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlPType createXhtmlPType() {
		XhtmlPTypeImpl xhtmlPType = new XhtmlPTypeImpl();
		return xhtmlPType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlQType createXhtmlQType() {
		XhtmlQTypeImpl xhtmlQType = new XhtmlQTypeImpl();
		return xhtmlQType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlSampType createXhtmlSampType() {
		XhtmlSampTypeImpl xhtmlSampType = new XhtmlSampTypeImpl();
		return xhtmlSampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlSpanType createXhtmlSpanType() {
		XhtmlSpanTypeImpl xhtmlSpanType = new XhtmlSpanTypeImpl();
		return xhtmlSpanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlStrongType createXhtmlStrongType() {
		XhtmlStrongTypeImpl xhtmlStrongType = new XhtmlStrongTypeImpl();
		return xhtmlStrongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTableType createXhtmlTableType() {
		XhtmlTableTypeImpl xhtmlTableType = new XhtmlTableTypeImpl();
		return xhtmlTableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTbodyType createXhtmlTbodyType() {
		XhtmlTbodyTypeImpl xhtmlTbodyType = new XhtmlTbodyTypeImpl();
		return xhtmlTbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTdType createXhtmlTdType() {
		XhtmlTdTypeImpl xhtmlTdType = new XhtmlTdTypeImpl();
		return xhtmlTdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTfootType createXhtmlTfootType() {
		XhtmlTfootTypeImpl xhtmlTfootType = new XhtmlTfootTypeImpl();
		return xhtmlTfootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTheadType createXhtmlTheadType() {
		XhtmlTheadTypeImpl xhtmlTheadType = new XhtmlTheadTypeImpl();
		return xhtmlTheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlThType createXhtmlThType() {
		XhtmlThTypeImpl xhtmlThType = new XhtmlThTypeImpl();
		return xhtmlThType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlTrType createXhtmlTrType() {
		XhtmlTrTypeImpl xhtmlTrType = new XhtmlTrTypeImpl();
		return xhtmlTrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlUlType createXhtmlUlType() {
		XhtmlUlTypeImpl xhtmlUlType = new XhtmlUlTypeImpl();
		return xhtmlUlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlVarType createXhtmlVarType() {
		XhtmlVarTypeImpl xhtmlVarType = new XhtmlVarTypeImpl();
		return xhtmlVarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareType createDeclareTypeFromString(EDataType eDataType, String initialValue) {
		DeclareType result = DeclareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeFromString(EDataType eDataType, String initialValue) {
		FrameType result = FrameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeFromString(EDataType eDataType, String initialValue) {
		RulesType result = RulesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuetypeType createValuetypeTypeFromString(EDataType eDataType, String initialValue) {
		ValuetypeType result = ValuetypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuetypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(XhtmlPackage.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(XhtmlPackage.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareType createDeclareTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeclareTypeFromString(XhtmlPackage.eINSTANCE.getDeclareType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclareTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeclareTypeToString(XhtmlPackage.eINSTANCE.getDeclareType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameType createFrameTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFrameTypeFromString(XhtmlPackage.eINSTANCE.getFrameType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFrameTypeToString(XhtmlPackage.eINSTANCE.getFrameType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesType createRulesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRulesTypeFromString(XhtmlPackage.eINSTANCE.getRulesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRulesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRulesTypeToString(XhtmlPackage.eINSTANCE.getRulesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(XhtmlPackage.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(XhtmlPackage.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(XhtmlPackage.eINSTANCE.getValignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(XhtmlPackage.eINSTANCE.getValignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuetypeType createValuetypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValuetypeTypeFromString(XhtmlPackage.eINSTANCE.getValuetypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuetypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValuetypeTypeToString(XhtmlPackage.eINSTANCE.getValuetypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlPackage getXhtmlPackage() {
		return (XhtmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XhtmlPackage getPackage() {
		return XhtmlPackage.eINSTANCE;
	}

} //XhtmlFactoryImpl
