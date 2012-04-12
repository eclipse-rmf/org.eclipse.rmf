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

package org.eclipse.rmf.reqif10.xsd.util;

import org.eclipse.rmf.reqif10.xsd.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage
 * @generated
 */
public class ReqifSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqifPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqifSwitch() {
		if (modelPackage == null) {
			modelPackage = ReqifPackage.eINSTANCE;
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
			case ReqifPackage.ALTERNATIVEID: {
				ALTERNATIVEID alternativeid = (ALTERNATIVEID)theEObject;
				T result = caseALTERNATIVEID(alternativeid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE: {
				ALTERNATIVEIDType alternativeidType = (ALTERNATIVEIDType)theEObject;
				T result = caseALTERNATIVEIDType(alternativeidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE1: {
				ALTERNATIVEIDType1 alternativeidType1 = (ALTERNATIVEIDType1)theEObject;
				T result = caseALTERNATIVEIDType1(alternativeidType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE2: {
				ALTERNATIVEIDType2 alternativeidType2 = (ALTERNATIVEIDType2)theEObject;
				T result = caseALTERNATIVEIDType2(alternativeidType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE3: {
				ALTERNATIVEIDType3 alternativeidType3 = (ALTERNATIVEIDType3)theEObject;
				T result = caseALTERNATIVEIDType3(alternativeidType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE4: {
				ALTERNATIVEIDType4 alternativeidType4 = (ALTERNATIVEIDType4)theEObject;
				T result = caseALTERNATIVEIDType4(alternativeidType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE5: {
				ALTERNATIVEIDType5 alternativeidType5 = (ALTERNATIVEIDType5)theEObject;
				T result = caseALTERNATIVEIDType5(alternativeidType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE6: {
				ALTERNATIVEIDType6 alternativeidType6 = (ALTERNATIVEIDType6)theEObject;
				T result = caseALTERNATIVEIDType6(alternativeidType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE7: {
				ALTERNATIVEIDType7 alternativeidType7 = (ALTERNATIVEIDType7)theEObject;
				T result = caseALTERNATIVEIDType7(alternativeidType7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE8: {
				ALTERNATIVEIDType8 alternativeidType8 = (ALTERNATIVEIDType8)theEObject;
				T result = caseALTERNATIVEIDType8(alternativeidType8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE9: {
				ALTERNATIVEIDType9 alternativeidType9 = (ALTERNATIVEIDType9)theEObject;
				T result = caseALTERNATIVEIDType9(alternativeidType9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE10: {
				ALTERNATIVEIDType10 alternativeidType10 = (ALTERNATIVEIDType10)theEObject;
				T result = caseALTERNATIVEIDType10(alternativeidType10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE11: {
				ALTERNATIVEIDType11 alternativeidType11 = (ALTERNATIVEIDType11)theEObject;
				T result = caseALTERNATIVEIDType11(alternativeidType11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE12: {
				ALTERNATIVEIDType12 alternativeidType12 = (ALTERNATIVEIDType12)theEObject;
				T result = caseALTERNATIVEIDType12(alternativeidType12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE13: {
				ALTERNATIVEIDType13 alternativeidType13 = (ALTERNATIVEIDType13)theEObject;
				T result = caseALTERNATIVEIDType13(alternativeidType13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE14: {
				ALTERNATIVEIDType14 alternativeidType14 = (ALTERNATIVEIDType14)theEObject;
				T result = caseALTERNATIVEIDType14(alternativeidType14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE15: {
				ALTERNATIVEIDType15 alternativeidType15 = (ALTERNATIVEIDType15)theEObject;
				T result = caseALTERNATIVEIDType15(alternativeidType15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE16: {
				ALTERNATIVEIDType16 alternativeidType16 = (ALTERNATIVEIDType16)theEObject;
				T result = caseALTERNATIVEIDType16(alternativeidType16);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE17: {
				ALTERNATIVEIDType17 alternativeidType17 = (ALTERNATIVEIDType17)theEObject;
				T result = caseALTERNATIVEIDType17(alternativeidType17);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE18: {
				ALTERNATIVEIDType18 alternativeidType18 = (ALTERNATIVEIDType18)theEObject;
				T result = caseALTERNATIVEIDType18(alternativeidType18);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE19: {
				ALTERNATIVEIDType19 alternativeidType19 = (ALTERNATIVEIDType19)theEObject;
				T result = caseALTERNATIVEIDType19(alternativeidType19);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE20: {
				ALTERNATIVEIDType20 alternativeidType20 = (ALTERNATIVEIDType20)theEObject;
				T result = caseALTERNATIVEIDType20(alternativeidType20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE21: {
				ALTERNATIVEIDType21 alternativeidType21 = (ALTERNATIVEIDType21)theEObject;
				T result = caseALTERNATIVEIDType21(alternativeidType21);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE22: {
				ALTERNATIVEIDType22 alternativeidType22 = (ALTERNATIVEIDType22)theEObject;
				T result = caseALTERNATIVEIDType22(alternativeidType22);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ALTERNATIVEID_TYPE23: {
				ALTERNATIVEIDType23 alternativeidType23 = (ALTERNATIVEIDType23)theEObject;
				T result = caseALTERNATIVEIDType23(alternativeidType23);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONBOOLEAN: {
				ATTRIBUTEDEFINITIONBOOLEAN attributedefinitionboolean = (ATTRIBUTEDEFINITIONBOOLEAN)theEObject;
				T result = caseATTRIBUTEDEFINITIONBOOLEAN(attributedefinitionboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONDATE: {
				ATTRIBUTEDEFINITIONDATE attributedefinitiondate = (ATTRIBUTEDEFINITIONDATE)theEObject;
				T result = caseATTRIBUTEDEFINITIONDATE(attributedefinitiondate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONENUMERATION: {
				ATTRIBUTEDEFINITIONENUMERATION attributedefinitionenumeration = (ATTRIBUTEDEFINITIONENUMERATION)theEObject;
				T result = caseATTRIBUTEDEFINITIONENUMERATION(attributedefinitionenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONINTEGER: {
				ATTRIBUTEDEFINITIONINTEGER attributedefinitioninteger = (ATTRIBUTEDEFINITIONINTEGER)theEObject;
				T result = caseATTRIBUTEDEFINITIONINTEGER(attributedefinitioninteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONREAL: {
				ATTRIBUTEDEFINITIONREAL attributedefinitionreal = (ATTRIBUTEDEFINITIONREAL)theEObject;
				T result = caseATTRIBUTEDEFINITIONREAL(attributedefinitionreal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONSTRING: {
				ATTRIBUTEDEFINITIONSTRING attributedefinitionstring = (ATTRIBUTEDEFINITIONSTRING)theEObject;
				T result = caseATTRIBUTEDEFINITIONSTRING(attributedefinitionstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEDEFINITIONXHTML: {
				ATTRIBUTEDEFINITIONXHTML attributedefinitionxhtml = (ATTRIBUTEDEFINITIONXHTML)theEObject;
				T result = caseATTRIBUTEDEFINITIONXHTML(attributedefinitionxhtml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEBOOLEAN: {
				ATTRIBUTEVALUEBOOLEAN attributevalueboolean = (ATTRIBUTEVALUEBOOLEAN)theEObject;
				T result = caseATTRIBUTEVALUEBOOLEAN(attributevalueboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEDATE: {
				ATTRIBUTEVALUEDATE attributevaluedate = (ATTRIBUTEVALUEDATE)theEObject;
				T result = caseATTRIBUTEVALUEDATE(attributevaluedate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEENUMERATION: {
				ATTRIBUTEVALUEENUMERATION attributevalueenumeration = (ATTRIBUTEVALUEENUMERATION)theEObject;
				T result = caseATTRIBUTEVALUEENUMERATION(attributevalueenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEINTEGER: {
				ATTRIBUTEVALUEINTEGER attributevalueinteger = (ATTRIBUTEVALUEINTEGER)theEObject;
				T result = caseATTRIBUTEVALUEINTEGER(attributevalueinteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEREAL: {
				ATTRIBUTEVALUEREAL attributevaluereal = (ATTRIBUTEVALUEREAL)theEObject;
				T result = caseATTRIBUTEVALUEREAL(attributevaluereal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUESTRING: {
				ATTRIBUTEVALUESTRING attributevaluestring = (ATTRIBUTEVALUESTRING)theEObject;
				T result = caseATTRIBUTEVALUESTRING(attributevaluestring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ATTRIBUTEVALUEXHTML: {
				ATTRIBUTEVALUEXHTML attributevaluexhtml = (ATTRIBUTEVALUEXHTML)theEObject;
				T result = caseATTRIBUTEVALUEXHTML(attributevaluexhtml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.CHILDREN_TYPE: {
				CHILDRENType childrenType = (CHILDRENType)theEObject;
				T result = caseCHILDRENType(childrenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.CHILDREN_TYPE1: {
				CHILDRENType1 childrenType1 = (CHILDRENType1)theEObject;
				T result = caseCHILDRENType1(childrenType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.CORECONTENT_TYPE: {
				CORECONTENTType corecontentType = (CORECONTENTType)theEObject;
				T result = caseCORECONTENTType(corecontentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONBOOLEAN: {
				DATATYPEDEFINITIONBOOLEAN datatypedefinitionboolean = (DATATYPEDEFINITIONBOOLEAN)theEObject;
				T result = caseDATATYPEDEFINITIONBOOLEAN(datatypedefinitionboolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONDATE: {
				DATATYPEDEFINITIONDATE datatypedefinitiondate = (DATATYPEDEFINITIONDATE)theEObject;
				T result = caseDATATYPEDEFINITIONDATE(datatypedefinitiondate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION: {
				DATATYPEDEFINITIONENUMERATION datatypedefinitionenumeration = (DATATYPEDEFINITIONENUMERATION)theEObject;
				T result = caseDATATYPEDEFINITIONENUMERATION(datatypedefinitionenumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONINTEGER: {
				DATATYPEDEFINITIONINTEGER datatypedefinitioninteger = (DATATYPEDEFINITIONINTEGER)theEObject;
				T result = caseDATATYPEDEFINITIONINTEGER(datatypedefinitioninteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONREAL: {
				DATATYPEDEFINITIONREAL datatypedefinitionreal = (DATATYPEDEFINITIONREAL)theEObject;
				T result = caseDATATYPEDEFINITIONREAL(datatypedefinitionreal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONSTRING: {
				DATATYPEDEFINITIONSTRING datatypedefinitionstring = (DATATYPEDEFINITIONSTRING)theEObject;
				T result = caseDATATYPEDEFINITIONSTRING(datatypedefinitionstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPEDEFINITIONXHTML: {
				DATATYPEDEFINITIONXHTML datatypedefinitionxhtml = (DATATYPEDEFINITIONXHTML)theEObject;
				T result = caseDATATYPEDEFINITIONXHTML(datatypedefinitionxhtml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DATATYPES_TYPE: {
				DATATYPESType datatypesType = (DATATYPESType)theEObject;
				T result = caseDATATYPESType(datatypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE: {
				DEFAULTVALUEType defaultvalueType = (DEFAULTVALUEType)theEObject;
				T result = caseDEFAULTVALUEType(defaultvalueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE1: {
				DEFAULTVALUEType1 defaultvalueType1 = (DEFAULTVALUEType1)theEObject;
				T result = caseDEFAULTVALUEType1(defaultvalueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE2: {
				DEFAULTVALUEType2 defaultvalueType2 = (DEFAULTVALUEType2)theEObject;
				T result = caseDEFAULTVALUEType2(defaultvalueType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE3: {
				DEFAULTVALUEType3 defaultvalueType3 = (DEFAULTVALUEType3)theEObject;
				T result = caseDEFAULTVALUEType3(defaultvalueType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE4: {
				DEFAULTVALUEType4 defaultvalueType4 = (DEFAULTVALUEType4)theEObject;
				T result = caseDEFAULTVALUEType4(defaultvalueType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE5: {
				DEFAULTVALUEType5 defaultvalueType5 = (DEFAULTVALUEType5)theEObject;
				T result = caseDEFAULTVALUEType5(defaultvalueType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFAULTVALUE_TYPE6: {
				DEFAULTVALUEType6 defaultvalueType6 = (DEFAULTVALUEType6)theEObject;
				T result = caseDEFAULTVALUEType6(defaultvalueType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE: {
				DEFINITIONType definitionType = (DEFINITIONType)theEObject;
				T result = caseDEFINITIONType(definitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE1: {
				DEFINITIONType1 definitionType1 = (DEFINITIONType1)theEObject;
				T result = caseDEFINITIONType1(definitionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE2: {
				DEFINITIONType2 definitionType2 = (DEFINITIONType2)theEObject;
				T result = caseDEFINITIONType2(definitionType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE3: {
				DEFINITIONType3 definitionType3 = (DEFINITIONType3)theEObject;
				T result = caseDEFINITIONType3(definitionType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE4: {
				DEFINITIONType4 definitionType4 = (DEFINITIONType4)theEObject;
				T result = caseDEFINITIONType4(definitionType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE5: {
				DEFINITIONType5 definitionType5 = (DEFINITIONType5)theEObject;
				T result = caseDEFINITIONType5(definitionType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DEFINITION_TYPE6: {
				DEFINITIONType6 definitionType6 = (DEFINITIONType6)theEObject;
				T result = caseDEFINITIONType6(definitionType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.EDITABLEATTS_TYPE: {
				EDITABLEATTSType editableattsType = (EDITABLEATTSType)theEObject;
				T result = caseEDITABLEATTSType(editableattsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.EMBEDDEDVALUE: {
				EMBEDDEDVALUE embeddedvalue = (EMBEDDEDVALUE)theEObject;
				T result = caseEMBEDDEDVALUE(embeddedvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.ENUMVALUE: {
				ENUMVALUE enumvalue = (ENUMVALUE)theEObject;
				T result = caseENUMVALUE(enumvalue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.OBJECT_TYPE: {
				OBJECTType objectType = (OBJECTType)theEObject;
				T result = caseOBJECTType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.PROPERTIES_TYPE: {
				PROPERTIESType propertiesType = (PROPERTIESType)theEObject;
				T result = casePROPERTIESType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.RELATIONGROUP: {
				RELATIONGROUP relationgroup = (RELATIONGROUP)theEObject;
				T result = caseRELATIONGROUP(relationgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.RELATIONGROUPTYPE: {
				RELATIONGROUPTYPE relationgrouptype = (RELATIONGROUPTYPE)theEObject;
				T result = caseRELATIONGROUPTYPE(relationgrouptype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.REQIF: {
				REQIF reqif = (REQIF)theEObject;
				T result = caseREQIF(reqif);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.REQIFCONTENT: {
				REQIFCONTENT reqifcontent = (REQIFCONTENT)theEObject;
				T result = caseREQIFCONTENT(reqifcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.REQIFHEADER: {
				REQIFHEADER reqifheader = (REQIFHEADER)theEObject;
				T result = caseREQIFHEADER(reqifheader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.REQIFTOOLEXTENSION: {
				REQIFTOOLEXTENSION reqiftoolextension = (REQIFTOOLEXTENSION)theEObject;
				T result = caseREQIFTOOLEXTENSION(reqiftoolextension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SOURCESPECIFICATION_TYPE: {
				SOURCESPECIFICATIONType sourcespecificationType = (SOURCESPECIFICATIONType)theEObject;
				T result = caseSOURCESPECIFICATIONType(sourcespecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SOURCE_TYPE: {
				SOURCEType sourceType = (SOURCEType)theEObject;
				T result = caseSOURCEType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECATTRIBUTES_TYPE: {
				SPECATTRIBUTESType specattributesType = (SPECATTRIBUTESType)theEObject;
				T result = caseSPECATTRIBUTESType(specattributesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECATTRIBUTES_TYPE1: {
				SPECATTRIBUTESType1 specattributesType1 = (SPECATTRIBUTESType1)theEObject;
				T result = caseSPECATTRIBUTESType1(specattributesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECATTRIBUTES_TYPE2: {
				SPECATTRIBUTESType2 specattributesType2 = (SPECATTRIBUTESType2)theEObject;
				T result = caseSPECATTRIBUTESType2(specattributesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECATTRIBUTES_TYPE3: {
				SPECATTRIBUTESType3 specattributesType3 = (SPECATTRIBUTESType3)theEObject;
				T result = caseSPECATTRIBUTESType3(specattributesType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECHIERARCHY: {
				SPECHIERARCHY spechierarchy = (SPECHIERARCHY)theEObject;
				T result = caseSPECHIERARCHY(spechierarchy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECIFICATION: {
				SPECIFICATION specification = (SPECIFICATION)theEObject;
				T result = caseSPECIFICATION(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECIFICATIONS_TYPE: {
				SPECIFICATIONSType specificationsType = (SPECIFICATIONSType)theEObject;
				T result = caseSPECIFICATIONSType(specificationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECIFICATIONTYPE: {
				SPECIFICATIONTYPE specificationtype = (SPECIFICATIONTYPE)theEObject;
				T result = caseSPECIFICATIONTYPE(specificationtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECIFIEDVALUES_TYPE: {
				SPECIFIEDVALUESType specifiedvaluesType = (SPECIFIEDVALUESType)theEObject;
				T result = caseSPECIFIEDVALUESType(specifiedvaluesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECOBJECT: {
				SPECOBJECT specobject = (SPECOBJECT)theEObject;
				T result = caseSPECOBJECT(specobject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECOBJECTS_TYPE: {
				SPECOBJECTSType specobjectsType = (SPECOBJECTSType)theEObject;
				T result = caseSPECOBJECTSType(specobjectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECOBJECTTYPE: {
				SPECOBJECTTYPE specobjecttype = (SPECOBJECTTYPE)theEObject;
				T result = caseSPECOBJECTTYPE(specobjecttype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECRELATION: {
				SPECRELATION specrelation = (SPECRELATION)theEObject;
				T result = caseSPECRELATION(specrelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECRELATIONGROUPS_TYPE: {
				SPECRELATIONGROUPSType specrelationgroupsType = (SPECRELATIONGROUPSType)theEObject;
				T result = caseSPECRELATIONGROUPSType(specrelationgroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECRELATIONS_TYPE: {
				SPECRELATIONSType specrelationsType = (SPECRELATIONSType)theEObject;
				T result = caseSPECRELATIONSType(specrelationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECRELATIONS_TYPE1: {
				SPECRELATIONSType1 specrelationsType1 = (SPECRELATIONSType1)theEObject;
				T result = caseSPECRELATIONSType1(specrelationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECRELATIONTYPE: {
				SPECRELATIONTYPE specrelationtype = (SPECRELATIONTYPE)theEObject;
				T result = caseSPECRELATIONTYPE(specrelationtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.SPECTYPES_TYPE: {
				SPECTYPESType spectypesType = (SPECTYPESType)theEObject;
				T result = caseSPECTYPESType(spectypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TARGETSPECIFICATION_TYPE: {
				TARGETSPECIFICATIONType targetspecificationType = (TARGETSPECIFICATIONType)theEObject;
				T result = caseTARGETSPECIFICATIONType(targetspecificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TARGET_TYPE: {
				TARGETType targetType = (TARGETType)theEObject;
				T result = caseTARGETType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.THEHEADER_TYPE: {
				THEHEADERType theheaderType = (THEHEADERType)theEObject;
				T result = caseTHEHEADERType(theheaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TOOLEXTENSIONS_TYPE: {
				TOOLEXTENSIONSType toolextensionsType = (TOOLEXTENSIONSType)theEObject;
				T result = caseTOOLEXTENSIONSType(toolextensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE: {
				TYPEType typeType = (TYPEType)theEObject;
				T result = caseTYPEType(typeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE1: {
				TYPEType1 typeType1 = (TYPEType1)theEObject;
				T result = caseTYPEType1(typeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE2: {
				TYPEType2 typeType2 = (TYPEType2)theEObject;
				T result = caseTYPEType2(typeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE3: {
				TYPEType3 typeType3 = (TYPEType3)theEObject;
				T result = caseTYPEType3(typeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE4: {
				TYPEType4 typeType4 = (TYPEType4)theEObject;
				T result = caseTYPEType4(typeType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE5: {
				TYPEType5 typeType5 = (TYPEType5)theEObject;
				T result = caseTYPEType5(typeType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE6: {
				TYPEType6 typeType6 = (TYPEType6)theEObject;
				T result = caseTYPEType6(typeType6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE7: {
				TYPEType7 typeType7 = (TYPEType7)theEObject;
				T result = caseTYPEType7(typeType7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE8: {
				TYPEType8 typeType8 = (TYPEType8)theEObject;
				T result = caseTYPEType8(typeType8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE9: {
				TYPEType9 typeType9 = (TYPEType9)theEObject;
				T result = caseTYPEType9(typeType9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.TYPE_TYPE10: {
				TYPEType10 typeType10 = (TYPEType10)theEObject;
				T result = caseTYPEType10(typeType10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.VALUES_TYPE: {
				VALUESType valuesType = (VALUESType)theEObject;
				T result = caseVALUESType(valuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.VALUES_TYPE1: {
				VALUESType1 valuesType1 = (VALUESType1)theEObject;
				T result = caseVALUESType1(valuesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.VALUES_TYPE2: {
				VALUESType2 valuesType2 = (VALUESType2)theEObject;
				T result = caseVALUESType2(valuesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.VALUES_TYPE3: {
				VALUESType3 valuesType3 = (VALUESType3)theEObject;
				T result = caseVALUESType3(valuesType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqifPackage.XHTMLCONTENT: {
				XHTMLCONTENT xhtmlcontent = (XHTMLCONTENT)theEObject;
				T result = caseXHTMLCONTENT(xhtmlcontent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEID(ALTERNATIVEID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType(ALTERNATIVEIDType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType1(ALTERNATIVEIDType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType2(ALTERNATIVEIDType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType3(ALTERNATIVEIDType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType4(ALTERNATIVEIDType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType5(ALTERNATIVEIDType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType6(ALTERNATIVEIDType6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType7(ALTERNATIVEIDType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType8(ALTERNATIVEIDType8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType9(ALTERNATIVEIDType9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType10(ALTERNATIVEIDType10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType11(ALTERNATIVEIDType11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType12(ALTERNATIVEIDType12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType13(ALTERNATIVEIDType13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType14(ALTERNATIVEIDType14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType15(ALTERNATIVEIDType15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type16</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type16</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType16(ALTERNATIVEIDType16 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type17</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type17</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType17(ALTERNATIVEIDType17 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type18</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type18</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType18(ALTERNATIVEIDType18 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type19</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type19</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType19(ALTERNATIVEIDType19 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType20(ALTERNATIVEIDType20 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type21</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type21</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType21(ALTERNATIVEIDType21 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type22</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type22</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType22(ALTERNATIVEIDType22 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type23</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ALTERNATIVEID Type23</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseALTERNATIVEIDType23(ALTERNATIVEIDType23 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONBOOLEAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONBOOLEAN(ATTRIBUTEDEFINITIONBOOLEAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONDATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONDATE(ATTRIBUTEDEFINITIONDATE object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONINTEGER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONINTEGER(ATTRIBUTEDEFINITIONINTEGER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONREAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONREAL(ATTRIBUTEDEFINITIONREAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONSTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONSTRING(ATTRIBUTEDEFINITIONSTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEDEFINITIONXHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEDEFINITIONXHTML(ATTRIBUTEDEFINITIONXHTML object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEBOOLEAN</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEBOOLEAN(ATTRIBUTEVALUEBOOLEAN object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEDATE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEDATE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEINTEGER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEINTEGER(ATTRIBUTEVALUEINTEGER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEREAL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEREAL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEREAL(ATTRIBUTEVALUEREAL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUESTRING</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUESTRING</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUESTRING(ATTRIBUTEVALUESTRING object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTEVALUEXHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseATTRIBUTEVALUEXHTML(ATTRIBUTEVALUEXHTML object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>CORECONTENT Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORECONTENT Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORECONTENTType(CORECONTENTType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONXHTML</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPEDEFINITIONXHTML</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDATATYPEDEFINITIONXHTML(DATATYPEDEFINITIONXHTML object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType3(DEFAULTVALUEType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType4(DEFAULTVALUEType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType5(DEFAULTVALUEType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFAULTVALUE Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFAULTVALUEType6(DEFAULTVALUEType6 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DEFINITION Type6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DEFINITION Type6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDEFINITIONType6(DEFINITIONType6 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>EDITABLEATTS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EDITABLEATTS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDITABLEATTSType(EDITABLEATTSType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>RELATIONGROUPTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RELATIONGROUPTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRELATIONGROUPTYPE(RELATIONGROUPTYPE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REQIF</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REQIF</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREQIF(REQIF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REQIFCONTENT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REQIFCONTENT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREQIFCONTENT(REQIFCONTENT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REQIFHEADER</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REQIFHEADER</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREQIFHEADER(REQIFHEADER object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REQIFTOOLEXTENSION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REQIFTOOLEXTENSION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseREQIFTOOLEXTENSION(REQIFTOOLEXTENSION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SOURCESPECIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOURCESPECIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSOURCESPECIFICATIONType(SOURCESPECIFICATIONType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECATTRIBUTESType1(SPECATTRIBUTESType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECATTRIBUTESType2(SPECATTRIBUTESType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECATTRIBUTES Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECATTRIBUTESType3(SPECATTRIBUTESType3 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SPECIFICATION</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECIFICATION</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECIFICATION(SPECIFICATION object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECIFICATIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECIFICATIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECIFICATIONSType(SPECIFICATIONSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SPECIFICATIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECIFICATIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECIFICATIONTYPE(SPECIFICATIONTYPE object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SPECOBJECTTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECOBJECTTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECOBJECTTYPE(SPECOBJECTTYPE object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATIONGROUPS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATIONGROUPS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATIONGROUPSType(SPECRELATIONGROUPSType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>SPECRELATIONTYPE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SPECRELATIONTYPE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSPECRELATIONTYPE(SPECRELATIONTYPE object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>TARGETSPECIFICATION Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TARGETSPECIFICATION Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTARGETSPECIFICATIONType(TARGETSPECIFICATIONType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>THEHEADER Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THEHEADER Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTHEHEADERType(THEHEADERType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOOLEXTENSIONS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOOLEXTENSIONS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOOLEXTENSIONSType(TOOLEXTENSIONSType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType7(TYPEType7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType8(TYPEType8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType9(TYPEType9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TYPE Type10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TYPE Type10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTYPEType10(TYPEType10 object) {
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

} //ReqifSwitch
