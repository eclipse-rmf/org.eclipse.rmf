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

package org.eclipse.rmf.rif12.xhtml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif12.xhtml.AContent;
import org.eclipse.rmf.rif12.xhtml.AType;
import org.eclipse.rmf.rif12.xhtml.AbbrType;
import org.eclipse.rmf.rif12.xhtml.AcronymType;
import org.eclipse.rmf.rif12.xhtml.AddressType;
import org.eclipse.rmf.rif12.xhtml.BType;
import org.eclipse.rmf.rif12.xhtml.BigType;
import org.eclipse.rmf.rif12.xhtml.Block;
import org.eclipse.rmf.rif12.xhtml.BlockquoteType;
import org.eclipse.rmf.rif12.xhtml.BodyType;
import org.eclipse.rmf.rif12.xhtml.BrType;
import org.eclipse.rmf.rif12.xhtml.CaptionType;
import org.eclipse.rmf.rif12.xhtml.CiteType;
import org.eclipse.rmf.rif12.xhtml.CodeType;
import org.eclipse.rmf.rif12.xhtml.ColType;
import org.eclipse.rmf.rif12.xhtml.ColgroupType;
import org.eclipse.rmf.rif12.xhtml.DdType;
import org.eclipse.rmf.rif12.xhtml.DelType;
import org.eclipse.rmf.rif12.xhtml.DfnType;
import org.eclipse.rmf.rif12.xhtml.DivType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.DocumentRoot;
import org.eclipse.rmf.rif12.xhtml.DtType;
import org.eclipse.rmf.rif12.xhtml.EmType;
import org.eclipse.rmf.rif12.xhtml.Flow;
import org.eclipse.rmf.rif12.xhtml.FormContent;
import org.eclipse.rmf.rif12.xhtml.H1Type;
import org.eclipse.rmf.rif12.xhtml.H2Type;
import org.eclipse.rmf.rif12.xhtml.H3Type;
import org.eclipse.rmf.rif12.xhtml.H4Type;
import org.eclipse.rmf.rif12.xhtml.H5Type;
import org.eclipse.rmf.rif12.xhtml.H6Type;
import org.eclipse.rmf.rif12.xhtml.HrType;
import org.eclipse.rmf.rif12.xhtml.HtmlType;
import org.eclipse.rmf.rif12.xhtml.IType;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.Inline;
import org.eclipse.rmf.rif12.xhtml.InsType;
import org.eclipse.rmf.rif12.xhtml.KbdType;
import org.eclipse.rmf.rif12.xhtml.LiType;
import org.eclipse.rmf.rif12.xhtml.ObjectType;
import org.eclipse.rmf.rif12.xhtml.OlType;
import org.eclipse.rmf.rif12.xhtml.PType;
import org.eclipse.rmf.rif12.xhtml.ParamType;
import org.eclipse.rmf.rif12.xhtml.PreContent;
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
import org.eclipse.rmf.rif12.xhtml.TbodyType;
import org.eclipse.rmf.rif12.xhtml.TdType;
import org.eclipse.rmf.rif12.xhtml.TfootType;
import org.eclipse.rmf.rif12.xhtml.ThType;
import org.eclipse.rmf.rif12.xhtml.TheadType;
import org.eclipse.rmf.rif12.xhtml.TrType;
import org.eclipse.rmf.rif12.xhtml.TtType;
import org.eclipse.rmf.rif12.xhtml.UType;
import org.eclipse.rmf.rif12.xhtml.UlType;
import org.eclipse.rmf.rif12.xhtml.VarType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XhtmlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlSwitch() {
		if (modelPackage == null) {
			modelPackage = XhtmlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XhtmlPackage.ABBR_TYPE: {
				AbbrType abbrType = (AbbrType)theEObject;
				T result = caseAbbrType(abbrType);
				if (result == null) result = caseInline(abbrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.ACONTENT: {
				AContent aContent = (AContent)theEObject;
				T result = caseAContent(aContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.ACRONYM_TYPE: {
				AcronymType acronymType = (AcronymType)theEObject;
				T result = caseAcronymType(acronymType);
				if (result == null) result = caseInline(acronymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseInline(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.ATYPE: {
				AType aType = (AType)theEObject;
				T result = caseAType(aType);
				if (result == null) result = caseAContent(aType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BIG_TYPE: {
				BigType bigType = (BigType)theEObject;
				T result = caseBigType(bigType);
				if (result == null) result = caseInline(bigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BLOCKQUOTE_TYPE: {
				BlockquoteType blockquoteType = (BlockquoteType)theEObject;
				T result = caseBlockquoteType(blockquoteType);
				if (result == null) result = caseBlock(blockquoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = caseBlock(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BR_TYPE: {
				BrType brType = (BrType)theEObject;
				T result = caseBrType(brType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.BTYPE: {
				BType bType = (BType)theEObject;
				T result = caseBType(bType);
				if (result == null) result = caseInline(bType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.CAPTION_TYPE: {
				CaptionType captionType = (CaptionType)theEObject;
				T result = caseCaptionType(captionType);
				if (result == null) result = caseInline(captionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.CITE_TYPE: {
				CiteType citeType = (CiteType)theEObject;
				T result = caseCiteType(citeType);
				if (result == null) result = caseInline(citeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = caseInline(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.COLGROUP_TYPE: {
				ColgroupType colgroupType = (ColgroupType)theEObject;
				T result = caseColgroupType(colgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.COL_TYPE: {
				ColType colType = (ColType)theEObject;
				T result = caseColType(colType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DD_TYPE: {
				DdType ddType = (DdType)theEObject;
				T result = caseDdType(ddType);
				if (result == null) result = caseFlow(ddType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DEL_TYPE: {
				DelType delType = (DelType)theEObject;
				T result = caseDelType(delType);
				if (result == null) result = caseFlow(delType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DFN_TYPE: {
				DfnType dfnType = (DfnType)theEObject;
				T result = caseDfnType(dfnType);
				if (result == null) result = caseInline(dfnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DIV_TYPE: {
				DivType divType = (DivType)theEObject;
				T result = caseDivType(divType);
				if (result == null) result = caseFlow(divType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DL_TYPE: {
				DlType dlType = (DlType)theEObject;
				T result = caseDlType(dlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DT_TYPE: {
				DtType dtType = (DtType)theEObject;
				T result = caseDtType(dtType);
				if (result == null) result = caseInline(dtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.EM_TYPE: {
				EmType emType = (EmType)theEObject;
				T result = caseEmType(emType);
				if (result == null) result = caseInline(emType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.FORM_CONTENT: {
				FormContent formContent = (FormContent)theEObject;
				T result = caseFormContent(formContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H1_TYPE: {
				H1Type h1Type = (H1Type)theEObject;
				T result = caseH1Type(h1Type);
				if (result == null) result = caseInline(h1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H2_TYPE: {
				H2Type h2Type = (H2Type)theEObject;
				T result = caseH2Type(h2Type);
				if (result == null) result = caseInline(h2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H3_TYPE: {
				H3Type h3Type = (H3Type)theEObject;
				T result = caseH3Type(h3Type);
				if (result == null) result = caseInline(h3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H4_TYPE: {
				H4Type h4Type = (H4Type)theEObject;
				T result = caseH4Type(h4Type);
				if (result == null) result = caseInline(h4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H5_TYPE: {
				H5Type h5Type = (H5Type)theEObject;
				T result = caseH5Type(h5Type);
				if (result == null) result = caseInline(h5Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.H6_TYPE: {
				H6Type h6Type = (H6Type)theEObject;
				T result = caseH6Type(h6Type);
				if (result == null) result = caseInline(h6Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.HR_TYPE: {
				HrType hrType = (HrType)theEObject;
				T result = caseHrType(hrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.HTML_TYPE: {
				HtmlType htmlType = (HtmlType)theEObject;
				T result = caseHtmlType(htmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.IMG_TYPE: {
				ImgType imgType = (ImgType)theEObject;
				T result = caseImgType(imgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.INLINE: {
				Inline inline = (Inline)theEObject;
				T result = caseInline(inline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.INS_TYPE: {
				InsType insType = (InsType)theEObject;
				T result = caseInsType(insType);
				if (result == null) result = caseFlow(insType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.ITYPE: {
				IType iType = (IType)theEObject;
				T result = caseIType(iType);
				if (result == null) result = caseInline(iType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.KBD_TYPE: {
				KbdType kbdType = (KbdType)theEObject;
				T result = caseKbdType(kbdType);
				if (result == null) result = caseInline(kbdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.LI_TYPE: {
				LiType liType = (LiType)theEObject;
				T result = caseLiType(liType);
				if (result == null) result = caseFlow(liType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.OL_TYPE: {
				OlType olType = (OlType)theEObject;
				T result = caseOlType(olType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.PRE_CONTENT: {
				PreContent preContent = (PreContent)theEObject;
				T result = casePreContent(preContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.PRE_TYPE: {
				PreType preType = (PreType)theEObject;
				T result = casePreType(preType);
				if (result == null) result = casePreContent(preType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.PTYPE: {
				PType pType = (PType)theEObject;
				T result = casePType(pType);
				if (result == null) result = caseInline(pType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.QTYPE: {
				QType qType = (QType)theEObject;
				T result = caseQType(qType);
				if (result == null) result = caseInline(qType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.SAMP_TYPE: {
				SampType sampType = (SampType)theEObject;
				T result = caseSampType(sampType);
				if (result == null) result = caseInline(sampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.SMALL_TYPE: {
				SmallType smallType = (SmallType)theEObject;
				T result = caseSmallType(smallType);
				if (result == null) result = caseInline(smallType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.SPAN_TYPE: {
				SpanType spanType = (SpanType)theEObject;
				T result = caseSpanType(spanType);
				if (result == null) result = caseInline(spanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.STRIKE_TYPE: {
				StrikeType strikeType = (StrikeType)theEObject;
				T result = caseStrikeType(strikeType);
				if (result == null) result = caseInline(strikeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.STRONG_TYPE: {
				StrongType strongType = (StrongType)theEObject;
				T result = caseStrongType(strongType);
				if (result == null) result = caseInline(strongType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.SUB_TYPE: {
				SubType subType = (SubType)theEObject;
				T result = caseSubType(subType);
				if (result == null) result = caseInline(subType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.SUP_TYPE: {
				SupType supType = (SupType)theEObject;
				T result = caseSupType(supType);
				if (result == null) result = caseInline(supType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TBODY_TYPE: {
				TbodyType tbodyType = (TbodyType)theEObject;
				T result = caseTbodyType(tbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TD_TYPE: {
				TdType tdType = (TdType)theEObject;
				T result = caseTdType(tdType);
				if (result == null) result = caseFlow(tdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TFOOT_TYPE: {
				TfootType tfootType = (TfootType)theEObject;
				T result = caseTfootType(tfootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.THEAD_TYPE: {
				TheadType theadType = (TheadType)theEObject;
				T result = caseTheadType(theadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TH_TYPE: {
				ThType thType = (ThType)theEObject;
				T result = caseThType(thType);
				if (result == null) result = caseFlow(thType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TR_TYPE: {
				TrType trType = (TrType)theEObject;
				T result = caseTrType(trType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.TT_TYPE: {
				TtType ttType = (TtType)theEObject;
				T result = caseTtType(ttType);
				if (result == null) result = caseInline(ttType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.UL_TYPE: {
				UlType ulType = (UlType)theEObject;
				T result = caseUlType(ulType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.UTYPE: {
				UType uType = (UType)theEObject;
				T result = caseUType(uType);
				if (result == null) result = caseInline(uType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = caseInline(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbrType(AbbrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAContent(AContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcronymType(AcronymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAType(AType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigType(BigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockquoteType(BlockquoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyType(BodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Br Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Br Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrType(BrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBType(BType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptionType(CaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiteType(CiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColgroupType(ColgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColType(ColType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdType(DdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Del Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Del Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelType(DelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDfnType(DfnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivType(DivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDlType(DlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDtType(DtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Em Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Em Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmType(EmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormContent(FormContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1Type(H1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2Type(H2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH3Type(H3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH4Type(H4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H5 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H5 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH5Type(H5Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H6 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H6 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH6Type(H6Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHrType(HrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlType(HtmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImgType(ImgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsType(InsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIType(IType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKbdType(KbdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Li Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Li Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiType(LiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlType(OlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreContent(PreContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreType(PreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePType(PType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQType(QType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Samp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Samp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampType(SampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallType(SmallType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanType(SpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strike Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strike Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrikeType(StrikeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongType(StrongType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubType(SubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupType(SupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbodyType(TbodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdType(TdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfootType(TfootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheadType(TheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThType(ThType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrType(TrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtType(TtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ul Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ul Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUlType(UlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUType(UType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //XhtmlSwitch
