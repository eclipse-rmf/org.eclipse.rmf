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

package org.eclipse.rmf.rif11.xsd.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICY;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA;
import org.eclipse.rmf.rif11.xsd.BINARYCONTENT;
import org.eclipse.rmf.rif11.xsd.CHILDRENType;
import org.eclipse.rmf.rif11.xsd.CHILDRENType1;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA;
import org.eclipse.rmf.rif11.xsd.DATATYPESType;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1;
import org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType1;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType2;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType3;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType4;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType5;
import org.eclipse.rmf.rif11.xsd.DocumentRoot;
import org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE;
import org.eclipse.rmf.rif11.xsd.ENUMVALUE;
import org.eclipse.rmf.rif11.xsd.OBJECTType;
import org.eclipse.rmf.rif11.xsd.PROPERTIESType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUP;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1;
import org.eclipse.rmf.rif11.xsd.RELATIONTYPEType;
import org.eclipse.rmf.rif11.xsd.RIF;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.SOURCEType;
import org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType;
import org.eclipse.rmf.rif11.xsd.SPECGROUP;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType1;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHY;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1;
import org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType;
import org.eclipse.rmf.rif11.xsd.SPECOBJECT;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2;
import org.eclipse.rmf.rif11.xsd.SPECRELATION;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2;
import org.eclipse.rmf.rif11.xsd.SPECTYPE;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType1;
import org.eclipse.rmf.rif11.xsd.TARGETGROUPType;
import org.eclipse.rmf.rif11.xsd.TARGETType;
import org.eclipse.rmf.rif11.xsd.TYPEType;
import org.eclipse.rmf.rif11.xsd.TYPEType1;
import org.eclipse.rmf.rif11.xsd.TYPEType2;
import org.eclipse.rmf.rif11.xsd.TYPEType3;
import org.eclipse.rmf.rif11.xsd.TYPEType4;
import org.eclipse.rmf.rif11.xsd.TYPEType5;
import org.eclipse.rmf.rif11.xsd.TYPEType6;
import org.eclipse.rmf.rif11.xsd.VALUESType;
import org.eclipse.rmf.rif11.xsd.VALUESType1;
import org.eclipse.rmf.rif11.xsd.VALUESType2;
import org.eclipse.rmf.rif11.xsd.VALUESType3;
import org.eclipse.rmf.rif11.xsd.VALUESType4;
import org.eclipse.rmf.rif11.xsd.XHTMLCONTENT;
import org.eclipse.rmf.rif11.xsd.XMLCONTENT;


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
 * @see org.eclipse.rmf.rif11.xsd.RifPackage
 * @generated
 */
