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

package org.eclipse.rmf.rif11.xsd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICY;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM;
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
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM;
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
import org.eclipse.rmf.rif11.xsd.RifFactory;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RifFactoryImpl extends EFactoryImpl implements RifFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RifFactory init() {
		try {
			RifFactory theRifFactory = (RifFactory)EPackage.Registry.INSTANCE.getEFactory("http://automotive-his.de/schema/rif"); 
			if (theRifFactory != null) {
				return theRifFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RifFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifFactoryImpl() {
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
			case RifPackage.ACCESSPOLICIES_TYPE: return createACCESSPOLICIESType();
			case RifPackage.ACCESSPOLICY: return createACCESSPOLICY();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX: return createATTRIBUTEDEFINITIONCOMPLEX();
			case RifPackage.ATTRIBUTEDEFINITIONENUMERATION: return createATTRIBUTEDEFINITIONENUMERATION();
			case RifPackage.ATTRIBUTEDEFINITIONSIMPLE: return createATTRIBUTEDEFINITIONSIMPLE();
			case RifPackage.ATTRIBUTEDEFINITIONS_TYPE: return createATTRIBUTEDEFINITIONSType();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT: return createATTRIBUTEVALUEEMBEDDEDDOCUMENT();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDFILE: return createATTRIBUTEVALUEEMBEDDEDFILE();
			case RifPackage.ATTRIBUTEVALUEENUMERATION: return createATTRIBUTEVALUEENUMERATION();
			case RifPackage.ATTRIBUTEVALUEFILEREFERENCE: return createATTRIBUTEVALUEFILEREFERENCE();
			case RifPackage.ATTRIBUTEVALUESIMPLE: return createATTRIBUTEVALUESIMPLE();
			case RifPackage.ATTRIBUTEVALUES_TYPE: return createATTRIBUTEVALUESType();
			case RifPackage.ATTRIBUTEVALUEXMLDATA: return createATTRIBUTEVALUEXMLDATA();
			case RifPackage.BINARYCONTENT: return createBINARYCONTENT();
			case RifPackage.CHILDREN_TYPE: return createCHILDRENType();
			case RifPackage.CHILDREN_TYPE1: return createCHILDRENType1();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE: return createDATATYPEDEFINITIONBINARYFILE();
			case RifPackage.DATATYPEDEFINITIONBOOLEAN: return createDATATYPEDEFINITIONBOOLEAN();
			case RifPackage.DATATYPEDEFINITIONDATE: return createDATATYPEDEFINITIONDATE();
			case RifPackage.DATATYPEDEFINITIONDOCUMENT: return createDATATYPEDEFINITIONDOCUMENT();
			case RifPackage.DATATYPEDEFINITIONENUMERATION: return createDATATYPEDEFINITIONENUMERATION();
			case RifPackage.DATATYPEDEFINITIONINTEGER: return createDATATYPEDEFINITIONINTEGER();
			case RifPackage.DATATYPEDEFINITIONREAL: return createDATATYPEDEFINITIONREAL();
			case RifPackage.DATATYPEDEFINITIONSTRING: return createDATATYPEDEFINITIONSTRING();
			case RifPackage.DATATYPEDEFINITIONS_TYPE: return createDATATYPEDEFINITIONSType();
			case RifPackage.DATATYPEDEFINITIONXMLDATA: return createDATATYPEDEFINITIONXMLDATA();
			case RifPackage.DATATYPES_TYPE: return createDATATYPESType();
			case RifPackage.DEFAULTVALUE_TYPE: return createDEFAULTVALUEType();
			case RifPackage.DEFAULTVALUE_TYPE1: return createDEFAULTVALUEType1();
			case RifPackage.DEFAULTVALUE_TYPE2: return createDEFAULTVALUEType2();
			case RifPackage.DEFINITION_TYPE: return createDEFINITIONType();
			case RifPackage.DEFINITION_TYPE1: return createDEFINITIONType1();
			case RifPackage.DEFINITION_TYPE2: return createDEFINITIONType2();
			case RifPackage.DEFINITION_TYPE3: return createDEFINITIONType3();
			case RifPackage.DEFINITION_TYPE4: return createDEFINITIONType4();
			case RifPackage.DEFINITION_TYPE5: return createDEFINITIONType5();
			case RifPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RifPackage.EMBEDDEDVALUE: return createEMBEDDEDVALUE();
			case RifPackage.ENUMVALUE: return createENUMVALUE();
			case RifPackage.OBJECT_TYPE: return createOBJECTType();
			case RifPackage.PROPERTIES_TYPE: return createPROPERTIESType();
			case RifPackage.RELATIONGROUP: return createRELATIONGROUP();
			case RifPackage.RELATIONGROUPS_TYPE: return createRELATIONGROUPSType();
			case RifPackage.RELATIONGROUPS_TYPE1: return createRELATIONGROUPSType1();
			case RifPackage.RELATIONTYPE_TYPE: return createRELATIONTYPEType();
			case RifPackage.RIF: return createRIF();
			case RifPackage.SOURCE_TYPE: return createSOURCEType();
			case RifPackage.SPECATTRIBUTES_TYPE: return createSPECATTRIBUTESType();
			case RifPackage.SPECGROUP: return createSPECGROUP();
			case RifPackage.SPECGROUPS_TYPE: return createSPECGROUPSType();
			case RifPackage.SPECGROUPS_TYPE1: return createSPECGROUPSType1();
			case RifPackage.SPECHIERARCHIES_TYPE: return createSPECHIERARCHIESType();
			case RifPackage.SPECHIERARCHY: return createSPECHIERARCHY();
			case RifPackage.SPECHIERARCHYROOT: return createSPECHIERARCHYROOT();
			case RifPackage.SPECHIERARCHYROOTS_TYPE: return createSPECHIERARCHYROOTSType();
			case RifPackage.SPECHIERARCHYROOTS_TYPE1: return createSPECHIERARCHYROOTSType1();
			case RifPackage.SPECIFIEDVALUES_TYPE: return createSPECIFIEDVALUESType();
			case RifPackage.SPECOBJECT: return createSPECOBJECT();
			case RifPackage.SPECOBJECTS_TYPE: return createSPECOBJECTSType();
			case RifPackage.SPECOBJECTS_TYPE1: return createSPECOBJECTSType1();
			case RifPackage.SPECOBJECTS_TYPE2: return createSPECOBJECTSType2();
			case RifPackage.SPECRELATION: return createSPECRELATION();
			case RifPackage.SPECRELATIONS_TYPE: return createSPECRELATIONSType();
			case RifPackage.SPECRELATIONS_TYPE1: return createSPECRELATIONSType1();
			case RifPackage.SPECRELATIONS_TYPE2: return createSPECRELATIONSType2();
			case RifPackage.SPECTYPE: return createSPECTYPE();
			case RifPackage.SPECTYPES_TYPE: return createSPECTYPESType();
			case RifPackage.SPECTYPES_TYPE1: return createSPECTYPESType1();
			case RifPackage.TARGETGROUP_TYPE: return createTARGETGROUPType();
			case RifPackage.TARGET_TYPE: return createTARGETType();
			case RifPackage.TYPE_TYPE: return createTYPEType();
			case RifPackage.TYPE_TYPE1: return createTYPEType1();
			case RifPackage.TYPE_TYPE2: return createTYPEType2();
			case RifPackage.TYPE_TYPE3: return createTYPEType3();
			case RifPackage.TYPE_TYPE4: return createTYPEType4();
			case RifPackage.TYPE_TYPE5: return createTYPEType5();
			case RifPackage.TYPE_TYPE6: return createTYPEType6();
			case RifPackage.VALUES_TYPE: return createVALUESType();
			case RifPackage.VALUES_TYPE1: return createVALUESType1();
			case RifPackage.VALUES_TYPE2: return createVALUESType2();
			case RifPackage.VALUES_TYPE3: return createVALUESType3();
			case RifPackage.VALUES_TYPE4: return createVALUESType4();
			case RifPackage.XHTMLCONTENT: return createXHTMLCONTENT();
			case RifPackage.XMLCONTENT: return createXMLCONTENT();
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
			case RifPackage.ACCESSPOLICYACCESSMODEENUM:
				return createACCESSPOLICYACCESSMODEENUMFromString(eDataType, initialValue);
			case RifPackage.DATATYPEDEFINITIONDATEFORMATENUM:
				return createDATATYPEDEFINITIONDATEFORMATENUMFromString(eDataType, initialValue);
			case RifPackage.ACCESSPOLICYACCESSMODEENUM_OBJECT:
				return createACCESSPOLICYACCESSMODEENUMObjectFromString(eDataType, initialValue);
			case RifPackage.DATATYPEDEFINITIONDATEFORMATENUM_OBJECT:
				return createDATATYPEDEFINITIONDATEFORMATENUMObjectFromString(eDataType, initialValue);
			case RifPackage.REF:
				return createREFFromString(eDataType, initialValue);
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
			case RifPackage.ACCESSPOLICYACCESSMODEENUM:
				return convertACCESSPOLICYACCESSMODEENUMToString(eDataType, instanceValue);
			case RifPackage.DATATYPEDEFINITIONDATEFORMATENUM:
				return convertDATATYPEDEFINITIONDATEFORMATENUMToString(eDataType, instanceValue);
			case RifPackage.ACCESSPOLICYACCESSMODEENUM_OBJECT:
				return convertACCESSPOLICYACCESSMODEENUMObjectToString(eDataType, instanceValue);
			case RifPackage.DATATYPEDEFINITIONDATEFORMATENUM_OBJECT:
				return convertDATATYPEDEFINITIONDATEFORMATENUMObjectToString(eDataType, instanceValue);
			case RifPackage.REF:
				return convertREFToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICIESType createACCESSPOLICIESType() {
		ACCESSPOLICIESTypeImpl accesspoliciesType = new ACCESSPOLICIESTypeImpl();
		return accesspoliciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICY createACCESSPOLICY() {
		ACCESSPOLICYImpl accesspolicy = new ACCESSPOLICYImpl();
		return accesspolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONCOMPLEX createATTRIBUTEDEFINITIONCOMPLEX() {
		ATTRIBUTEDEFINITIONCOMPLEXImpl attributedefinitioncomplex = new ATTRIBUTEDEFINITIONCOMPLEXImpl();
		return attributedefinitioncomplex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONENUMERATION createATTRIBUTEDEFINITIONENUMERATION() {
		ATTRIBUTEDEFINITIONENUMERATIONImpl attributedefinitionenumeration = new ATTRIBUTEDEFINITIONENUMERATIONImpl();
		return attributedefinitionenumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSIMPLE createATTRIBUTEDEFINITIONSIMPLE() {
		ATTRIBUTEDEFINITIONSIMPLEImpl attributedefinitionsimple = new ATTRIBUTEDEFINITIONSIMPLEImpl();
		return attributedefinitionsimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSType createATTRIBUTEDEFINITIONSType() {
		ATTRIBUTEDEFINITIONSTypeImpl attributedefinitionsType = new ATTRIBUTEDEFINITIONSTypeImpl();
		return attributedefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEEMBEDDEDDOCUMENT createATTRIBUTEVALUEEMBEDDEDDOCUMENT() {
		ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl attributevalueembeddeddocument = new ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl();
		return attributevalueembeddeddocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEEMBEDDEDFILE createATTRIBUTEVALUEEMBEDDEDFILE() {
		ATTRIBUTEVALUEEMBEDDEDFILEImpl attributevalueembeddedfile = new ATTRIBUTEVALUEEMBEDDEDFILEImpl();
		return attributevalueembeddedfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEENUMERATION createATTRIBUTEVALUEENUMERATION() {
		ATTRIBUTEVALUEENUMERATIONImpl attributevalueenumeration = new ATTRIBUTEVALUEENUMERATIONImpl();
		return attributevalueenumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEFILEREFERENCE createATTRIBUTEVALUEFILEREFERENCE() {
		ATTRIBUTEVALUEFILEREFERENCEImpl attributevaluefilereference = new ATTRIBUTEVALUEFILEREFERENCEImpl();
		return attributevaluefilereference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESIMPLE createATTRIBUTEVALUESIMPLE() {
		ATTRIBUTEVALUESIMPLEImpl attributevaluesimple = new ATTRIBUTEVALUESIMPLEImpl();
		return attributevaluesimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESType createATTRIBUTEVALUESType() {
		ATTRIBUTEVALUESTypeImpl attributevaluesType = new ATTRIBUTEVALUESTypeImpl();
		return attributevaluesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEXMLDATA createATTRIBUTEVALUEXMLDATA() {
		ATTRIBUTEVALUEXMLDATAImpl attributevaluexmldata = new ATTRIBUTEVALUEXMLDATAImpl();
		return attributevaluexmldata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BINARYCONTENT createBINARYCONTENT() {
		BINARYCONTENTImpl binarycontent = new BINARYCONTENTImpl();
		return binarycontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHILDRENType createCHILDRENType() {
		CHILDRENTypeImpl childrenType = new CHILDRENTypeImpl();
		return childrenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHILDRENType1 createCHILDRENType1() {
		CHILDRENType1Impl childrenType1 = new CHILDRENType1Impl();
		return childrenType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONBINARYFILE createDATATYPEDEFINITIONBINARYFILE() {
		DATATYPEDEFINITIONBINARYFILEImpl datatypedefinitionbinaryfile = new DATATYPEDEFINITIONBINARYFILEImpl();
		return datatypedefinitionbinaryfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONBOOLEAN createDATATYPEDEFINITIONBOOLEAN() {
		DATATYPEDEFINITIONBOOLEANImpl datatypedefinitionboolean = new DATATYPEDEFINITIONBOOLEANImpl();
		return datatypedefinitionboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONDATE createDATATYPEDEFINITIONDATE() {
		DATATYPEDEFINITIONDATEImpl datatypedefinitiondate = new DATATYPEDEFINITIONDATEImpl();
		return datatypedefinitiondate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONDOCUMENT createDATATYPEDEFINITIONDOCUMENT() {
		DATATYPEDEFINITIONDOCUMENTImpl datatypedefinitiondocument = new DATATYPEDEFINITIONDOCUMENTImpl();
		return datatypedefinitiondocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONENUMERATION createDATATYPEDEFINITIONENUMERATION() {
		DATATYPEDEFINITIONENUMERATIONImpl datatypedefinitionenumeration = new DATATYPEDEFINITIONENUMERATIONImpl();
		return datatypedefinitionenumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONINTEGER createDATATYPEDEFINITIONINTEGER() {
		DATATYPEDEFINITIONINTEGERImpl datatypedefinitioninteger = new DATATYPEDEFINITIONINTEGERImpl();
		return datatypedefinitioninteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONREAL createDATATYPEDEFINITIONREAL() {
		DATATYPEDEFINITIONREALImpl datatypedefinitionreal = new DATATYPEDEFINITIONREALImpl();
		return datatypedefinitionreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONSTRING createDATATYPEDEFINITIONSTRING() {
		DATATYPEDEFINITIONSTRINGImpl datatypedefinitionstring = new DATATYPEDEFINITIONSTRINGImpl();
		return datatypedefinitionstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONSType createDATATYPEDEFINITIONSType() {
		DATATYPEDEFINITIONSTypeImpl datatypedefinitionsType = new DATATYPEDEFINITIONSTypeImpl();
		return datatypedefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONXMLDATA createDATATYPEDEFINITIONXMLDATA() {
		DATATYPEDEFINITIONXMLDATAImpl datatypedefinitionxmldata = new DATATYPEDEFINITIONXMLDATAImpl();
		return datatypedefinitionxmldata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESType createDATATYPESType() {
		DATATYPESTypeImpl datatypesType = new DATATYPESTypeImpl();
		return datatypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType createDEFAULTVALUEType() {
		DEFAULTVALUETypeImpl defaultvalueType = new DEFAULTVALUETypeImpl();
		return defaultvalueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType1 createDEFAULTVALUEType1() {
		DEFAULTVALUEType1Impl defaultvalueType1 = new DEFAULTVALUEType1Impl();
		return defaultvalueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType2 createDEFAULTVALUEType2() {
		DEFAULTVALUEType2Impl defaultvalueType2 = new DEFAULTVALUEType2Impl();
		return defaultvalueType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType createDEFINITIONType() {
		DEFINITIONTypeImpl definitionType = new DEFINITIONTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType1 createDEFINITIONType1() {
		DEFINITIONType1Impl definitionType1 = new DEFINITIONType1Impl();
		return definitionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType2 createDEFINITIONType2() {
		DEFINITIONType2Impl definitionType2 = new DEFINITIONType2Impl();
		return definitionType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType3 createDEFINITIONType3() {
		DEFINITIONType3Impl definitionType3 = new DEFINITIONType3Impl();
		return definitionType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType4 createDEFINITIONType4() {
		DEFINITIONType4Impl definitionType4 = new DEFINITIONType4Impl();
		return definitionType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType5 createDEFINITIONType5() {
		DEFINITIONType5Impl definitionType5 = new DEFINITIONType5Impl();
		return definitionType5;
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
	public EMBEDDEDVALUE createEMBEDDEDVALUE() {
		EMBEDDEDVALUEImpl embeddedvalue = new EMBEDDEDVALUEImpl();
		return embeddedvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMVALUE createENUMVALUE() {
		ENUMVALUEImpl enumvalue = new ENUMVALUEImpl();
		return enumvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBJECTType createOBJECTType() {
		OBJECTTypeImpl objectType = new OBJECTTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROPERTIESType createPROPERTIESType() {
		PROPERTIESTypeImpl propertiesType = new PROPERTIESTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUP createRELATIONGROUP() {
		RELATIONGROUPImpl relationgroup = new RELATIONGROUPImpl();
		return relationgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUPSType createRELATIONGROUPSType() {
		RELATIONGROUPSTypeImpl relationgroupsType = new RELATIONGROUPSTypeImpl();
		return relationgroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUPSType1 createRELATIONGROUPSType1() {
		RELATIONGROUPSType1Impl relationgroupsType1 = new RELATIONGROUPSType1Impl();
		return relationgroupsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONTYPEType createRELATIONTYPEType() {
		RELATIONTYPETypeImpl relationtypeType = new RELATIONTYPETypeImpl();
		return relationtypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIF createRIF() {
		RIFImpl rif = new RIFImpl();
		return rif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCEType createSOURCEType() {
		SOURCETypeImpl sourceType = new SOURCETypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECATTRIBUTESType createSPECATTRIBUTESType() {
		SPECATTRIBUTESTypeImpl specattributesType = new SPECATTRIBUTESTypeImpl();
		return specattributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECGROUP createSPECGROUP() {
		SPECGROUPImpl specgroup = new SPECGROUPImpl();
		return specgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECGROUPSType createSPECGROUPSType() {
		SPECGROUPSTypeImpl specgroupsType = new SPECGROUPSTypeImpl();
		return specgroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECGROUPSType1 createSPECGROUPSType1() {
		SPECGROUPSType1Impl specgroupsType1 = new SPECGROUPSType1Impl();
		return specgroupsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHIESType createSPECHIERARCHIESType() {
		SPECHIERARCHIESTypeImpl spechierarchiesType = new SPECHIERARCHIESTypeImpl();
		return spechierarchiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHY createSPECHIERARCHY() {
		SPECHIERARCHYImpl spechierarchy = new SPECHIERARCHYImpl();
		return spechierarchy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHYROOT createSPECHIERARCHYROOT() {
		SPECHIERARCHYROOTImpl spechierarchyroot = new SPECHIERARCHYROOTImpl();
		return spechierarchyroot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHYROOTSType createSPECHIERARCHYROOTSType() {
		SPECHIERARCHYROOTSTypeImpl spechierarchyrootsType = new SPECHIERARCHYROOTSTypeImpl();
		return spechierarchyrootsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHYROOTSType1 createSPECHIERARCHYROOTSType1() {
		SPECHIERARCHYROOTSType1Impl spechierarchyrootsType1 = new SPECHIERARCHYROOTSType1Impl();
		return spechierarchyrootsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFIEDVALUESType createSPECIFIEDVALUESType() {
		SPECIFIEDVALUESTypeImpl specifiedvaluesType = new SPECIFIEDVALUESTypeImpl();
		return specifiedvaluesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECT createSPECOBJECT() {
		SPECOBJECTImpl specobject = new SPECOBJECTImpl();
		return specobject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType createSPECOBJECTSType() {
		SPECOBJECTSTypeImpl specobjectsType = new SPECOBJECTSTypeImpl();
		return specobjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType1 createSPECOBJECTSType1() {
		SPECOBJECTSType1Impl specobjectsType1 = new SPECOBJECTSType1Impl();
		return specobjectsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType2 createSPECOBJECTSType2() {
		SPECOBJECTSType2Impl specobjectsType2 = new SPECOBJECTSType2Impl();
		return specobjectsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATION createSPECRELATION() {
		SPECRELATIONImpl specrelation = new SPECRELATIONImpl();
		return specrelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType createSPECRELATIONSType() {
		SPECRELATIONSTypeImpl specrelationsType = new SPECRELATIONSTypeImpl();
		return specrelationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType1 createSPECRELATIONSType1() {
		SPECRELATIONSType1Impl specrelationsType1 = new SPECRELATIONSType1Impl();
		return specrelationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType2 createSPECRELATIONSType2() {
		SPECRELATIONSType2Impl specrelationsType2 = new SPECRELATIONSType2Impl();
		return specrelationsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECTYPE createSPECTYPE() {
		SPECTYPEImpl spectype = new SPECTYPEImpl();
		return spectype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECTYPESType createSPECTYPESType() {
		SPECTYPESTypeImpl spectypesType = new SPECTYPESTypeImpl();
		return spectypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECTYPESType1 createSPECTYPESType1() {
		SPECTYPESType1Impl spectypesType1 = new SPECTYPESType1Impl();
		return spectypesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARGETGROUPType createTARGETGROUPType() {
		TARGETGROUPTypeImpl targetgroupType = new TARGETGROUPTypeImpl();
		return targetgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARGETType createTARGETType() {
		TARGETTypeImpl targetType = new TARGETTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType createTYPEType() {
		TYPETypeImpl typeType = new TYPETypeImpl();
		return typeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType1 createTYPEType1() {
		TYPEType1Impl typeType1 = new TYPEType1Impl();
		return typeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType2 createTYPEType2() {
		TYPEType2Impl typeType2 = new TYPEType2Impl();
		return typeType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType3 createTYPEType3() {
		TYPEType3Impl typeType3 = new TYPEType3Impl();
		return typeType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType4 createTYPEType4() {
		TYPEType4Impl typeType4 = new TYPEType4Impl();
		return typeType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType5 createTYPEType5() {
		TYPEType5Impl typeType5 = new TYPEType5Impl();
		return typeType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType6 createTYPEType6() {
		TYPEType6Impl typeType6 = new TYPEType6Impl();
		return typeType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType createVALUESType() {
		VALUESTypeImpl valuesType = new VALUESTypeImpl();
		return valuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType1 createVALUESType1() {
		VALUESType1Impl valuesType1 = new VALUESType1Impl();
		return valuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType2 createVALUESType2() {
		VALUESType2Impl valuesType2 = new VALUESType2Impl();
		return valuesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType3 createVALUESType3() {
		VALUESType3Impl valuesType3 = new VALUESType3Impl();
		return valuesType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType4 createVALUESType4() {
		VALUESType4Impl valuesType4 = new VALUESType4Impl();
		return valuesType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XHTMLCONTENT createXHTMLCONTENT() {
		XHTMLCONTENTImpl xhtmlcontent = new XHTMLCONTENTImpl();
		return xhtmlcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLCONTENT createXMLCONTENT() {
		XMLCONTENTImpl xmlcontent = new XMLCONTENTImpl();
		return xmlcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICYACCESSMODEENUM createACCESSPOLICYACCESSMODEENUMFromString(EDataType eDataType, String initialValue) {
		ACCESSPOLICYACCESSMODEENUM result = ACCESSPOLICYACCESSMODEENUM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertACCESSPOLICYACCESSMODEENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONDATEFORMATENUM createDATATYPEDEFINITIONDATEFORMATENUMFromString(EDataType eDataType, String initialValue) {
		DATATYPEDEFINITIONDATEFORMATENUM result = DATATYPEDEFINITIONDATEFORMATENUM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDATATYPEDEFINITIONDATEFORMATENUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICYACCESSMODEENUM createACCESSPOLICYACCESSMODEENUMObjectFromString(EDataType eDataType, String initialValue) {
		return createACCESSPOLICYACCESSMODEENUMFromString(RifPackage.Literals.ACCESSPOLICYACCESSMODEENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertACCESSPOLICYACCESSMODEENUMObjectToString(EDataType eDataType, Object instanceValue) {
		return convertACCESSPOLICYACCESSMODEENUMToString(RifPackage.Literals.ACCESSPOLICYACCESSMODEENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONDATEFORMATENUM createDATATYPEDEFINITIONDATEFORMATENUMObjectFromString(EDataType eDataType, String initialValue) {
		return createDATATYPEDEFINITIONDATEFORMATENUMFromString(RifPackage.Literals.DATATYPEDEFINITIONDATEFORMATENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDATATYPEDEFINITIONDATEFORMATENUMObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDATATYPEDEFINITIONDATEFORMATENUMToString(RifPackage.Literals.DATATYPEDEFINITIONDATEFORMATENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createREFFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertREFToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifPackage getRifPackage() {
		return (RifPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RifPackage getPackage() {
		return RifPackage.eINSTANCE;
	}

} //RifFactoryImpl
