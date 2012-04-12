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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage
 * @generated
 */
public class ReqifAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqifPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqifAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqifPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqifSwitch<Adapter> modelSwitch =
		new ReqifSwitch<Adapter>() {
			@Override
			public Adapter caseALTERNATIVEID(ALTERNATIVEID object) {
				return createALTERNATIVEIDAdapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType(ALTERNATIVEIDType object) {
				return createALTERNATIVEIDTypeAdapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType1(ALTERNATIVEIDType1 object) {
				return createALTERNATIVEIDType1Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType2(ALTERNATIVEIDType2 object) {
				return createALTERNATIVEIDType2Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType3(ALTERNATIVEIDType3 object) {
				return createALTERNATIVEIDType3Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType4(ALTERNATIVEIDType4 object) {
				return createALTERNATIVEIDType4Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType5(ALTERNATIVEIDType5 object) {
				return createALTERNATIVEIDType5Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType6(ALTERNATIVEIDType6 object) {
				return createALTERNATIVEIDType6Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType7(ALTERNATIVEIDType7 object) {
				return createALTERNATIVEIDType7Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType8(ALTERNATIVEIDType8 object) {
				return createALTERNATIVEIDType8Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType9(ALTERNATIVEIDType9 object) {
				return createALTERNATIVEIDType9Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType10(ALTERNATIVEIDType10 object) {
				return createALTERNATIVEIDType10Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType11(ALTERNATIVEIDType11 object) {
				return createALTERNATIVEIDType11Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType12(ALTERNATIVEIDType12 object) {
				return createALTERNATIVEIDType12Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType13(ALTERNATIVEIDType13 object) {
				return createALTERNATIVEIDType13Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType14(ALTERNATIVEIDType14 object) {
				return createALTERNATIVEIDType14Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType15(ALTERNATIVEIDType15 object) {
				return createALTERNATIVEIDType15Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType16(ALTERNATIVEIDType16 object) {
				return createALTERNATIVEIDType16Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType17(ALTERNATIVEIDType17 object) {
				return createALTERNATIVEIDType17Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType18(ALTERNATIVEIDType18 object) {
				return createALTERNATIVEIDType18Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType19(ALTERNATIVEIDType19 object) {
				return createALTERNATIVEIDType19Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType20(ALTERNATIVEIDType20 object) {
				return createALTERNATIVEIDType20Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType21(ALTERNATIVEIDType21 object) {
				return createALTERNATIVEIDType21Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType22(ALTERNATIVEIDType22 object) {
				return createALTERNATIVEIDType22Adapter();
			}
			@Override
			public Adapter caseALTERNATIVEIDType23(ALTERNATIVEIDType23 object) {
				return createALTERNATIVEIDType23Adapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONBOOLEAN(ATTRIBUTEDEFINITIONBOOLEAN object) {
				return createATTRIBUTEDEFINITIONBOOLEANAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONDATE(ATTRIBUTEDEFINITIONDATE object) {
				return createATTRIBUTEDEFINITIONDATEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONENUMERATION(ATTRIBUTEDEFINITIONENUMERATION object) {
				return createATTRIBUTEDEFINITIONENUMERATIONAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONINTEGER(ATTRIBUTEDEFINITIONINTEGER object) {
				return createATTRIBUTEDEFINITIONINTEGERAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONREAL(ATTRIBUTEDEFINITIONREAL object) {
				return createATTRIBUTEDEFINITIONREALAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONSTRING(ATTRIBUTEDEFINITIONSTRING object) {
				return createATTRIBUTEDEFINITIONSTRINGAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONXHTML(ATTRIBUTEDEFINITIONXHTML object) {
				return createATTRIBUTEDEFINITIONXHTMLAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEBOOLEAN(ATTRIBUTEVALUEBOOLEAN object) {
				return createATTRIBUTEVALUEBOOLEANAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE object) {
				return createATTRIBUTEVALUEDATEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEENUMERATION(ATTRIBUTEVALUEENUMERATION object) {
				return createATTRIBUTEVALUEENUMERATIONAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEINTEGER(ATTRIBUTEVALUEINTEGER object) {
				return createATTRIBUTEVALUEINTEGERAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEREAL(ATTRIBUTEVALUEREAL object) {
				return createATTRIBUTEVALUEREALAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUESTRING(ATTRIBUTEVALUESTRING object) {
				return createATTRIBUTEVALUESTRINGAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEXHTML(ATTRIBUTEVALUEXHTML object) {
				return createATTRIBUTEVALUEXHTMLAdapter();
			}
			@Override
			public Adapter caseCHILDRENType(CHILDRENType object) {
				return createCHILDRENTypeAdapter();
			}
			@Override
			public Adapter caseCHILDRENType1(CHILDRENType1 object) {
				return createCHILDRENType1Adapter();
			}
			@Override
			public Adapter caseCORECONTENTType(CORECONTENTType object) {
				return createCORECONTENTTypeAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONBOOLEAN(DATATYPEDEFINITIONBOOLEAN object) {
				return createDATATYPEDEFINITIONBOOLEANAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONDATE(DATATYPEDEFINITIONDATE object) {
				return createDATATYPEDEFINITIONDATEAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONENUMERATION(DATATYPEDEFINITIONENUMERATION object) {
				return createDATATYPEDEFINITIONENUMERATIONAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONINTEGER(DATATYPEDEFINITIONINTEGER object) {
				return createDATATYPEDEFINITIONINTEGERAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONREAL(DATATYPEDEFINITIONREAL object) {
				return createDATATYPEDEFINITIONREALAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONSTRING(DATATYPEDEFINITIONSTRING object) {
				return createDATATYPEDEFINITIONSTRINGAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONXHTML(DATATYPEDEFINITIONXHTML object) {
				return createDATATYPEDEFINITIONXHTMLAdapter();
			}
			@Override
			public Adapter caseDATATYPESType(DATATYPESType object) {
				return createDATATYPESTypeAdapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType(DEFAULTVALUEType object) {
				return createDEFAULTVALUETypeAdapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType1(DEFAULTVALUEType1 object) {
				return createDEFAULTVALUEType1Adapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType2(DEFAULTVALUEType2 object) {
				return createDEFAULTVALUEType2Adapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType3(DEFAULTVALUEType3 object) {
				return createDEFAULTVALUEType3Adapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType4(DEFAULTVALUEType4 object) {
				return createDEFAULTVALUEType4Adapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType5(DEFAULTVALUEType5 object) {
				return createDEFAULTVALUEType5Adapter();
			}
			@Override
			public Adapter caseDEFAULTVALUEType6(DEFAULTVALUEType6 object) {
				return createDEFAULTVALUEType6Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType(DEFINITIONType object) {
				return createDEFINITIONTypeAdapter();
			}
			@Override
			public Adapter caseDEFINITIONType1(DEFINITIONType1 object) {
				return createDEFINITIONType1Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType2(DEFINITIONType2 object) {
				return createDEFINITIONType2Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType3(DEFINITIONType3 object) {
				return createDEFINITIONType3Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType4(DEFINITIONType4 object) {
				return createDEFINITIONType4Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType5(DEFINITIONType5 object) {
				return createDEFINITIONType5Adapter();
			}
			@Override
			public Adapter caseDEFINITIONType6(DEFINITIONType6 object) {
				return createDEFINITIONType6Adapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEDITABLEATTSType(EDITABLEATTSType object) {
				return createEDITABLEATTSTypeAdapter();
			}
			@Override
			public Adapter caseEMBEDDEDVALUE(EMBEDDEDVALUE object) {
				return createEMBEDDEDVALUEAdapter();
			}
			@Override
			public Adapter caseENUMVALUE(ENUMVALUE object) {
				return createENUMVALUEAdapter();
			}
			@Override
			public Adapter caseOBJECTType(OBJECTType object) {
				return createOBJECTTypeAdapter();
			}
			@Override
			public Adapter casePROPERTIESType(PROPERTIESType object) {
				return createPROPERTIESTypeAdapter();
			}
			@Override
			public Adapter caseRELATIONGROUP(RELATIONGROUP object) {
				return createRELATIONGROUPAdapter();
			}
			@Override
			public Adapter caseRELATIONGROUPTYPE(RELATIONGROUPTYPE object) {
				return createRELATIONGROUPTYPEAdapter();
			}
			@Override
			public Adapter caseREQIF(REQIF object) {
				return createREQIFAdapter();
			}
			@Override
			public Adapter caseREQIFCONTENT(REQIFCONTENT object) {
				return createREQIFCONTENTAdapter();
			}
			@Override
			public Adapter caseREQIFHEADER(REQIFHEADER object) {
				return createREQIFHEADERAdapter();
			}
			@Override
			public Adapter caseREQIFTOOLEXTENSION(REQIFTOOLEXTENSION object) {
				return createREQIFTOOLEXTENSIONAdapter();
			}
			@Override
			public Adapter caseSOURCESPECIFICATIONType(SOURCESPECIFICATIONType object) {
				return createSOURCESPECIFICATIONTypeAdapter();
			}
			@Override
			public Adapter caseSOURCEType(SOURCEType object) {
				return createSOURCETypeAdapter();
			}
			@Override
			public Adapter caseSPECATTRIBUTESType(SPECATTRIBUTESType object) {
				return createSPECATTRIBUTESTypeAdapter();
			}
			@Override
			public Adapter caseSPECATTRIBUTESType1(SPECATTRIBUTESType1 object) {
				return createSPECATTRIBUTESType1Adapter();
			}
			@Override
			public Adapter caseSPECATTRIBUTESType2(SPECATTRIBUTESType2 object) {
				return createSPECATTRIBUTESType2Adapter();
			}
			@Override
			public Adapter caseSPECATTRIBUTESType3(SPECATTRIBUTESType3 object) {
				return createSPECATTRIBUTESType3Adapter();
			}
			@Override
			public Adapter caseSPECHIERARCHY(SPECHIERARCHY object) {
				return createSPECHIERARCHYAdapter();
			}
			@Override
			public Adapter caseSPECIFICATION(SPECIFICATION object) {
				return createSPECIFICATIONAdapter();
			}
			@Override
			public Adapter caseSPECIFICATIONSType(SPECIFICATIONSType object) {
				return createSPECIFICATIONSTypeAdapter();
			}
			@Override
			public Adapter caseSPECIFICATIONTYPE(SPECIFICATIONTYPE object) {
				return createSPECIFICATIONTYPEAdapter();
			}
			@Override
			public Adapter caseSPECIFIEDVALUESType(SPECIFIEDVALUESType object) {
				return createSPECIFIEDVALUESTypeAdapter();
			}
			@Override
			public Adapter caseSPECOBJECT(SPECOBJECT object) {
				return createSPECOBJECTAdapter();
			}
			@Override
			public Adapter caseSPECOBJECTSType(SPECOBJECTSType object) {
				return createSPECOBJECTSTypeAdapter();
			}
			@Override
			public Adapter caseSPECOBJECTTYPE(SPECOBJECTTYPE object) {
				return createSPECOBJECTTYPEAdapter();
			}
			@Override
			public Adapter caseSPECRELATION(SPECRELATION object) {
				return createSPECRELATIONAdapter();
			}
			@Override
			public Adapter caseSPECRELATIONGROUPSType(SPECRELATIONGROUPSType object) {
				return createSPECRELATIONGROUPSTypeAdapter();
			}
			@Override
			public Adapter caseSPECRELATIONSType(SPECRELATIONSType object) {
				return createSPECRELATIONSTypeAdapter();
			}
			@Override
			public Adapter caseSPECRELATIONSType1(SPECRELATIONSType1 object) {
				return createSPECRELATIONSType1Adapter();
			}
			@Override
			public Adapter caseSPECRELATIONTYPE(SPECRELATIONTYPE object) {
				return createSPECRELATIONTYPEAdapter();
			}
			@Override
			public Adapter caseSPECTYPESType(SPECTYPESType object) {
				return createSPECTYPESTypeAdapter();
			}
			@Override
			public Adapter caseTARGETSPECIFICATIONType(TARGETSPECIFICATIONType object) {
				return createTARGETSPECIFICATIONTypeAdapter();
			}
			@Override
			public Adapter caseTARGETType(TARGETType object) {
				return createTARGETTypeAdapter();
			}
			@Override
			public Adapter caseTHEHEADERType(THEHEADERType object) {
				return createTHEHEADERTypeAdapter();
			}
			@Override
			public Adapter caseTOOLEXTENSIONSType(TOOLEXTENSIONSType object) {
				return createTOOLEXTENSIONSTypeAdapter();
			}
			@Override
			public Adapter caseTYPEType(TYPEType object) {
				return createTYPETypeAdapter();
			}
			@Override
			public Adapter caseTYPEType1(TYPEType1 object) {
				return createTYPEType1Adapter();
			}
			@Override
			public Adapter caseTYPEType2(TYPEType2 object) {
				return createTYPEType2Adapter();
			}
			@Override
			public Adapter caseTYPEType3(TYPEType3 object) {
				return createTYPEType3Adapter();
			}
			@Override
			public Adapter caseTYPEType4(TYPEType4 object) {
				return createTYPEType4Adapter();
			}
			@Override
			public Adapter caseTYPEType5(TYPEType5 object) {
				return createTYPEType5Adapter();
			}
			@Override
			public Adapter caseTYPEType6(TYPEType6 object) {
				return createTYPEType6Adapter();
			}
			@Override
			public Adapter caseTYPEType7(TYPEType7 object) {
				return createTYPEType7Adapter();
			}
			@Override
			public Adapter caseTYPEType8(TYPEType8 object) {
				return createTYPEType8Adapter();
			}
			@Override
			public Adapter caseTYPEType9(TYPEType9 object) {
				return createTYPEType9Adapter();
			}
			@Override
			public Adapter caseTYPEType10(TYPEType10 object) {
				return createTYPEType10Adapter();
			}
			@Override
			public Adapter caseVALUESType(VALUESType object) {
				return createVALUESTypeAdapter();
			}
			@Override
			public Adapter caseVALUESType1(VALUESType1 object) {
				return createVALUESType1Adapter();
			}
			@Override
			public Adapter caseVALUESType2(VALUESType2 object) {
				return createVALUESType2Adapter();
			}
			@Override
			public Adapter caseVALUESType3(VALUESType3 object) {
				return createVALUESType3Adapter();
			}
			@Override
			public Adapter caseXHTMLCONTENT(XHTMLCONTENT object) {
				return createXHTMLCONTENTAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEID <em>ALTERNATIVEID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEID
	 * @generated
	 */
	public Adapter createALTERNATIVEIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType <em>ALTERNATIVEID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType
	 * @generated
	 */
	public Adapter createALTERNATIVEIDTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType1 <em>ALTERNATIVEID Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType1
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType2 <em>ALTERNATIVEID Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType2
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType3 <em>ALTERNATIVEID Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType3
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType4 <em>ALTERNATIVEID Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType4
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType5 <em>ALTERNATIVEID Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType5
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType6 <em>ALTERNATIVEID Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType6
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType7 <em>ALTERNATIVEID Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType7
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType8 <em>ALTERNATIVEID Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType8
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType9 <em>ALTERNATIVEID Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType9
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType10 <em>ALTERNATIVEID Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType10
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType11 <em>ALTERNATIVEID Type11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType11
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType12 <em>ALTERNATIVEID Type12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType12
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType13 <em>ALTERNATIVEID Type13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType13
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType14 <em>ALTERNATIVEID Type14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType14
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType15 <em>ALTERNATIVEID Type15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType15
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType16 <em>ALTERNATIVEID Type16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType16
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType17 <em>ALTERNATIVEID Type17</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType17
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType17Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType18 <em>ALTERNATIVEID Type18</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType18
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType18Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType19 <em>ALTERNATIVEID Type19</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType19
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType19Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType20 <em>ALTERNATIVEID Type20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType20
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType21 <em>ALTERNATIVEID Type21</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType21
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType21Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType22 <em>ALTERNATIVEID Type22</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType22
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType22Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType23 <em>ALTERNATIVEID Type23</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType23
	 * @generated
	 */
	public Adapter createALTERNATIVEIDType23Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN <em>ATTRIBUTEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONBOOLEANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE <em>ATTRIBUTEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONDATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER <em>ATTRIBUTEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONINTEGERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL <em>ATTRIBUTEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING <em>ATTRIBUTEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML <em>ATTRIBUTEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN <em>ATTRIBUTEVALUEBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEBOOLEANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEDATE
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEDATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEENUMERATION
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEINTEGER <em>ATTRIBUTEVALUEINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEINTEGER
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEINTEGERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEREAL <em>ATTRIBUTEVALUEREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEREAL
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUESTRING <em>ATTRIBUTEVALUESTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUESTRING
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUESTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEXHTML <em>ATTRIBUTEVALUEXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEXHTML
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.CHILDRENType <em>CHILDREN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.CHILDRENType
	 * @generated
	 */
	public Adapter createCHILDRENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.CHILDRENType1 <em>CHILDREN Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.CHILDRENType1
	 * @generated
	 */
	public Adapter createCHILDRENType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.CORECONTENTType <em>CORECONTENT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.CORECONTENTType
	 * @generated
	 */
	public Adapter createCORECONTENTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONBOOLEAN
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONBOOLEANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONDATE
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONDATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONINTEGER
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONINTEGERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONREAL
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONSTRING
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONXHTML <em>DATATYPEDEFINITIONXHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONXHTML
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType <em>DATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DATATYPESType
	 * @generated
	 */
	public Adapter createDATATYPESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType <em>DEFAULTVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType
	 * @generated
	 */
	public Adapter createDEFAULTVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType1 <em>DEFAULTVALUE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType1
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType2 <em>DEFAULTVALUE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType2
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType3 <em>DEFAULTVALUE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType3
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType4 <em>DEFAULTVALUE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType4
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType5 <em>DEFAULTVALUE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType5
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType6 <em>DEFAULTVALUE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFAULTVALUEType6
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType <em>DEFINITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType
	 * @generated
	 */
	public Adapter createDEFINITIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType1 <em>DEFINITION Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType1
	 * @generated
	 */
	public Adapter createDEFINITIONType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType2 <em>DEFINITION Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType2
	 * @generated
	 */
	public Adapter createDEFINITIONType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType3 <em>DEFINITION Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType3
	 * @generated
	 */
	public Adapter createDEFINITIONType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType4 <em>DEFINITION Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType4
	 * @generated
	 */
	public Adapter createDEFINITIONType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType5 <em>DEFINITION Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType5
	 * @generated
	 */
	public Adapter createDEFINITIONType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType6 <em>DEFINITION Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DEFINITIONType6
	 * @generated
	 */
	public Adapter createDEFINITIONType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType <em>EDITABLEATTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType
	 * @generated
	 */
	public Adapter createEDITABLEATTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.EMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.EMBEDDEDVALUE
	 * @generated
	 */
	public Adapter createEMBEDDEDVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.ENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.ENUMVALUE
	 * @generated
	 */
	public Adapter createENUMVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.OBJECTType <em>OBJECT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.OBJECTType
	 * @generated
	 */
	public Adapter createOBJECTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.PROPERTIESType <em>PROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.PROPERTIESType
	 * @generated
	 */
	public Adapter createPROPERTIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.RELATIONGROUP
	 * @generated
	 */
	public Adapter createRELATIONGROUPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUPTYPE <em>RELATIONGROUPTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.RELATIONGROUPTYPE
	 * @generated
	 */
	public Adapter createRELATIONGROUPTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.REQIF <em>REQIF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.REQIF
	 * @generated
	 */
	public Adapter createREQIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.REQIFCONTENT <em>REQIFCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.REQIFCONTENT
	 * @generated
	 */
	public Adapter createREQIFCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.REQIFHEADER <em>REQIFHEADER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.REQIFHEADER
	 * @generated
	 */
	public Adapter createREQIFHEADERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.REQIFTOOLEXTENSION <em>REQIFTOOLEXTENSION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.REQIFTOOLEXTENSION
	 * @generated
	 */
	public Adapter createREQIFTOOLEXTENSIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SOURCESPECIFICATIONType <em>SOURCESPECIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SOURCESPECIFICATIONType
	 * @generated
	 */
	public Adapter createSOURCESPECIFICATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SOURCEType <em>SOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SOURCEType
	 * @generated
	 */
	public Adapter createSOURCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType <em>SPECATTRIBUTES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType
	 * @generated
	 */
	public Adapter createSPECATTRIBUTESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType1 <em>SPECATTRIBUTES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType1
	 * @generated
	 */
	public Adapter createSPECATTRIBUTESType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType2 <em>SPECATTRIBUTES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType2
	 * @generated
	 */
	public Adapter createSPECATTRIBUTESType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType3 <em>SPECATTRIBUTES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECATTRIBUTESType3
	 * @generated
	 */
	public Adapter createSPECATTRIBUTESType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECHIERARCHY
	 * @generated
	 */
	public Adapter createSPECHIERARCHYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECIFICATION <em>SPECIFICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECIFICATION
	 * @generated
	 */
	public Adapter createSPECIFICATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECIFICATIONSType <em>SPECIFICATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECIFICATIONSType
	 * @generated
	 */
	public Adapter createSPECIFICATIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECIFICATIONTYPE <em>SPECIFICATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECIFICATIONTYPE
	 * @generated
	 */
	public Adapter createSPECIFICATIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECIFIEDVALUESType <em>SPECIFIEDVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECIFIEDVALUESType
	 * @generated
	 */
	public Adapter createSPECIFIEDVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECOBJECT
	 * @generated
	 */
	public Adapter createSPECOBJECTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECOBJECTSType <em>SPECOBJECTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECOBJECTSType
	 * @generated
	 */
	public Adapter createSPECOBJECTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECOBJECTTYPE <em>SPECOBJECTTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECOBJECTTYPE
	 * @generated
	 */
	public Adapter createSPECOBJECTTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECRELATION
	 * @generated
	 */
	public Adapter createSPECRELATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECRELATIONGROUPSType <em>SPECRELATIONGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECRELATIONGROUPSType
	 * @generated
	 */
	public Adapter createSPECRELATIONGROUPSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECRELATIONSType <em>SPECRELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECRELATIONSType
	 * @generated
	 */
	public Adapter createSPECRELATIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECRELATIONSType1 <em>SPECRELATIONS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECRELATIONSType1
	 * @generated
	 */
	public Adapter createSPECRELATIONSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECRELATIONTYPE <em>SPECRELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECRELATIONTYPE
	 * @generated
	 */
	public Adapter createSPECRELATIONTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.SPECTYPESType <em>SPECTYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.SPECTYPESType
	 * @generated
	 */
	public Adapter createSPECTYPESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType <em>TARGETSPECIFICATION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType
	 * @generated
	 */
	public Adapter createTARGETSPECIFICATIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TARGETType <em>TARGET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TARGETType
	 * @generated
	 */
	public Adapter createTARGETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.THEHEADERType <em>THEHEADER Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.THEHEADERType
	 * @generated
	 */
	public Adapter createTHEHEADERTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TOOLEXTENSIONSType <em>TOOLEXTENSIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TOOLEXTENSIONSType
	 * @generated
	 */
	public Adapter createTOOLEXTENSIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType <em>TYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType
	 * @generated
	 */
	public Adapter createTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType1 <em>TYPE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType1
	 * @generated
	 */
	public Adapter createTYPEType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType2 <em>TYPE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType2
	 * @generated
	 */
	public Adapter createTYPEType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType3 <em>TYPE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType3
	 * @generated
	 */
	public Adapter createTYPEType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType4 <em>TYPE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType4
	 * @generated
	 */
	public Adapter createTYPEType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType5 <em>TYPE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType5
	 * @generated
	 */
	public Adapter createTYPEType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType6 <em>TYPE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType6
	 * @generated
	 */
	public Adapter createTYPEType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType7 <em>TYPE Type7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType7
	 * @generated
	 */
	public Adapter createTYPEType7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType8 <em>TYPE Type8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType8
	 * @generated
	 */
	public Adapter createTYPEType8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType9 <em>TYPE Type9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType9
	 * @generated
	 */
	public Adapter createTYPEType9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.TYPEType10 <em>TYPE Type10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.TYPEType10
	 * @generated
	 */
	public Adapter createTYPEType10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.VALUESType <em>VALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.VALUESType
	 * @generated
	 */
	public Adapter createVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.VALUESType1 <em>VALUES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.VALUESType1
	 * @generated
	 */
	public Adapter createVALUESType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.VALUESType2 <em>VALUES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.VALUESType2
	 * @generated
	 */
	public Adapter createVALUESType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.VALUESType3 <em>VALUES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.VALUESType3
	 * @generated
	 */
	public Adapter createVALUESType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.xsd.XHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.xsd.XHTMLCONTENT
	 * @generated
	 */
	public Adapter createXHTMLCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ReqifAdapterFactory