public class RifSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RifPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifSwitch() {
		if (modelPackage == null) {
			modelPackage = RifPackage.eINSTANCE;
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
			case RifPackage.ACCESSPOLICIES_TYPE: {
				ACCESSPOLICIESType accesspoliciesType = (ACCESSPOLICIESType)theEObject;
				T result = caseACCESSPOLICIESType(accesspoliciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ACCESSPOLICY: {
				ACCESSPOLICY accesspolicy = (ACCESSPOLICY)theEObject;
				T result = caseACCESSPOLICY(accesspolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX: {
				ATTRIBUTEDEFINITIONCOMPLEX attributedefinitioncomplex = (ATTRIBUTEDEFINITIONCOMPLEX)theEObject;
				T result = caseATTRIBUTEDEFINITIONCOMPLEX(attributedefinitioncomplex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEDEFINITIONENUMERATION: {
				ATTRIBUTEDEFINITIONENUMERATION attributedefinitionenumeration = (ATTRIBUTEDEFINITIONENUMERATION)theEObject;
				T result = caseATTRIBUTEDEFINITIONENUMERATION(attributedefinitionenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEDEFINITIONSIMPLE: {
				ATTRIBUTEDEFINITIONSIMPLE attributedefinitionsimple = (ATTRIBUTEDEFINITIONSIMPLE)theEObject;
				T result = caseATTRIBUTEDEFINITIONSIMPLE(attributedefinitionsimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEDEFINITIONS_TYPE: {
				ATTRIBUTEDEFINITIONSType attributedefinitionsType = (ATTRIBUTEDEFINITIONSType)theEObject;
				T result = caseATTRIBUTEDEFINITIONSType(attributedefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT: {
				ATTRIBUTEVALUEEMBEDDEDDOCUMENT attributevalueembeddeddocument = (ATTRIBUTEVALUEEMBEDDEDDOCUMENT)theEObject;
				T result = caseATTRIBUTEVALUEEMBEDDEDDOCUMENT(attributevalueembeddeddocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDFILE: {
				ATTRIBUTEVALUEEMBEDDEDFILE attributevalueembeddedfile = (ATTRIBUTEVALUEEMBEDDEDFILE)theEObject;
				T result = caseATTRIBUTEVALUEEMBEDDEDFILE(attributevalueembeddedfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUEENUMERATION: {
				ATTRIBUTEVALUEENUMERATION attributevalueenumeration = (ATTRIBUTEVALUEENUMERATION)theEObject;
				T result = caseATTRIBUTEVALUEENUMERATION(attributevalueenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUEFILEREFERENCE: {
				ATTRIBUTEVALUEFILEREFERENCE attributevaluefilereference = (ATTRIBUTEVALUEFILEREFERENCE)theEObject;
				T result = caseATTRIBUTEVALUEFILEREFERENCE(attributevaluefilereference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUESIMPLE: {
				ATTRIBUTEVALUESIMPLE attributevaluesimple = (ATTRIBUTEVALUESIMPLE)theEObject;
				T result = caseATTRIBUTEVALUESIMPLE(attributevaluesimple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUES_TYPE: {
				ATTRIBUTEVALUESType attributevaluesType = (ATTRIBUTEVALUESType)theEObject;
				T result = caseATTRIBUTEVALUESType(attributevaluesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ATTRIBUTEVALUEXMLDATA: {
				ATTRIBUTEVALUEXMLDATA attributevaluexmldata = (ATTRIBUTEVALUEXMLDATA)theEObject;
				T result = caseATTRIBUTEVALUEXMLDATA(attributevaluexmldata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.BINARYCONTENT: {
				BINARYCONTENT binarycontent = (BINARYCONTENT)theEObject;
				T result = caseBINARYCONTENT(binarycontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.CHILDREN_TYPE: {
				CHILDRENType childrenType = (CHILDRENType)theEObject;
				T result = caseCHILDRENType(childrenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.CHILDREN_TYPE1: {
				CHILDRENType1 childrenType1 = (CHILDRENType1)theEObject;
				T result = caseCHILDRENType1(childrenType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONBINARYFILE: {
				DATATYPEDEFINITIONBINARYFILE datatypedefinitionbinaryfile = (DATATYPEDEFINITIONBINARYFILE)theEObject;
				T result = caseDATATYPEDEFINITIONBINARYFILE(datatypedefinitionbinaryfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONBOOLEAN: {
				DATATYPEDEFINITIONBOOLEAN datatypedefinitionboolean = (DATATYPEDEFINITIONBOOLEAN)theEObject;
				T result = caseDATATYPEDEFINITIONBOOLEAN(datatypedefinitionboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONDATE: {
				DATATYPEDEFINITIONDATE datatypedefinitiondate = (DATATYPEDEFINITIONDATE)theEObject;
				T result = caseDATATYPEDEFINITIONDATE(datatypedefinitiondate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONDOCUMENT: {
				DATATYPEDEFINITIONDOCUMENT datatypedefinitiondocument = (DATATYPEDEFINITIONDOCUMENT)theEObject;
				T result = caseDATATYPEDEFINITIONDOCUMENT(datatypedefinitiondocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONENUMERATION: {
				DATATYPEDEFINITIONENUMERATION datatypedefinitionenumeration = (DATATYPEDEFINITIONENUMERATION)theEObject;
				T result = caseDATATYPEDEFINITIONENUMERATION(datatypedefinitionenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONINTEGER: {
				DATATYPEDEFINITIONINTEGER datatypedefinitioninteger = (DATATYPEDEFINITIONINTEGER)theEObject;
				T result = caseDATATYPEDEFINITIONINTEGER(datatypedefinitioninteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONREAL: {
				DATATYPEDEFINITIONREAL datatypedefinitionreal = (DATATYPEDEFINITIONREAL)theEObject;
				T result = caseDATATYPEDEFINITIONREAL(datatypedefinitionreal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONSTRING: {
				DATATYPEDEFINITIONSTRING datatypedefinitionstring = (DATATYPEDEFINITIONSTRING)theEObject;
				T result = caseDATATYPEDEFINITIONSTRING(datatypedefinitionstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONS_TYPE: {
				DATATYPEDEFINITIONSType datatypedefinitionsType = (DATATYPEDEFINITIONSType)theEObject;
				T result = caseDATATYPEDEFINITIONSType(datatypedefinitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPEDEFINITIONXMLDATA: {
				DATATYPEDEFINITIONXMLDATA datatypedefinitionxmldata = (DATATYPEDEFINITIONXMLDATA)theEObject;
				T result = caseDATATYPEDEFINITIONXMLDATA(datatypedefinitionxmldata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DATATYPES_TYPE: {
				DATATYPESType datatypesType = (DATATYPESType)theEObject;
				T result = caseDATATYPESType(datatypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFAULTVALUE_TYPE: {
				DEFAULTVALUEType defaultvalueType = (DEFAULTVALUEType)theEObject;
				T result = caseDEFAULTVALUEType(defaultvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFAULTVALUE_TYPE1: {
				DEFAULTVALUEType1 defaultvalueType1 = (DEFAULTVALUEType1)theEObject;
				T result = caseDEFAULTVALUEType1(defaultvalueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFAULTVALUE_TYPE2: {
				DEFAULTVALUEType2 defaultvalueType2 = (DEFAULTVALUEType2)theEObject;
				T result = caseDEFAULTVALUEType2(defaultvalueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE: {
				DEFINITIONType definitionType = (DEFINITIONType)theEObject;
				T result = caseDEFINITIONType(definitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE1: {
				DEFINITIONType1 definitionType1 = (DEFINITIONType1)theEObject;
				T result = caseDEFINITIONType1(definitionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE2: {
				DEFINITIONType2 definitionType2 = (DEFINITIONType2)theEObject;
				T result = caseDEFINITIONType2(definitionType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE3: {
				DEFINITIONType3 definitionType3 = (DEFINITIONType3)theEObject;
				T result = caseDEFINITIONType3(definitionType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE4: {
				DEFINITIONType4 definitionType4 = (DEFINITIONType4)theEObject;
				T result = caseDEFINITIONType4(definitionType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DEFINITION_TYPE5: {
				DEFINITIONType5 definitionType5 = (DEFINITIONType5)theEObject;
				T result = caseDEFINITIONType5(definitionType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.EMBEDDEDVALUE: {
				EMBEDDEDVALUE embeddedvalue = (EMBEDDEDVALUE)theEObject;
				T result = caseEMBEDDEDVALUE(embeddedvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.ENUMVALUE: {
				ENUMVALUE enumvalue = (ENUMVALUE)theEObject;
				T result = caseENUMVALUE(enumvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.OBJECT_TYPE: {
				OBJECTType objectType = (OBJECTType)theEObject;
				T result = caseOBJECTType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.PROPERTIES_TYPE: {
				PROPERTIESType propertiesType = (PROPERTIESType)theEObject;
				T result = casePROPERTIESType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.RELATIONGROUP: {
				RELATIONGROUP relationgroup = (RELATIONGROUP)theEObject;
				T result = caseRELATIONGROUP(relationgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.RELATIONGROUPS_TYPE: {
				RELATIONGROUPSType relationgroupsType = (RELATIONGROUPSType)theEObject;
				T result = caseRELATIONGROUPSType(relationgroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.RELATIONGROUPS_TYPE1: {
				RELATIONGROUPSType1 relationgroupsType1 = (RELATIONGROUPSType1)theEObject;
				T result = caseRELATIONGROUPSType1(relationgroupsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.RELATIONTYPE_TYPE: {
				RELATIONTYPEType relationtypeType = (RELATIONTYPEType)theEObject;
				T result = caseRELATIONTYPEType(relationtypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.RIF: {
				RIF rif = (RIF)theEObject;
				T result = caseRIF(rif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SOURCE_TYPE: {
				SOURCEType sourceType = (SOURCEType)theEObject;
				T result = caseSOURCEType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECATTRIBUTES_TYPE: {
				SPECATTRIBUTESType specattributesType = (SPECATTRIBUTESType)theEObject;
				T result = caseSPECATTRIBUTESType(specattributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECGROUP: {
				SPECGROUP specgroup = (SPECGROUP)theEObject;
				T result = caseSPECGROUP(specgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECGROUPS_TYPE: {
				SPECGROUPSType specgroupsType = (SPECGROUPSType)theEObject;
				T result = caseSPECGROUPSType(specgroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECGROUPS_TYPE1: {
				SPECGROUPSType1 specgroupsType1 = (SPECGROUPSType1)theEObject;
				T result = caseSPECGROUPSType1(specgroupsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECHIERARCHIES_TYPE: {
				SPECHIERARCHIESType spechierarchiesType = (SPECHIERARCHIESType)theEObject;
				T result = caseSPECHIERARCHIESType(spechierarchiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECHIERARCHY: {
				SPECHIERARCHY spechierarchy = (SPECHIERARCHY)theEObject;
				T result = caseSPECHIERARCHY(spechierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECHIERARCHYROOT: {
				SPECHIERARCHYROOT spechierarchyroot = (SPECHIERARCHYROOT)theEObject;
				T result = caseSPECHIERARCHYROOT(spechierarchyroot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECHIERARCHYROOTS_TYPE: {
				SPECHIERARCHYROOTSType spechierarchyrootsType = (SPECHIERARCHYROOTSType)theEObject;
				T result = caseSPECHIERARCHYROOTSType(spechierarchyrootsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECHIERARCHYROOTS_TYPE1: {
				SPECHIERARCHYROOTSType1 spechierarchyrootsType1 = (SPECHIERARCHYROOTSType1)theEObject;
				T result = caseSPECHIERARCHYROOTSType1(spechierarchyrootsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECIFIEDVALUES_TYPE: {
				SPECIFIEDVALUESType specifiedvaluesType = (SPECIFIEDVALUESType)theEObject;
				T result = caseSPECIFIEDVALUESType(specifiedvaluesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECOBJECT: {
				SPECOBJECT specobject = (SPECOBJECT)theEObject;
				T result = caseSPECOBJECT(specobject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECOBJECTS_TYPE: {
				SPECOBJECTSType specobjectsType = (SPECOBJECTSType)theEObject;
				T result = caseSPECOBJECTSType(specobjectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECOBJECTS_TYPE1: {
				SPECOBJECTSType1 specobjectsType1 = (SPECOBJECTSType1)theEObject;
				T result = caseSPECOBJECTSType1(specobjectsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECOBJECTS_TYPE2: {
				SPECOBJECTSType2 specobjectsType2 = (SPECOBJECTSType2)theEObject;
				T result = caseSPECOBJECTSType2(specobjectsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECRELATION: {
				SPECRELATION specrelation = (SPECRELATION)theEObject;
				T result = caseSPECRELATION(specrelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECRELATIONS_TYPE: {
				SPECRELATIONSType specrelationsType = (SPECRELATIONSType)theEObject;
				T result = caseSPECRELATIONSType(specrelationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECRELATIONS_TYPE1: {
				SPECRELATIONSType1 specrelationsType1 = (SPECRELATIONSType1)theEObject;
				T result = caseSPECRELATIONSType1(specrelationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECRELATIONS_TYPE2: {
				SPECRELATIONSType2 specrelationsType2 = (SPECRELATIONSType2)theEObject;
				T result = caseSPECRELATIONSType2(specrelationsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECTYPE: {
				SPECTYPE spectype = (SPECTYPE)theEObject;
				T result = caseSPECTYPE(spectype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECTYPES_TYPE: {
				SPECTYPESType spectypesType = (SPECTYPESType)theEObject;
				T result = caseSPECTYPESType(spectypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.SPECTYPES_TYPE1: {
				SPECTYPESType1 spectypesType1 = (SPECTYPESType1)theEObject;
				T result = caseSPECTYPESType1(spectypesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TARGETGROUP_TYPE: {
				TARGETGROUPType targetgroupType = (TARGETGROUPType)theEObject;
				T result = caseTARGETGROUPType(targetgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TARGET_TYPE: {
				TARGETType targetType = (TARGETType)theEObject;
				T result = caseTARGETType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE: {
				TYPEType typeType = (TYPEType)theEObject;
				T result = caseTYPEType(typeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE1: {
				TYPEType1 typeType1 = (TYPEType1)theEObject;
				T result = caseTYPEType1(typeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE2: {
				TYPEType2 typeType2 = (TYPEType2)theEObject;
				T result = caseTYPEType2(typeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE3: {
				TYPEType3 typeType3 = (TYPEType3)theEObject;
				T result = caseTYPEType3(typeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE4: {
				TYPEType4 typeType4 = (TYPEType4)theEObject;
				T result = caseTYPEType4(typeType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE5: {
				TYPEType5 typeType5 = (TYPEType5)theEObject;
				T result = caseTYPEType5(typeType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.TYPE_TYPE6: {
				TYPEType6 typeType6 = (TYPEType6)theEObject;
				T result = caseTYPEType6(typeType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.VALUES_TYPE: {
				VALUESType valuesType = (VALUESType)theEObject;
				T result = caseVALUESType(valuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.VALUES_TYPE1: {
				VALUESType1 valuesType1 = (VALUESType1)theEObject;
				T result = caseVALUESType1(valuesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.VALUES_TYPE2: {
				VALUESType2 valuesType2 = (VALUESType2)theEObject;
				T result = caseVALUESType2(valuesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.VALUES_TYPE3: {
				VALUESType3 valuesType3 = (VALUESType3)theEObject;
				T result = caseVALUESType3(valuesType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.VALUES_TYPE4: {
				VALUESType4 valuesType4 = (VALUESType4)theEObject;
				T result = caseVALUESType4(valuesType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.XHTMLCONTENT: {
				XHTMLCONTENT xhtmlcontent = (XHTMLCONTENT)theEObject;
				T result = caseXHTMLCONTENT(xhtmlcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RifPackage.XMLCONTENT: {
				XMLCONTENT xmlcontent = (XMLCONTENT)theEObject;
				T result = caseXMLCONTENT(xmlcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACCESSPOLICIES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACCESSPOLICIES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACCESSPOLICIESType(ACCESSPOLICIESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACCESSPOLICY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACCESSPOLICY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACCESSPOLICY(ACCESSPOLICY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONCOMPLEX(ATTRIBUTEDEFINITIONCOMPLEX object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONENUMERATION(ATTRIBUTEDEFINITIONENUMERATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONSIMPLE(ATTRIBUTEDEFINITIONSIMPLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONSType(ATTRIBUTEDEFINITIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEEMBEDDEDDOCUMENT(ATTRIBUTEVALUEEMBEDDEDDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEEMBEDDEDFILE(ATTRIBUTEVALUEEMBEDDEDFILE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEENUMERATION(ATTRIBUTEVALUEENUMERATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEFILEREFERENCE(ATTRIBUTEVALUEFILEREFERENCE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUESIMPLE(ATTRIBUTEVALUESIMPLE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUESType(ATTRIBUTEVALUESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEXMLDATA(ATTRIBUTEVALUEXMLDATA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BINARYCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BINARYCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBINARYCONTENT(BINARYCONTENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CHILDREN Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CHILDREN Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCHILDRENType(CHILDRENType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CHILDREN Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CHILDREN Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCHILDRENType1(CHILDRENType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONBINARYFILE(DATATYPEDEFINITIONBINARYFILE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONBOOLEAN(DATATYPEDEFINITIONBOOLEAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONDATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONDATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONDATE(DATATYPEDEFINITIONDATE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONDOCUMENT(DATATYPEDEFINITIONDOCUMENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONENUMERATION(DATATYPEDEFINITIONENUMERATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONINTEGER(DATATYPEDEFINITIONINTEGER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONREAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONREAL(DATATYPEDEFINITIONREAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONSTRING(DATATYPEDEFINITIONSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONSType(DATATYPEDEFINITIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONXMLDATA(DATATYPEDEFINITIONXMLDATA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPESType(DATATYPESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType(DEFAULTVALUEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType1(DEFAULTVALUEType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType2(DEFAULTVALUEType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType(DEFINITIONType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType1(DEFINITIONType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType2(DEFINITIONType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType3(DEFINITIONType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType4(DEFINITIONType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType5(DEFINITIONType5 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EMBEDDEDVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMBEDDEDVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMBEDDEDVALUE(EMBEDDEDVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENUMVALUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENUMVALUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENUMVALUE(ENUMVALUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OBJECT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OBJECT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOBJECTType(OBJECTType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PROPERTIES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PROPERTIES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePROPERTIESType(PROPERTIESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RELATIONGROUP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RELATIONGROUP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRELATIONGROUP(RELATIONGROUP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RELATIONGROUPS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RELATIONGROUPS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRELATIONGROUPSType(RELATIONGROUPSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RELATIONGROUPS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RELATIONGROUPS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRELATIONGROUPSType1(RELATIONGROUPSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RELATIONTYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RELATIONTYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRELATIONTYPEType(RELATIONTYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RIF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RIF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRIF(RIF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOURCE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOURCE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOURCEType(SOURCEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECATTRIBUTESType(SPECATTRIBUTESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECGROUP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECGROUP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECGROUP(SPECGROUP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECGROUPS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECGROUPS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECGROUPSType(SPECGROUPSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECGROUPS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECGROUPS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECGROUPSType1(SPECGROUPSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECHIERARCHIES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECHIERARCHIES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECHIERARCHIESType(SPECHIERARCHIESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECHIERARCHY</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECHIERARCHY</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECHIERARCHY(SPECHIERARCHY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECHIERARCHYROOT(SPECHIERARCHYROOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECHIERARCHYROOTSType(SPECHIERARCHYROOTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOTS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECHIERARCHYROOTS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECHIERARCHYROOTSType1(SPECHIERARCHYROOTSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECIFIEDVALUES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECIFIEDVALUES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECIFIEDVALUESType(SPECIFIEDVALUESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECOBJECT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECOBJECT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECOBJECT(SPECOBJECT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECOBJECTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECOBJECTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECOBJECTSType(SPECOBJECTSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECOBJECTS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECOBJECTS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECOBJECTSType1(SPECOBJECTSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECOBJECTS Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECOBJECTS Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECOBJECTSType2(SPECOBJECTSType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATION(SPECRELATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATIONSType(SPECRELATIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATIONS Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATIONS Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATIONSType1(SPECRELATIONSType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATIONS Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATIONS Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATIONSType2(SPECRELATIONSType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECTYPE(SPECTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECTYPES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECTYPES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECTYPESType(SPECTYPESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECTYPES Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECTYPES Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECTYPESType1(SPECTYPESType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TARGETGROUP Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TARGETGROUP Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTARGETGROUPType(TARGETGROUPType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TARGET Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TARGET Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTARGETType(TARGETType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType(TYPEType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType1(TYPEType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType2(TYPEType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType3(TYPEType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType4(TYPEType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType5(TYPEType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType6(TYPEType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUES Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUES Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUESType(VALUESType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUES Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUES Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUESType1(VALUESType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUES Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUES Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUESType2(VALUESType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUES Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUES Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUESType3(VALUESType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VALUES Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VALUES Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVALUESType4(VALUESType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XHTMLCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XHTMLCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXHTMLCONTENT(XHTMLCONTENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMLCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMLCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLCONTENT(XMLCONTENT object) {
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

} //RifSwitch
