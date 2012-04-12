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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.xsd.RifPackage
 * @generated
 */
public class RifAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RifPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RifAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RifPackage.eINSTANCE;
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
	protected RifSwitch<Adapter> modelSwitch =
		new RifSwitch<Adapter>() {
			@Override
			public Adapter caseACCESSPOLICIESType(ACCESSPOLICIESType object) {
				return createACCESSPOLICIESTypeAdapter();
			}
			@Override
			public Adapter caseACCESSPOLICY(ACCESSPOLICY object) {
				return createACCESSPOLICYAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONCOMPLEX(ATTRIBUTEDEFINITIONCOMPLEX object) {
				return createATTRIBUTEDEFINITIONCOMPLEXAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONENUMERATION(ATTRIBUTEDEFINITIONENUMERATION object) {
				return createATTRIBUTEDEFINITIONENUMERATIONAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONSIMPLE(ATTRIBUTEDEFINITIONSIMPLE object) {
				return createATTRIBUTEDEFINITIONSIMPLEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEDEFINITIONSType(ATTRIBUTEDEFINITIONSType object) {
				return createATTRIBUTEDEFINITIONSTypeAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEEMBEDDEDDOCUMENT(ATTRIBUTEVALUEEMBEDDEDDOCUMENT object) {
				return createATTRIBUTEVALUEEMBEDDEDDOCUMENTAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEEMBEDDEDFILE(ATTRIBUTEVALUEEMBEDDEDFILE object) {
				return createATTRIBUTEVALUEEMBEDDEDFILEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEENUMERATION(ATTRIBUTEVALUEENUMERATION object) {
				return createATTRIBUTEVALUEENUMERATIONAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEFILEREFERENCE(ATTRIBUTEVALUEFILEREFERENCE object) {
				return createATTRIBUTEVALUEFILEREFERENCEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUESIMPLE(ATTRIBUTEVALUESIMPLE object) {
				return createATTRIBUTEVALUESIMPLEAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUESType(ATTRIBUTEVALUESType object) {
				return createATTRIBUTEVALUESTypeAdapter();
			}
			@Override
			public Adapter caseATTRIBUTEVALUEXMLDATA(ATTRIBUTEVALUEXMLDATA object) {
				return createATTRIBUTEVALUEXMLDATAAdapter();
			}
			@Override
			public Adapter caseBINARYCONTENT(BINARYCONTENT object) {
				return createBINARYCONTENTAdapter();
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
			public Adapter caseDATATYPEDEFINITIONBINARYFILE(DATATYPEDEFINITIONBINARYFILE object) {
				return createDATATYPEDEFINITIONBINARYFILEAdapter();
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
			public Adapter caseDATATYPEDEFINITIONDOCUMENT(DATATYPEDEFINITIONDOCUMENT object) {
				return createDATATYPEDEFINITIONDOCUMENTAdapter();
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
			public Adapter caseDATATYPEDEFINITIONSType(DATATYPEDEFINITIONSType object) {
				return createDATATYPEDEFINITIONSTypeAdapter();
			}
			@Override
			public Adapter caseDATATYPEDEFINITIONXMLDATA(DATATYPEDEFINITIONXMLDATA object) {
				return createDATATYPEDEFINITIONXMLDATAAdapter();
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
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
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
			public Adapter caseRELATIONGROUPSType(RELATIONGROUPSType object) {
				return createRELATIONGROUPSTypeAdapter();
			}
			@Override
			public Adapter caseRELATIONGROUPSType1(RELATIONGROUPSType1 object) {
				return createRELATIONGROUPSType1Adapter();
			}
			@Override
			public Adapter caseRELATIONTYPEType(RELATIONTYPEType object) {
				return createRELATIONTYPETypeAdapter();
			}
			@Override
			public Adapter caseRIF(RIF object) {
				return createRIFAdapter();
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
			public Adapter caseSPECGROUP(SPECGROUP object) {
				return createSPECGROUPAdapter();
			}
			@Override
			public Adapter caseSPECGROUPSType(SPECGROUPSType object) {
				return createSPECGROUPSTypeAdapter();
			}
			@Override
			public Adapter caseSPECGROUPSType1(SPECGROUPSType1 object) {
				return createSPECGROUPSType1Adapter();
			}
			@Override
			public Adapter caseSPECHIERARCHIESType(SPECHIERARCHIESType object) {
				return createSPECHIERARCHIESTypeAdapter();
			}
			@Override
			public Adapter caseSPECHIERARCHY(SPECHIERARCHY object) {
				return createSPECHIERARCHYAdapter();
			}
			@Override
			public Adapter caseSPECHIERARCHYROOT(SPECHIERARCHYROOT object) {
				return createSPECHIERARCHYROOTAdapter();
			}
			@Override
			public Adapter caseSPECHIERARCHYROOTSType(SPECHIERARCHYROOTSType object) {
				return createSPECHIERARCHYROOTSTypeAdapter();
			}
			@Override
			public Adapter caseSPECHIERARCHYROOTSType1(SPECHIERARCHYROOTSType1 object) {
				return createSPECHIERARCHYROOTSType1Adapter();
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
			public Adapter caseSPECOBJECTSType1(SPECOBJECTSType1 object) {
				return createSPECOBJECTSType1Adapter();
			}
			@Override
			public Adapter caseSPECOBJECTSType2(SPECOBJECTSType2 object) {
				return createSPECOBJECTSType2Adapter();
			}
			@Override
			public Adapter caseSPECRELATION(SPECRELATION object) {
				return createSPECRELATIONAdapter();
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
			public Adapter caseSPECRELATIONSType2(SPECRELATIONSType2 object) {
				return createSPECRELATIONSType2Adapter();
			}
			@Override
			public Adapter caseSPECTYPE(SPECTYPE object) {
				return createSPECTYPEAdapter();
			}
			@Override
			public Adapter caseSPECTYPESType(SPECTYPESType object) {
				return createSPECTYPESTypeAdapter();
			}
			@Override
			public Adapter caseSPECTYPESType1(SPECTYPESType1 object) {
				return createSPECTYPESType1Adapter();
			}
			@Override
			public Adapter caseTARGETGROUPType(TARGETGROUPType object) {
				return createTARGETGROUPTypeAdapter();
			}
			@Override
			public Adapter caseTARGETType(TARGETType object) {
				return createTARGETTypeAdapter();
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
			public Adapter caseVALUESType4(VALUESType4 object) {
				return createVALUESType4Adapter();
			}
			@Override
			public Adapter caseXHTMLCONTENT(XHTMLCONTENT object) {
				return createXHTMLCONTENTAdapter();
			}
			@Override
			public Adapter caseXMLCONTENT(XMLCONTENT object) {
				return createXMLCONTENTAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType <em>ACCESSPOLICIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType
	 * @generated
	 */
	public Adapter createACCESSPOLICIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY <em>ACCESSPOLICY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY
	 * @generated
	 */
	public Adapter createACCESSPOLICYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONCOMPLEXAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONSIMPLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType <em>ATTRIBUTEDEFINITIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType
	 * @generated
	 */
	public Adapter createATTRIBUTEDEFINITIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEEMBEDDEDDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEEMBEDDEDFILEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEFILEREFERENCEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUESIMPLEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType <em>ATTRIBUTEVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA
	 * @generated
	 */
	public Adapter createATTRIBUTEVALUEXMLDATAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.BINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.BINARYCONTENT
	 * @generated
	 */
	public Adapter createBINARYCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType <em>CHILDREN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType
	 * @generated
	 */
	public Adapter createCHILDRENTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType1 <em>CHILDREN Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType1
	 * @generated
	 */
	public Adapter createCHILDRENType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONBINARYFILEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONBOOLEANAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONDATEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONDOCUMENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONENUMERATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONINTEGERAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONREALAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONSTRINGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType <em>DATATYPEDEFINITIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA
	 * @generated
	 */
	public Adapter createDATATYPEDEFINITIONXMLDATAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType <em>DATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType
	 * @generated
	 */
	public Adapter createDATATYPESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType <em>DEFAULTVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType
	 * @generated
	 */
	public Adapter createDEFAULTVALUETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1 <em>DEFAULTVALUE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2 <em>DEFAULTVALUE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2
	 * @generated
	 */
	public Adapter createDEFAULTVALUEType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType <em>DEFINITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType
	 * @generated
	 */
	public Adapter createDEFINITIONTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType1 <em>DEFINITION Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType1
	 * @generated
	 */
	public Adapter createDEFINITIONType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType2 <em>DEFINITION Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType2
	 * @generated
	 */
	public Adapter createDEFINITIONType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType3 <em>DEFINITION Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType3
	 * @generated
	 */
	public Adapter createDEFINITIONType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType4 <em>DEFINITION Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType4
	 * @generated
	 */
	public Adapter createDEFINITIONType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType5 <em>DEFINITION Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType5
	 * @generated
	 */
	public Adapter createDEFINITIONType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE
	 * @generated
	 */
	public Adapter createEMBEDDEDVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE
	 * @generated
	 */
	public Adapter createENUMVALUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.OBJECTType <em>OBJECT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.OBJECTType
	 * @generated
	 */
	public Adapter createOBJECTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.PROPERTIESType <em>PROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.PROPERTIESType
	 * @generated
	 */
	public Adapter createPROPERTIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP
	 * @generated
	 */
	public Adapter createRELATIONGROUPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType <em>RELATIONGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType
	 * @generated
	 */
	public Adapter createRELATIONGROUPSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1 <em>RELATIONGROUPS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1
	 * @generated
	 */
	public Adapter createRELATIONGROUPSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.RELATIONTYPEType <em>RELATIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONTYPEType
	 * @generated
	 */
	public Adapter createRELATIONTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.RIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.RIF
	 * @generated
	 */
	public Adapter createRIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SOURCEType <em>SOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SOURCEType
	 * @generated
	 */
	public Adapter createSOURCETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType <em>SPECATTRIBUTES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType
	 * @generated
	 */
	public Adapter createSPECATTRIBUTESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP <em>SPECGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP
	 * @generated
	 */
	public Adapter createSPECGROUPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType <em>SPECGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType
	 * @generated
	 */
	public Adapter createSPECGROUPSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType1 <em>SPECGROUPS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType1
	 * @generated
	 */
	public Adapter createSPECGROUPSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType <em>SPECHIERARCHIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType
	 * @generated
	 */
	public Adapter createSPECHIERARCHIESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY
	 * @generated
	 */
	public Adapter createSPECHIERARCHYAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT
	 * @generated
	 */
	public Adapter createSPECHIERARCHYROOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType <em>SPECHIERARCHYROOTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType
	 * @generated
	 */
	public Adapter createSPECHIERARCHYROOTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1 <em>SPECHIERARCHYROOTS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1
	 * @generated
	 */
	public Adapter createSPECHIERARCHYROOTSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType <em>SPECIFIEDVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType
	 * @generated
	 */
	public Adapter createSPECIFIEDVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT
	 * @generated
	 */
	public Adapter createSPECOBJECTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType <em>SPECOBJECTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType
	 * @generated
	 */
	public Adapter createSPECOBJECTSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1 <em>SPECOBJECTS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1
	 * @generated
	 */
	public Adapter createSPECOBJECTSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2 <em>SPECOBJECTS Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2
	 * @generated
	 */
	public Adapter createSPECOBJECTSType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION
	 * @generated
	 */
	public Adapter createSPECRELATIONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType <em>SPECRELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType
	 * @generated
	 */
	public Adapter createSPECRELATIONSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1 <em>SPECRELATIONS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1
	 * @generated
	 */
	public Adapter createSPECRELATIONSType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2 <em>SPECRELATIONS Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2
	 * @generated
	 */
	public Adapter createSPECRELATIONSType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE <em>SPECTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE
	 * @generated
	 */
	public Adapter createSPECTYPEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType <em>SPECTYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType
	 * @generated
	 */
	public Adapter createSPECTYPESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType1 <em>SPECTYPES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType1
	 * @generated
	 */
	public Adapter createSPECTYPESType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TARGETGROUPType <em>TARGETGROUP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETGROUPType
	 * @generated
	 */
	public Adapter createTARGETGROUPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TARGETType <em>TARGET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETType
	 * @generated
	 */
	public Adapter createTARGETTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType <em>TYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType
	 * @generated
	 */
	public Adapter createTYPETypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType1 <em>TYPE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType1
	 * @generated
	 */
	public Adapter createTYPEType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType2 <em>TYPE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType2
	 * @generated
	 */
	public Adapter createTYPEType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType3 <em>TYPE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3
	 * @generated
	 */
	public Adapter createTYPEType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType4 <em>TYPE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType4
	 * @generated
	 */
	public Adapter createTYPEType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType5 <em>TYPE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType5
	 * @generated
	 */
	public Adapter createTYPEType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.TYPEType6 <em>TYPE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType6
	 * @generated
	 */
	public Adapter createTYPEType6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.VALUESType <em>VALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType
	 * @generated
	 */
	public Adapter createVALUESTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.VALUESType1 <em>VALUES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1
	 * @generated
	 */
	public Adapter createVALUESType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.VALUESType2 <em>VALUES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2
	 * @generated
	 */
	public Adapter createVALUESType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.VALUESType3 <em>VALUES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3
	 * @generated
	 */
	public Adapter createVALUESType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.VALUESType4 <em>VALUES Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType4
	 * @generated
	 */
	public Adapter createVALUESType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.XHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.XHTMLCONTENT
	 * @generated
	 */
	public Adapter createXHTMLCONTENTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.xsd.XMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.xsd.XMLCONTENT
	 * @generated
	 */
	public Adapter createXMLCONTENTAdapter() {
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

} //RifAdapterFactory
