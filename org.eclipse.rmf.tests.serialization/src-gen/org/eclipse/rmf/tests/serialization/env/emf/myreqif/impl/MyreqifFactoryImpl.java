/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyreqifFactoryImpl extends EFactoryImpl implements MyreqifFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MyreqifFactory init() {
		try {
			MyreqifFactory theMyreqifFactory = (MyreqifFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/rmf/tests/serialization/env/myreqif.xsd"); 
			if (theMyreqifFactory != null) {
				return theMyreqifFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MyreqifFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyreqifFactoryImpl() {
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
			case MyreqifPackage.ALTERNATIVEID: return createALTERNATIVEID();
			case MyreqifPackage.ALTERNATIVEID_TYPE: return createALTERNATIVEIDType();
			case MyreqifPackage.ALTERNATIVEID_TYPE1: return createALTERNATIVEIDType1();
			case MyreqifPackage.ALTERNATIVEID_TYPE2: return createALTERNATIVEIDType2();
			case MyreqifPackage.ALTERNATIVEID_TYPE3: return createALTERNATIVEIDType3();
			case MyreqifPackage.ALTERNATIVEID_TYPE4: return createALTERNATIVEIDType4();
			case MyreqifPackage.ALTERNATIVEID_TYPE5: return createALTERNATIVEIDType5();
			case MyreqifPackage.ALTERNATIVEID_TYPE6: return createALTERNATIVEIDType6();
			case MyreqifPackage.ALTERNATIVEID_TYPE7: return createALTERNATIVEIDType7();
			case MyreqifPackage.ALTERNATIVEID_TYPE8: return createALTERNATIVEIDType8();
			case MyreqifPackage.ALTERNATIVEID_TYPE9: return createALTERNATIVEIDType9();
			case MyreqifPackage.ALTERNATIVEID_TYPE10: return createALTERNATIVEIDType10();
			case MyreqifPackage.ALTERNATIVEID_TYPE11: return createALTERNATIVEIDType11();
			case MyreqifPackage.ALTERNATIVEID_TYPE12: return createALTERNATIVEIDType12();
			case MyreqifPackage.ALTERNATIVEID_TYPE13: return createALTERNATIVEIDType13();
			case MyreqifPackage.ALTERNATIVEID_TYPE14: return createALTERNATIVEIDType14();
			case MyreqifPackage.ALTERNATIVEID_TYPE15: return createALTERNATIVEIDType15();
			case MyreqifPackage.ALTERNATIVEID_TYPE16: return createALTERNATIVEIDType16();
			case MyreqifPackage.ALTERNATIVEID_TYPE17: return createALTERNATIVEIDType17();
			case MyreqifPackage.ALTERNATIVEID_TYPE18: return createALTERNATIVEIDType18();
			case MyreqifPackage.ALTERNATIVEID_TYPE19: return createALTERNATIVEIDType19();
			case MyreqifPackage.ALTERNATIVEID_TYPE20: return createALTERNATIVEIDType20();
			case MyreqifPackage.ALTERNATIVEID_TYPE21: return createALTERNATIVEIDType21();
			case MyreqifPackage.ALTERNATIVEID_TYPE22: return createALTERNATIVEIDType22();
			case MyreqifPackage.ALTERNATIVEID_TYPE23: return createALTERNATIVEIDType23();
			case MyreqifPackage.ATTRIBUTEDEFINITIONBOOLEAN: return createATTRIBUTEDEFINITIONBOOLEAN();
			case MyreqifPackage.ATTRIBUTEDEFINITIONDATE: return createATTRIBUTEDEFINITIONDATE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION: return createATTRIBUTEDEFINITIONENUMERATION();
			case MyreqifPackage.ATTRIBUTEDEFINITIONINTEGER: return createATTRIBUTEDEFINITIONINTEGER();
			case MyreqifPackage.ATTRIBUTEDEFINITIONREAL: return createATTRIBUTEDEFINITIONREAL();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING: return createATTRIBUTEDEFINITIONSTRING();
			case MyreqifPackage.ATTRIBUTEDEFINITIONXHTML: return createATTRIBUTEDEFINITIONXHTML();
			case MyreqifPackage.ATTRIBUTEVALUEBOOLEAN: return createATTRIBUTEVALUEBOOLEAN();
			case MyreqifPackage.ATTRIBUTEVALUEDATE: return createATTRIBUTEVALUEDATE();
			case MyreqifPackage.ATTRIBUTEVALUEENUMERATION: return createATTRIBUTEVALUEENUMERATION();
			case MyreqifPackage.ATTRIBUTEVALUEINTEGER: return createATTRIBUTEVALUEINTEGER();
			case MyreqifPackage.ATTRIBUTEVALUEREAL: return createATTRIBUTEVALUEREAL();
			case MyreqifPackage.ATTRIBUTEVALUESTRING: return createATTRIBUTEVALUESTRING();
			case MyreqifPackage.ATTRIBUTEVALUEXHTML: return createATTRIBUTEVALUEXHTML();
			case MyreqifPackage.CHILDREN_TYPE: return createCHILDRENType();
			case MyreqifPackage.CHILDREN_TYPE1: return createCHILDRENType1();
			case MyreqifPackage.CORECONTENT_TYPE: return createCORECONTENTType();
			case MyreqifPackage.DATATYPEDEFINITIONBOOLEAN: return createDATATYPEDEFINITIONBOOLEAN();
			case MyreqifPackage.DATATYPEDEFINITIONDATE: return createDATATYPEDEFINITIONDATE();
			case MyreqifPackage.DATATYPEDEFINITIONENUMERATION: return createDATATYPEDEFINITIONENUMERATION();
			case MyreqifPackage.DATATYPEDEFINITIONINTEGER: return createDATATYPEDEFINITIONINTEGER();
			case MyreqifPackage.DATATYPEDEFINITIONREAL: return createDATATYPEDEFINITIONREAL();
			case MyreqifPackage.DATATYPEDEFINITIONSTRING: return createDATATYPEDEFINITIONSTRING();
			case MyreqifPackage.DATATYPEDEFINITIONXHTML: return createDATATYPEDEFINITIONXHTML();
			case MyreqifPackage.DATATYPES_TYPE: return createDATATYPESType();
			case MyreqifPackage.DEFAULTVALUE_TYPE: return createDEFAULTVALUEType();
			case MyreqifPackage.DEFAULTVALUE_TYPE1: return createDEFAULTVALUEType1();
			case MyreqifPackage.DEFAULTVALUE_TYPE2: return createDEFAULTVALUEType2();
			case MyreqifPackage.DEFAULTVALUE_TYPE3: return createDEFAULTVALUEType3();
			case MyreqifPackage.DEFAULTVALUE_TYPE4: return createDEFAULTVALUEType4();
			case MyreqifPackage.DEFAULTVALUE_TYPE5: return createDEFAULTVALUEType5();
			case MyreqifPackage.DEFAULTVALUE_TYPE6: return createDEFAULTVALUEType6();
			case MyreqifPackage.DEFINITION_TYPE: return createDEFINITIONType();
			case MyreqifPackage.DEFINITION_TYPE1: return createDEFINITIONType1();
			case MyreqifPackage.DEFINITION_TYPE2: return createDEFINITIONType2();
			case MyreqifPackage.DEFINITION_TYPE3: return createDEFINITIONType3();
			case MyreqifPackage.DEFINITION_TYPE4: return createDEFINITIONType4();
			case MyreqifPackage.DEFINITION_TYPE5: return createDEFINITIONType5();
			case MyreqifPackage.DEFINITION_TYPE6: return createDEFINITIONType6();
			case MyreqifPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case MyreqifPackage.EDITABLEATTS_TYPE: return createEDITABLEATTSType();
			case MyreqifPackage.EMBEDDEDVALUE: return createEMBEDDEDVALUE();
			case MyreqifPackage.ENUMVALUE: return createENUMVALUE();
			case MyreqifPackage.OBJECT_TYPE: return createOBJECTType();
			case MyreqifPackage.PROPERTIES_TYPE: return createPROPERTIESType();
			case MyreqifPackage.RELATIONGROUP: return createRELATIONGROUP();
			case MyreqifPackage.RELATIONGROUPTYPE: return createRELATIONGROUPTYPE();
			case MyreqifPackage.REQIF: return createREQIF();
			case MyreqifPackage.REQIFCONTENT: return createREQIFCONTENT();
			case MyreqifPackage.REQIFHEADER: return createREQIFHEADER();
			case MyreqifPackage.REQIFTOOLEXTENSION: return createREQIFTOOLEXTENSION();
			case MyreqifPackage.SOURCESPECIFICATION_TYPE: return createSOURCESPECIFICATIONType();
			case MyreqifPackage.SOURCE_TYPE: return createSOURCEType();
			case MyreqifPackage.SPECATTRIBUTES_TYPE: return createSPECATTRIBUTESType();
			case MyreqifPackage.SPECATTRIBUTES_TYPE1: return createSPECATTRIBUTESType1();
			case MyreqifPackage.SPECATTRIBUTES_TYPE2: return createSPECATTRIBUTESType2();
			case MyreqifPackage.SPECATTRIBUTES_TYPE3: return createSPECATTRIBUTESType3();
			case MyreqifPackage.SPECHIERARCHY: return createSPECHIERARCHY();
			case MyreqifPackage.SPECIFICATION: return createSPECIFICATION();
			case MyreqifPackage.SPECIFICATIONS_TYPE: return createSPECIFICATIONSType();
			case MyreqifPackage.SPECIFICATIONTYPE: return createSPECIFICATIONTYPE();
			case MyreqifPackage.SPECIFIEDVALUES_TYPE: return createSPECIFIEDVALUESType();
			case MyreqifPackage.SPECOBJECT: return createSPECOBJECT();
			case MyreqifPackage.SPECOBJECTS_TYPE: return createSPECOBJECTSType();
			case MyreqifPackage.SPECOBJECTTYPE: return createSPECOBJECTTYPE();
			case MyreqifPackage.SPECRELATION: return createSPECRELATION();
			case MyreqifPackage.SPECRELATIONGROUPS_TYPE: return createSPECRELATIONGROUPSType();
			case MyreqifPackage.SPECRELATIONS_TYPE: return createSPECRELATIONSType();
			case MyreqifPackage.SPECRELATIONS_TYPE1: return createSPECRELATIONSType1();
			case MyreqifPackage.SPECRELATIONTYPE: return createSPECRELATIONTYPE();
			case MyreqifPackage.SPECTYPES_TYPE: return createSPECTYPESType();
			case MyreqifPackage.TARGETSPECIFICATION_TYPE: return createTARGETSPECIFICATIONType();
			case MyreqifPackage.TARGET_TYPE: return createTARGETType();
			case MyreqifPackage.THEHEADER_TYPE: return createTHEHEADERType();
			case MyreqifPackage.TOOLEXTENSIONS_TYPE: return createTOOLEXTENSIONSType();
			case MyreqifPackage.TYPE_TYPE: return createTYPEType();
			case MyreqifPackage.TYPE_TYPE1: return createTYPEType1();
			case MyreqifPackage.TYPE_TYPE2: return createTYPEType2();
			case MyreqifPackage.TYPE_TYPE3: return createTYPEType3();
			case MyreqifPackage.TYPE_TYPE4: return createTYPEType4();
			case MyreqifPackage.TYPE_TYPE5: return createTYPEType5();
			case MyreqifPackage.TYPE_TYPE6: return createTYPEType6();
			case MyreqifPackage.TYPE_TYPE7: return createTYPEType7();
			case MyreqifPackage.TYPE_TYPE8: return createTYPEType8();
			case MyreqifPackage.TYPE_TYPE9: return createTYPEType9();
			case MyreqifPackage.TYPE_TYPE10: return createTYPEType10();
			case MyreqifPackage.VALUES_TYPE: return createVALUESType();
			case MyreqifPackage.VALUES_TYPE1: return createVALUESType1();
			case MyreqifPackage.VALUES_TYPE2: return createVALUESType2();
			case MyreqifPackage.VALUES_TYPE3: return createVALUESType3();
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
			case MyreqifPackage.GLOBALREF:
				return createGLOBALREFFromString(eDataType, initialValue);
			case MyreqifPackage.LOCALREF:
				return createLOCALREFFromString(eDataType, initialValue);
			case MyreqifPackage.XHTMLCONTENT:
				return createXHTMLCONTENTFromString(eDataType, initialValue);
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
			case MyreqifPackage.GLOBALREF:
				return convertGLOBALREFToString(eDataType, instanceValue);
			case MyreqifPackage.LOCALREF:
				return convertLOCALREFToString(eDataType, instanceValue);
			case MyreqifPackage.XHTMLCONTENT:
				return convertXHTMLCONTENTToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEID createALTERNATIVEID() {
		ALTERNATIVEIDImpl alternativeid = new ALTERNATIVEIDImpl();
		return alternativeid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType createALTERNATIVEIDType() {
		ALTERNATIVEIDTypeImpl alternativeidType = new ALTERNATIVEIDTypeImpl();
		return alternativeidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType1 createALTERNATIVEIDType1() {
		ALTERNATIVEIDType1Impl alternativeidType1 = new ALTERNATIVEIDType1Impl();
		return alternativeidType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType2 createALTERNATIVEIDType2() {
		ALTERNATIVEIDType2Impl alternativeidType2 = new ALTERNATIVEIDType2Impl();
		return alternativeidType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType3 createALTERNATIVEIDType3() {
		ALTERNATIVEIDType3Impl alternativeidType3 = new ALTERNATIVEIDType3Impl();
		return alternativeidType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType4 createALTERNATIVEIDType4() {
		ALTERNATIVEIDType4Impl alternativeidType4 = new ALTERNATIVEIDType4Impl();
		return alternativeidType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType5 createALTERNATIVEIDType5() {
		ALTERNATIVEIDType5Impl alternativeidType5 = new ALTERNATIVEIDType5Impl();
		return alternativeidType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType6 createALTERNATIVEIDType6() {
		ALTERNATIVEIDType6Impl alternativeidType6 = new ALTERNATIVEIDType6Impl();
		return alternativeidType6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType7 createALTERNATIVEIDType7() {
		ALTERNATIVEIDType7Impl alternativeidType7 = new ALTERNATIVEIDType7Impl();
		return alternativeidType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType8 createALTERNATIVEIDType8() {
		ALTERNATIVEIDType8Impl alternativeidType8 = new ALTERNATIVEIDType8Impl();
		return alternativeidType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType9 createALTERNATIVEIDType9() {
		ALTERNATIVEIDType9Impl alternativeidType9 = new ALTERNATIVEIDType9Impl();
		return alternativeidType9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType10 createALTERNATIVEIDType10() {
		ALTERNATIVEIDType10Impl alternativeidType10 = new ALTERNATIVEIDType10Impl();
		return alternativeidType10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType11 createALTERNATIVEIDType11() {
		ALTERNATIVEIDType11Impl alternativeidType11 = new ALTERNATIVEIDType11Impl();
		return alternativeidType11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType12 createALTERNATIVEIDType12() {
		ALTERNATIVEIDType12Impl alternativeidType12 = new ALTERNATIVEIDType12Impl();
		return alternativeidType12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType13 createALTERNATIVEIDType13() {
		ALTERNATIVEIDType13Impl alternativeidType13 = new ALTERNATIVEIDType13Impl();
		return alternativeidType13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType14 createALTERNATIVEIDType14() {
		ALTERNATIVEIDType14Impl alternativeidType14 = new ALTERNATIVEIDType14Impl();
		return alternativeidType14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType15 createALTERNATIVEIDType15() {
		ALTERNATIVEIDType15Impl alternativeidType15 = new ALTERNATIVEIDType15Impl();
		return alternativeidType15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType16 createALTERNATIVEIDType16() {
		ALTERNATIVEIDType16Impl alternativeidType16 = new ALTERNATIVEIDType16Impl();
		return alternativeidType16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType17 createALTERNATIVEIDType17() {
		ALTERNATIVEIDType17Impl alternativeidType17 = new ALTERNATIVEIDType17Impl();
		return alternativeidType17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType18 createALTERNATIVEIDType18() {
		ALTERNATIVEIDType18Impl alternativeidType18 = new ALTERNATIVEIDType18Impl();
		return alternativeidType18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType19 createALTERNATIVEIDType19() {
		ALTERNATIVEIDType19Impl alternativeidType19 = new ALTERNATIVEIDType19Impl();
		return alternativeidType19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType20 createALTERNATIVEIDType20() {
		ALTERNATIVEIDType20Impl alternativeidType20 = new ALTERNATIVEIDType20Impl();
		return alternativeidType20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType21 createALTERNATIVEIDType21() {
		ALTERNATIVEIDType21Impl alternativeidType21 = new ALTERNATIVEIDType21Impl();
		return alternativeidType21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType22 createALTERNATIVEIDType22() {
		ALTERNATIVEIDType22Impl alternativeidType22 = new ALTERNATIVEIDType22Impl();
		return alternativeidType22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType23 createALTERNATIVEIDType23() {
		ALTERNATIVEIDType23Impl alternativeidType23 = new ALTERNATIVEIDType23Impl();
		return alternativeidType23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONBOOLEAN createATTRIBUTEDEFINITIONBOOLEAN() {
		ATTRIBUTEDEFINITIONBOOLEANImpl attributedefinitionboolean = new ATTRIBUTEDEFINITIONBOOLEANImpl();
		return attributedefinitionboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONDATE createATTRIBUTEDEFINITIONDATE() {
		ATTRIBUTEDEFINITIONDATEImpl attributedefinitiondate = new ATTRIBUTEDEFINITIONDATEImpl();
		return attributedefinitiondate;
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
	public ATTRIBUTEDEFINITIONINTEGER createATTRIBUTEDEFINITIONINTEGER() {
		ATTRIBUTEDEFINITIONINTEGERImpl attributedefinitioninteger = new ATTRIBUTEDEFINITIONINTEGERImpl();
		return attributedefinitioninteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONREAL createATTRIBUTEDEFINITIONREAL() {
		ATTRIBUTEDEFINITIONREALImpl attributedefinitionreal = new ATTRIBUTEDEFINITIONREALImpl();
		return attributedefinitionreal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSTRING createATTRIBUTEDEFINITIONSTRING() {
		ATTRIBUTEDEFINITIONSTRINGImpl attributedefinitionstring = new ATTRIBUTEDEFINITIONSTRINGImpl();
		return attributedefinitionstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONXHTML createATTRIBUTEDEFINITIONXHTML() {
		ATTRIBUTEDEFINITIONXHTMLImpl attributedefinitionxhtml = new ATTRIBUTEDEFINITIONXHTMLImpl();
		return attributedefinitionxhtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEBOOLEAN createATTRIBUTEVALUEBOOLEAN() {
		ATTRIBUTEVALUEBOOLEANImpl attributevalueboolean = new ATTRIBUTEVALUEBOOLEANImpl();
		return attributevalueboolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEDATE createATTRIBUTEVALUEDATE() {
		ATTRIBUTEVALUEDATEImpl attributevaluedate = new ATTRIBUTEVALUEDATEImpl();
		return attributevaluedate;
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
	public ATTRIBUTEVALUEINTEGER createATTRIBUTEVALUEINTEGER() {
		ATTRIBUTEVALUEINTEGERImpl attributevalueinteger = new ATTRIBUTEVALUEINTEGERImpl();
		return attributevalueinteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEREAL createATTRIBUTEVALUEREAL() {
		ATTRIBUTEVALUEREALImpl attributevaluereal = new ATTRIBUTEVALUEREALImpl();
		return attributevaluereal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESTRING createATTRIBUTEVALUESTRING() {
		ATTRIBUTEVALUESTRINGImpl attributevaluestring = new ATTRIBUTEVALUESTRINGImpl();
		return attributevaluestring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUEXHTML createATTRIBUTEVALUEXHTML() {
		ATTRIBUTEVALUEXHTMLImpl attributevaluexhtml = new ATTRIBUTEVALUEXHTMLImpl();
		return attributevaluexhtml;
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
	public CORECONTENTType createCORECONTENTType() {
		CORECONTENTTypeImpl corecontentType = new CORECONTENTTypeImpl();
		return corecontentType;
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
	public DATATYPEDEFINITIONXHTML createDATATYPEDEFINITIONXHTML() {
		DATATYPEDEFINITIONXHTMLImpl datatypedefinitionxhtml = new DATATYPEDEFINITIONXHTMLImpl();
		return datatypedefinitionxhtml;
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
	public DEFAULTVALUEType3 createDEFAULTVALUEType3() {
		DEFAULTVALUEType3Impl defaultvalueType3 = new DEFAULTVALUEType3Impl();
		return defaultvalueType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType4 createDEFAULTVALUEType4() {
		DEFAULTVALUEType4Impl defaultvalueType4 = new DEFAULTVALUEType4Impl();
		return defaultvalueType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType5 createDEFAULTVALUEType5() {
		DEFAULTVALUEType5Impl defaultvalueType5 = new DEFAULTVALUEType5Impl();
		return defaultvalueType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType6 createDEFAULTVALUEType6() {
		DEFAULTVALUEType6Impl defaultvalueType6 = new DEFAULTVALUEType6Impl();
		return defaultvalueType6;
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
	public DEFINITIONType6 createDEFINITIONType6() {
		DEFINITIONType6Impl definitionType6 = new DEFINITIONType6Impl();
		return definitionType6;
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
	public EDITABLEATTSType createEDITABLEATTSType() {
		EDITABLEATTSTypeImpl editableattsType = new EDITABLEATTSTypeImpl();
		return editableattsType;
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
	public RELATIONGROUPTYPE createRELATIONGROUPTYPE() {
		RELATIONGROUPTYPEImpl relationgrouptype = new RELATIONGROUPTYPEImpl();
		return relationgrouptype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIF createREQIF() {
		REQIFImpl reqif = new REQIFImpl();
		return reqif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIFCONTENT createREQIFCONTENT() {
		REQIFCONTENTImpl reqifcontent = new REQIFCONTENTImpl();
		return reqifcontent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIFHEADER createREQIFHEADER() {
		REQIFHEADERImpl reqifheader = new REQIFHEADERImpl();
		return reqifheader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REQIFTOOLEXTENSION createREQIFTOOLEXTENSION() {
		REQIFTOOLEXTENSIONImpl reqiftoolextension = new REQIFTOOLEXTENSIONImpl();
		return reqiftoolextension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCESPECIFICATIONType createSOURCESPECIFICATIONType() {
		SOURCESPECIFICATIONTypeImpl sourcespecificationType = new SOURCESPECIFICATIONTypeImpl();
		return sourcespecificationType;
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
	public SPECATTRIBUTESType1 createSPECATTRIBUTESType1() {
		SPECATTRIBUTESType1Impl specattributesType1 = new SPECATTRIBUTESType1Impl();
		return specattributesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECATTRIBUTESType2 createSPECATTRIBUTESType2() {
		SPECATTRIBUTESType2Impl specattributesType2 = new SPECATTRIBUTESType2Impl();
		return specattributesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECATTRIBUTESType3 createSPECATTRIBUTESType3() {
		SPECATTRIBUTESType3Impl specattributesType3 = new SPECATTRIBUTESType3Impl();
		return specattributesType3;
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
	public SPECIFICATION createSPECIFICATION() {
		SPECIFICATIONImpl specification = new SPECIFICATIONImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFICATIONSType createSPECIFICATIONSType() {
		SPECIFICATIONSTypeImpl specificationsType = new SPECIFICATIONSTypeImpl();
		return specificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFICATIONTYPE createSPECIFICATIONTYPE() {
		SPECIFICATIONTYPEImpl specificationtype = new SPECIFICATIONTYPEImpl();
		return specificationtype;
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
	public SPECOBJECTTYPE createSPECOBJECTTYPE() {
		SPECOBJECTTYPEImpl specobjecttype = new SPECOBJECTTYPEImpl();
		return specobjecttype;
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
	public SPECRELATIONGROUPSType createSPECRELATIONGROUPSType() {
		SPECRELATIONGROUPSTypeImpl specrelationgroupsType = new SPECRELATIONGROUPSTypeImpl();
		return specrelationgroupsType;
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
	public SPECRELATIONTYPE createSPECRELATIONTYPE() {
		SPECRELATIONTYPEImpl specrelationtype = new SPECRELATIONTYPEImpl();
		return specrelationtype;
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
	public TARGETSPECIFICATIONType createTARGETSPECIFICATIONType() {
		TARGETSPECIFICATIONTypeImpl targetspecificationType = new TARGETSPECIFICATIONTypeImpl();
		return targetspecificationType;
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
	public THEHEADERType createTHEHEADERType() {
		THEHEADERTypeImpl theheaderType = new THEHEADERTypeImpl();
		return theheaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOOLEXTENSIONSType createTOOLEXTENSIONSType() {
		TOOLEXTENSIONSTypeImpl toolextensionsType = new TOOLEXTENSIONSTypeImpl();
		return toolextensionsType;
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
	public TYPEType7 createTYPEType7() {
		TYPEType7Impl typeType7 = new TYPEType7Impl();
		return typeType7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType8 createTYPEType8() {
		TYPEType8Impl typeType8 = new TYPEType8Impl();
		return typeType8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType9 createTYPEType9() {
		TYPEType9Impl typeType9 = new TYPEType9Impl();
		return typeType9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType10 createTYPEType10() {
		TYPEType10Impl typeType10 = new TYPEType10Impl();
		return typeType10;
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
	public String createGLOBALREFFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGLOBALREFToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLOCALREFFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.IDREF, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLOCALREFToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.IDREF, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXHTMLCONTENTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXHTMLCONTENTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyreqifPackage getMyreqifPackage() {
		return (MyreqifPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MyreqifPackage getPackage() {
		return MyreqifPackage.eINSTANCE;
	}

} //MyreqifFactoryImpl
