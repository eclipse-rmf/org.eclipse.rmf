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
package org.eclipse.rmf.reqif10.xhtml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.rmf.reqif10.xhtml.*;

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
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPackage
 * @generated
 */
public class XhtmlSwitch<T> extends Switch<T> {
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
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case XhtmlPackage.XHTML_ABBR_TYPE: {
				XhtmlAbbrType xhtmlAbbrType = (XhtmlAbbrType)theEObject;
				T result = caseXhtmlAbbrType(xhtmlAbbrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_ACRONYM_TYPE: {
				XhtmlAcronymType xhtmlAcronymType = (XhtmlAcronymType)theEObject;
				T result = caseXhtmlAcronymType(xhtmlAcronymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_ADDRESS_TYPE: {
				XhtmlAddressType xhtmlAddressType = (XhtmlAddressType)theEObject;
				T result = caseXhtmlAddressType(xhtmlAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_ATYPE: {
				XhtmlAType xhtmlAType = (XhtmlAType)theEObject;
				T result = caseXhtmlAType(xhtmlAType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE: {
				XhtmlBlockquoteType xhtmlBlockquoteType = (XhtmlBlockquoteType)theEObject;
				T result = caseXhtmlBlockquoteType(xhtmlBlockquoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_BR_TYPE: {
				XhtmlBrType xhtmlBrType = (XhtmlBrType)theEObject;
				T result = caseXhtmlBrType(xhtmlBrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_CAPTION_TYPE: {
				XhtmlCaptionType xhtmlCaptionType = (XhtmlCaptionType)theEObject;
				T result = caseXhtmlCaptionType(xhtmlCaptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_CITE_TYPE: {
				XhtmlCiteType xhtmlCiteType = (XhtmlCiteType)theEObject;
				T result = caseXhtmlCiteType(xhtmlCiteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_CODE_TYPE: {
				XhtmlCodeType xhtmlCodeType = (XhtmlCodeType)theEObject;
				T result = caseXhtmlCodeType(xhtmlCodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_COLGROUP_TYPE: {
				XhtmlColgroupType xhtmlColgroupType = (XhtmlColgroupType)theEObject;
				T result = caseXhtmlColgroupType(xhtmlColgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_COL_TYPE: {
				XhtmlColType xhtmlColType = (XhtmlColType)theEObject;
				T result = caseXhtmlColType(xhtmlColType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_DD_TYPE: {
				XhtmlDdType xhtmlDdType = (XhtmlDdType)theEObject;
				T result = caseXhtmlDdType(xhtmlDdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_DFN_TYPE: {
				XhtmlDfnType xhtmlDfnType = (XhtmlDfnType)theEObject;
				T result = caseXhtmlDfnType(xhtmlDfnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_DIV_TYPE: {
				XhtmlDivType xhtmlDivType = (XhtmlDivType)theEObject;
				T result = caseXhtmlDivType(xhtmlDivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_DL_TYPE: {
				XhtmlDlType xhtmlDlType = (XhtmlDlType)theEObject;
				T result = caseXhtmlDlType(xhtmlDlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_DT_TYPE: {
				XhtmlDtType xhtmlDtType = (XhtmlDtType)theEObject;
				T result = caseXhtmlDtType(xhtmlDtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_EDIT_TYPE: {
				XhtmlEditType xhtmlEditType = (XhtmlEditType)theEObject;
				T result = caseXhtmlEditType(xhtmlEditType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_EM_TYPE: {
				XhtmlEmType xhtmlEmType = (XhtmlEmType)theEObject;
				T result = caseXhtmlEmType(xhtmlEmType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H1_TYPE: {
				XhtmlH1Type xhtmlH1Type = (XhtmlH1Type)theEObject;
				T result = caseXhtmlH1Type(xhtmlH1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H2_TYPE: {
				XhtmlH2Type xhtmlH2Type = (XhtmlH2Type)theEObject;
				T result = caseXhtmlH2Type(xhtmlH2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H3_TYPE: {
				XhtmlH3Type xhtmlH3Type = (XhtmlH3Type)theEObject;
				T result = caseXhtmlH3Type(xhtmlH3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H4_TYPE: {
				XhtmlH4Type xhtmlH4Type = (XhtmlH4Type)theEObject;
				T result = caseXhtmlH4Type(xhtmlH4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H5_TYPE: {
				XhtmlH5Type xhtmlH5Type = (XhtmlH5Type)theEObject;
				T result = caseXhtmlH5Type(xhtmlH5Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_H6_TYPE: {
				XhtmlH6Type xhtmlH6Type = (XhtmlH6Type)theEObject;
				T result = caseXhtmlH6Type(xhtmlH6Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_HEADING_TYPE: {
				XhtmlHeadingType xhtmlHeadingType = (XhtmlHeadingType)theEObject;
				T result = caseXhtmlHeadingType(xhtmlHeadingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_HR_TYPE: {
				XhtmlHrType xhtmlHrType = (XhtmlHrType)theEObject;
				T result = caseXhtmlHrType(xhtmlHrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_INL_PRES_TYPE: {
				XhtmlInlPresType xhtmlInlPresType = (XhtmlInlPresType)theEObject;
				T result = caseXhtmlInlPresType(xhtmlInlPresType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_KBD_TYPE: {
				XhtmlKbdType xhtmlKbdType = (XhtmlKbdType)theEObject;
				T result = caseXhtmlKbdType(xhtmlKbdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_LI_TYPE: {
				XhtmlLiType xhtmlLiType = (XhtmlLiType)theEObject;
				T result = caseXhtmlLiType(xhtmlLiType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_OBJECT_TYPE: {
				XhtmlObjectType xhtmlObjectType = (XhtmlObjectType)theEObject;
				T result = caseXhtmlObjectType(xhtmlObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_OL_TYPE: {
				XhtmlOlType xhtmlOlType = (XhtmlOlType)theEObject;
				T result = caseXhtmlOlType(xhtmlOlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_PARAM_TYPE: {
				XhtmlParamType xhtmlParamType = (XhtmlParamType)theEObject;
				T result = caseXhtmlParamType(xhtmlParamType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_PRE_TYPE: {
				XhtmlPreType xhtmlPreType = (XhtmlPreType)theEObject;
				T result = caseXhtmlPreType(xhtmlPreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_PTYPE: {
				XhtmlPType xhtmlPType = (XhtmlPType)theEObject;
				T result = caseXhtmlPType(xhtmlPType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_QTYPE: {
				XhtmlQType xhtmlQType = (XhtmlQType)theEObject;
				T result = caseXhtmlQType(xhtmlQType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_SAMP_TYPE: {
				XhtmlSampType xhtmlSampType = (XhtmlSampType)theEObject;
				T result = caseXhtmlSampType(xhtmlSampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_SPAN_TYPE: {
				XhtmlSpanType xhtmlSpanType = (XhtmlSpanType)theEObject;
				T result = caseXhtmlSpanType(xhtmlSpanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_STRONG_TYPE: {
				XhtmlStrongType xhtmlStrongType = (XhtmlStrongType)theEObject;
				T result = caseXhtmlStrongType(xhtmlStrongType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TABLE_TYPE: {
				XhtmlTableType xhtmlTableType = (XhtmlTableType)theEObject;
				T result = caseXhtmlTableType(xhtmlTableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TBODY_TYPE: {
				XhtmlTbodyType xhtmlTbodyType = (XhtmlTbodyType)theEObject;
				T result = caseXhtmlTbodyType(xhtmlTbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TD_TYPE: {
				XhtmlTdType xhtmlTdType = (XhtmlTdType)theEObject;
				T result = caseXhtmlTdType(xhtmlTdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TFOOT_TYPE: {
				XhtmlTfootType xhtmlTfootType = (XhtmlTfootType)theEObject;
				T result = caseXhtmlTfootType(xhtmlTfootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_THEAD_TYPE: {
				XhtmlTheadType xhtmlTheadType = (XhtmlTheadType)theEObject;
				T result = caseXhtmlTheadType(xhtmlTheadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TH_TYPE: {
				XhtmlThType xhtmlThType = (XhtmlThType)theEObject;
				T result = caseXhtmlThType(xhtmlThType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_TR_TYPE: {
				XhtmlTrType xhtmlTrType = (XhtmlTrType)theEObject;
				T result = caseXhtmlTrType(xhtmlTrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_UL_TYPE: {
				XhtmlUlType xhtmlUlType = (XhtmlUlType)theEObject;
				T result = caseXhtmlUlType(xhtmlUlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.XHTML_VAR_TYPE: {
				XhtmlVarType xhtmlVarType = (XhtmlVarType)theEObject;
				T result = caseXhtmlVarType(xhtmlVarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case XhtmlPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
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
	public T caseXhtmlAbbrType(XhtmlAbbrType object) {
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
	public T caseXhtmlAcronymType(XhtmlAcronymType object) {
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
	public T caseXhtmlAddressType(XhtmlAddressType object) {
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
	public T caseXhtmlAType(XhtmlAType object) {
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
	public T caseXhtmlBlockquoteType(XhtmlBlockquoteType object) {
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
	public T caseXhtmlBrType(XhtmlBrType object) {
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
	public T caseXhtmlCaptionType(XhtmlCaptionType object) {
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
	public T caseXhtmlCiteType(XhtmlCiteType object) {
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
	public T caseXhtmlCodeType(XhtmlCodeType object) {
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
	public T caseXhtmlColgroupType(XhtmlColgroupType object) {
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
	public T caseXhtmlColType(XhtmlColType object) {
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
	public T caseXhtmlDdType(XhtmlDdType object) {
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
	public T caseXhtmlDfnType(XhtmlDfnType object) {
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
	public T caseXhtmlDivType(XhtmlDivType object) {
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
	public T caseXhtmlDlType(XhtmlDlType object) {
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
	public T caseXhtmlDtType(XhtmlDtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtmlEditType(XhtmlEditType object) {
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
	public T caseXhtmlEmType(XhtmlEmType object) {
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
	public T caseXhtmlH1Type(XhtmlH1Type object) {
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
	public T caseXhtmlH2Type(XhtmlH2Type object) {
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
	public T caseXhtmlH3Type(XhtmlH3Type object) {
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
	public T caseXhtmlH4Type(XhtmlH4Type object) {
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
	public T caseXhtmlH5Type(XhtmlH5Type object) {
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
	public T caseXhtmlH6Type(XhtmlH6Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtmlHeadingType(XhtmlHeadingType object) {
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
	public T caseXhtmlHrType(XhtmlHrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inl Pres Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inl Pres Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXhtmlInlPresType(XhtmlInlPresType object) {
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
	public T caseXhtmlKbdType(XhtmlKbdType object) {
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
	public T caseXhtmlLiType(XhtmlLiType object) {
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
	public T caseXhtmlObjectType(XhtmlObjectType object) {
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
	public T caseXhtmlOlType(XhtmlOlType object) {
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
	public T caseXhtmlParamType(XhtmlParamType object) {
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
	public T caseXhtmlPreType(XhtmlPreType object) {
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
	public T caseXhtmlPType(XhtmlPType object) {
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
	public T caseXhtmlQType(XhtmlQType object) {
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
	public T caseXhtmlSampType(XhtmlSampType object) {
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
	public T caseXhtmlSpanType(XhtmlSpanType object) {
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
	public T caseXhtmlStrongType(XhtmlStrongType object) {
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
	public T caseXhtmlTableType(XhtmlTableType object) {
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
	public T caseXhtmlTbodyType(XhtmlTbodyType object) {
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
	public T caseXhtmlTdType(XhtmlTdType object) {
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
	public T caseXhtmlTfootType(XhtmlTfootType object) {
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
	public T caseXhtmlTheadType(XhtmlTheadType object) {
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
	public T caseXhtmlThType(XhtmlThType object) {
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
	public T caseXhtmlTrType(XhtmlTrType object) {
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
	public T caseXhtmlUlType(XhtmlUlType object) {
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
	public T caseXhtmlVarType(XhtmlVarType object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //XhtmlSwitch
