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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType10;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType12;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType13;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType14;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType16;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType17;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType18;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType19;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType21;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType22;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType23;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType7;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType8;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType9;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifFactory;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.PROPERTIESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCESPECIFICATIONType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SOURCEType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECATTRIBUTESType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFIEDVALUESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETSPECIFICATIONType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TARGETType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType10;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType5;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType6;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType7;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType8;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType2;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyreqifPackageImpl extends EPackageImpl implements MyreqifPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType13EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType14EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType15EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType16EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType17EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType18EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType19EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType20EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType21EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType22EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeidType23EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionbooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitiondateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionintegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionrealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributedefinitionxhtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluebooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluedateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevalueenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevalueintegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluerealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluestringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributevaluexhtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass childrenType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corecontentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionbooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitiondateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionenumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionintegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionrealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionstringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypedefinitionxhtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultvalueType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editableattsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumvalueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationgrouptypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqifcontentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqifheaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reqiftoolextensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourcespecificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specattributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specattributesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specattributesType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specattributesType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spechierarchyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specifiedvaluesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specobjecttypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationgroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specrelationtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spectypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetspecificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theheaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolextensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType8EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType9EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeType10EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuesType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType globalrefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localrefEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xhtmlcontentEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MyreqifPackageImpl() {
		super(eNS_URI, MyreqifFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MyreqifPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MyreqifPackage init() {
		if (isInited) return (MyreqifPackage)EPackage.Registry.INSTANCE.getEPackage(MyreqifPackage.eNS_URI);

		// Obtain or create and register package
		MyreqifPackageImpl theMyreqifPackage = (MyreqifPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyreqifPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyreqifPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMyreqifPackage.createPackageContents();

		// Initialize created meta-data
		theMyreqifPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMyreqifPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, theMyreqifPackage);
		return theMyreqifPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEID() {
		return alternativeidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALTERNATIVEID_IDENTIFIER() {
		return (EAttribute)alternativeidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType() {
		return alternativeidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType_ALTERNATIVEID() {
		return (EReference)alternativeidTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType1() {
		return alternativeidType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType1_ALTERNATIVEID() {
		return (EReference)alternativeidType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType2() {
		return alternativeidType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType2_ALTERNATIVEID() {
		return (EReference)alternativeidType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType3() {
		return alternativeidType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType3_ALTERNATIVEID() {
		return (EReference)alternativeidType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType4() {
		return alternativeidType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType4_ALTERNATIVEID() {
		return (EReference)alternativeidType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType5() {
		return alternativeidType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType5_ALTERNATIVEID() {
		return (EReference)alternativeidType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType6() {
		return alternativeidType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType6_ALTERNATIVEID() {
		return (EReference)alternativeidType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType7() {
		return alternativeidType7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType7_ALTERNATIVEID() {
		return (EReference)alternativeidType7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType8() {
		return alternativeidType8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType8_ALTERNATIVEID() {
		return (EReference)alternativeidType8EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType9() {
		return alternativeidType9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType9_ALTERNATIVEID() {
		return (EReference)alternativeidType9EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType10() {
		return alternativeidType10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType10_ALTERNATIVEID() {
		return (EReference)alternativeidType10EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType11() {
		return alternativeidType11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType11_ALTERNATIVEID() {
		return (EReference)alternativeidType11EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType12() {
		return alternativeidType12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType12_ALTERNATIVEID() {
		return (EReference)alternativeidType12EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType13() {
		return alternativeidType13EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType13_ALTERNATIVEID() {
		return (EReference)alternativeidType13EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType14() {
		return alternativeidType14EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType14_ALTERNATIVEID() {
		return (EReference)alternativeidType14EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType15() {
		return alternativeidType15EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType15_ALTERNATIVEID() {
		return (EReference)alternativeidType15EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType16() {
		return alternativeidType16EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType16_ALTERNATIVEID() {
		return (EReference)alternativeidType16EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType17() {
		return alternativeidType17EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType17_ALTERNATIVEID() {
		return (EReference)alternativeidType17EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType18() {
		return alternativeidType18EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType18_ALTERNATIVEID() {
		return (EReference)alternativeidType18EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType19() {
		return alternativeidType19EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType19_ALTERNATIVEID() {
		return (EReference)alternativeidType19EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType20() {
		return alternativeidType20EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType20_ALTERNATIVEID() {
		return (EReference)alternativeidType20EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType21() {
		return alternativeidType21EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType21_ALTERNATIVEID() {
		return (EReference)alternativeidType21EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType22() {
		return alternativeidType22EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType22_ALTERNATIVEID() {
		return (EReference)alternativeidType22EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALTERNATIVEIDType23() {
		return alternativeidType23EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getALTERNATIVEIDType23_ALTERNATIVEID() {
		return (EReference)alternativeidType23EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONBOOLEAN() {
		return attributedefinitionbooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONBOOLEAN_ALTERNATIVEID() {
		return (EReference)attributedefinitionbooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONBOOLEAN_DEFAULTVALUE() {
		return (EReference)attributedefinitionbooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONBOOLEAN_TYPE() {
		return (EReference)attributedefinitionbooleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONBOOLEAN_DESC() {
		return (EAttribute)attributedefinitionbooleanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONBOOLEAN_IDENTIFIER() {
		return (EAttribute)attributedefinitionbooleanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONBOOLEAN_ISEDITABLE() {
		return (EAttribute)attributedefinitionbooleanEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONBOOLEAN_LASTCHANGE() {
		return (EAttribute)attributedefinitionbooleanEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONBOOLEAN_LONGNAME() {
		return (EAttribute)attributedefinitionbooleanEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONDATE() {
		return attributedefinitiondateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONDATE_ALTERNATIVEID() {
		return (EReference)attributedefinitiondateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONDATE_DEFAULTVALUE() {
		return (EReference)attributedefinitiondateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONDATE_TYPE() {
		return (EReference)attributedefinitiondateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONDATE_DESC() {
		return (EAttribute)attributedefinitiondateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONDATE_IDENTIFIER() {
		return (EAttribute)attributedefinitiondateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONDATE_ISEDITABLE() {
		return (EAttribute)attributedefinitiondateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONDATE_LASTCHANGE() {
		return (EAttribute)attributedefinitiondateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONDATE_LONGNAME() {
		return (EAttribute)attributedefinitiondateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONENUMERATION() {
		return attributedefinitionenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE() {
		return (EReference)attributedefinitionenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONENUMERATION_ALTERNATIVEID() {
		return (EReference)attributedefinitionenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONENUMERATION_TYPE() {
		return (EReference)attributedefinitionenumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_DESC() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_ISEDITABLE() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_LONGNAME() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED() {
		return (EAttribute)attributedefinitionenumerationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONINTEGER() {
		return attributedefinitionintegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID() {
		return (EReference)attributedefinitionintegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE() {
		return (EReference)attributedefinitionintegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONINTEGER_TYPE() {
		return (EReference)attributedefinitionintegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONINTEGER_DESC() {
		return (EAttribute)attributedefinitionintegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER() {
		return (EAttribute)attributedefinitionintegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE() {
		return (EAttribute)attributedefinitionintegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE() {
		return (EAttribute)attributedefinitionintegerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONINTEGER_LONGNAME() {
		return (EAttribute)attributedefinitionintegerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONREAL() {
		return attributedefinitionrealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONREAL_ALTERNATIVEID() {
		return (EReference)attributedefinitionrealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONREAL_DEFAULTVALUE() {
		return (EReference)attributedefinitionrealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONREAL_TYPE() {
		return (EReference)attributedefinitionrealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONREAL_DESC() {
		return (EAttribute)attributedefinitionrealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONREAL_IDENTIFIER() {
		return (EAttribute)attributedefinitionrealEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONREAL_ISEDITABLE() {
		return (EAttribute)attributedefinitionrealEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONREAL_LASTCHANGE() {
		return (EAttribute)attributedefinitionrealEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONREAL_LONGNAME() {
		return (EAttribute)attributedefinitionrealEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONSTRING() {
		return attributedefinitionstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSTRING_ALTERNATIVEID() {
		return (EReference)attributedefinitionstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSTRING_DEFAULTVALUE() {
		return (EReference)attributedefinitionstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONSTRING_TYPE() {
		return (EReference)attributedefinitionstringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSTRING_DESC() {
		return (EAttribute)attributedefinitionstringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSTRING_IDENTIFIER() {
		return (EAttribute)attributedefinitionstringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSTRING_ISEDITABLE() {
		return (EAttribute)attributedefinitionstringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSTRING_LASTCHANGE() {
		return (EAttribute)attributedefinitionstringEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONSTRING_LONGNAME() {
		return (EAttribute)attributedefinitionstringEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEDEFINITIONXHTML() {
		return attributedefinitionxhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONXHTML_ALTERNATIVEID() {
		return (EReference)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONXHTML_DEFAULTVALUE() {
		return (EReference)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEDEFINITIONXHTML_TYPE() {
		return (EReference)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONXHTML_DESC() {
		return (EAttribute)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONXHTML_IDENTIFIER() {
		return (EAttribute)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONXHTML_ISEDITABLE() {
		return (EAttribute)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONXHTML_LASTCHANGE() {
		return (EAttribute)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEDEFINITIONXHTML_LONGNAME() {
		return (EAttribute)attributedefinitionxhtmlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEBOOLEAN() {
		return attributevaluebooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEBOOLEAN_DEFINITION() {
		return (EReference)attributevaluebooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEBOOLEAN_THEVALUE() {
		return (EAttribute)attributevaluebooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEDATE() {
		return attributevaluedateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEDATE_DEFINITION() {
		return (EReference)attributevaluedateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEDATE_THEVALUE() {
		return (EAttribute)attributevaluedateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEENUMERATION() {
		return attributevalueenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEENUMERATION_DEFINITION() {
		return (EReference)attributevalueenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEENUMERATION_VALUES() {
		return (EReference)attributevalueenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEINTEGER() {
		return attributevalueintegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEINTEGER_DEFINITION() {
		return (EReference)attributevalueintegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEINTEGER_THEVALUE() {
		return (EAttribute)attributevalueintegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEREAL() {
		return attributevaluerealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEREAL_DEFINITION() {
		return (EReference)attributevaluerealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEREAL_THEVALUE() {
		return (EAttribute)attributevaluerealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUESTRING() {
		return attributevaluestringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUESTRING_DEFINITION() {
		return (EReference)attributevaluestringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUESTRING_THEVALUE() {
		return (EAttribute)attributevaluestringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATTRIBUTEVALUEXHTML() {
		return attributevaluexhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXHTML_THEVALUE() {
		return (EAttribute)attributevaluexhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXHTML_THEORIGINALVALUE() {
		return (EAttribute)attributevaluexhtmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATTRIBUTEVALUEXHTML_DEFINITION() {
		return (EReference)attributevaluexhtmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getATTRIBUTEVALUEXHTML_ISSIMPLIFIED() {
		return (EAttribute)attributevaluexhtmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCHILDRENType() {
		return childrenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCHILDRENType_Group() {
		return (EAttribute)childrenTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCHILDRENType_SPECHIERARCHY() {
		return (EReference)childrenTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCHILDRENType1() {
		return childrenType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCHILDRENType1_Group() {
		return (EAttribute)childrenType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCHILDRENType1_SPECHIERARCHY() {
		return (EReference)childrenType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCORECONTENTType() {
		return corecontentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCORECONTENTType_REQIFCONTENT() {
		return (EReference)corecontentTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONBOOLEAN() {
		return datatypedefinitionbooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONBOOLEAN_ALTERNATIVEID() {
		return (EReference)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_DESC() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONBOOLEAN_LONGNAME() {
		return (EAttribute)datatypedefinitionbooleanEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONDATE() {
		return datatypedefinitiondateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONDATE_ALTERNATIVEID() {
		return (EReference)datatypedefinitiondateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_DESC() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_IDENTIFIER() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_LASTCHANGE() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONDATE_LONGNAME() {
		return (EAttribute)datatypedefinitiondateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONENUMERATION() {
		return datatypedefinitionenumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONENUMERATION_ALTERNATIVEID() {
		return (EReference)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES() {
		return (EReference)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_DESC() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_IDENTIFIER() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_LASTCHANGE() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONENUMERATION_LONGNAME() {
		return (EAttribute)datatypedefinitionenumerationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONINTEGER() {
		return datatypedefinitionintegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONINTEGER_ALTERNATIVEID() {
		return (EReference)datatypedefinitionintegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_DESC() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_IDENTIFIER() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_LASTCHANGE() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_LONGNAME() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_MAX() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONINTEGER_MIN() {
		return (EAttribute)datatypedefinitionintegerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONREAL() {
		return datatypedefinitionrealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONREAL_ALTERNATIVEID() {
		return (EReference)datatypedefinitionrealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_ACCURACY() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_DESC() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_IDENTIFIER() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_LASTCHANGE() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_LONGNAME() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_MAX() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONREAL_MIN() {
		return (EAttribute)datatypedefinitionrealEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONSTRING() {
		return datatypedefinitionstringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONSTRING_ALTERNATIVEID() {
		return (EReference)datatypedefinitionstringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_DESC() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_IDENTIFIER() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_LASTCHANGE() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_LONGNAME() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONSTRING_MAXLENGTH() {
		return (EAttribute)datatypedefinitionstringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPEDEFINITIONXHTML() {
		return datatypedefinitionxhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPEDEFINITIONXHTML_ALTERNATIVEID() {
		return (EReference)datatypedefinitionxhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXHTML_DESC() {
		return (EAttribute)datatypedefinitionxhtmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXHTML_IDENTIFIER() {
		return (EAttribute)datatypedefinitionxhtmlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXHTML_LASTCHANGE() {
		return (EAttribute)datatypedefinitionxhtmlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPEDEFINITIONXHTML_LONGNAME() {
		return (EAttribute)datatypedefinitionxhtmlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDATATYPESType() {
		return datatypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDATATYPESType_Group() {
		return (EAttribute)datatypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONBOOLEAN() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONDATE() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONENUMERATION() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONINTEGER() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONREAL() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONSTRING() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDATATYPESType_DATATYPEDEFINITIONXHTML() {
		return (EReference)datatypesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType() {
		return defaultvalueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType_ATTRIBUTEVALUEDATE() {
		return (EReference)defaultvalueTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType1() {
		return defaultvalueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)defaultvalueType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType2() {
		return defaultvalueType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEINTEGER() {
		return (EReference)defaultvalueType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType3() {
		return defaultvalueType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType3_ATTRIBUTEVALUEREAL() {
		return (EReference)defaultvalueType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType4() {
		return defaultvalueType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType4_ATTRIBUTEVALUESTRING() {
		return (EReference)defaultvalueType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType5() {
		return defaultvalueType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType5_ATTRIBUTEVALUEXHTML() {
		return (EReference)defaultvalueType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFAULTVALUEType6() {
		return defaultvalueType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDEFAULTVALUEType6_ATTRIBUTEVALUEBOOLEAN() {
		return (EReference)defaultvalueType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType() {
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType_ATTRIBUTEDEFINITIONENUMERATIONREF() {
		return (EAttribute)definitionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType1() {
		return definitionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType1_ATTRIBUTEDEFINITIONDATEREF() {
		return (EAttribute)definitionType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType2() {
		return definitionType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF() {
		return (EAttribute)definitionType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType3() {
		return definitionType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType3_ATTRIBUTEDEFINITIONXHTMLREF() {
		return (EAttribute)definitionType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType4() {
		return definitionType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF() {
		return (EAttribute)definitionType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType5() {
		return definitionType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF() {
		return (EAttribute)definitionType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDEFINITIONType6() {
		return definitionType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDEFINITIONType6_ATTRIBUTEDEFINITIONBOOLEANREF() {
		return (EAttribute)definitionType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_REQIF() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEDITABLEATTSType() {
		return editableattsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_Group() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF() {
		return (EAttribute)editableattsTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMBEDDEDVALUE() {
		return embeddedvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBEDDEDVALUE_KEY() {
		return (EAttribute)embeddedvalueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMBEDDEDVALUE_OTHERCONTENT() {
		return (EAttribute)embeddedvalueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getENUMVALUE() {
		return enumvalueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMVALUE_ALTERNATIVEID() {
		return (EReference)enumvalueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getENUMVALUE_PROPERTIES() {
		return (EReference)enumvalueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_DESC() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_IDENTIFIER() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_LASTCHANGE() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getENUMVALUE_LONGNAME() {
		return (EAttribute)enumvalueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOBJECTType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOBJECTType_SPECOBJECTREF() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROPERTIESType() {
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPROPERTIESType_EMBEDDEDVALUE() {
		return (EReference)propertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONGROUP() {
		return relationgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_ALTERNATIVEID() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_SOURCESPECIFICATION() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_SPECRELATIONS() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_TARGETSPECIFICATION() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUP_TYPE() {
		return (EReference)relationgroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_DESC() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_IDENTIFIER() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_LASTCHANGE() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUP_LONGNAME() {
		return (EAttribute)relationgroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRELATIONGROUPTYPE() {
		return relationgrouptypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUPTYPE_ALTERNATIVEID() {
		return (EReference)relationgrouptypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRELATIONGROUPTYPE_SPECATTRIBUTES() {
		return (EReference)relationgrouptypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPTYPE_DESC() {
		return (EAttribute)relationgrouptypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPTYPE_IDENTIFIER() {
		return (EAttribute)relationgrouptypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPTYPE_LASTCHANGE() {
		return (EAttribute)relationgrouptypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRELATIONGROUPTYPE_LONGNAME() {
		return (EAttribute)relationgrouptypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREQIF() {
		return reqifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIF_THEHEADER() {
		return (EReference)reqifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIF_CORECONTENT() {
		return (EReference)reqifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIF_TOOLEXTENSIONS() {
		return (EReference)reqifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIF_Lang() {
		return (EAttribute)reqifEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREQIFCONTENT() {
		return reqifcontentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_DATATYPES() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_SPECTYPES() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_SPECOBJECTS() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_SPECRELATIONS() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_SPECIFICATIONS() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getREQIFCONTENT_SPECRELATIONGROUPS() {
		return (EReference)reqifcontentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREQIFHEADER() {
		return reqifheaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_COMMENT() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_CREATIONTIME() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_REPOSITORYID() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_REQIFTOOLID() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_REQIFVERSION() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_SOURCETOOLID() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_TITLE() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFHEADER_IDENTIFIER() {
		return (EAttribute)reqifheaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getREQIFTOOLEXTENSION() {
		return reqiftoolextensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getREQIFTOOLEXTENSION_Any() {
		return (EAttribute)reqiftoolextensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOURCESPECIFICATIONType() {
		return sourcespecificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOURCESPECIFICATIONType_SPECIFICATIONREF() {
		return (EAttribute)sourcespecificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSOURCEType() {
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSOURCEType_SPECOBJECTREF() {
		return (EAttribute)sourceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECATTRIBUTESType() {
		return specattributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECATTRIBUTESType_Group() {
		return (EAttribute)specattributesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML() {
		return (EReference)specattributesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECATTRIBUTESType1() {
		return specattributesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECATTRIBUTESType1_Group() {
		return (EAttribute)specattributesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONBOOLEAN() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONDATE() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONENUMERATION() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONINTEGER() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONREAL() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONSTRING() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONXHTML() {
		return (EReference)specattributesType1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECATTRIBUTESType2() {
		return specattributesType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECATTRIBUTESType2_Group() {
		return (EAttribute)specattributesType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONBOOLEAN() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONDATE() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONENUMERATION() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONINTEGER() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONREAL() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONSTRING() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONXHTML() {
		return (EReference)specattributesType2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECATTRIBUTESType3() {
		return specattributesType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECATTRIBUTESType3_Group() {
		return (EAttribute)specattributesType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONBOOLEAN() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONDATE() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONENUMERATION() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONINTEGER() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONREAL() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONSTRING() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONXHTML() {
		return (EReference)specattributesType3EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECHIERARCHY() {
		return spechierarchyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_ALTERNATIVEID() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_CHILDREN() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_EDITABLEATTS() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECHIERARCHY_OBJECT() {
		return (EReference)spechierarchyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_DESC() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_IDENTIFIER() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_ISEDITABLE() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_ISTABLEINTERNAL() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_LASTCHANGE() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECHIERARCHY_LONGNAME() {
		return (EAttribute)spechierarchyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECIFICATION() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATION_ALTERNATIVEID() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATION_VALUES() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATION_CHILDREN() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATION_TYPE() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATION_DESC() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATION_IDENTIFIER() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATION_LASTCHANGE() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATION_LONGNAME() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECIFICATIONSType() {
		return specificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATIONSType_Group() {
		return (EAttribute)specificationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATIONSType_SPECIFICATION() {
		return (EReference)specificationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECIFICATIONTYPE() {
		return specificationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATIONTYPE_ALTERNATIVEID() {
		return (EReference)specificationtypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFICATIONTYPE_SPECATTRIBUTES() {
		return (EReference)specificationtypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATIONTYPE_DESC() {
		return (EAttribute)specificationtypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATIONTYPE_IDENTIFIER() {
		return (EAttribute)specificationtypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATIONTYPE_LASTCHANGE() {
		return (EAttribute)specificationtypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFICATIONTYPE_LONGNAME() {
		return (EAttribute)specificationtypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECIFIEDVALUESType() {
		return specifiedvaluesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECIFIEDVALUESType_Group() {
		return (EAttribute)specifiedvaluesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECIFIEDVALUESType_ENUMVALUE() {
		return (EReference)specifiedvaluesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECT() {
		return specobjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECT_ALTERNATIVEID() {
		return (EReference)specobjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECT_VALUES() {
		return (EReference)specobjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECT_TYPE() {
		return (EReference)specobjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_DESC() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_IDENTIFIER() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_LASTCHANGE() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECT_LONGNAME() {
		return (EAttribute)specobjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECTSType() {
		return specobjectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTSType_Group() {
		return (EAttribute)specobjectsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTSType_SPECOBJECT() {
		return (EReference)specobjectsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECOBJECTTYPE() {
		return specobjecttypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTTYPE_ALTERNATIVEID() {
		return (EReference)specobjecttypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECOBJECTTYPE_SPECATTRIBUTES() {
		return (EReference)specobjecttypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTTYPE_DESC() {
		return (EAttribute)specobjecttypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTTYPE_IDENTIFIER() {
		return (EAttribute)specobjecttypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTTYPE_LASTCHANGE() {
		return (EAttribute)specobjecttypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECOBJECTTYPE_LONGNAME() {
		return (EAttribute)specobjecttypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATION() {
		return specrelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_ALTERNATIVEID() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_VALUES() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_SOURCE() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_TARGET() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATION_TYPE() {
		return (EReference)specrelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_DESC() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_IDENTIFIER() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_LASTCHANGE() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATION_LONGNAME() {
		return (EAttribute)specrelationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONGROUPSType() {
		return specrelationgroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONGROUPSType_Group() {
		return (EAttribute)specrelationgroupsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONGROUPSType_RELATIONGROUP() {
		return (EReference)specrelationgroupsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONSType() {
		return specrelationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType_Group() {
		return (EAttribute)specrelationsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType_SPECRELATIONREF() {
		return (EAttribute)specrelationsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONSType1() {
		return specrelationsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONSType1_Group() {
		return (EAttribute)specrelationsType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONSType1_SPECRELATION() {
		return (EReference)specrelationsType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECRELATIONTYPE() {
		return specrelationtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONTYPE_ALTERNATIVEID() {
		return (EReference)specrelationtypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECRELATIONTYPE_SPECATTRIBUTES() {
		return (EReference)specrelationtypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONTYPE_DESC() {
		return (EAttribute)specrelationtypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONTYPE_IDENTIFIER() {
		return (EAttribute)specrelationtypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONTYPE_LASTCHANGE() {
		return (EAttribute)specrelationtypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECRELATIONTYPE_LONGNAME() {
		return (EAttribute)specrelationtypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSPECTYPESType() {
		return spectypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSPECTYPESType_Group() {
		return (EAttribute)spectypesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType_RELATIONGROUPTYPE() {
		return (EReference)spectypesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType_SPECOBJECTTYPE() {
		return (EReference)spectypesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType_SPECRELATIONTYPE() {
		return (EReference)spectypesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSPECTYPESType_SPECIFICATIONTYPE() {
		return (EReference)spectypesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTARGETSPECIFICATIONType() {
		return targetspecificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTARGETSPECIFICATIONType_SPECIFICATIONREF() {
		return (EAttribute)targetspecificationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTARGETType() {
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTARGETType_SPECOBJECTREF() {
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTHEHEADERType() {
		return theheaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTHEHEADERType_REQIFHEADER() {
		return (EReference)theheaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTOOLEXTENSIONSType() {
		return toolextensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTOOLEXTENSIONSType_Group() {
		return (EAttribute)toolextensionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTOOLEXTENSIONSType_REQIFTOOLEXTENSION() {
		return (EReference)toolextensionsTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType() {
		return typeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType_RELATIONGROUPTYPEREF() {
		return (EAttribute)typeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType1() {
		return typeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType1_SPECIFICATIONTYPEREF() {
		return (EAttribute)typeType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType2() {
		return typeType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType2_DATATYPEDEFINITIONINTEGERREF() {
		return (EAttribute)typeType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType3() {
		return typeType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType3_DATATYPEDEFINITIONSTRINGREF() {
		return (EAttribute)typeType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType4() {
		return typeType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType4_DATATYPEDEFINITIONREALREF() {
		return (EAttribute)typeType4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType5() {
		return typeType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType5_DATATYPEDEFINITIONXHTMLREF() {
		return (EAttribute)typeType5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType6() {
		return typeType6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType6_SPECOBJECTTYPEREF() {
		return (EAttribute)typeType6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType7() {
		return typeType7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType7_SPECRELATIONTYPEREF() {
		return (EAttribute)typeType7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType8() {
		return typeType8EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType8_DATATYPEDEFINITIONDATEREF() {
		return (EAttribute)typeType8EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType9() {
		return typeType9EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType9_DATATYPEDEFINITIONENUMERATIONREF() {
		return (EAttribute)typeType9EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTYPEType10() {
		return typeType10EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTYPEType10_DATATYPEDEFINITIONBOOLEANREF() {
		return (EAttribute)typeType10EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType() {
		return valuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType_Group() {
		return (EAttribute)valuesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEBOOLEAN() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEDATE() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEINTEGER() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEREAL() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUESTRING() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType_ATTRIBUTEVALUEXHTML() {
		return (EReference)valuesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType1() {
		return valuesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType1_Group() {
		return (EAttribute)valuesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEBOOLEAN() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEDATE() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEINTEGER() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEREAL() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUESTRING() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType1_ATTRIBUTEVALUEXHTML() {
		return (EReference)valuesType1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType2() {
		return valuesType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType2_Group() {
		return (EAttribute)valuesType2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEBOOLEAN() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEDATE() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEENUMERATION() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEINTEGER() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEREAL() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUESTRING() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVALUESType2_ATTRIBUTEVALUEXHTML() {
		return (EReference)valuesType2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVALUESType3() {
		return valuesType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType3_Group() {
		return (EAttribute)valuesType3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVALUESType3_ENUMVALUEREF() {
		return (EAttribute)valuesType3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGLOBALREF() {
		return globalrefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLOCALREF() {
		return localrefEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getXHTMLCONTENT() {
		return xhtmlcontentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyreqifFactory getMyreqifFactory() {
		return (MyreqifFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		alternativeidEClass = createEClass(ALTERNATIVEID);
		createEAttribute(alternativeidEClass, ALTERNATIVEID__IDENTIFIER);

		alternativeidTypeEClass = createEClass(ALTERNATIVEID_TYPE);
		createEReference(alternativeidTypeEClass, ALTERNATIVEID_TYPE__ALTERNATIVEID);

		alternativeidType1EClass = createEClass(ALTERNATIVEID_TYPE1);
		createEReference(alternativeidType1EClass, ALTERNATIVEID_TYPE1__ALTERNATIVEID);

		alternativeidType2EClass = createEClass(ALTERNATIVEID_TYPE2);
		createEReference(alternativeidType2EClass, ALTERNATIVEID_TYPE2__ALTERNATIVEID);

		alternativeidType3EClass = createEClass(ALTERNATIVEID_TYPE3);
		createEReference(alternativeidType3EClass, ALTERNATIVEID_TYPE3__ALTERNATIVEID);

		alternativeidType4EClass = createEClass(ALTERNATIVEID_TYPE4);
		createEReference(alternativeidType4EClass, ALTERNATIVEID_TYPE4__ALTERNATIVEID);

		alternativeidType5EClass = createEClass(ALTERNATIVEID_TYPE5);
		createEReference(alternativeidType5EClass, ALTERNATIVEID_TYPE5__ALTERNATIVEID);

		alternativeidType6EClass = createEClass(ALTERNATIVEID_TYPE6);
		createEReference(alternativeidType6EClass, ALTERNATIVEID_TYPE6__ALTERNATIVEID);

		alternativeidType7EClass = createEClass(ALTERNATIVEID_TYPE7);
		createEReference(alternativeidType7EClass, ALTERNATIVEID_TYPE7__ALTERNATIVEID);

		alternativeidType8EClass = createEClass(ALTERNATIVEID_TYPE8);
		createEReference(alternativeidType8EClass, ALTERNATIVEID_TYPE8__ALTERNATIVEID);

		alternativeidType9EClass = createEClass(ALTERNATIVEID_TYPE9);
		createEReference(alternativeidType9EClass, ALTERNATIVEID_TYPE9__ALTERNATIVEID);

		alternativeidType10EClass = createEClass(ALTERNATIVEID_TYPE10);
		createEReference(alternativeidType10EClass, ALTERNATIVEID_TYPE10__ALTERNATIVEID);

		alternativeidType11EClass = createEClass(ALTERNATIVEID_TYPE11);
		createEReference(alternativeidType11EClass, ALTERNATIVEID_TYPE11__ALTERNATIVEID);

		alternativeidType12EClass = createEClass(ALTERNATIVEID_TYPE12);
		createEReference(alternativeidType12EClass, ALTERNATIVEID_TYPE12__ALTERNATIVEID);

		alternativeidType13EClass = createEClass(ALTERNATIVEID_TYPE13);
		createEReference(alternativeidType13EClass, ALTERNATIVEID_TYPE13__ALTERNATIVEID);

		alternativeidType14EClass = createEClass(ALTERNATIVEID_TYPE14);
		createEReference(alternativeidType14EClass, ALTERNATIVEID_TYPE14__ALTERNATIVEID);

		alternativeidType15EClass = createEClass(ALTERNATIVEID_TYPE15);
		createEReference(alternativeidType15EClass, ALTERNATIVEID_TYPE15__ALTERNATIVEID);

		alternativeidType16EClass = createEClass(ALTERNATIVEID_TYPE16);
		createEReference(alternativeidType16EClass, ALTERNATIVEID_TYPE16__ALTERNATIVEID);

		alternativeidType17EClass = createEClass(ALTERNATIVEID_TYPE17);
		createEReference(alternativeidType17EClass, ALTERNATIVEID_TYPE17__ALTERNATIVEID);

		alternativeidType18EClass = createEClass(ALTERNATIVEID_TYPE18);
		createEReference(alternativeidType18EClass, ALTERNATIVEID_TYPE18__ALTERNATIVEID);

		alternativeidType19EClass = createEClass(ALTERNATIVEID_TYPE19);
		createEReference(alternativeidType19EClass, ALTERNATIVEID_TYPE19__ALTERNATIVEID);

		alternativeidType20EClass = createEClass(ALTERNATIVEID_TYPE20);
		createEReference(alternativeidType20EClass, ALTERNATIVEID_TYPE20__ALTERNATIVEID);

		alternativeidType21EClass = createEClass(ALTERNATIVEID_TYPE21);
		createEReference(alternativeidType21EClass, ALTERNATIVEID_TYPE21__ALTERNATIVEID);

		alternativeidType22EClass = createEClass(ALTERNATIVEID_TYPE22);
		createEReference(alternativeidType22EClass, ALTERNATIVEID_TYPE22__ALTERNATIVEID);

		alternativeidType23EClass = createEClass(ALTERNATIVEID_TYPE23);
		createEReference(alternativeidType23EClass, ALTERNATIVEID_TYPE23__ALTERNATIVEID);

		attributedefinitionbooleanEClass = createEClass(ATTRIBUTEDEFINITIONBOOLEAN);
		createEReference(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__ALTERNATIVEID);
		createEReference(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__DEFAULTVALUE);
		createEReference(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__TYPE);
		createEAttribute(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__DESC);
		createEAttribute(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__IDENTIFIER);
		createEAttribute(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__ISEDITABLE);
		createEAttribute(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__LASTCHANGE);
		createEAttribute(attributedefinitionbooleanEClass, ATTRIBUTEDEFINITIONBOOLEAN__LONGNAME);

		attributedefinitiondateEClass = createEClass(ATTRIBUTEDEFINITIONDATE);
		createEReference(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__ALTERNATIVEID);
		createEReference(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__DEFAULTVALUE);
		createEReference(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__TYPE);
		createEAttribute(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__DESC);
		createEAttribute(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__IDENTIFIER);
		createEAttribute(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__ISEDITABLE);
		createEAttribute(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__LASTCHANGE);
		createEAttribute(attributedefinitiondateEClass, ATTRIBUTEDEFINITIONDATE__LONGNAME);

		attributedefinitionenumerationEClass = createEClass(ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE);
		createEReference(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID);
		createEReference(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__TYPE);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__DESC);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__LONGNAME);
		createEAttribute(attributedefinitionenumerationEClass, ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED);

		attributedefinitionintegerEClass = createEClass(ATTRIBUTEDEFINITIONINTEGER);
		createEReference(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__ALTERNATIVEID);
		createEReference(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__DEFAULTVALUE);
		createEReference(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__TYPE);
		createEAttribute(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__DESC);
		createEAttribute(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__IDENTIFIER);
		createEAttribute(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__ISEDITABLE);
		createEAttribute(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__LASTCHANGE);
		createEAttribute(attributedefinitionintegerEClass, ATTRIBUTEDEFINITIONINTEGER__LONGNAME);

		attributedefinitionrealEClass = createEClass(ATTRIBUTEDEFINITIONREAL);
		createEReference(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__ALTERNATIVEID);
		createEReference(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__DEFAULTVALUE);
		createEReference(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__TYPE);
		createEAttribute(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__DESC);
		createEAttribute(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__IDENTIFIER);
		createEAttribute(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__ISEDITABLE);
		createEAttribute(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__LASTCHANGE);
		createEAttribute(attributedefinitionrealEClass, ATTRIBUTEDEFINITIONREAL__LONGNAME);

		attributedefinitionstringEClass = createEClass(ATTRIBUTEDEFINITIONSTRING);
		createEReference(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID);
		createEReference(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE);
		createEReference(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__TYPE);
		createEAttribute(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__DESC);
		createEAttribute(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__IDENTIFIER);
		createEAttribute(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__ISEDITABLE);
		createEAttribute(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__LASTCHANGE);
		createEAttribute(attributedefinitionstringEClass, ATTRIBUTEDEFINITIONSTRING__LONGNAME);

		attributedefinitionxhtmlEClass = createEClass(ATTRIBUTEDEFINITIONXHTML);
		createEReference(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__ALTERNATIVEID);
		createEReference(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__DEFAULTVALUE);
		createEReference(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__TYPE);
		createEAttribute(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__DESC);
		createEAttribute(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__IDENTIFIER);
		createEAttribute(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__ISEDITABLE);
		createEAttribute(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__LASTCHANGE);
		createEAttribute(attributedefinitionxhtmlEClass, ATTRIBUTEDEFINITIONXHTML__LONGNAME);

		attributevaluebooleanEClass = createEClass(ATTRIBUTEVALUEBOOLEAN);
		createEReference(attributevaluebooleanEClass, ATTRIBUTEVALUEBOOLEAN__DEFINITION);
		createEAttribute(attributevaluebooleanEClass, ATTRIBUTEVALUEBOOLEAN__THEVALUE);

		attributevaluedateEClass = createEClass(ATTRIBUTEVALUEDATE);
		createEReference(attributevaluedateEClass, ATTRIBUTEVALUEDATE__DEFINITION);
		createEAttribute(attributevaluedateEClass, ATTRIBUTEVALUEDATE__THEVALUE);

		attributevalueenumerationEClass = createEClass(ATTRIBUTEVALUEENUMERATION);
		createEReference(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__DEFINITION);
		createEReference(attributevalueenumerationEClass, ATTRIBUTEVALUEENUMERATION__VALUES);

		attributevalueintegerEClass = createEClass(ATTRIBUTEVALUEINTEGER);
		createEReference(attributevalueintegerEClass, ATTRIBUTEVALUEINTEGER__DEFINITION);
		createEAttribute(attributevalueintegerEClass, ATTRIBUTEVALUEINTEGER__THEVALUE);

		attributevaluerealEClass = createEClass(ATTRIBUTEVALUEREAL);
		createEReference(attributevaluerealEClass, ATTRIBUTEVALUEREAL__DEFINITION);
		createEAttribute(attributevaluerealEClass, ATTRIBUTEVALUEREAL__THEVALUE);

		attributevaluestringEClass = createEClass(ATTRIBUTEVALUESTRING);
		createEReference(attributevaluestringEClass, ATTRIBUTEVALUESTRING__DEFINITION);
		createEAttribute(attributevaluestringEClass, ATTRIBUTEVALUESTRING__THEVALUE);

		attributevaluexhtmlEClass = createEClass(ATTRIBUTEVALUEXHTML);
		createEAttribute(attributevaluexhtmlEClass, ATTRIBUTEVALUEXHTML__THEVALUE);
		createEAttribute(attributevaluexhtmlEClass, ATTRIBUTEVALUEXHTML__THEORIGINALVALUE);
		createEReference(attributevaluexhtmlEClass, ATTRIBUTEVALUEXHTML__DEFINITION);
		createEAttribute(attributevaluexhtmlEClass, ATTRIBUTEVALUEXHTML__ISSIMPLIFIED);

		childrenTypeEClass = createEClass(CHILDREN_TYPE);
		createEAttribute(childrenTypeEClass, CHILDREN_TYPE__GROUP);
		createEReference(childrenTypeEClass, CHILDREN_TYPE__SPECHIERARCHY);

		childrenType1EClass = createEClass(CHILDREN_TYPE1);
		createEAttribute(childrenType1EClass, CHILDREN_TYPE1__GROUP);
		createEReference(childrenType1EClass, CHILDREN_TYPE1__SPECHIERARCHY);

		corecontentTypeEClass = createEClass(CORECONTENT_TYPE);
		createEReference(corecontentTypeEClass, CORECONTENT_TYPE__REQIFCONTENT);

		datatypedefinitionbooleanEClass = createEClass(DATATYPEDEFINITIONBOOLEAN);
		createEReference(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__ALTERNATIVEID);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__DESC);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__IDENTIFIER);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__LASTCHANGE);
		createEAttribute(datatypedefinitionbooleanEClass, DATATYPEDEFINITIONBOOLEAN__LONGNAME);

		datatypedefinitiondateEClass = createEClass(DATATYPEDEFINITIONDATE);
		createEReference(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__ALTERNATIVEID);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__DESC);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__IDENTIFIER);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__LASTCHANGE);
		createEAttribute(datatypedefinitiondateEClass, DATATYPEDEFINITIONDATE__LONGNAME);

		datatypedefinitionenumerationEClass = createEClass(DATATYPEDEFINITIONENUMERATION);
		createEReference(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID);
		createEReference(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__DESC);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__IDENTIFIER);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__LASTCHANGE);
		createEAttribute(datatypedefinitionenumerationEClass, DATATYPEDEFINITIONENUMERATION__LONGNAME);

		datatypedefinitionintegerEClass = createEClass(DATATYPEDEFINITIONINTEGER);
		createEReference(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__ALTERNATIVEID);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__DESC);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__IDENTIFIER);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__LASTCHANGE);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__LONGNAME);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__MAX);
		createEAttribute(datatypedefinitionintegerEClass, DATATYPEDEFINITIONINTEGER__MIN);

		datatypedefinitionrealEClass = createEClass(DATATYPEDEFINITIONREAL);
		createEReference(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__ALTERNATIVEID);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__ACCURACY);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__DESC);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__IDENTIFIER);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__LASTCHANGE);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__LONGNAME);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__MAX);
		createEAttribute(datatypedefinitionrealEClass, DATATYPEDEFINITIONREAL__MIN);

		datatypedefinitionstringEClass = createEClass(DATATYPEDEFINITIONSTRING);
		createEReference(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__ALTERNATIVEID);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__DESC);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__IDENTIFIER);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__LASTCHANGE);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__LONGNAME);
		createEAttribute(datatypedefinitionstringEClass, DATATYPEDEFINITIONSTRING__MAXLENGTH);

		datatypedefinitionxhtmlEClass = createEClass(DATATYPEDEFINITIONXHTML);
		createEReference(datatypedefinitionxhtmlEClass, DATATYPEDEFINITIONXHTML__ALTERNATIVEID);
		createEAttribute(datatypedefinitionxhtmlEClass, DATATYPEDEFINITIONXHTML__DESC);
		createEAttribute(datatypedefinitionxhtmlEClass, DATATYPEDEFINITIONXHTML__IDENTIFIER);
		createEAttribute(datatypedefinitionxhtmlEClass, DATATYPEDEFINITIONXHTML__LASTCHANGE);
		createEAttribute(datatypedefinitionxhtmlEClass, DATATYPEDEFINITIONXHTML__LONGNAME);

		datatypesTypeEClass = createEClass(DATATYPES_TYPE);
		createEAttribute(datatypesTypeEClass, DATATYPES_TYPE__GROUP);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONDATE);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONREAL);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONSTRING);
		createEReference(datatypesTypeEClass, DATATYPES_TYPE__DATATYPEDEFINITIONXHTML);

		defaultvalueTypeEClass = createEClass(DEFAULTVALUE_TYPE);
		createEReference(defaultvalueTypeEClass, DEFAULTVALUE_TYPE__ATTRIBUTEVALUEDATE);

		defaultvalueType1EClass = createEClass(DEFAULTVALUE_TYPE1);
		createEReference(defaultvalueType1EClass, DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION);

		defaultvalueType2EClass = createEClass(DEFAULTVALUE_TYPE2);
		createEReference(defaultvalueType2EClass, DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEINTEGER);

		defaultvalueType3EClass = createEClass(DEFAULTVALUE_TYPE3);
		createEReference(defaultvalueType3EClass, DEFAULTVALUE_TYPE3__ATTRIBUTEVALUEREAL);

		defaultvalueType4EClass = createEClass(DEFAULTVALUE_TYPE4);
		createEReference(defaultvalueType4EClass, DEFAULTVALUE_TYPE4__ATTRIBUTEVALUESTRING);

		defaultvalueType5EClass = createEClass(DEFAULTVALUE_TYPE5);
		createEReference(defaultvalueType5EClass, DEFAULTVALUE_TYPE5__ATTRIBUTEVALUEXHTML);

		defaultvalueType6EClass = createEClass(DEFAULTVALUE_TYPE6);
		createEReference(defaultvalueType6EClass, DEFAULTVALUE_TYPE6__ATTRIBUTEVALUEBOOLEAN);

		definitionTypeEClass = createEClass(DEFINITION_TYPE);
		createEAttribute(definitionTypeEClass, DEFINITION_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF);

		definitionType1EClass = createEClass(DEFINITION_TYPE1);
		createEAttribute(definitionType1EClass, DEFINITION_TYPE1__ATTRIBUTEDEFINITIONDATEREF);

		definitionType2EClass = createEClass(DEFINITION_TYPE2);
		createEAttribute(definitionType2EClass, DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSTRINGREF);

		definitionType3EClass = createEClass(DEFINITION_TYPE3);
		createEAttribute(definitionType3EClass, DEFINITION_TYPE3__ATTRIBUTEDEFINITIONXHTMLREF);

		definitionType4EClass = createEClass(DEFINITION_TYPE4);
		createEAttribute(definitionType4EClass, DEFINITION_TYPE4__ATTRIBUTEDEFINITIONREALREF);

		definitionType5EClass = createEClass(DEFINITION_TYPE5);
		createEAttribute(definitionType5EClass, DEFINITION_TYPE5__ATTRIBUTEDEFINITIONINTEGERREF);

		definitionType6EClass = createEClass(DEFINITION_TYPE6);
		createEAttribute(definitionType6EClass, DEFINITION_TYPE6__ATTRIBUTEDEFINITIONBOOLEANREF);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQIF);

		editableattsTypeEClass = createEClass(EDITABLEATTS_TYPE);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__GROUP);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONBOOLEANREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONDATEREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONINTEGERREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONREALREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONSTRINGREF);
		createEAttribute(editableattsTypeEClass, EDITABLEATTS_TYPE__ATTRIBUTEDEFINITIONXHTMLREF);

		embeddedvalueEClass = createEClass(EMBEDDEDVALUE);
		createEAttribute(embeddedvalueEClass, EMBEDDEDVALUE__KEY);
		createEAttribute(embeddedvalueEClass, EMBEDDEDVALUE__OTHERCONTENT);

		enumvalueEClass = createEClass(ENUMVALUE);
		createEReference(enumvalueEClass, ENUMVALUE__ALTERNATIVEID);
		createEReference(enumvalueEClass, ENUMVALUE__PROPERTIES);
		createEAttribute(enumvalueEClass, ENUMVALUE__DESC);
		createEAttribute(enumvalueEClass, ENUMVALUE__IDENTIFIER);
		createEAttribute(enumvalueEClass, ENUMVALUE__LASTCHANGE);
		createEAttribute(enumvalueEClass, ENUMVALUE__LONGNAME);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__SPECOBJECTREF);

		propertiesTypeEClass = createEClass(PROPERTIES_TYPE);
		createEReference(propertiesTypeEClass, PROPERTIES_TYPE__EMBEDDEDVALUE);

		relationgroupEClass = createEClass(RELATIONGROUP);
		createEReference(relationgroupEClass, RELATIONGROUP__ALTERNATIVEID);
		createEReference(relationgroupEClass, RELATIONGROUP__SOURCESPECIFICATION);
		createEReference(relationgroupEClass, RELATIONGROUP__SPECRELATIONS);
		createEReference(relationgroupEClass, RELATIONGROUP__TARGETSPECIFICATION);
		createEReference(relationgroupEClass, RELATIONGROUP__TYPE);
		createEAttribute(relationgroupEClass, RELATIONGROUP__DESC);
		createEAttribute(relationgroupEClass, RELATIONGROUP__IDENTIFIER);
		createEAttribute(relationgroupEClass, RELATIONGROUP__LASTCHANGE);
		createEAttribute(relationgroupEClass, RELATIONGROUP__LONGNAME);

		relationgrouptypeEClass = createEClass(RELATIONGROUPTYPE);
		createEReference(relationgrouptypeEClass, RELATIONGROUPTYPE__ALTERNATIVEID);
		createEReference(relationgrouptypeEClass, RELATIONGROUPTYPE__SPECATTRIBUTES);
		createEAttribute(relationgrouptypeEClass, RELATIONGROUPTYPE__DESC);
		createEAttribute(relationgrouptypeEClass, RELATIONGROUPTYPE__IDENTIFIER);
		createEAttribute(relationgrouptypeEClass, RELATIONGROUPTYPE__LASTCHANGE);
		createEAttribute(relationgrouptypeEClass, RELATIONGROUPTYPE__LONGNAME);

		reqifEClass = createEClass(REQIF);
		createEReference(reqifEClass, REQIF__THEHEADER);
		createEReference(reqifEClass, REQIF__CORECONTENT);
		createEReference(reqifEClass, REQIF__TOOLEXTENSIONS);
		createEAttribute(reqifEClass, REQIF__LANG);

		reqifcontentEClass = createEClass(REQIFCONTENT);
		createEReference(reqifcontentEClass, REQIFCONTENT__DATATYPES);
		createEReference(reqifcontentEClass, REQIFCONTENT__SPECTYPES);
		createEReference(reqifcontentEClass, REQIFCONTENT__SPECOBJECTS);
		createEReference(reqifcontentEClass, REQIFCONTENT__SPECRELATIONS);
		createEReference(reqifcontentEClass, REQIFCONTENT__SPECIFICATIONS);
		createEReference(reqifcontentEClass, REQIFCONTENT__SPECRELATIONGROUPS);

		reqifheaderEClass = createEClass(REQIFHEADER);
		createEAttribute(reqifheaderEClass, REQIFHEADER__COMMENT);
		createEAttribute(reqifheaderEClass, REQIFHEADER__CREATIONTIME);
		createEAttribute(reqifheaderEClass, REQIFHEADER__REPOSITORYID);
		createEAttribute(reqifheaderEClass, REQIFHEADER__REQIFTOOLID);
		createEAttribute(reqifheaderEClass, REQIFHEADER__REQIFVERSION);
		createEAttribute(reqifheaderEClass, REQIFHEADER__SOURCETOOLID);
		createEAttribute(reqifheaderEClass, REQIFHEADER__TITLE);
		createEAttribute(reqifheaderEClass, REQIFHEADER__IDENTIFIER);

		reqiftoolextensionEClass = createEClass(REQIFTOOLEXTENSION);
		createEAttribute(reqiftoolextensionEClass, REQIFTOOLEXTENSION__ANY);

		sourcespecificationTypeEClass = createEClass(SOURCESPECIFICATION_TYPE);
		createEAttribute(sourcespecificationTypeEClass, SOURCESPECIFICATION_TYPE__SPECIFICATIONREF);

		sourceTypeEClass = createEClass(SOURCE_TYPE);
		createEAttribute(sourceTypeEClass, SOURCE_TYPE__SPECOBJECTREF);

		specattributesTypeEClass = createEClass(SPECATTRIBUTES_TYPE);
		createEAttribute(specattributesTypeEClass, SPECATTRIBUTES_TYPE__GROUP);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONBOOLEAN);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONDATE);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONINTEGER);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONREAL);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSTRING);
		createEReference(specattributesTypeEClass, SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONXHTML);

		specattributesType1EClass = createEClass(SPECATTRIBUTES_TYPE1);
		createEAttribute(specattributesType1EClass, SPECATTRIBUTES_TYPE1__GROUP);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONBOOLEAN);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONDATE);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONINTEGER);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONREAL);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONSTRING);
		createEReference(specattributesType1EClass, SPECATTRIBUTES_TYPE1__ATTRIBUTEDEFINITIONXHTML);

		specattributesType2EClass = createEClass(SPECATTRIBUTES_TYPE2);
		createEAttribute(specattributesType2EClass, SPECATTRIBUTES_TYPE2__GROUP);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONBOOLEAN);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONDATE);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONINTEGER);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONREAL);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONSTRING);
		createEReference(specattributesType2EClass, SPECATTRIBUTES_TYPE2__ATTRIBUTEDEFINITIONXHTML);

		specattributesType3EClass = createEClass(SPECATTRIBUTES_TYPE3);
		createEAttribute(specattributesType3EClass, SPECATTRIBUTES_TYPE3__GROUP);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONBOOLEAN);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONDATE);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONENUMERATION);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONINTEGER);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONREAL);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONSTRING);
		createEReference(specattributesType3EClass, SPECATTRIBUTES_TYPE3__ATTRIBUTEDEFINITIONXHTML);

		spechierarchyEClass = createEClass(SPECHIERARCHY);
		createEReference(spechierarchyEClass, SPECHIERARCHY__ALTERNATIVEID);
		createEReference(spechierarchyEClass, SPECHIERARCHY__CHILDREN);
		createEReference(spechierarchyEClass, SPECHIERARCHY__EDITABLEATTS);
		createEReference(spechierarchyEClass, SPECHIERARCHY__OBJECT);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__DESC);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__IDENTIFIER);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__ISEDITABLE);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__ISTABLEINTERNAL);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__LASTCHANGE);
		createEAttribute(spechierarchyEClass, SPECHIERARCHY__LONGNAME);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__ALTERNATIVEID);
		createEReference(specificationEClass, SPECIFICATION__VALUES);
		createEReference(specificationEClass, SPECIFICATION__CHILDREN);
		createEReference(specificationEClass, SPECIFICATION__TYPE);
		createEAttribute(specificationEClass, SPECIFICATION__DESC);
		createEAttribute(specificationEClass, SPECIFICATION__IDENTIFIER);
		createEAttribute(specificationEClass, SPECIFICATION__LASTCHANGE);
		createEAttribute(specificationEClass, SPECIFICATION__LONGNAME);

		specificationsTypeEClass = createEClass(SPECIFICATIONS_TYPE);
		createEAttribute(specificationsTypeEClass, SPECIFICATIONS_TYPE__GROUP);
		createEReference(specificationsTypeEClass, SPECIFICATIONS_TYPE__SPECIFICATION);

		specificationtypeEClass = createEClass(SPECIFICATIONTYPE);
		createEReference(specificationtypeEClass, SPECIFICATIONTYPE__ALTERNATIVEID);
		createEReference(specificationtypeEClass, SPECIFICATIONTYPE__SPECATTRIBUTES);
		createEAttribute(specificationtypeEClass, SPECIFICATIONTYPE__DESC);
		createEAttribute(specificationtypeEClass, SPECIFICATIONTYPE__IDENTIFIER);
		createEAttribute(specificationtypeEClass, SPECIFICATIONTYPE__LASTCHANGE);
		createEAttribute(specificationtypeEClass, SPECIFICATIONTYPE__LONGNAME);

		specifiedvaluesTypeEClass = createEClass(SPECIFIEDVALUES_TYPE);
		createEAttribute(specifiedvaluesTypeEClass, SPECIFIEDVALUES_TYPE__GROUP);
		createEReference(specifiedvaluesTypeEClass, SPECIFIEDVALUES_TYPE__ENUMVALUE);

		specobjectEClass = createEClass(SPECOBJECT);
		createEReference(specobjectEClass, SPECOBJECT__ALTERNATIVEID);
		createEReference(specobjectEClass, SPECOBJECT__VALUES);
		createEReference(specobjectEClass, SPECOBJECT__TYPE);
		createEAttribute(specobjectEClass, SPECOBJECT__DESC);
		createEAttribute(specobjectEClass, SPECOBJECT__IDENTIFIER);
		createEAttribute(specobjectEClass, SPECOBJECT__LASTCHANGE);
		createEAttribute(specobjectEClass, SPECOBJECT__LONGNAME);

		specobjectsTypeEClass = createEClass(SPECOBJECTS_TYPE);
		createEAttribute(specobjectsTypeEClass, SPECOBJECTS_TYPE__GROUP);
		createEReference(specobjectsTypeEClass, SPECOBJECTS_TYPE__SPECOBJECT);

		specobjecttypeEClass = createEClass(SPECOBJECTTYPE);
		createEReference(specobjecttypeEClass, SPECOBJECTTYPE__ALTERNATIVEID);
		createEReference(specobjecttypeEClass, SPECOBJECTTYPE__SPECATTRIBUTES);
		createEAttribute(specobjecttypeEClass, SPECOBJECTTYPE__DESC);
		createEAttribute(specobjecttypeEClass, SPECOBJECTTYPE__IDENTIFIER);
		createEAttribute(specobjecttypeEClass, SPECOBJECTTYPE__LASTCHANGE);
		createEAttribute(specobjecttypeEClass, SPECOBJECTTYPE__LONGNAME);

		specrelationEClass = createEClass(SPECRELATION);
		createEReference(specrelationEClass, SPECRELATION__ALTERNATIVEID);
		createEReference(specrelationEClass, SPECRELATION__VALUES);
		createEReference(specrelationEClass, SPECRELATION__SOURCE);
		createEReference(specrelationEClass, SPECRELATION__TARGET);
		createEReference(specrelationEClass, SPECRELATION__TYPE);
		createEAttribute(specrelationEClass, SPECRELATION__DESC);
		createEAttribute(specrelationEClass, SPECRELATION__IDENTIFIER);
		createEAttribute(specrelationEClass, SPECRELATION__LASTCHANGE);
		createEAttribute(specrelationEClass, SPECRELATION__LONGNAME);

		specrelationgroupsTypeEClass = createEClass(SPECRELATIONGROUPS_TYPE);
		createEAttribute(specrelationgroupsTypeEClass, SPECRELATIONGROUPS_TYPE__GROUP);
		createEReference(specrelationgroupsTypeEClass, SPECRELATIONGROUPS_TYPE__RELATIONGROUP);

		specrelationsTypeEClass = createEClass(SPECRELATIONS_TYPE);
		createEAttribute(specrelationsTypeEClass, SPECRELATIONS_TYPE__GROUP);
		createEAttribute(specrelationsTypeEClass, SPECRELATIONS_TYPE__SPECRELATIONREF);

		specrelationsType1EClass = createEClass(SPECRELATIONS_TYPE1);
		createEAttribute(specrelationsType1EClass, SPECRELATIONS_TYPE1__GROUP);
		createEReference(specrelationsType1EClass, SPECRELATIONS_TYPE1__SPECRELATION);

		specrelationtypeEClass = createEClass(SPECRELATIONTYPE);
		createEReference(specrelationtypeEClass, SPECRELATIONTYPE__ALTERNATIVEID);
		createEReference(specrelationtypeEClass, SPECRELATIONTYPE__SPECATTRIBUTES);
		createEAttribute(specrelationtypeEClass, SPECRELATIONTYPE__DESC);
		createEAttribute(specrelationtypeEClass, SPECRELATIONTYPE__IDENTIFIER);
		createEAttribute(specrelationtypeEClass, SPECRELATIONTYPE__LASTCHANGE);
		createEAttribute(specrelationtypeEClass, SPECRELATIONTYPE__LONGNAME);

		spectypesTypeEClass = createEClass(SPECTYPES_TYPE);
		createEAttribute(spectypesTypeEClass, SPECTYPES_TYPE__GROUP);
		createEReference(spectypesTypeEClass, SPECTYPES_TYPE__RELATIONGROUPTYPE);
		createEReference(spectypesTypeEClass, SPECTYPES_TYPE__SPECOBJECTTYPE);
		createEReference(spectypesTypeEClass, SPECTYPES_TYPE__SPECRELATIONTYPE);
		createEReference(spectypesTypeEClass, SPECTYPES_TYPE__SPECIFICATIONTYPE);

		targetspecificationTypeEClass = createEClass(TARGETSPECIFICATION_TYPE);
		createEAttribute(targetspecificationTypeEClass, TARGETSPECIFICATION_TYPE__SPECIFICATIONREF);

		targetTypeEClass = createEClass(TARGET_TYPE);
		createEAttribute(targetTypeEClass, TARGET_TYPE__SPECOBJECTREF);

		theheaderTypeEClass = createEClass(THEHEADER_TYPE);
		createEReference(theheaderTypeEClass, THEHEADER_TYPE__REQIFHEADER);

		toolextensionsTypeEClass = createEClass(TOOLEXTENSIONS_TYPE);
		createEAttribute(toolextensionsTypeEClass, TOOLEXTENSIONS_TYPE__GROUP);
		createEReference(toolextensionsTypeEClass, TOOLEXTENSIONS_TYPE__REQIFTOOLEXTENSION);

		typeTypeEClass = createEClass(TYPE_TYPE);
		createEAttribute(typeTypeEClass, TYPE_TYPE__RELATIONGROUPTYPEREF);

		typeType1EClass = createEClass(TYPE_TYPE1);
		createEAttribute(typeType1EClass, TYPE_TYPE1__SPECIFICATIONTYPEREF);

		typeType2EClass = createEClass(TYPE_TYPE2);
		createEAttribute(typeType2EClass, TYPE_TYPE2__DATATYPEDEFINITIONINTEGERREF);

		typeType3EClass = createEClass(TYPE_TYPE3);
		createEAttribute(typeType3EClass, TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF);

		typeType4EClass = createEClass(TYPE_TYPE4);
		createEAttribute(typeType4EClass, TYPE_TYPE4__DATATYPEDEFINITIONREALREF);

		typeType5EClass = createEClass(TYPE_TYPE5);
		createEAttribute(typeType5EClass, TYPE_TYPE5__DATATYPEDEFINITIONXHTMLREF);

		typeType6EClass = createEClass(TYPE_TYPE6);
		createEAttribute(typeType6EClass, TYPE_TYPE6__SPECOBJECTTYPEREF);

		typeType7EClass = createEClass(TYPE_TYPE7);
		createEAttribute(typeType7EClass, TYPE_TYPE7__SPECRELATIONTYPEREF);

		typeType8EClass = createEClass(TYPE_TYPE8);
		createEAttribute(typeType8EClass, TYPE_TYPE8__DATATYPEDEFINITIONDATEREF);

		typeType9EClass = createEClass(TYPE_TYPE9);
		createEAttribute(typeType9EClass, TYPE_TYPE9__DATATYPEDEFINITIONENUMERATIONREF);

		typeType10EClass = createEClass(TYPE_TYPE10);
		createEAttribute(typeType10EClass, TYPE_TYPE10__DATATYPEDEFINITIONBOOLEANREF);

		valuesTypeEClass = createEClass(VALUES_TYPE);
		createEAttribute(valuesTypeEClass, VALUES_TYPE__GROUP);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEBOOLEAN);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEDATE);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEINTEGER);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEREAL);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUESTRING);
		createEReference(valuesTypeEClass, VALUES_TYPE__ATTRIBUTEVALUEXHTML);

		valuesType1EClass = createEClass(VALUES_TYPE1);
		createEAttribute(valuesType1EClass, VALUES_TYPE1__GROUP);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEBOOLEAN);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEDATE);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEINTEGER);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEREAL);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUESTRING);
		createEReference(valuesType1EClass, VALUES_TYPE1__ATTRIBUTEVALUEXHTML);

		valuesType2EClass = createEClass(VALUES_TYPE2);
		createEAttribute(valuesType2EClass, VALUES_TYPE2__GROUP);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEBOOLEAN);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEDATE);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEINTEGER);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEREAL);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUESTRING);
		createEReference(valuesType2EClass, VALUES_TYPE2__ATTRIBUTEVALUEXHTML);

		valuesType3EClass = createEClass(VALUES_TYPE3);
		createEAttribute(valuesType3EClass, VALUES_TYPE3__GROUP);
		createEAttribute(valuesType3EClass, VALUES_TYPE3__ENUMVALUEREF);

		// Create data types
		globalrefEDataType = createEDataType(GLOBALREF);
		localrefEDataType = createEDataType(LOCALREF);
		xhtmlcontentEDataType = createEDataType(XHTMLCONTENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(alternativeidEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID.class, "ALTERNATIVEID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getALTERNATIVEID_IDENTIFIER(), theXMLTypePackage.getString(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidTypeEClass, ALTERNATIVEIDType.class, "ALTERNATIVEIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType1EClass, ALTERNATIVEIDType1.class, "ALTERNATIVEIDType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType1_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType2EClass, ALTERNATIVEIDType2.class, "ALTERNATIVEIDType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType2_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType3EClass, ALTERNATIVEIDType3.class, "ALTERNATIVEIDType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType3_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType4EClass, ALTERNATIVEIDType4.class, "ALTERNATIVEIDType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType4_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType5EClass, ALTERNATIVEIDType5.class, "ALTERNATIVEIDType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType5_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType6EClass, ALTERNATIVEIDType6.class, "ALTERNATIVEIDType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType6_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType7EClass, ALTERNATIVEIDType7.class, "ALTERNATIVEIDType7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType7_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType8EClass, ALTERNATIVEIDType8.class, "ALTERNATIVEIDType8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType8_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType8.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType9EClass, ALTERNATIVEIDType9.class, "ALTERNATIVEIDType9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType9_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType10EClass, ALTERNATIVEIDType10.class, "ALTERNATIVEIDType10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType10_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType11EClass, ALTERNATIVEIDType11.class, "ALTERNATIVEIDType11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType11_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType12EClass, ALTERNATIVEIDType12.class, "ALTERNATIVEIDType12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType12_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType13EClass, ALTERNATIVEIDType13.class, "ALTERNATIVEIDType13", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType13_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType13.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType14EClass, ALTERNATIVEIDType14.class, "ALTERNATIVEIDType14", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType14_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType14.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType15EClass, ALTERNATIVEIDType15.class, "ALTERNATIVEIDType15", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType15_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType15.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType16EClass, ALTERNATIVEIDType16.class, "ALTERNATIVEIDType16", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType16_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType16.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType17EClass, ALTERNATIVEIDType17.class, "ALTERNATIVEIDType17", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType17_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType17.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType18EClass, ALTERNATIVEIDType18.class, "ALTERNATIVEIDType18", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType18_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType18.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType19EClass, ALTERNATIVEIDType19.class, "ALTERNATIVEIDType19", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType19_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType19.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType20EClass, ALTERNATIVEIDType20.class, "ALTERNATIVEIDType20", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType20_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType20.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType21EClass, ALTERNATIVEIDType21.class, "ALTERNATIVEIDType21", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType21_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType21.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType22EClass, ALTERNATIVEIDType22.class, "ALTERNATIVEIDType22", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType22_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType22.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(alternativeidType23EClass, ALTERNATIVEIDType23.class, "ALTERNATIVEIDType23", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getALTERNATIVEIDType23_ALTERNATIVEID(), this.getALTERNATIVEID(), null, "aLTERNATIVEID", null, 0, 1, ALTERNATIVEIDType23.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionbooleanEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, "ATTRIBUTEDEFINITIONBOOLEAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONBOOLEAN_ALTERNATIVEID(), this.getALTERNATIVEIDType16(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONBOOLEAN_DEFAULTVALUE(), this.getDEFAULTVALUEType6(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONBOOLEAN_TYPE(), this.getTYPEType10(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONBOOLEAN_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONBOOLEAN_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONBOOLEAN_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONBOOLEAN_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONBOOLEAN_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitiondateEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, "ATTRIBUTEDEFINITIONDATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONDATE_ALTERNATIVEID(), this.getALTERNATIVEIDType18(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONDATE_DEFAULTVALUE(), this.getDEFAULTVALUEType(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONDATE_TYPE(), this.getTYPEType8(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONDATE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONDATE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONDATE_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONDATE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONDATE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionenumerationEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, "ATTRIBUTEDEFINITIONENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE(), this.getDEFAULTVALUEType1(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONENUMERATION_ALTERNATIVEID(), this.getALTERNATIVEIDType20(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONENUMERATION_TYPE(), this.getTYPEType9(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED(), theXMLTypePackage.getBoolean(), "mULTIVALUED", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionintegerEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, "ATTRIBUTEDEFINITIONINTEGER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID(), this.getALTERNATIVEIDType21(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE(), this.getDEFAULTVALUEType2(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONINTEGER_TYPE(), this.getTYPEType2(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONINTEGER_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONINTEGER_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionrealEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, "ATTRIBUTEDEFINITIONREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONREAL_ALTERNATIVEID(), this.getALTERNATIVEIDType22(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONREAL_DEFAULTVALUE(), this.getDEFAULTVALUEType3(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONREAL_TYPE(), this.getTYPEType4(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONREAL_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONREAL_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONREAL_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONREAL_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONREAL_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionstringEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, "ATTRIBUTEDEFINITIONSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONSTRING_ALTERNATIVEID(), this.getALTERNATIVEIDType15(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSTRING_DEFAULTVALUE(), this.getDEFAULTVALUEType4(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONSTRING_TYPE(), this.getTYPEType3(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSTRING_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSTRING_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSTRING_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSTRING_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONSTRING_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributedefinitionxhtmlEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, "ATTRIBUTEDEFINITIONXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEDEFINITIONXHTML_ALTERNATIVEID(), this.getALTERNATIVEIDType6(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONXHTML_DEFAULTVALUE(), this.getDEFAULTVALUEType5(), null, "dEFAULTVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEDEFINITIONXHTML_TYPE(), this.getTYPEType5(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONXHTML_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONXHTML_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONXHTML_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONXHTML_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEDEFINITIONXHTML_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluebooleanEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN.class, "ATTRIBUTEVALUEBOOLEAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUEBOOLEAN_DEFINITION(), this.getDEFINITIONType6(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEBOOLEAN_THEVALUE(), theXMLTypePackage.getBoolean(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluedateEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE.class, "ATTRIBUTEVALUEDATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUEDATE_DEFINITION(), this.getDEFINITIONType1(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEDATE_THEVALUE(), theXMLTypePackage.getDateTime(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevalueenumerationEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION.class, "ATTRIBUTEVALUEENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUEENUMERATION_DEFINITION(), this.getDEFINITIONType(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEENUMERATION_VALUES(), this.getVALUESType3(), null, "vALUES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevalueintegerEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER.class, "ATTRIBUTEVALUEINTEGER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUEINTEGER_DEFINITION(), this.getDEFINITIONType5(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEINTEGER_THEVALUE(), theXMLTypePackage.getInteger(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluerealEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL.class, "ATTRIBUTEVALUEREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUEREAL_DEFINITION(), this.getDEFINITIONType4(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEREAL_THEVALUE(), theXMLTypePackage.getDouble(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluestringEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING.class, "ATTRIBUTEVALUESTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATTRIBUTEVALUESTRING_DEFINITION(), this.getDEFINITIONType2(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUESTRING_THEVALUE(), theXMLTypePackage.getString(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUESTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributevaluexhtmlEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML.class, "ATTRIBUTEVALUEXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getATTRIBUTEVALUEXHTML_THEVALUE(), this.getXHTMLCONTENT(), "tHEVALUE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEXHTML_THEORIGINALVALUE(), this.getXHTMLCONTENT(), "tHEORIGINALVALUE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATTRIBUTEVALUEXHTML_DEFINITION(), this.getDEFINITIONType3(), null, "dEFINITION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getATTRIBUTEVALUEXHTML_ISSIMPLIFIED(), theXMLTypePackage.getBoolean(), "iSSIMPLIFIED", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(childrenTypeEClass, CHILDRENType.class, "CHILDRENType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCHILDRENType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CHILDRENType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCHILDRENType_SPECHIERARCHY(), this.getSPECHIERARCHY(), null, "sPECHIERARCHY", null, 0, -1, CHILDRENType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(childrenType1EClass, CHILDRENType1.class, "CHILDRENType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCHILDRENType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CHILDRENType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCHILDRENType1_SPECHIERARCHY(), this.getSPECHIERARCHY(), null, "sPECHIERARCHY", null, 0, -1, CHILDRENType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(corecontentTypeEClass, CORECONTENTType.class, "CORECONTENTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCORECONTENTType_REQIFCONTENT(), this.getREQIFCONTENT(), null, "rEQIFCONTENT", null, 0, 1, CORECONTENTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionbooleanEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, "DATATYPEDEFINITIONBOOLEAN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONBOOLEAN_ALTERNATIVEID(), this.getALTERNATIVEIDType23(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONBOOLEAN_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONBOOLEAN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitiondateEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, "DATATYPEDEFINITIONDATE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONDATE_ALTERNATIVEID(), this.getALTERNATIVEIDType(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONDATE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONDATE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionenumerationEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, "DATATYPEDEFINITIONENUMERATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONENUMERATION_ALTERNATIVEID(), this.getALTERNATIVEIDType1(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES(), this.getSPECIFIEDVALUESType(), null, "sPECIFIEDVALUES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONENUMERATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONENUMERATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionintegerEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, "DATATYPEDEFINITIONINTEGER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONINTEGER_ALTERNATIVEID(), this.getALTERNATIVEIDType19(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_MAX(), theXMLTypePackage.getInteger(), "mAX", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONINTEGER_MIN(), theXMLTypePackage.getInteger(), "mIN", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONINTEGER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionrealEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, "DATATYPEDEFINITIONREAL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONREAL_ALTERNATIVEID(), this.getALTERNATIVEIDType3(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_ACCURACY(), theXMLTypePackage.getInteger(), "aCCURACY", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_MAX(), theXMLTypePackage.getDouble(), "mAX", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONREAL_MIN(), theXMLTypePackage.getDouble(), "mIN", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionstringEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, "DATATYPEDEFINITIONSTRING", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONSTRING_ALTERNATIVEID(), this.getALTERNATIVEIDType17(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONSTRING_MAXLENGTH(), theXMLTypePackage.getInteger(), "mAXLENGTH", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONSTRING.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypedefinitionxhtmlEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, "DATATYPEDEFINITIONXHTML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDATATYPEDEFINITIONXHTML_ALTERNATIVEID(), this.getALTERNATIVEIDType4(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXHTML_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXHTML_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXHTML_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDATATYPEDEFINITIONXHTML_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONXHTML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypesTypeEClass, DATATYPESType.class, "DATATYPESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDATATYPESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DATATYPESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONBOOLEAN(), this.getDATATYPEDEFINITIONBOOLEAN(), null, "dATATYPEDEFINITIONBOOLEAN", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONDATE(), this.getDATATYPEDEFINITIONDATE(), null, "dATATYPEDEFINITIONDATE", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONENUMERATION(), this.getDATATYPEDEFINITIONENUMERATION(), null, "dATATYPEDEFINITIONENUMERATION", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONINTEGER(), this.getDATATYPEDEFINITIONINTEGER(), null, "dATATYPEDEFINITIONINTEGER", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONREAL(), this.getDATATYPEDEFINITIONREAL(), null, "dATATYPEDEFINITIONREAL", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONSTRING(), this.getDATATYPEDEFINITIONSTRING(), null, "dATATYPEDEFINITIONSTRING", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDATATYPESType_DATATYPEDEFINITIONXHTML(), this.getDATATYPEDEFINITIONXHTML(), null, "dATATYPEDEFINITIONXHTML", null, 0, -1, DATATYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueTypeEClass, DEFAULTVALUEType.class, "DEFAULTVALUEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType_ATTRIBUTEVALUEDATE(), this.getATTRIBUTEVALUEDATE(), null, "aTTRIBUTEVALUEDATE", null, 0, 1, DEFAULTVALUEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType1EClass, DEFAULTVALUEType1.class, "DEFAULTVALUEType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, 1, DEFAULTVALUEType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType2EClass, DEFAULTVALUEType2.class, "DEFAULTVALUEType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType2_ATTRIBUTEVALUEINTEGER(), this.getATTRIBUTEVALUEINTEGER(), null, "aTTRIBUTEVALUEINTEGER", null, 0, 1, DEFAULTVALUEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType3EClass, DEFAULTVALUEType3.class, "DEFAULTVALUEType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType3_ATTRIBUTEVALUEREAL(), this.getATTRIBUTEVALUEREAL(), null, "aTTRIBUTEVALUEREAL", null, 0, 1, DEFAULTVALUEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType4EClass, DEFAULTVALUEType4.class, "DEFAULTVALUEType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType4_ATTRIBUTEVALUESTRING(), this.getATTRIBUTEVALUESTRING(), null, "aTTRIBUTEVALUESTRING", null, 0, 1, DEFAULTVALUEType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType5EClass, DEFAULTVALUEType5.class, "DEFAULTVALUEType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType5_ATTRIBUTEVALUEXHTML(), this.getATTRIBUTEVALUEXHTML(), null, "aTTRIBUTEVALUEXHTML", null, 0, 1, DEFAULTVALUEType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultvalueType6EClass, DEFAULTVALUEType6.class, "DEFAULTVALUEType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDEFAULTVALUEType6_ATTRIBUTEVALUEBOOLEAN(), this.getATTRIBUTEVALUEBOOLEAN(), null, "aTTRIBUTEVALUEBOOLEAN", null, 0, 1, DEFAULTVALUEType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionTypeEClass, DEFINITIONType.class, "DEFINITIONType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType_ATTRIBUTEDEFINITIONENUMERATIONREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONENUMERATIONREF", null, 0, 1, DEFINITIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType1EClass, DEFINITIONType1.class, "DEFINITIONType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType1_ATTRIBUTEDEFINITIONDATEREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONDATEREF", null, 0, 1, DEFINITIONType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType2EClass, DEFINITIONType2.class, "DEFINITIONType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONSTRINGREF", null, 0, 1, DEFINITIONType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType3EClass, DEFINITIONType3.class, "DEFINITIONType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType3_ATTRIBUTEDEFINITIONXHTMLREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONXHTMLREF", null, 0, 1, DEFINITIONType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType4EClass, DEFINITIONType4.class, "DEFINITIONType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONREALREF", null, 0, 1, DEFINITIONType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType5EClass, DEFINITIONType5.class, "DEFINITIONType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONINTEGERREF", null, 0, 1, DEFINITIONType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(definitionType6EClass, DEFINITIONType6.class, "DEFINITIONType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDEFINITIONType6_ATTRIBUTEDEFINITIONBOOLEANREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONBOOLEANREF", null, 0, 1, DEFINITIONType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_REQIF(), this.getREQIF(), null, "rEQIF", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(editableattsTypeEClass, EDITABLEATTSType.class, "EDITABLEATTSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEDITABLEATTSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, EDITABLEATTSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONBOOLEANREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONDATEREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONENUMERATIONREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONINTEGERREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONREALREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONSTRINGREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF(), this.getLOCALREF(), "aTTRIBUTEDEFINITIONXHTMLREF", null, 0, -1, EDITABLEATTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(embeddedvalueEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE.class, "EMBEDDEDVALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMBEDDEDVALUE_KEY(), theXMLTypePackage.getInteger(), "kEY", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEMBEDDEDVALUE_OTHERCONTENT(), theXMLTypePackage.getString(), "oTHERCONTENT", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.EMBEDDEDVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumvalueEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, "ENUMVALUE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getENUMVALUE_ALTERNATIVEID(), this.getALTERNATIVEIDType2(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getENUMVALUE_PROPERTIES(), this.getPROPERTIESType(), null, "pROPERTIES", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getENUMVALUE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.ENUMVALUE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, OBJECTType.class, "OBJECTType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOBJECTType_SPECOBJECTREF(), this.getLOCALREF(), "sPECOBJECTREF", null, 0, 1, OBJECTType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertiesTypeEClass, PROPERTIESType.class, "PROPERTIESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPROPERTIESType_EMBEDDEDVALUE(), this.getEMBEDDEDVALUE(), null, "eMBEDDEDVALUE", null, 0, 1, PROPERTIESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationgroupEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, "RELATIONGROUP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRELATIONGROUP_ALTERNATIVEID(), this.getALTERNATIVEIDType12(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_SOURCESPECIFICATION(), this.getSOURCESPECIFICATIONType(), null, "sOURCESPECIFICATION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_SPECRELATIONS(), this.getSPECRELATIONSType(), null, "sPECRELATIONS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_TARGETSPECIFICATION(), this.getTARGETSPECIFICATIONType(), null, "tARGETSPECIFICATION", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUP_TYPE(), this.getTYPEType(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUP_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationgrouptypeEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, "RELATIONGROUPTYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRELATIONGROUPTYPE_ALTERNATIVEID(), this.getALTERNATIVEIDType5(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRELATIONGROUPTYPE_SPECATTRIBUTES(), this.getSPECATTRIBUTESType3(), null, "sPECATTRIBUTES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUPTYPE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUPTYPE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUPTYPE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRELATIONGROUPTYPE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqifEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF.class, "REQIF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREQIF_THEHEADER(), this.getTHEHEADERType(), null, "tHEHEADER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIF_CORECONTENT(), this.getCORECONTENTType(), null, "cORECONTENT", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIF_TOOLEXTENSIONS(), this.getTOOLEXTENSIONSType(), null, "tOOLEXTENSIONS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIF_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqifcontentEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, "REQIFCONTENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getREQIFCONTENT_DATATYPES(), this.getDATATYPESType(), null, "dATATYPES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIFCONTENT_SPECTYPES(), this.getSPECTYPESType(), null, "sPECTYPES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIFCONTENT_SPECOBJECTS(), this.getSPECOBJECTSType(), null, "sPECOBJECTS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIFCONTENT_SPECRELATIONS(), this.getSPECRELATIONSType1(), null, "sPECRELATIONS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIFCONTENT_SPECIFICATIONS(), this.getSPECIFICATIONSType(), null, "sPECIFICATIONS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getREQIFCONTENT_SPECRELATIONGROUPS(), this.getSPECRELATIONGROUPSType(), null, "sPECRELATIONGROUPS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqifheaderEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, "REQIFHEADER", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getREQIFHEADER_COMMENT(), theXMLTypePackage.getString(), "cOMMENT", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_CREATIONTIME(), theXMLTypePackage.getDateTime(), "cREATIONTIME", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_REPOSITORYID(), theXMLTypePackage.getString(), "rEPOSITORYID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_REQIFTOOLID(), theXMLTypePackage.getString(), "rEQIFTOOLID", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_REQIFVERSION(), theXMLTypePackage.getString(), "rEQIFVERSION", "1.0", 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_SOURCETOOLID(), theXMLTypePackage.getString(), "sOURCETOOLID", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_TITLE(), theXMLTypePackage.getString(), "tITLE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getREQIFHEADER_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reqiftoolextensionEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION.class, "REQIFTOOLEXTENSION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getREQIFTOOLEXTENSION_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFTOOLEXTENSION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourcespecificationTypeEClass, SOURCESPECIFICATIONType.class, "SOURCESPECIFICATIONType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSOURCESPECIFICATIONType_SPECIFICATIONREF(), this.getGLOBALREF(), "sPECIFICATIONREF", null, 0, 1, SOURCESPECIFICATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceTypeEClass, SOURCEType.class, "SOURCEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSOURCEType_SPECOBJECTREF(), this.getGLOBALREF(), "sPECOBJECTREF", null, 0, 1, SOURCEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specattributesTypeEClass, SPECATTRIBUTESType.class, "SPECATTRIBUTESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECATTRIBUTESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECATTRIBUTESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN(), this.getATTRIBUTEDEFINITIONBOOLEAN(), null, "aTTRIBUTEDEFINITIONBOOLEAN", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE(), this.getATTRIBUTEDEFINITIONDATE(), null, "aTTRIBUTEDEFINITIONDATE", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATION", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER(), this.getATTRIBUTEDEFINITIONINTEGER(), null, "aTTRIBUTEDEFINITIONINTEGER", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL(), this.getATTRIBUTEDEFINITIONREAL(), null, "aTTRIBUTEDEFINITIONREAL", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING(), this.getATTRIBUTEDEFINITIONSTRING(), null, "aTTRIBUTEDEFINITIONSTRING", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML(), this.getATTRIBUTEDEFINITIONXHTML(), null, "aTTRIBUTEDEFINITIONXHTML", null, 0, -1, SPECATTRIBUTESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specattributesType1EClass, SPECATTRIBUTESType1.class, "SPECATTRIBUTESType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECATTRIBUTESType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECATTRIBUTESType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONBOOLEAN(), this.getATTRIBUTEDEFINITIONBOOLEAN(), null, "aTTRIBUTEDEFINITIONBOOLEAN", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONDATE(), this.getATTRIBUTEDEFINITIONDATE(), null, "aTTRIBUTEDEFINITIONDATE", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONENUMERATION(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATION", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONINTEGER(), this.getATTRIBUTEDEFINITIONINTEGER(), null, "aTTRIBUTEDEFINITIONINTEGER", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONREAL(), this.getATTRIBUTEDEFINITIONREAL(), null, "aTTRIBUTEDEFINITIONREAL", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONSTRING(), this.getATTRIBUTEDEFINITIONSTRING(), null, "aTTRIBUTEDEFINITIONSTRING", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONXHTML(), this.getATTRIBUTEDEFINITIONXHTML(), null, "aTTRIBUTEDEFINITIONXHTML", null, 0, -1, SPECATTRIBUTESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specattributesType2EClass, SPECATTRIBUTESType2.class, "SPECATTRIBUTESType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECATTRIBUTESType2_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECATTRIBUTESType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONBOOLEAN(), this.getATTRIBUTEDEFINITIONBOOLEAN(), null, "aTTRIBUTEDEFINITIONBOOLEAN", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONDATE(), this.getATTRIBUTEDEFINITIONDATE(), null, "aTTRIBUTEDEFINITIONDATE", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONENUMERATION(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATION", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONINTEGER(), this.getATTRIBUTEDEFINITIONINTEGER(), null, "aTTRIBUTEDEFINITIONINTEGER", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONREAL(), this.getATTRIBUTEDEFINITIONREAL(), null, "aTTRIBUTEDEFINITIONREAL", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONSTRING(), this.getATTRIBUTEDEFINITIONSTRING(), null, "aTTRIBUTEDEFINITIONSTRING", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONXHTML(), this.getATTRIBUTEDEFINITIONXHTML(), null, "aTTRIBUTEDEFINITIONXHTML", null, 0, -1, SPECATTRIBUTESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specattributesType3EClass, SPECATTRIBUTESType3.class, "SPECATTRIBUTESType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECATTRIBUTESType3_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECATTRIBUTESType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONBOOLEAN(), this.getATTRIBUTEDEFINITIONBOOLEAN(), null, "aTTRIBUTEDEFINITIONBOOLEAN", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONDATE(), this.getATTRIBUTEDEFINITIONDATE(), null, "aTTRIBUTEDEFINITIONDATE", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONENUMERATION(), this.getATTRIBUTEDEFINITIONENUMERATION(), null, "aTTRIBUTEDEFINITIONENUMERATION", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONINTEGER(), this.getATTRIBUTEDEFINITIONINTEGER(), null, "aTTRIBUTEDEFINITIONINTEGER", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONREAL(), this.getATTRIBUTEDEFINITIONREAL(), null, "aTTRIBUTEDEFINITIONREAL", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONSTRING(), this.getATTRIBUTEDEFINITIONSTRING(), null, "aTTRIBUTEDEFINITIONSTRING", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONXHTML(), this.getATTRIBUTEDEFINITIONXHTML(), null, "aTTRIBUTEDEFINITIONXHTML", null, 0, -1, SPECATTRIBUTESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(spechierarchyEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, "SPECHIERARCHY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECHIERARCHY_ALTERNATIVEID(), this.getALTERNATIVEIDType11(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHY_CHILDREN(), this.getCHILDRENType(), null, "cHILDREN", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHY_EDITABLEATTS(), this.getEDITABLEATTSType(), null, "eDITABLEATTS", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECHIERARCHY_OBJECT(), this.getOBJECTType(), null, "oBJECT", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_ISEDITABLE(), theXMLTypePackage.getBoolean(), "iSEDITABLE", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_ISTABLEINTERNAL(), theXMLTypePackage.getBoolean(), "iSTABLEINTERNAL", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECHIERARCHY_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, "SPECIFICATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECIFICATION_ALTERNATIVEID(), this.getALTERNATIVEIDType10(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFICATION_VALUES(), this.getVALUESType(), null, "vALUES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFICATION_CHILDREN(), this.getCHILDRENType1(), null, "cHILDREN", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFICATION_TYPE(), this.getTYPEType1(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationsTypeEClass, SPECIFICATIONSType.class, "SPECIFICATIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECIFICATIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECIFICATIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFICATIONSType_SPECIFICATION(), this.getSPECIFICATION(), null, "sPECIFICATION", null, 0, -1, SPECIFICATIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specificationtypeEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, "SPECIFICATIONTYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECIFICATIONTYPE_ALTERNATIVEID(), this.getALTERNATIVEIDType8(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFICATIONTYPE_SPECATTRIBUTES(), this.getSPECATTRIBUTESType1(), null, "sPECATTRIBUTES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATIONTYPE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATIONTYPE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATIONTYPE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECIFICATIONTYPE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specifiedvaluesTypeEClass, SPECIFIEDVALUESType.class, "SPECIFIEDVALUESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECIFIEDVALUESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECIFIEDVALUESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECIFIEDVALUESType_ENUMVALUE(), this.getENUMVALUE(), null, "eNUMVALUE", null, 0, -1, SPECIFIEDVALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specobjectEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, "SPECOBJECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECOBJECT_ALTERNATIVEID(), this.getALTERNATIVEIDType13(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECT_VALUES(), this.getVALUESType2(), null, "vALUES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECT_TYPE(), this.getTYPEType6(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECT_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specobjectsTypeEClass, SPECOBJECTSType.class, "SPECOBJECTSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECOBJECTSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECOBJECTSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECTSType_SPECOBJECT(), this.getSPECOBJECT(), null, "sPECOBJECT", null, 0, -1, SPECOBJECTSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specobjecttypeEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, "SPECOBJECTTYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECOBJECTTYPE_ALTERNATIVEID(), this.getALTERNATIVEIDType7(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECOBJECTTYPE_SPECATTRIBUTES(), this.getSPECATTRIBUTESType2(), null, "sPECATTRIBUTES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECTTYPE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECTTYPE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECTTYPE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECOBJECTTYPE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specrelationEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, "SPECRELATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECRELATION_ALTERNATIVEID(), this.getALTERNATIVEIDType9(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_VALUES(), this.getVALUESType1(), null, "vALUES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_SOURCE(), this.getSOURCEType(), null, "sOURCE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_TARGET(), this.getTARGETType(), null, "tARGET", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATION_TYPE(), this.getTYPEType7(), null, "tYPE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATION_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATION.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specrelationgroupsTypeEClass, SPECRELATIONGROUPSType.class, "SPECRELATIONGROUPSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONGROUPSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONGROUPSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONGROUPSType_RELATIONGROUP(), this.getRELATIONGROUP(), null, "rELATIONGROUP", null, 0, -1, SPECRELATIONGROUPSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationsTypeEClass, SPECRELATIONSType.class, "SPECRELATIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATIONSType_SPECRELATIONREF(), this.getLOCALREF(), "sPECRELATIONREF", null, 0, -1, SPECRELATIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationsType1EClass, SPECRELATIONSType1.class, "SPECRELATIONSType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECRELATIONSType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECRELATIONSType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONSType1_SPECRELATION(), this.getSPECRELATION(), null, "sPECRELATION", null, 0, -1, SPECRELATIONSType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(specrelationtypeEClass, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, "SPECRELATIONTYPE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSPECRELATIONTYPE_ALTERNATIVEID(), this.getALTERNATIVEIDType14(), null, "aLTERNATIVEID", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECRELATIONTYPE_SPECATTRIBUTES(), this.getSPECATTRIBUTESType(), null, "sPECATTRIBUTES", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATIONTYPE_DESC(), theXMLTypePackage.getString(), "dESC", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATIONTYPE_IDENTIFIER(), theXMLTypePackage.getID(), "iDENTIFIER", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATIONTYPE_LASTCHANGE(), theXMLTypePackage.getDateTime(), "lASTCHANGE", null, 1, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSPECRELATIONTYPE_LONGNAME(), theXMLTypePackage.getString(), "lONGNAME", null, 0, 1, org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spectypesTypeEClass, SPECTYPESType.class, "SPECTYPESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSPECTYPESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SPECTYPESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType_RELATIONGROUPTYPE(), this.getRELATIONGROUPTYPE(), null, "rELATIONGROUPTYPE", null, 0, -1, SPECTYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType_SPECOBJECTTYPE(), this.getSPECOBJECTTYPE(), null, "sPECOBJECTTYPE", null, 0, -1, SPECTYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType_SPECRELATIONTYPE(), this.getSPECRELATIONTYPE(), null, "sPECRELATIONTYPE", null, 0, -1, SPECTYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSPECTYPESType_SPECIFICATIONTYPE(), this.getSPECIFICATIONTYPE(), null, "sPECIFICATIONTYPE", null, 0, -1, SPECTYPESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(targetspecificationTypeEClass, TARGETSPECIFICATIONType.class, "TARGETSPECIFICATIONType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTARGETSPECIFICATIONType_SPECIFICATIONREF(), this.getGLOBALREF(), "sPECIFICATIONREF", null, 0, 1, TARGETSPECIFICATIONType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetTypeEClass, TARGETType.class, "TARGETType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTARGETType_SPECOBJECTREF(), this.getGLOBALREF(), "sPECOBJECTREF", null, 0, 1, TARGETType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theheaderTypeEClass, THEHEADERType.class, "THEHEADERType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTHEHEADERType_REQIFHEADER(), this.getREQIFHEADER(), null, "rEQIFHEADER", null, 0, 1, THEHEADERType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toolextensionsTypeEClass, TOOLEXTENSIONSType.class, "TOOLEXTENSIONSType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTOOLEXTENSIONSType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TOOLEXTENSIONSType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOOLEXTENSIONSType_REQIFTOOLEXTENSION(), this.getREQIFTOOLEXTENSION(), null, "rEQIFTOOLEXTENSION", null, 0, -1, TOOLEXTENSIONSType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(typeTypeEClass, TYPEType.class, "TYPEType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType_RELATIONGROUPTYPEREF(), this.getLOCALREF(), "rELATIONGROUPTYPEREF", null, 0, 1, TYPEType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType1EClass, TYPEType1.class, "TYPEType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType1_SPECIFICATIONTYPEREF(), this.getLOCALREF(), "sPECIFICATIONTYPEREF", null, 0, 1, TYPEType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType2EClass, TYPEType2.class, "TYPEType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType2_DATATYPEDEFINITIONINTEGERREF(), this.getLOCALREF(), "dATATYPEDEFINITIONINTEGERREF", null, 0, 1, TYPEType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType3EClass, TYPEType3.class, "TYPEType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType3_DATATYPEDEFINITIONSTRINGREF(), this.getLOCALREF(), "dATATYPEDEFINITIONSTRINGREF", null, 0, 1, TYPEType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType4EClass, TYPEType4.class, "TYPEType4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType4_DATATYPEDEFINITIONREALREF(), this.getLOCALREF(), "dATATYPEDEFINITIONREALREF", null, 0, 1, TYPEType4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType5EClass, TYPEType5.class, "TYPEType5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType5_DATATYPEDEFINITIONXHTMLREF(), this.getLOCALREF(), "dATATYPEDEFINITIONXHTMLREF", null, 0, 1, TYPEType5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType6EClass, TYPEType6.class, "TYPEType6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType6_SPECOBJECTTYPEREF(), this.getLOCALREF(), "sPECOBJECTTYPEREF", null, 0, 1, TYPEType6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType7EClass, TYPEType7.class, "TYPEType7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType7_SPECRELATIONTYPEREF(), this.getLOCALREF(), "sPECRELATIONTYPEREF", null, 0, 1, TYPEType7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType8EClass, TYPEType8.class, "TYPEType8", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType8_DATATYPEDEFINITIONDATEREF(), this.getLOCALREF(), "dATATYPEDEFINITIONDATEREF", null, 0, 1, TYPEType8.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType9EClass, TYPEType9.class, "TYPEType9", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType9_DATATYPEDEFINITIONENUMERATIONREF(), this.getLOCALREF(), "dATATYPEDEFINITIONENUMERATIONREF", null, 0, 1, TYPEType9.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeType10EClass, TYPEType10.class, "TYPEType10", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTYPEType10_DATATYPEDEFINITIONBOOLEANREF(), this.getLOCALREF(), "dATATYPEDEFINITIONBOOLEANREF", null, 0, 1, TYPEType10.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valuesTypeEClass, VALUESType.class, "VALUESType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEBOOLEAN(), this.getATTRIBUTEVALUEBOOLEAN(), null, "aTTRIBUTEVALUEBOOLEAN", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEDATE(), this.getATTRIBUTEVALUEDATE(), null, "aTTRIBUTEVALUEDATE", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEINTEGER(), this.getATTRIBUTEVALUEINTEGER(), null, "aTTRIBUTEVALUEINTEGER", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEREAL(), this.getATTRIBUTEVALUEREAL(), null, "aTTRIBUTEVALUEREAL", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUESTRING(), this.getATTRIBUTEVALUESTRING(), null, "aTTRIBUTEVALUESTRING", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType_ATTRIBUTEVALUEXHTML(), this.getATTRIBUTEVALUEXHTML(), null, "aTTRIBUTEVALUEXHTML", null, 0, -1, VALUESType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType1EClass, VALUESType1.class, "VALUESType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEBOOLEAN(), this.getATTRIBUTEVALUEBOOLEAN(), null, "aTTRIBUTEVALUEBOOLEAN", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEDATE(), this.getATTRIBUTEVALUEDATE(), null, "aTTRIBUTEVALUEDATE", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEINTEGER(), this.getATTRIBUTEVALUEINTEGER(), null, "aTTRIBUTEVALUEINTEGER", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEREAL(), this.getATTRIBUTEVALUEREAL(), null, "aTTRIBUTEVALUEREAL", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUESTRING(), this.getATTRIBUTEVALUESTRING(), null, "aTTRIBUTEVALUESTRING", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType1_ATTRIBUTEVALUEXHTML(), this.getATTRIBUTEVALUEXHTML(), null, "aTTRIBUTEVALUEXHTML", null, 0, -1, VALUESType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType2EClass, VALUESType2.class, "VALUESType2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType2_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEBOOLEAN(), this.getATTRIBUTEVALUEBOOLEAN(), null, "aTTRIBUTEVALUEBOOLEAN", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEDATE(), this.getATTRIBUTEVALUEDATE(), null, "aTTRIBUTEVALUEDATE", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEENUMERATION(), this.getATTRIBUTEVALUEENUMERATION(), null, "aTTRIBUTEVALUEENUMERATION", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEINTEGER(), this.getATTRIBUTEVALUEINTEGER(), null, "aTTRIBUTEVALUEINTEGER", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEREAL(), this.getATTRIBUTEVALUEREAL(), null, "aTTRIBUTEVALUEREAL", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUESTRING(), this.getATTRIBUTEVALUESTRING(), null, "aTTRIBUTEVALUESTRING", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getVALUESType2_ATTRIBUTEVALUEXHTML(), this.getATTRIBUTEVALUEXHTML(), null, "aTTRIBUTEVALUEXHTML", null, 0, -1, VALUESType2.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(valuesType3EClass, VALUESType3.class, "VALUESType3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVALUESType3_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, VALUESType3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVALUESType3_ENUMVALUEREF(), this.getLOCALREF(), "eNUMVALUEREF", null, 0, -1, VALUESType3.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(globalrefEDataType, String.class, "GLOBALREF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(localrefEDataType, String.class, "LOCALREF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xhtmlcontentEDataType, String.class, "XHTMLCONTENT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (alternativeidEClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getALTERNATIVEID_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (alternativeidTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType1EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType1_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType2EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType2_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType3EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType3_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType4EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType4_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType5EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType5_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType6EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._6_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType6_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType7EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._7_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType7_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType8EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._8_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType8_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType9EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._9_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType9_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType10EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._10_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType10_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType11EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._11_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType11_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType12EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._12_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType12_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType13EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._13_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType13_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType14EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._14_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType14_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType15EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._15_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType15_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType16EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._16_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType16_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType17EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._17_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType17_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType18EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._18_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType18_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType19EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._19_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType19_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType20EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._20_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType20_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType21EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._21_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType21_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType22EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._22_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType22_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (alternativeidType23EClass, 
		   source, 
		   new String[] {
			 "name", "ALTERNATIVE-ID_._23_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getALTERNATIVEIDType23_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributedefinitionbooleanEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONBOOLEAN_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributedefinitiondateEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-DATE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONDATE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributedefinitionenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MULTI-VALUED"
		   });		
		addAnnotation
		  (attributedefinitionintegerEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-INTEGER",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONINTEGER_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributedefinitionrealEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-REAL",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONREAL_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributedefinitionstringEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-STRING",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONSTRING_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributedefinitionxhtmlEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-DEFINITION-XHTML",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_DEFAULTVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFAULT-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getATTRIBUTEDEFINITIONXHTML_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (attributevaluebooleanEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-BOOLEAN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEBOOLEAN_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEBOOLEAN_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "THE-VALUE"
		   });		
		addAnnotation
		  (attributevaluedateEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-DATE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEDATE_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEDATE_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "THE-VALUE"
		   });		
		addAnnotation
		  (attributevalueenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEENUMERATION_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (attributevalueintegerEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-INTEGER",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEINTEGER_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEINTEGER_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "THE-VALUE"
		   });		
		addAnnotation
		  (attributevaluerealEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-REAL",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEREAL_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEREAL_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "THE-VALUE"
		   });		
		addAnnotation
		  (attributevaluestringEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-STRING",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESTRING_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUESTRING_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "THE-VALUE"
		   });		
		addAnnotation
		  (attributevaluexhtmlEClass, 
		   source, 
		   new String[] {
			 "name", "ATTRIBUTE-VALUE-XHTML",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXHTML_THEVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "THE-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXHTML_THEORIGINALVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "THE-ORIGINAL-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXHTML_DEFINITION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DEFINITION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getATTRIBUTEVALUEXHTML_ISSIMPLIFIED(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-SIMPLIFIED"
		   });		
		addAnnotation
		  (childrenTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CHILDREN_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCHILDRENType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCHILDRENType_SPECHIERARCHY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (childrenType1EClass, 
		   source, 
		   new String[] {
			 "name", "CHILDREN_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCHILDRENType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getCHILDRENType1_SPECHIERARCHY(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-HIERARCHY",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (corecontentTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CORE-CONTENT_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCORECONTENTType_REQIFCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF-CONTENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (datatypedefinitionbooleanEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-BOOLEAN",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONBOOLEAN_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (datatypedefinitiondateEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-DATE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONDATE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (datatypedefinitionenumerationEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-ENUMERATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFIED-VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONENUMERATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (datatypedefinitionintegerEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-INTEGER",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_MAX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MAX"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONINTEGER_MIN(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MIN"
		   });		
		addAnnotation
		  (datatypedefinitionrealEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-REAL",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_ACCURACY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ACCURACY"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_MAX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MAX"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONREAL_MIN(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MIN"
		   });		
		addAnnotation
		  (datatypedefinitionstringEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-STRING",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONSTRING_MAXLENGTH(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MAX-LENGTH"
		   });		
		addAnnotation
		  (datatypedefinitionxhtmlEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPE-DEFINITION-XHTML",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXHTML_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXHTML_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXHTML_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXHTML_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getDATATYPEDEFINITIONXHTML_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (datatypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DATATYPES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDATATYPESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDATATYPESType_DATATYPEDEFINITIONXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (defaultvalueTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType_ATTRIBUTEVALUEDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-DATE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType1EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType2EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType2_ATTRIBUTEVALUEINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-INTEGER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType3EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType3_ATTRIBUTEVALUEREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-REAL",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType4EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType4_ATTRIBUTEVALUESTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-STRING",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType5EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType5_ATTRIBUTEVALUEXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XHTML",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (defaultvalueType6EClass, 
		   source, 
		   new String[] {
			 "name", "DEFAULT-VALUE_._6_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFAULTVALUEType6_ATTRIBUTEVALUEBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-BOOLEAN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType_ATTRIBUTEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType1EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType1_ATTRIBUTEDEFINITIONDATEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType2EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType3EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType3_ATTRIBUTEDEFINITIONXHTMLREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType4EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType5EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType5_ATTRIBUTEDEFINITIONINTEGERREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (definitionType6EClass, 
		   source, 
		   new String[] {
			 "name", "DEFINITION_._6_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDEFINITIONType6_ATTRIBUTEDEFINITIONBOOLEANREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_REQIF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (editableattsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "EDITABLE-ATTS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (embeddedvalueEClass, 
		   source, 
		   new String[] {
			 "name", "EMBEDDED-VALUE",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getEMBEDDEDVALUE_KEY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "KEY"
		   });		
		addAnnotation
		  (getEMBEDDEDVALUE_OTHERCONTENT(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "OTHER-CONTENT"
		   });		
		addAnnotation
		  (enumvalueEClass, 
		   source, 
		   new String[] {
			 "name", "ENUM-VALUE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getENUMVALUE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_PROPERTIES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PROPERTIES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getENUMVALUE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getENUMVALUE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getENUMVALUE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getENUMVALUE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (globalrefEDataType, 
		   source, 
		   new String[] {
			 "name", "GLOBAL-REF",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (localrefEDataType, 
		   source, 
		   new String[] {
			 "name", "LOCAL-REF",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#IDREF"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "OBJECT_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOBJECTType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (propertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PROPERTIES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPROPERTIESType_EMBEDDEDVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EMBEDDED-VALUE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (relationgroupEClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-GROUP",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONGROUP_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_SOURCESPECIFICATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOURCE-SPECIFICATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_SPECRELATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_TARGETSPECIFICATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TARGET-SPECIFICATION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUP_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getRELATIONGROUP_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getRELATIONGROUP_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getRELATIONGROUP_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (relationgrouptypeEClass, 
		   source, 
		   new String[] {
			 "name", "RELATION-GROUP-TYPE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_SPECATTRIBUTES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-ATTRIBUTES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getRELATIONGROUPTYPE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (reqifEClass, 
		   source, 
		   new String[] {
			 "name", "REQ-IF",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getREQIF_THEHEADER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "THE-HEADER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIF_CORECONTENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CORE-CONTENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIF_TOOLEXTENSIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TOOL-EXTENSIONS",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getREQIF_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "http://www.w3.org/XML/1998/namespace"
		   });		
		addAnnotation
		  (reqifcontentEClass, 
		   source, 
		   new String[] {
			 "name", "REQ-IF-CONTENT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getREQIFCONTENT_DATATYPES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFCONTENT_SPECTYPES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-TYPES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFCONTENT_SPECOBJECTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFCONTENT_SPECRELATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFCONTENT_SPECIFICATIONS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATIONS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFCONTENT_SPECRELATIONGROUPS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-GROUPS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (reqifheaderEClass, 
		   source, 
		   new String[] {
			 "name", "REQ-IF-HEADER",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getREQIFHEADER_COMMENT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "COMMENT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_CREATIONTIME(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CREATION-TIME",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_REPOSITORYID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REPOSITORY-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_REQIFTOOLID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF-TOOL-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_REQIFVERSION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF-VERSION",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_SOURCETOOLID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOURCE-TOOL-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_TITLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TITLE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getREQIFHEADER_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (reqiftoolextensionEClass, 
		   source, 
		   new String[] {
			 "name", "REQ-IF-TOOL-EXTENSION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getREQIFTOOLEXTENSION_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (sourcespecificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SOURCE-SPECIFICATION_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSOURCESPECIFICATIONType_SPECIFICATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sourceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SOURCE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSOURCEType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (specattributesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-ATTRIBUTES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specattributesType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-ATTRIBUTES_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType1_ATTRIBUTEDEFINITIONXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specattributesType2EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-ATTRIBUTES_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType2_ATTRIBUTEDEFINITIONXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specattributesType3EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-ATTRIBUTES_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONSTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECATTRIBUTESType3_ATTRIBUTEDEFINITIONXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-DEFINITION-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (spechierarchyEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-HIERARCHY",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_CHILDREN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CHILDREN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_EDITABLEATTS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "EDITABLE-ATTS",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_OBJECT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "OBJECT",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_ISEDITABLE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-EDITABLE"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_ISTABLEINTERNAL(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IS-TABLE-INTERNAL"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECHIERARCHY_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specificationEClass, 
		   source, 
		   new String[] {
			 "name", "SPECIFICATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECIFICATION_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATION_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATION_CHILDREN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CHILDREN",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATION_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECIFICATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECIFICATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECIFICATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specificationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPECIFICATIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECIFICATIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECIFICATIONSType_SPECIFICATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specificationtypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPECIFICATION-TYPE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_SPECATTRIBUTES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-ATTRIBUTES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECIFICATIONTYPE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specifiedvaluesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPECIFIED-VALUES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECIFIEDVALUESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECIFIEDVALUESType_ENUMVALUE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ENUM-VALUE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specobjectEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECT",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECT_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECT_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECOBJECT_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECOBJECT_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECOBJECT_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specobjectsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECTS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECTSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECOBJECTSType_SPECOBJECT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specobjecttypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-OBJECT-TYPE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_SPECATTRIBUTES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-ATTRIBUTES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECOBJECTTYPE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specrelationEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATION",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATION_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_VALUES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VALUES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_SOURCE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SOURCE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_TARGET(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TARGET",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_TYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TYPE",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATION_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECRELATION_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECRELATION_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECRELATION_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (specrelationgroupsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATION-GROUPS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONGROUPSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONGROUPSType_RELATIONGROUP(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUP",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specrelationsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONSType_SPECRELATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specrelationsType1EClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATIONS_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONSType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECRELATIONSType1_SPECRELATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (specrelationtypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-RELATION-TYPE",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_ALTERNATIVEID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ALTERNATIVE-ID",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_SPECATTRIBUTES(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-ATTRIBUTES",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_DESC(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DESC"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_IDENTIFIER(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IDENTIFIER"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_LASTCHANGE(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LAST-CHANGE"
		   });		
		addAnnotation
		  (getSPECRELATIONTYPE_LONGNAME(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LONG-NAME"
		   });		
		addAnnotation
		  (spectypesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "SPEC-TYPES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSPECTYPESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType_RELATIONGROUPTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUP-TYPE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType_SPECOBJECTTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-TYPE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType_SPECRELATIONTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-TYPE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getSPECTYPESType_SPECIFICATIONTYPE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATION-TYPE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (targetspecificationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TARGET-SPECIFICATION_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTARGETSPECIFICATIONType_SPECIFICATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (targetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TARGET_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTARGETType_SPECOBJECTREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (theheaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "THE-HEADER_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTHEHEADERType_REQIFHEADER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF-HEADER",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (toolextensionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TOOL-EXTENSIONS_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTOOLEXTENSIONSType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTOOLEXTENSIONSType_REQIFTOOLEXTENSION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "REQ-IF-TOOL-EXTENSION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (typeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType_RELATIONGROUPTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RELATION-GROUP-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType1EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType1_SPECIFICATIONTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPECIFICATION-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType2EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType2_DATATYPEDEFINITIONINTEGERREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-INTEGER-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType3EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType3_DATATYPEDEFINITIONSTRINGREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-STRING-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType4EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._4_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType4_DATATYPEDEFINITIONREALREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-REAL-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType5EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._5_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType5_DATATYPEDEFINITIONXHTMLREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-XHTML-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType6EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._6_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType6_SPECOBJECTTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-OBJECT-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType7EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._7_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType7_SPECRELATIONTYPEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SPEC-RELATION-TYPE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType8EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._8_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType8_DATATYPEDEFINITIONDATEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-DATE-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType9EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._9_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType9_DATATYPEDEFINITIONENUMERATIONREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-ENUMERATION-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (typeType10EClass, 
		   source, 
		   new String[] {
			 "name", "TYPE_._10_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTYPEType10_DATATYPEDEFINITIONBOOLEANREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DATATYPE-DEFINITION-BOOLEAN-REF",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (valuesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUESTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType_ATTRIBUTEVALUEXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType1EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType1_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUESTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType1_ATTRIBUTEVALUEXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType2EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._2_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType2_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEBOOLEAN(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-BOOLEAN",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEDATE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-DATE",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEENUMERATION(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-ENUMERATION",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEINTEGER(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-INTEGER",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEREAL(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-REAL",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUESTRING(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-STRING",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getVALUESType2_ATTRIBUTEVALUEXHTML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ATTRIBUTE-VALUE-XHTML",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (valuesType3EClass, 
		   source, 
		   new String[] {
			 "name", "VALUES_._3_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVALUESType3_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getVALUESType3_ENUMVALUEREF(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ENUM-VALUE-REF",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (xhtmlcontentEDataType, 
		   source, 
		   new String[] {
			 "name", "XHTML-CONTENT",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
	}

} //MyreqifPackageImpl
