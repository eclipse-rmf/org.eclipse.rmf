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

package org.eclipse.rmf.rif11.xsd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.xsd.RifFactory
 * @model kind="package"
 * @generated
 */
public interface RifPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rif11";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/schema/rif";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rif";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RifPackage eINSTANCE = org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICIESTypeImpl <em>ACCESSPOLICIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICIESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICIESType()
	 * @generated
	 */
	int ACCESSPOLICIES_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ACCESSPOLICY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICIES_TYPE__ACCESSPOLICY = 1;

	/**
	 * The number of structural features of the '<em>ACCESSPOLICIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl <em>ACCESSPOLICY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICY()
	 * @generated
	 */
	int ACCESSPOLICY = 1;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>ACCESSMODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__ACCESSMODE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__ATTRIBUTEDEFINITIONS = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__ATTRIBUTEVALUES = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__DATATYPEDEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__RELATIONGROUPS = 8;

	/**
	 * The feature id for the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECGROUPS = 9;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECHIERARCHIES = 10;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECHIERARCHYROOTS = 11;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECOBJECTS = 12;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECRELATIONS = 13;

	/**
	 * The feature id for the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY__SPECTYPES = 14;

	/**
	 * The number of structural features of the '<em>ACCESSPOLICY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESSPOLICY_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX = 2;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE = 4;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX__TYPE = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONCOMPLEX_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl <em>ATTRIBUTEDEFINITIONENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE = 4;

	/**
	 * The feature id for the '<em><b>MULTIVALUED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED = 5;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION__TYPE = 6;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONENUMERATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSIMPLEImpl <em>ATTRIBUTEDEFINITIONSIMPLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSIMPLEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONSIMPLE = 4;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFAULTVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__DEFAULTVALUE = 4;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONSIMPLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONSIMPLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSTypeImpl <em>ATTRIBUTEDEFINITIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONSType()
	 * @generated
	 */
	int ATTRIBUTEDEFINITIONS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONSIMPLEREF = 3;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEDEFINITIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEDEFINITIONS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 6;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>XHTMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDDOCUMENT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDFILEImpl <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDFILEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE = 7;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>BINARYCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__BINARYCONTENT = 4;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE__DEFINITION = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEEMBEDDEDFILE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl <em>ATTRIBUTEVALUEENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	int ATTRIBUTEVALUEENUMERATION = 8;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION__VALUES = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEENUMERATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEFILEREFERENCEImpl <em>ATTRIBUTEVALUEFILEREFERENCE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEFILEREFERENCEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	int ATTRIBUTEVALUEFILEREFERENCE = 9;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>PATHTOFILE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE__PATHTOFILE = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEFILEREFERENCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESIMPLEImpl <em>ATTRIBUTEVALUESIMPLE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESIMPLEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	int ATTRIBUTEVALUESIMPLE = 10;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE__THEVALUE = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUESIMPLE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUESIMPLE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESTypeImpl <em>ATTRIBUTEVALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUESType()
	 * @generated
	 */
	int ATTRIBUTEVALUES_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF = 6;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUES_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEXMLDATAImpl <em>ATTRIBUTEVALUEXMLDATA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEXMLDATAImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	int ATTRIBUTEVALUEXMLDATA = 12;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>XMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA__XMLCONTENT = 5;

	/**
	 * The number of structural features of the '<em>ATTRIBUTEVALUEXMLDATA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTEVALUEXMLDATA_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.BINARYCONTENTImpl <em>BINARYCONTENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.BINARYCONTENTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getBINARYCONTENT()
	 * @generated
	 */
	int BINARYCONTENT = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARYCONTENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>BINARYCONTENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARYCONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.CHILDRENTypeImpl <em>CHILDREN Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.CHILDRENTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getCHILDRENType()
	 * @generated
	 */
	int CHILDREN_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>CHILDREN Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.CHILDRENType1Impl <em>CHILDREN Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.CHILDRENType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getCHILDRENType1()
	 * @generated
	 */
	int CHILDREN_TYPE1 = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHY</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1__SPECHIERARCHY = 1;

	/**
	 * The number of structural features of the '<em>CHILDREN Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILDREN_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl <em>DATATYPEDEFINITIONBINARYFILE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	int DATATYPEDEFINITIONBINARYFILE = 16;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__EMBEDDED = 4;

	/**
	 * The feature id for the '<em><b>APPLICATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__APPLICATION = 5;

	/**
	 * The feature id for the '<em><b>FILENAMESUFFIX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX = 6;

	/**
	 * The feature id for the '<em><b>FORMATNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__FORMATNAME = 7;

	/**
	 * The feature id for the '<em><b>MIMETYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE__MIMETYPE = 8;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONBINARYFILE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBINARYFILE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBOOLEANImpl <em>DATATYPEDEFINITIONBOOLEAN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBOOLEANImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	int DATATYPEDEFINITIONBOOLEAN = 17;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN__LONGNAME = 3;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONBOOLEAN_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDATEImpl <em>DATATYPEDEFINITIONDATE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDATEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	int DATATYPEDEFINITIONDATE = 18;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>FORMAT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE__FORMAT = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONDATE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDATE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl <em>DATATYPEDEFINITIONDOCUMENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	int DATATYPEDEFINITIONDOCUMENT = 19;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT__EMBEDDED = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONDOCUMENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONDOCUMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl <em>DATATYPEDEFINITIONENUMERATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	int DATATYPEDEFINITIONENUMERATION = 20;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONENUMERATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONENUMERATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONINTEGERImpl <em>DATATYPEDEFINITIONINTEGER</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONINTEGERImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	int DATATYPEDEFINITIONINTEGER = 21;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__MAX = 4;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER__MIN = 5;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONINTEGER</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONINTEGER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONREALImpl <em>DATATYPEDEFINITIONREAL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONREALImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	int DATATYPEDEFINITIONREAL = 22;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>ACCURACY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__ACCURACY = 4;

	/**
	 * The feature id for the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__MAX = 5;

	/**
	 * The feature id for the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL__MIN = 6;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONREAL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONREAL_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTRINGImpl <em>DATATYPEDEFINITIONSTRING</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTRINGImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	int DATATYPEDEFINITIONSTRING = 23;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>MAXLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING__MAXLENGTH = 4;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONSTRING</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONSTRING_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTypeImpl <em>DATATYPEDEFINITIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	int DATATYPEDEFINITIONS_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF = 5;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF = 7;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF = 8;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF = 9;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONS_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONXMLDATAImpl <em>DATATYPEDEFINITIONXMLDATA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONXMLDATAImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	int DATATYPEDEFINITIONXMLDATA = 25;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>EMBEDDED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__EMBEDDED = 4;

	/**
	 * The feature id for the '<em><b>NAMESPACEURI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__NAMESPACEURI = 5;

	/**
	 * The feature id for the '<em><b>SCHEMALOCATION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA__SCHEMALOCATION = 6;

	/**
	 * The number of structural features of the '<em>DATATYPEDEFINITIONXMLDATA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPEDEFINITIONXMLDATA_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPESTypeImpl <em>DATATYPES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPESType()
	 * @generated
	 */
	int DATATYPES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONBINARYFILE = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDATE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONDATE = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONDOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION = 5;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER = 6;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONREAL = 7;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONSTRING = 8;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE__DATATYPEDEFINITIONXMLDATA = 9;

	/**
	 * The number of structural features of the '<em>DATATYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPES_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUETypeImpl <em>DEFAULTVALUE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUETypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType1Impl <em>DEFAULTVALUE Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType1()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE1 = 28;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION = 0;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType2Impl <em>DEFAULTVALUE Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType2()
	 * @generated
	 */
	int DEFAULTVALUE_TYPE2 = 29;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA = 3;

	/**
	 * The number of structural features of the '<em>DEFAULTVALUE Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTVALUE_TYPE2_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONTypeImpl <em>DEFINITION Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType()
	 * @generated
	 */
	int DEFINITION_TYPE = 30;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType1Impl <em>DEFINITION Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType1()
	 * @generated
	 */
	int DEFINITION_TYPE1 = 31;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE1__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType2Impl <em>DEFINITION Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType2()
	 * @generated
	 */
	int DEFINITION_TYPE2 = 32;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSIMPLEREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType3Impl <em>DEFINITION Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType3Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType3()
	 * @generated
	 */
	int DEFINITION_TYPE3 = 33;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE3_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType4Impl <em>DEFINITION Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType4Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType4()
	 * @generated
	 */
	int DEFINITION_TYPE4 = 34;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE4__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType5Impl <em>DEFINITION Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType5Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType5()
	 * @generated
	 */
	int DEFINITION_TYPE5 = 35;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF = 0;

	/**
	 * The number of structural features of the '<em>DEFINITION Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.DocumentRootImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>RIF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIF = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.EMBEDDEDVALUEImpl <em>EMBEDDEDVALUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.EMBEDDEDVALUEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getEMBEDDEDVALUE()
	 * @generated
	 */
	int EMBEDDEDVALUE = 37;

	/**
	 * The feature id for the '<em><b>KEY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>OTHERCONTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE__OTHERCONTENT = 1;

	/**
	 * The number of structural features of the '<em>EMBEDDEDVALUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDEDVALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.ENUMVALUEImpl <em>ENUMVALUE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.ENUMVALUEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getENUMVALUE()
	 * @generated
	 */
	int ENUMVALUE = 38;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>PROPERTIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE__PROPERTIES = 4;

	/**
	 * The number of structural features of the '<em>ENUMVALUE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMVALUE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.OBJECTTypeImpl <em>OBJECT Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.OBJECTTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getOBJECTType()
	 * @generated
	 */
	int OBJECT_TYPE = 39;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>OBJECT Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.PROPERTIESTypeImpl <em>PROPERTIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.PROPERTIESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getPROPERTIESType()
	 * @generated
	 */
	int PROPERTIES_TYPE = 40;

	/**
	 * The feature id for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE__EMBEDDEDVALUE = 0;

	/**
	 * The number of structural features of the '<em>PROPERTIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl <em>RELATIONGROUP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUP()
	 * @generated
	 */
	int RELATIONGROUP = 41;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>RELATIONTYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__RELATIONTYPE = 4;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__SPECRELATIONS = 5;

	/**
	 * The feature id for the '<em><b>TARGETGROUP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP__TARGETGROUP = 6;

	/**
	 * The number of structural features of the '<em>RELATIONGROUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUP_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSTypeImpl <em>RELATIONGROUPS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUPSType()
	 * @generated
	 */
	int RELATIONGROUPS_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE__RELATIONGROUP = 1;

	/**
	 * The number of structural features of the '<em>RELATIONGROUPS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSType1Impl <em>RELATIONGROUPS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUPSType1()
	 * @generated
	 */
	int RELATIONGROUPS_TYPE1 = 43;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE1__RELATIONGROUPREF = 1;

	/**
	 * The number of structural features of the '<em>RELATIONGROUPS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONGROUPS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONTYPETypeImpl <em>RELATIONTYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONTYPETypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONTYPEType()
	 * @generated
	 */
	int RELATIONTYPE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONTYPE_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>RELATIONTYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONTYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.RIFImpl <em>RIF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.RIFImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRIF()
	 * @generated
	 */
	int RIF = 45;

	/**
	 * The feature id for the '<em><b>AUTHOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>COMMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COMMENT = 1;

	/**
	 * The feature id for the '<em><b>COUNTRYCODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__COUNTRYCODE = 2;

	/**
	 * The feature id for the '<em><b>CREATIONTIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__CREATIONTIME = 3;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>SOURCETOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SOURCETOOLID = 5;

	/**
	 * The feature id for the '<em><b>TITLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__TITLE = 6;

	/**
	 * The feature id for the '<em><b>VERSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__VERSION = 7;

	/**
	 * The feature id for the '<em><b>ACCESSPOLICIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__ACCESSPOLICIES = 8;

	/**
	 * The feature id for the '<em><b>DATATYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__DATATYPES = 9;

	/**
	 * The feature id for the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECTYPES = 10;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECOBJECTS = 11;

	/**
	 * The feature id for the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECRELATIONS = 12;

	/**
	 * The feature id for the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECGROUPS = 13;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF__SPECHIERARCHYROOTS = 14;

	/**
	 * The number of structural features of the '<em>RIF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIF_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SOURCETypeImpl <em>SOURCE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SOURCETypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSOURCEType()
	 * @generated
	 */
	int SOURCE_TYPE = 46;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>SOURCE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECATTRIBUTESTypeImpl <em>SPECATTRIBUTES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECATTRIBUTESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECATTRIBUTESType()
	 * @generated
	 */
	int SPECATTRIBUTES_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONCOMPLEX = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSIMPLE = 3;

	/**
	 * The number of structural features of the '<em>SPECATTRIBUTES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECATTRIBUTES_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl <em>SPECGROUP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUP()
	 * @generated
	 */
	int SPECGROUP = 48;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__TYPE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__VALUES = 5;

	/**
	 * The feature id for the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__RELATIONGROUPS = 6;

	/**
	 * The feature id for the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP__SPECOBJECTS = 7;

	/**
	 * The number of structural features of the '<em>SPECGROUP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUP_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSTypeImpl <em>SPECGROUPS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUPSType()
	 * @generated
	 */
	int SPECGROUPS_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECGROUP</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE__SPECGROUP = 1;

	/**
	 * The number of structural features of the '<em>SPECGROUPS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSType1Impl <em>SPECGROUPS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUPSType1()
	 * @generated
	 */
	int SPECGROUPS_TYPE1 = 50;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECGROUPREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE1__SPECGROUPREF = 1;

	/**
	 * The number of structural features of the '<em>SPECGROUPS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECGROUPS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHIESTypeImpl <em>SPECHIERARCHIES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHIESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHIESType()
	 * @generated
	 */
	int SPECHIERARCHIES_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHIES_TYPE__SPECHIERARCHYREF = 1;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHIES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYImpl <em>SPECHIERARCHY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHY()
	 * @generated
	 */
	int SPECHIERARCHY = 52;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>OBJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY__OBJECT = 5;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHY_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTImpl <em>SPECHIERARCHYROOT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOT()
	 * @generated
	 */
	int SPECHIERARCHYROOT = 53;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__VALUES = 5;

	/**
	 * The feature id for the '<em><b>CHILDREN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT__CHILDREN = 6;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHYROOT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSTypeImpl <em>SPECHIERARCHYROOTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOTSType()
	 * @generated
	 */
	int SPECHIERARCHYROOTS_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE__SPECHIERARCHYROOT = 1;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHYROOTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSType1Impl <em>SPECHIERARCHYROOTS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOTSType1()
	 * @generated
	 */
	int SPECHIERARCHYROOTS_TYPE1 = 55;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECHIERARCHYROOTREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOTREF = 1;

	/**
	 * The number of structural features of the '<em>SPECHIERARCHYROOTS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECHIERARCHYROOTS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECIFIEDVALUESTypeImpl <em>SPECIFIEDVALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECIFIEDVALUESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECIFIEDVALUESType()
	 * @generated
	 */
	int SPECIFIEDVALUES_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE__ENUMVALUE = 1;

	/**
	 * The number of structural features of the '<em>SPECIFIEDVALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIEDVALUES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTImpl <em>SPECOBJECT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECT()
	 * @generated
	 */
	int SPECOBJECT = 57;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__TYPE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT__VALUES = 5;

	/**
	 * The number of structural features of the '<em>SPECOBJECT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSTypeImpl <em>SPECOBJECTS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType()
	 * @generated
	 */
	int SPECOBJECTS_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE__SPECOBJECT = 1;

	/**
	 * The number of structural features of the '<em>SPECOBJECTS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType1Impl <em>SPECOBJECTS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType1()
	 * @generated
	 */
	int SPECOBJECTS_TYPE1 = 59;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE1__SPECOBJECTREF = 1;

	/**
	 * The number of structural features of the '<em>SPECOBJECTS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType2Impl <em>SPECOBJECTS Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType2()
	 * @generated
	 */
	int SPECOBJECTS_TYPE2 = 60;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE2__SPECOBJECTREF = 1;

	/**
	 * The number of structural features of the '<em>SPECOBJECTS Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECOBJECTS_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONImpl <em>SPECRELATION</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATION()
	 * @generated
	 */
	int SPECRELATION = 61;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__VALUES = 5;

	/**
	 * The feature id for the '<em><b>SOURCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>TARGET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION__TARGET = 7;

	/**
	 * The number of structural features of the '<em>SPECRELATION</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSTypeImpl <em>SPECRELATIONS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType()
	 * @generated
	 */
	int SPECRELATIONS_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATIONREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE__SPECRELATIONREF = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType1Impl <em>SPECRELATIONS Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType1()
	 * @generated
	 */
	int SPECRELATIONS_TYPE1 = 63;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1__SPECRELATION = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONS Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType2Impl <em>SPECRELATIONS Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType2()
	 * @generated
	 */
	int SPECRELATIONS_TYPE2 = 64;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECRELATIONREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE2__SPECRELATIONREF = 1;

	/**
	 * The number of structural features of the '<em>SPECRELATIONS Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECRELATIONS_TYPE2_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPEImpl <em>SPECTYPE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPEImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPE()
	 * @generated
	 */
	int SPECTYPE = 65;

	/**
	 * The feature id for the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE__DESC = 0;

	/**
	 * The feature id for the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE__LASTCHANGE = 2;

	/**
	 * The feature id for the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE__LONGNAME = 3;

	/**
	 * The feature id for the '<em><b>SPECATTRIBUTES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE__SPECATTRIBUTES = 4;

	/**
	 * The number of structural features of the '<em>SPECTYPE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPESTypeImpl <em>SPECTYPES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPESType()
	 * @generated
	 */
	int SPECTYPES_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECTYPE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE__SPECTYPE = 1;

	/**
	 * The number of structural features of the '<em>SPECTYPES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPESType1Impl <em>SPECTYPES Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPESType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPESType1()
	 * @generated
	 */
	int SPECTYPES_TYPE1 = 67;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE1__SPECTYPEREF = 1;

	/**
	 * The number of structural features of the '<em>SPECTYPES Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECTYPES_TYPE1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TARGETGROUPTypeImpl <em>TARGETGROUP Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TARGETGROUPTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTARGETGROUPType()
	 * @generated
	 */
	int TARGETGROUP_TYPE = 68;

	/**
	 * The feature id for the '<em><b>SPECGROUPREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETGROUP_TYPE__SPECGROUPREF = 0;

	/**
	 * The number of structural features of the '<em>TARGETGROUP Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGETGROUP_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TARGETTypeImpl <em>TARGET Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TARGETTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTARGETType()
	 * @generated
	 */
	int TARGET_TYPE = 69;

	/**
	 * The feature id for the '<em><b>SPECOBJECTREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__SPECOBJECTREF = 0;

	/**
	 * The number of structural features of the '<em>TARGET Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPETypeImpl <em>TYPE Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPETypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType()
	 * @generated
	 */
	int TYPE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType1Impl <em>TYPE Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType1()
	 * @generated
	 */
	int TYPE_TYPE1 = 71;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE1__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE1_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType2Impl <em>TYPE Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType2()
	 * @generated
	 */
	int TYPE_TYPE2 = 72;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE2__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE2_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType3Impl <em>TYPE Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType3Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType3()
	 * @generated
	 */
	int TYPE_TYPE3 = 73;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONBOOLEANREF = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONDATEREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONINTEGERREF = 2;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONREALREF = 3;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF = 4;

	/**
	 * The number of structural features of the '<em>TYPE Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE3_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType4Impl <em>TYPE Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType4Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType4()
	 * @generated
	 */
	int TYPE_TYPE4 = 74;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE4__DATATYPEDEFINITIONENUMERATIONREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE4_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType5Impl <em>TYPE Type5</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType5Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType5()
	 * @generated
	 */
	int TYPE_TYPE5 = 75;

	/**
	 * The feature id for the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE5__SPECTYPEREF = 0;

	/**
	 * The number of structural features of the '<em>TYPE Type5</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE5_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType6Impl <em>TYPE Type6</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType6Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType6()
	 * @generated
	 */
	int TYPE_TYPE6 = 76;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6__DATATYPEDEFINITIONBINARYFILEREF = 0;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6__DATATYPEDEFINITIONDOCUMENTREF = 1;

	/**
	 * The feature id for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6__DATATYPEDEFINITIONXMLDATAREF = 2;

	/**
	 * The number of structural features of the '<em>TYPE Type6</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_TYPE6_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESTypeImpl <em>VALUES Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESTypeImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType()
	 * @generated
	 */
	int VALUES_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>VALUES Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType1Impl <em>VALUES Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType1Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType1()
	 * @generated
	 */
	int VALUES_TYPE1 = 78;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>VALUES Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE1_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType2Impl <em>VALUES Type2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType2Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType2()
	 * @generated
	 */
	int VALUES_TYPE2 = 79;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>VALUES Type2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE2_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType3Impl <em>VALUES Type3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType3Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType3()
	 * @generated
	 */
	int VALUES_TYPE3 = 80;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = 1;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE = 2;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION = 3;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE = 4;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUESIMPLE = 5;

	/**
	 * The feature id for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA = 6;

	/**
	 * The number of structural features of the '<em>VALUES Type3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE3_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType4Impl <em>VALUES Type4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType4Impl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType4()
	 * @generated
	 */
	int VALUES_TYPE4 = 81;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE4__GROUP = 0;

	/**
	 * The feature id for the '<em><b>ENUMVALUEREF</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE4__ENUMVALUEREF = 1;

	/**
	 * The number of structural features of the '<em>VALUES Type4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUES_TYPE4_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.XHTMLCONTENTImpl <em>XHTMLCONTENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.XHTMLCONTENTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getXHTMLCONTENT()
	 * @generated
	 */
	int XHTMLCONTENT = 82;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTMLCONTENT__ANY = 0;

	/**
	 * The number of structural features of the '<em>XHTMLCONTENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTMLCONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.impl.XMLCONTENTImpl <em>XMLCONTENT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.impl.XMLCONTENTImpl
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getXMLCONTENT()
	 * @generated
	 */
	int XMLCONTENT = 83;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLCONTENT__ANY = 0;

	/**
	 * The number of structural features of the '<em>XMLCONTENT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLCONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICYACCESSMODEENUM()
	 * @generated
	 */
	int ACCESSPOLICYACCESSMODEENUM = 84;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM <em>DATATYPEDEFINITIONDATEFORMATENUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATEFORMATENUM()
	 * @generated
	 */
	int DATATYPEDEFINITIONDATEFORMATENUM = 85;

	/**
	 * The meta object id for the '<em>ACCESSPOLICYACCESSMODEENUM Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICYACCESSMODEENUMObject()
	 * @generated
	 */
	int ACCESSPOLICYACCESSMODEENUM_OBJECT = 86;

	/**
	 * The meta object id for the '<em>DATATYPEDEFINITIONDATEFORMATENUM Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATEFORMATENUMObject()
	 * @generated
	 */
	int DATATYPEDEFINITIONDATEFORMATENUM_OBJECT = 87;

	/**
	 * The meta object id for the '<em>REF</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getREF()
	 * @generated
	 */
	int REF = 88;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType <em>ACCESSPOLICIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACCESSPOLICIES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType
	 * @generated
	 */
	EClass getACCESSPOLICIESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType#getGroup()
	 * @see #getACCESSPOLICIESType()
	 * @generated
	 */
	EAttribute getACCESSPOLICIESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType#getACCESSPOLICY <em>ACCESSPOLICY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ACCESSPOLICY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICIESType#getACCESSPOLICY()
	 * @see #getACCESSPOLICIESType()
	 * @generated
	 */
	EReference getACCESSPOLICIESType_ACCESSPOLICY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY <em>ACCESSPOLICY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACCESSPOLICY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY
	 * @generated
	 */
	EClass getACCESSPOLICY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getDESC()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EAttribute getACCESSPOLICY_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getIDENTIFIER()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EAttribute getACCESSPOLICY_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getLASTCHANGE()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EAttribute getACCESSPOLICY_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getLONGNAME()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EAttribute getACCESSPOLICY_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getACCESSMODE <em>ACCESSMODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACCESSMODE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getACCESSMODE()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EAttribute getACCESSPOLICY_ACCESSMODE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEDEFINITIONS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getATTRIBUTEDEFINITIONS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_ATTRIBUTEDEFINITIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getATTRIBUTEVALUES()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_ATTRIBUTEVALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPEDEFINITIONS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getDATATYPEDEFINITIONS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_DATATYPEDEFINITIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getRELATIONGROUPS <em>RELATIONGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONGROUPS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getRELATIONGROUPS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_RELATIONGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECGROUPS <em>SPECGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECGROUPS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECGROUPS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHIES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECHIERARCHIES()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECHIERARCHIES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHYROOTS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECHIERARCHYROOTS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECHIERARCHYROOTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECOBJECTS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECRELATIONS()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECTYPES <em>SPECTYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICY#getSPECTYPES()
	 * @see #getACCESSPOLICY()
	 * @generated
	 */
	EReference getACCESSPOLICY_SPECTYPES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONCOMPLEX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getDESC()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONCOMPLEX_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONCOMPLEX_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONCOMPLEX_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONCOMPLEX_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONCOMPLEX_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONCOMPLEX#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONCOMPLEX()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONCOMPLEX_TYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getDESC()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#isMULTIVALUED <em>MULTIVALUED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MULTIVALUED</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#isMULTIVALUED()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONENUMERATION#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONENUMERATION_TYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONSIMPLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getDESC()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSIMPLE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getIDENTIFIER()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSIMPLE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getLASTCHANGE()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSIMPLE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getLONGNAME()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSIMPLE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getDEFAULTVALUE <em>DEFAULTVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFAULTVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getDEFAULTVALUE()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSIMPLE_DEFAULTVALUE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSIMPLE#getTYPE()
	 * @see #getATTRIBUTEDEFINITIONSIMPLE()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSIMPLE_TYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType <em>ATTRIBUTEDEFINITIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEDEFINITIONS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType
	 * @generated
	 */
	EClass getATTRIBUTEDEFINITIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getGroup()
	 * @see #getATTRIBUTEDEFINITIONSType()
	 * @generated
	 */
	EAttribute getATTRIBUTEDEFINITIONSType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getATTRIBUTEDEFINITIONSType()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getATTRIBUTEDEFINITIONSType()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType#getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @see #getATTRIBUTEDEFINITIONSType()
	 * @generated
	 */
	EReference getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT
	 * @generated
	 */
	EClass getATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getDESC()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getLONGNAME()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getDEFINITION()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DEFINITION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getXHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XHTMLCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT#getXHTMLCONTENT()
	 * @see #getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEEMBEDDEDDOCUMENT_XHTMLCONTENT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE
	 * @generated
	 */
	EClass getATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getDESC()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getLONGNAME()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEEMBEDDEDFILE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getBINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BINARYCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getBINARYCONTENT()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEEMBEDDEDFILE_BINARYCONTENT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE#getDEFINITION()
	 * @see #getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEEMBEDDEDFILE_DEFINITION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION
	 * @generated
	 */
	EClass getATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getDESC()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEENUMERATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEENUMERATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEENUMERATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getLONGNAME()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEENUMERATION_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getDEFINITION()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEENUMERATION_DEFINITION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION#getVALUES()
	 * @see #getATTRIBUTEVALUEENUMERATION()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEENUMERATION_VALUES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE
	 * @generated
	 */
	EClass getATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getDESC()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEFILEREFERENCE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEFILEREFERENCE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEFILEREFERENCE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getLONGNAME()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEFILEREFERENCE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getDEFINITION()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEFILEREFERENCE_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getPATHTOFILE <em>PATHTOFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PATHTOFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE#getPATHTOFILE()
	 * @see #getATTRIBUTEVALUEFILEREFERENCE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEFILEREFERENCE_PATHTOFILE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE
	 * @generated
	 */
	EClass getATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDESC()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESIMPLE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESIMPLE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESIMPLE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLONGNAME()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESIMPLE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDEFINITION()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESIMPLE_DEFINITION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getTHEVALUE <em>THEVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>THEVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getTHEVALUE()
	 * @see #getATTRIBUTEVALUESIMPLE()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESIMPLE_THEVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType <em>ATTRIBUTEVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType
	 * @generated
	 */
	EClass getATTRIBUTEVALUESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getGroup()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUESType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDFILEREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUEENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEENUMERATIONREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEFILEREFERENCEREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUESIMPLEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUESIMPLEREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ATTRIBUTEVALUEXMLDATAREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEXMLDATAREF()
	 * @see #getATTRIBUTEVALUESType()
	 * @generated
	 */
	EReference getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA
	 * @generated
	 */
	EClass getATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getDESC()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXMLDATA_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getIDENTIFIER()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXMLDATA_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getLASTCHANGE()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXMLDATA_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getLONGNAME()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EAttribute getATTRIBUTEVALUEXMLDATA_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getDEFINITION <em>DEFINITION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DEFINITION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getDEFINITION()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEXMLDATA_DEFINITION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getXMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>XMLCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA#getXMLCONTENT()
	 * @see #getATTRIBUTEVALUEXMLDATA()
	 * @generated
	 */
	EReference getATTRIBUTEVALUEXMLDATA_XMLCONTENT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.BINARYCONTENT <em>BINARYCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BINARYCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.BINARYCONTENT
	 * @generated
	 */
	EClass getBINARYCONTENT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.BINARYCONTENT#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.BINARYCONTENT#getValue()
	 * @see #getBINARYCONTENT()
	 * @generated
	 */
	EAttribute getBINARYCONTENT_Value();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType <em>CHILDREN Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CHILDREN Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType
	 * @generated
	 */
	EClass getCHILDRENType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType#getGroup()
	 * @see #getCHILDRENType()
	 * @generated
	 */
	EAttribute getCHILDRENType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType#getSPECHIERARCHY()
	 * @see #getCHILDRENType()
	 * @generated
	 */
	EReference getCHILDRENType_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType1 <em>CHILDREN Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CHILDREN Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType1
	 * @generated
	 */
	EClass getCHILDRENType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType1#getGroup()
	 * @see #getCHILDRENType1()
	 * @generated
	 */
	EAttribute getCHILDRENType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.CHILDRENType1#getSPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.CHILDRENType1#getSPECHIERARCHY()
	 * @see #getCHILDRENType1()
	 * @generated
	 */
	EReference getCHILDRENType1_SPECHIERARCHY();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONBINARYFILE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getDESC()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#isEMBEDDED()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_EMBEDDED();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getAPPLICATION <em>APPLICATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>APPLICATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getAPPLICATION()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_APPLICATION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FILENAMESUFFIX</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFILENAMESUFFIX()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFORMATNAME <em>FORMATNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FORMATNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getFORMATNAME()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_FORMATNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getMIMETYPE <em>MIMETYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIMETYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBINARYFILE#getMIMETYPE()
	 * @see #getDATATYPEDEFINITIONBINARYFILE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBINARYFILE_MIMETYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getDESC()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONBOOLEAN#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONBOOLEAN()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONBOOLEAN_LONGNAME();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONDATE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getDESC()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getFORMAT <em>FORMAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FORMAT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATE#getFORMAT()
	 * @see #getDATATYPEDEFINITIONDATE()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDATE_FORMAT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONDOCUMENT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getDESC()
	 * @see #getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDOCUMENT_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDOCUMENT_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDOCUMENT_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDOCUMENT_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#isEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDOCUMENT#isEMBEDDED()
	 * @see #getDATATYPEDEFINITIONDOCUMENT()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONDOCUMENT_EMBEDDED();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getDESC()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONENUMERATION_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getSPECIFIEDVALUES <em>SPECIFIEDVALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECIFIEDVALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONENUMERATION#getSPECIFIEDVALUES()
	 * @see #getDATATYPEDEFINITIONENUMERATION()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getDESC()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getMAX()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_MAX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONINTEGER#getMIN()
	 * @see #getDATATYPEDEFINITIONINTEGER()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONINTEGER_MIN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getDESC()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ACCURACY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getACCURACY()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_ACCURACY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAX</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_MAX();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MIN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN()
	 * @see #getDATATYPEDEFINITIONREAL()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONREAL_MIN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getDESC()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getMAXLENGTH <em>MAXLENGTH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXLENGTH</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSTRING#getMAXLENGTH()
	 * @see #getDATATYPEDEFINITIONSTRING()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSTRING_MAXLENGTH();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType <em>DATATYPEDEFINITIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getGroup()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONSType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONBINARYFILEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBINARYFILEREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONBOOLEANREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBOOLEANREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONDATEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDATEREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONDOCUMENTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDOCUMENTREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONENUMERATIONREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONINTEGERREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONINTEGERREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONREALREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONREALREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONSTRINGREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONSTRINGREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>DATATYPEDEFINITIONXMLDATAREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONXMLDATAREF()
	 * @see #getDATATYPEDEFINITIONSType()
	 * @generated
	 */
	EReference getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA
	 * @generated
	 */
	EClass getDATATYPEDEFINITIONXMLDATA();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getDESC()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getIDENTIFIER()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getLASTCHANGE()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getLONGNAME()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_LONGNAME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED <em>EMBEDDED</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMBEDDED</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#isEMBEDDED()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_EMBEDDED();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getNAMESPACEURI <em>NAMESPACEURI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NAMESPACEURI</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getNAMESPACEURI()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getSCHEMALOCATION <em>SCHEMALOCATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SCHEMALOCATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONXMLDATA#getSCHEMALOCATION()
	 * @see #getDATATYPEDEFINITIONXMLDATA()
	 * @generated
	 */
	EAttribute getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType <em>DATATYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DATATYPES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType
	 * @generated
	 */
	EClass getDATATYPESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getGroup()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EAttribute getDATATYPESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONBINARYFILE <em>DATATYPEDEFINITIONBINARYFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONBINARYFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONBINARYFILE()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONBINARYFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONBOOLEAN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONBOOLEAN()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONDATE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONDATE()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONDATE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONDOCUMENT <em>DATATYPEDEFINITIONDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONDOCUMENT()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONENUMERATION()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONINTEGER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONINTEGER()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONREAL</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONREAL()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONREAL();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONSTRING</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONSTRING()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONSTRING();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONXMLDATA <em>DATATYPEDEFINITIONXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>DATATYPEDEFINITIONXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPESType#getDATATYPEDEFINITIONXMLDATA()
	 * @see #getDATATYPESType()
	 * @generated
	 */
	EReference getDATATYPESType_DATATYPEDEFINITIONXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType <em>DEFAULTVALUE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType
	 * @generated
	 */
	EClass getDEFAULTVALUEType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType#getATTRIBUTEVALUESIMPLE()
	 * @see #getDEFAULTVALUEType()
	 * @generated
	 */
	EReference getDEFAULTVALUEType_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1 <em>DEFAULTVALUE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1
	 * @generated
	 */
	EClass getDEFAULTVALUEType1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType1#getATTRIBUTEVALUEENUMERATION()
	 * @see #getDEFAULTVALUEType1()
	 * @generated
	 */
	EReference getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2 <em>DEFAULTVALUE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFAULTVALUE Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2
	 * @generated
	 */
	EClass getDEFAULTVALUEType2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getDEFAULTVALUEType2()
	 * @generated
	 */
	EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getDEFAULTVALUEType2()
	 * @generated
	 */
	EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getDEFAULTVALUEType2()
	 * @generated
	 */
	EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFAULTVALUEType2#getATTRIBUTEVALUEXMLDATA()
	 * @see #getDEFAULTVALUEType2()
	 * @generated
	 */
	EReference getDEFAULTVALUEType2_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType <em>DEFINITION Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType
	 * @generated
	 */
	EClass getDEFINITIONType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getDEFINITIONType()
	 * @generated
	 */
	EReference getDEFINITIONType_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType1 <em>DEFINITION Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType1
	 * @generated
	 */
	EClass getDEFINITIONType1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType1#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType1#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getDEFINITIONType1()
	 * @generated
	 */
	EReference getDEFINITIONType1_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType2 <em>DEFINITION Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType2
	 * @generated
	 */
	EClass getDEFINITIONType2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @see #getDEFINITIONType2()
	 * @generated
	 */
	EReference getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType3 <em>DEFINITION Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type3</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType3
	 * @generated
	 */
	EClass getDEFINITIONType3();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType3#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType3#getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @see #getDEFINITIONType3()
	 * @generated
	 */
	EReference getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType4 <em>DEFINITION Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type4</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType4
	 * @generated
	 */
	EClass getDEFINITIONType4();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType4#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType4#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getDEFINITIONType4()
	 * @generated
	 */
	EReference getDEFINITIONType4_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType5 <em>DEFINITION Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DEFINITION Type5</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType5
	 * @generated
	 */
	EClass getDEFINITIONType5();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @see #getDEFINITIONType5()
	 * @generated
	 */
	EReference getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.DocumentRoot#getRIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RIF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DocumentRoot#getRIF()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RIF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMBEDDEDVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE
	 * @generated
	 */
	EClass getEMBEDDEDVALUE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE#getKEY <em>KEY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>KEY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE#getKEY()
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 */
	EAttribute getEMBEDDEDVALUE_KEY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE#getOTHERCONTENT <em>OTHERCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OTHERCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.EMBEDDEDVALUE#getOTHERCONTENT()
	 * @see #getEMBEDDEDVALUE()
	 * @generated
	 */
	EAttribute getEMBEDDEDVALUE_OTHERCONTENT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ENUMVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE
	 * @generated
	 */
	EClass getENUMVALUE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE#getDESC()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE#getIDENTIFIER()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE#getLASTCHANGE()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE#getLONGNAME()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EAttribute getENUMVALUE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.ENUMVALUE#getPROPERTIES <em>PROPERTIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PROPERTIES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ENUMVALUE#getPROPERTIES()
	 * @see #getENUMVALUE()
	 * @generated
	 */
	EReference getENUMVALUE_PROPERTIES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.OBJECTType <em>OBJECT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBJECT Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.OBJECTType
	 * @generated
	 */
	EClass getOBJECTType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.OBJECTType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.OBJECTType#getSPECOBJECTREF()
	 * @see #getOBJECTType()
	 * @generated
	 */
	EReference getOBJECTType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.PROPERTIESType <em>PROPERTIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PROPERTIES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.PROPERTIESType
	 * @generated
	 */
	EClass getPROPERTIESType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.PROPERTIESType#getEMBEDDEDVALUE <em>EMBEDDEDVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMBEDDEDVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.PROPERTIESType#getEMBEDDEDVALUE()
	 * @see #getPROPERTIESType()
	 * @generated
	 */
	EReference getPROPERTIESType_EMBEDDEDVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONGROUP</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP
	 * @generated
	 */
	EClass getRELATIONGROUP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getDESC()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getIDENTIFIER()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLASTCHANGE()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLONGNAME()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EAttribute getRELATIONGROUP_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getRELATIONTYPE <em>RELATIONTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONTYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getRELATIONTYPE()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_RELATIONTYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getSPECRELATIONS()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getTARGETGROUP <em>TARGETGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGETGROUP</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getTARGETGROUP()
	 * @see #getRELATIONGROUP()
	 * @generated
	 */
	EReference getRELATIONGROUP_TARGETGROUP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType <em>RELATIONGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONGROUPS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType
	 * @generated
	 */
	EClass getRELATIONGROUPSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType#getGroup()
	 * @see #getRELATIONGROUPSType()
	 * @generated
	 */
	EAttribute getRELATIONGROUPSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType#getRELATIONGROUP <em>RELATIONGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>RELATIONGROUP</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType#getRELATIONGROUP()
	 * @see #getRELATIONGROUPSType()
	 * @generated
	 */
	EReference getRELATIONGROUPSType_RELATIONGROUP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1 <em>RELATIONGROUPS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONGROUPS Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1
	 * @generated
	 */
	EClass getRELATIONGROUPSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1#getGroup()
	 * @see #getRELATIONGROUPSType1()
	 * @generated
	 */
	EAttribute getRELATIONGROUPSType1_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1#getRELATIONGROUPREF <em>RELATIONGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RELATIONGROUPREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1#getRELATIONGROUPREF()
	 * @see #getRELATIONGROUPSType1()
	 * @generated
	 */
	EReference getRELATIONGROUPSType1_RELATIONGROUPREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.RELATIONTYPEType <em>RELATIONTYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RELATIONTYPE Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONTYPEType
	 * @generated
	 */
	EClass getRELATIONTYPEType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.RELATIONTYPEType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RELATIONTYPEType#getSPECTYPEREF()
	 * @see #getRELATIONTYPEType()
	 * @generated
	 */
	EReference getRELATIONTYPEType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.RIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RIF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF
	 * @generated
	 */
	EClass getRIF();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getAUTHOR <em>AUTHOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AUTHOR</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getAUTHOR()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_AUTHOR();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getCOMMENT <em>COMMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COMMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getCOMMENT()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_COMMENT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getCOUNTRYCODE <em>COUNTRYCODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>COUNTRYCODE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getCOUNTRYCODE()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_COUNTRYCODE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getCREATIONTIME <em>CREATIONTIME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CREATIONTIME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getCREATIONTIME()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_CREATIONTIME();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getIDENTIFIER()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getSOURCETOOLID <em>SOURCETOOLID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SOURCETOOLID</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSOURCETOOLID()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_SOURCETOOLID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getTITLE <em>TITLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TITLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getTITLE()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_TITLE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.RIF#getVERSION <em>VERSION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VERSION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getVERSION()
	 * @see #getRIF()
	 * @generated
	 */
	EAttribute getRIF_VERSION();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ACCESSPOLICIES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getACCESSPOLICIES()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_ACCESSPOLICIES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getDATATYPES <em>DATATYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DATATYPES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getDATATYPES()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_DATATYPES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECTYPES <em>SPECTYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECTYPES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSPECTYPES()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SPECTYPES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSPECOBJECTS()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SPECOBJECTS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECRELATIONS <em>SPECRELATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECRELATIONS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSPECRELATIONS()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SPECRELATIONS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECGROUPS <em>SPECGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECGROUPS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSPECGROUPS()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SPECGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECHIERARCHYROOTS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.RIF#getSPECHIERARCHYROOTS()
	 * @see #getRIF()
	 * @generated
	 */
	EReference getRIF_SPECHIERARCHYROOTS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SOURCEType <em>SOURCE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOURCE Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SOURCEType
	 * @generated
	 */
	EClass getSOURCEType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SOURCEType#getSPECOBJECTREF()
	 * @see #getSOURCEType()
	 * @generated
	 */
	EReference getSOURCEType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType <em>SPECATTRIBUTES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECATTRIBUTES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType
	 * @generated
	 */
	EClass getSPECATTRIBUTESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getGroup()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EAttribute getSPECATTRIBUTESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONCOMPLEX <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONCOMPLEX</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONCOMPLEX()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONCOMPLEX();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONENUMERATION <em>ATTRIBUTEDEFINITIONENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONENUMERATION()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONSIMPLE <em>ATTRIBUTEDEFINITIONSIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEDEFINITIONSIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECATTRIBUTESType#getATTRIBUTEDEFINITIONSIMPLE()
	 * @see #getSPECATTRIBUTESType()
	 * @generated
	 */
	EReference getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSIMPLE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP <em>SPECGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECGROUP</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP
	 * @generated
	 */
	EClass getSPECGROUP();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getDESC()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EAttribute getSPECGROUP_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getIDENTIFIER()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EAttribute getSPECGROUP_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getLASTCHANGE()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EAttribute getSPECGROUP_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getLONGNAME()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EAttribute getSPECGROUP_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getTYPE()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EReference getSPECGROUP_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getVALUES()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EReference getSPECGROUP_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getRELATIONGROUPS <em>RELATIONGROUPS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RELATIONGROUPS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getRELATIONGROUPS()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EReference getSPECGROUP_RELATIONGROUPS();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECGROUP#getSPECOBJECTS <em>SPECOBJECTS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECOBJECTS</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUP#getSPECOBJECTS()
	 * @see #getSPECGROUP()
	 * @generated
	 */
	EReference getSPECGROUP_SPECOBJECTS();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType <em>SPECGROUPS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECGROUPS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType
	 * @generated
	 */
	EClass getSPECGROUPSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType#getGroup()
	 * @see #getSPECGROUPSType()
	 * @generated
	 */
	EAttribute getSPECGROUPSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType#getSPECGROUP <em>SPECGROUP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECGROUP</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType#getSPECGROUP()
	 * @see #getSPECGROUPSType()
	 * @generated
	 */
	EReference getSPECGROUPSType_SPECGROUP();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType1 <em>SPECGROUPS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECGROUPS Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType1
	 * @generated
	 */
	EClass getSPECGROUPSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType1#getGroup()
	 * @see #getSPECGROUPSType1()
	 * @generated
	 */
	EAttribute getSPECGROUPSType1_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECGROUPSType1#getSPECGROUPREF <em>SPECGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECGROUPREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECGROUPSType1#getSPECGROUPREF()
	 * @see #getSPECGROUPSType1()
	 * @generated
	 */
	EReference getSPECGROUPSType1_SPECGROUPREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType <em>SPECHIERARCHIES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHIES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType
	 * @generated
	 */
	EClass getSPECHIERARCHIESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType#getGroup()
	 * @see #getSPECHIERARCHIESType()
	 * @generated
	 */
	EAttribute getSPECHIERARCHIESType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType#getSPECHIERARCHYREF <em>SPECHIERARCHYREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECHIERARCHYREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType#getSPECHIERARCHYREF()
	 * @see #getSPECHIERARCHIESType()
	 * @generated
	 */
	EReference getSPECHIERARCHIESType_SPECHIERARCHYREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY <em>SPECHIERARCHY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHY</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY
	 * @generated
	 */
	EClass getSPECHIERARCHY();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getDESC()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getIDENTIFIER()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getLASTCHANGE()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getLONGNAME()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EAttribute getSPECHIERARCHY_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getCHILDREN()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_CHILDREN();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getOBJECT <em>OBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OBJECT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHY#getOBJECT()
	 * @see #getSPECHIERARCHY()
	 * @generated
	 */
	EReference getSPECHIERARCHY_OBJECT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHYROOT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT
	 * @generated
	 */
	EClass getSPECHIERARCHYROOT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getDESC()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOT_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getIDENTIFIER()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOT_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getLASTCHANGE()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOT_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getLONGNAME()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOT_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getTYPE()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EReference getSPECHIERARCHYROOT_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getVALUES()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EReference getSPECHIERARCHYROOT_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getCHILDREN <em>CHILDREN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CHILDREN</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOT#getCHILDREN()
	 * @see #getSPECHIERARCHYROOT()
	 * @generated
	 */
	EReference getSPECHIERARCHYROOT_CHILDREN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType <em>SPECHIERARCHYROOTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHYROOTS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType
	 * @generated
	 */
	EClass getSPECHIERARCHYROOTSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType#getGroup()
	 * @see #getSPECHIERARCHYROOTSType()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOTSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType#getSPECHIERARCHYROOT <em>SPECHIERARCHYROOT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECHIERARCHYROOT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType#getSPECHIERARCHYROOT()
	 * @see #getSPECHIERARCHYROOTSType()
	 * @generated
	 */
	EReference getSPECHIERARCHYROOTSType_SPECHIERARCHYROOT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1 <em>SPECHIERARCHYROOTS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECHIERARCHYROOTS Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1
	 * @generated
	 */
	EClass getSPECHIERARCHYROOTSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1#getGroup()
	 * @see #getSPECHIERARCHYROOTSType1()
	 * @generated
	 */
	EAttribute getSPECHIERARCHYROOTSType1_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1#getSPECHIERARCHYROOTREF <em>SPECHIERARCHYROOTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECHIERARCHYROOTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1#getSPECHIERARCHYROOTREF()
	 * @see #getSPECHIERARCHYROOTSType1()
	 * @generated
	 */
	EReference getSPECHIERARCHYROOTSType1_SPECHIERARCHYROOTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType <em>SPECIFIEDVALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECIFIEDVALUES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType
	 * @generated
	 */
	EClass getSPECIFIEDVALUESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType#getGroup()
	 * @see #getSPECIFIEDVALUESType()
	 * @generated
	 */
	EAttribute getSPECIFIEDVALUESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType#getENUMVALUE <em>ENUMVALUE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ENUMVALUE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECIFIEDVALUESType#getENUMVALUE()
	 * @see #getSPECIFIEDVALUESType()
	 * @generated
	 */
	EReference getSPECIFIEDVALUESType_ENUMVALUE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT
	 * @generated
	 */
	EClass getSPECOBJECT();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getDESC()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getIDENTIFIER()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getLASTCHANGE()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getLONGNAME()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EAttribute getSPECOBJECT_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getTYPE()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EReference getSPECOBJECT_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECT#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECT#getVALUES()
	 * @see #getSPECOBJECT()
	 * @generated
	 */
	EReference getSPECOBJECT_VALUES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType <em>SPECOBJECTS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECTS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType
	 * @generated
	 */
	EClass getSPECOBJECTSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType#getGroup()
	 * @see #getSPECOBJECTSType()
	 * @generated
	 */
	EAttribute getSPECOBJECTSType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType#getSPECOBJECT <em>SPECOBJECT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECOBJECT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType#getSPECOBJECT()
	 * @see #getSPECOBJECTSType()
	 * @generated
	 */
	EReference getSPECOBJECTSType_SPECOBJECT();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1 <em>SPECOBJECTS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECTS Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1
	 * @generated
	 */
	EClass getSPECOBJECTSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1#getGroup()
	 * @see #getSPECOBJECTSType1()
	 * @generated
	 */
	EAttribute getSPECOBJECTSType1_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1#getSPECOBJECTREF()
	 * @see #getSPECOBJECTSType1()
	 * @generated
	 */
	EReference getSPECOBJECTSType1_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2 <em>SPECOBJECTS Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECOBJECTS Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2
	 * @generated
	 */
	EClass getSPECOBJECTSType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2#getGroup()
	 * @see #getSPECOBJECTSType2()
	 * @generated
	 */
	EAttribute getSPECOBJECTSType2_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2#getSPECOBJECTREF()
	 * @see #getSPECOBJECTSType2()
	 * @generated
	 */
	EReference getSPECOBJECTSType2_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION
	 * @generated
	 */
	EClass getSPECRELATION();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getDESC()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getIDENTIFIER()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getLASTCHANGE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getLONGNAME()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EAttribute getSPECRELATION_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getTYPE <em>TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getTYPE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_TYPE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getVALUES <em>VALUES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VALUES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getVALUES()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_VALUES();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getSOURCE <em>SOURCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SOURCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getSOURCE()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_SOURCE();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECRELATION#getTARGET <em>TARGET</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TARGET</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATION#getTARGET()
	 * @see #getSPECRELATION()
	 * @generated
	 */
	EReference getSPECRELATION_TARGET();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType <em>SPECRELATIONS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONS Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType
	 * @generated
	 */
	EClass getSPECRELATIONSType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType#getGroup()
	 * @see #getSPECRELATIONSType()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType#getSPECRELATIONREF <em>SPECRELATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECRELATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType#getSPECRELATIONREF()
	 * @see #getSPECRELATIONSType()
	 * @generated
	 */
	EReference getSPECRELATIONSType_SPECRELATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1 <em>SPECRELATIONS Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONS Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1
	 * @generated
	 */
	EClass getSPECRELATIONSType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1#getGroup()
	 * @see #getSPECRELATIONSType1()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1#getSPECRELATION <em>SPECRELATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECRELATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType1#getSPECRELATION()
	 * @see #getSPECRELATIONSType1()
	 * @generated
	 */
	EReference getSPECRELATIONSType1_SPECRELATION();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2 <em>SPECRELATIONS Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECRELATIONS Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2
	 * @generated
	 */
	EClass getSPECRELATIONSType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2#getGroup()
	 * @see #getSPECRELATIONSType2()
	 * @generated
	 */
	EAttribute getSPECRELATIONSType2_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2#getSPECRELATIONREF <em>SPECRELATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECRELATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2#getSPECRELATIONREF()
	 * @see #getSPECRELATIONSType2()
	 * @generated
	 */
	EReference getSPECRELATIONSType2_SPECRELATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE <em>SPECTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECTYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE
	 * @generated
	 */
	EClass getSPECTYPE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE#getDESC <em>DESC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DESC</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE#getDESC()
	 * @see #getSPECTYPE()
	 * @generated
	 */
	EAttribute getSPECTYPE_DESC();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE#getIDENTIFIER <em>IDENTIFIER</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IDENTIFIER</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE#getIDENTIFIER()
	 * @see #getSPECTYPE()
	 * @generated
	 */
	EAttribute getSPECTYPE_IDENTIFIER();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE#getLASTCHANGE <em>LASTCHANGE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LASTCHANGE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE#getLASTCHANGE()
	 * @see #getSPECTYPE()
	 * @generated
	 */
	EAttribute getSPECTYPE_LASTCHANGE();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE#getLONGNAME <em>LONGNAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>LONGNAME</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE#getLONGNAME()
	 * @see #getSPECTYPE()
	 * @generated
	 */
	EAttribute getSPECTYPE_LONGNAME();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif11.xsd.SPECTYPE#getSPECATTRIBUTES <em>SPECATTRIBUTES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SPECATTRIBUTES</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPE#getSPECATTRIBUTES()
	 * @see #getSPECTYPE()
	 * @generated
	 */
	EReference getSPECTYPE_SPECATTRIBUTES();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType <em>SPECTYPES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECTYPES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType
	 * @generated
	 */
	EClass getSPECTYPESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType#getGroup()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EAttribute getSPECTYPESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType#getSPECTYPE <em>SPECTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>SPECTYPE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType#getSPECTYPE()
	 * @see #getSPECTYPESType()
	 * @generated
	 */
	EReference getSPECTYPESType_SPECTYPE();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType1 <em>SPECTYPES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SPECTYPES Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType1
	 * @generated
	 */
	EClass getSPECTYPESType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType1#getGroup()
	 * @see #getSPECTYPESType1()
	 * @generated
	 */
	EAttribute getSPECTYPESType1_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.SPECTYPESType1#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.SPECTYPESType1#getSPECTYPEREF()
	 * @see #getSPECTYPESType1()
	 * @generated
	 */
	EReference getSPECTYPESType1_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TARGETGROUPType <em>TARGETGROUP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TARGETGROUP Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETGROUPType
	 * @generated
	 */
	EClass getTARGETGROUPType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TARGETGROUPType#getSPECGROUPREF <em>SPECGROUPREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECGROUPREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETGROUPType#getSPECGROUPREF()
	 * @see #getTARGETGROUPType()
	 * @generated
	 */
	EReference getTARGETGROUPType_SPECGROUPREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TARGETType <em>TARGET Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TARGET Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETType
	 * @generated
	 */
	EClass getTARGETType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TARGETType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECOBJECTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TARGETType#getSPECOBJECTREF()
	 * @see #getTARGETType()
	 * @generated
	 */
	EReference getTARGETType_SPECOBJECTREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType <em>TYPE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType
	 * @generated
	 */
	EClass getTYPEType();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType#getSPECTYPEREF()
	 * @see #getTYPEType()
	 * @generated
	 */
	EReference getTYPEType_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType1 <em>TYPE Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType1
	 * @generated
	 */
	EClass getTYPEType1();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType1#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType1#getSPECTYPEREF()
	 * @see #getTYPEType1()
	 * @generated
	 */
	EReference getTYPEType1_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType2 <em>TYPE Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType2
	 * @generated
	 */
	EClass getTYPEType2();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType2#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType2#getSPECTYPEREF()
	 * @see #getTYPEType2()
	 * @generated
	 */
	EReference getTYPEType2_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType3 <em>TYPE Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type3</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3
	 * @generated
	 */
	EClass getTYPEType3();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONBOOLEANREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONBOOLEANREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EReference getTYPEType3_DATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONDATEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONDATEREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EReference getTYPEType3_DATATYPEDEFINITIONDATEREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONINTEGERREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONINTEGERREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EReference getTYPEType3_DATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONREALREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONREALREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EReference getTYPEType3_DATATYPEDEFINITIONREALREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONSTRINGREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType3#getDATATYPEDEFINITIONSTRINGREF()
	 * @see #getTYPEType3()
	 * @generated
	 */
	EReference getTYPEType3_DATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType4 <em>TYPE Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type4</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType4
	 * @generated
	 */
	EClass getTYPEType4();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType4#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONENUMERATIONREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType4#getDATATYPEDEFINITIONENUMERATIONREF()
	 * @see #getTYPEType4()
	 * @generated
	 */
	EReference getTYPEType4_DATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType5 <em>TYPE Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type5</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType5
	 * @generated
	 */
	EClass getTYPEType5();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType5#getSPECTYPEREF <em>SPECTYPEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>SPECTYPEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType5#getSPECTYPEREF()
	 * @see #getTYPEType5()
	 * @generated
	 */
	EReference getTYPEType5_SPECTYPEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.TYPEType6 <em>TYPE Type6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TYPE Type6</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType6
	 * @generated
	 */
	EClass getTYPEType6();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONBINARYFILEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONBINARYFILEREF()
	 * @see #getTYPEType6()
	 * @generated
	 */
	EReference getTYPEType6_DATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONDOCUMENTREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONDOCUMENTREF()
	 * @see #getTYPEType6()
	 * @generated
	 */
	EReference getTYPEType6_DATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>DATATYPEDEFINITIONXMLDATAREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.TYPEType6#getDATATYPEDEFINITIONXMLDATAREF()
	 * @see #getTYPEType6()
	 * @generated
	 */
	EReference getTYPEType6_DATATYPEDEFINITIONXMLDATAREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.VALUESType <em>VALUES Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType
	 * @generated
	 */
	EClass getVALUESType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getGroup()
	 * @see #getVALUESType()
	 * @generated
	 */
	EAttribute getVALUESType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUESIMPLE()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType#getATTRIBUTEVALUEXMLDATA()
	 * @see #getVALUESType()
	 * @generated
	 */
	EReference getVALUESType_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.VALUESType1 <em>VALUES Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type1</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1
	 * @generated
	 */
	EClass getVALUESType1();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getGroup()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EAttribute getVALUESType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUESIMPLE()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEXMLDATA()
	 * @see #getVALUESType1()
	 * @generated
	 */
	EReference getVALUESType1_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.VALUESType2 <em>VALUES Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type2</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2
	 * @generated
	 */
	EClass getVALUESType2();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getGroup()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EAttribute getVALUESType2_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUESIMPLE()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType2#getATTRIBUTEVALUEXMLDATA()
	 * @see #getVALUESType2()
	 * @generated
	 */
	EReference getVALUESType2_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.VALUESType3 <em>VALUES Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type3</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3
	 * @generated
	 */
	EClass getVALUESType3();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getGroup()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EAttribute getVALUESType3_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEEMBEDDEDFILE()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEENUMERATION</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEENUMERATION()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEFILEREFERENCE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEFILEREFERENCE()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUESIMPLE</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUESIMPLE()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>ATTRIBUTEVALUEXMLDATA</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType3#getATTRIBUTEVALUEXMLDATA()
	 * @see #getVALUESType3()
	 * @generated
	 */
	EReference getVALUESType3_ATTRIBUTEVALUEXMLDATA();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.VALUESType4 <em>VALUES Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VALUES Type4</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType4
	 * @generated
	 */
	EClass getVALUESType4();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.VALUESType4#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType4#getGroup()
	 * @see #getVALUESType4()
	 * @generated
	 */
	EAttribute getVALUESType4_Group();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.rmf.rif11.xsd.VALUESType4#getENUMVALUEREF <em>ENUMVALUEREF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>ENUMVALUEREF</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.VALUESType4#getENUMVALUEREF()
	 * @see #getVALUESType4()
	 * @generated
	 */
	EReference getVALUESType4_ENUMVALUEREF();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.XHTMLCONTENT <em>XHTMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XHTMLCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.XHTMLCONTENT
	 * @generated
	 */
	EClass getXHTMLCONTENT();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.XHTMLCONTENT#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.XHTMLCONTENT#getAny()
	 * @see #getXHTMLCONTENT()
	 * @generated
	 */
	EAttribute getXHTMLCONTENT_Any();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif11.xsd.XMLCONTENT <em>XMLCONTENT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMLCONTENT</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.XMLCONTENT
	 * @generated
	 */
	EClass getXMLCONTENT();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif11.xsd.XMLCONTENT#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.XMLCONTENT#getAny()
	 * @see #getXMLCONTENT()
	 * @generated
	 */
	EAttribute getXMLCONTENT_Any();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ACCESSPOLICYACCESSMODEENUM</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @generated
	 */
	EEnum getACCESSPOLICYACCESSMODEENUM();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM <em>DATATYPEDEFINITIONDATEFORMATENUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DATATYPEDEFINITIONDATEFORMATENUM</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @generated
	 */
	EEnum getDATATYPEDEFINITIONDATEFORMATENUM();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>ACCESSPOLICYACCESSMODEENUM Object</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @model instanceClass="org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM"
	 *        extendedMetaData="name='ACCESS-POLICY-ACCESS-MODE-ENUM:Object' baseType='ACCESS-POLICY-ACCESS-MODE-ENUM'"
	 * @generated
	 */
	EDataType getACCESSPOLICYACCESSMODEENUMObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM <em>DATATYPEDEFINITIONDATEFORMATENUM Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>DATATYPEDEFINITIONDATEFORMATENUM Object</em>'.
	 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
	 * @model instanceClass="org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM"
	 *        extendedMetaData="name='DATATYPE-DEFINITION-DATE-FORMAT-ENUM:Object' baseType='DATATYPE-DEFINITION-DATE-FORMAT-ENUM'"
	 * @generated
	 */
	EDataType getDATATYPEDEFINITIONDATEFORMATENUMObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>REF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>REF</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='REF' baseType='http://www.eclipse.org/emf/2003/XMLType#IDREF'"
	 * @generated
	 */
	EDataType getREF();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RifFactory getRifFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICIESTypeImpl <em>ACCESSPOLICIES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICIESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICIESType()
		 * @generated
		 */
		EClass ACCESSPOLICIES_TYPE = eINSTANCE.getACCESSPOLICIESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICIES_TYPE__GROUP = eINSTANCE.getACCESSPOLICIESType_Group();

		/**
		 * The meta object literal for the '<em><b>ACCESSPOLICY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICIES_TYPE__ACCESSPOLICY = eINSTANCE.getACCESSPOLICIESType_ACCESSPOLICY();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl <em>ACCESSPOLICY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICY()
		 * @generated
		 */
		EClass ACCESSPOLICY = eINSTANCE.getACCESSPOLICY();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICY__DESC = eINSTANCE.getACCESSPOLICY_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICY__IDENTIFIER = eINSTANCE.getACCESSPOLICY_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICY__LASTCHANGE = eINSTANCE.getACCESSPOLICY_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICY__LONGNAME = eINSTANCE.getACCESSPOLICY_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>ACCESSMODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCESSPOLICY__ACCESSMODE = eINSTANCE.getACCESSPOLICY_ACCESSMODE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__ATTRIBUTEDEFINITIONS = eINSTANCE.getACCESSPOLICY_ATTRIBUTEDEFINITIONS();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__ATTRIBUTEVALUES = eINSTANCE.getACCESSPOLICY_ATTRIBUTEVALUES();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__DATATYPEDEFINITIONS = eINSTANCE.getACCESSPOLICY_DATATYPEDEFINITIONS();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__RELATIONGROUPS = eINSTANCE.getACCESSPOLICY_RELATIONGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECGROUPS = eINSTANCE.getACCESSPOLICY_SPECGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECHIERARCHIES = eINSTANCE.getACCESSPOLICY_SPECHIERARCHIES();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECHIERARCHYROOTS = eINSTANCE.getACCESSPOLICY_SPECHIERARCHYROOTS();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECOBJECTS = eINSTANCE.getACCESSPOLICY_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECRELATIONS = eINSTANCE.getACCESSPOLICY_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECTYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESSPOLICY__SPECTYPES = eINSTANCE.getACCESSPOLICY_SPECTYPES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl <em>ATTRIBUTEDEFINITIONCOMPLEX</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONCOMPLEX()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONCOMPLEX = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONCOMPLEX__DESC = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONCOMPLEX__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONCOMPLEX_TYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl <em>ATTRIBUTEDEFINITIONENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONENUMERATION()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__DESC = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>MULTIVALUED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_MULTIVALUED();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONENUMERATION__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONENUMERATION_TYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSIMPLEImpl <em>ATTRIBUTEDEFINITIONSIMPLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSIMPLEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONSIMPLE()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONSIMPLE = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSIMPLE__DESC = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSIMPLE__IDENTIFIER = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSIMPLE__LASTCHANGE = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONSIMPLE__LONGNAME = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFAULTVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONSIMPLE__DEFAULTVALUE = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_DEFAULTVALUE();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONSIMPLE__TYPE = eINSTANCE.getATTRIBUTEDEFINITIONSIMPLE_TYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSTypeImpl <em>ATTRIBUTEDEFINITIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEDEFINITIONSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEDEFINITIONSType()
		 * @generated
		 */
		EClass ATTRIBUTEDEFINITIONS_TYPE = eINSTANCE.getATTRIBUTEDEFINITIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEDEFINITIONS_TYPE__GROUP = eINSTANCE.getATTRIBUTEDEFINITIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE.getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE.getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEDEFINITIONS_TYPE__ATTRIBUTEDEFINITIONSIMPLEREF = eINSTANCE.getATTRIBUTEDEFINITIONSType_ATTRIBUTEDEFINITIONSIMPLEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEEMBEDDEDDOCUMENT()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>XHTMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDDOCUMENT_XHTMLCONTENT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDFILEImpl <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEEMBEDDEDFILEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEEMBEDDEDFILE()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDFILE__DESC = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDFILE__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDFILE__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEEMBEDDEDFILE__LONGNAME = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>BINARYCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEEMBEDDEDFILE__BINARYCONTENT = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_BINARYCONTENT();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEEMBEDDEDFILE__DEFINITION = eINSTANCE.getATTRIBUTEVALUEEMBEDDEDFILE_DEFINITION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl <em>ATTRIBUTEVALUEENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEENUMERATION()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEENUMERATION = eINSTANCE.getATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEENUMERATION__DESC = eINSTANCE.getATTRIBUTEVALUEENUMERATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEENUMERATION__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUEENUMERATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEENUMERATION__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUEENUMERATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEENUMERATION__LONGNAME = eINSTANCE.getATTRIBUTEVALUEENUMERATION_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEENUMERATION__DEFINITION = eINSTANCE.getATTRIBUTEVALUEENUMERATION_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEENUMERATION__VALUES = eINSTANCE.getATTRIBUTEVALUEENUMERATION_VALUES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEFILEREFERENCEImpl <em>ATTRIBUTEVALUEFILEREFERENCE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEFILEREFERENCEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEFILEREFERENCE()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEFILEREFERENCE__DESC = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEFILEREFERENCE__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEFILEREFERENCE__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEFILEREFERENCE__LONGNAME = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEFILEREFERENCE__DEFINITION = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>PATHTOFILE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEFILEREFERENCE__PATHTOFILE = eINSTANCE.getATTRIBUTEVALUEFILEREFERENCE_PATHTOFILE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESIMPLEImpl <em>ATTRIBUTEVALUESIMPLE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESIMPLEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUESIMPLE()
		 * @generated
		 */
		EClass ATTRIBUTEVALUESIMPLE = eINSTANCE.getATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESIMPLE__DESC = eINSTANCE.getATTRIBUTEVALUESIMPLE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESIMPLE__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUESIMPLE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESIMPLE__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUESIMPLE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESIMPLE__LONGNAME = eINSTANCE.getATTRIBUTEVALUESIMPLE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUESIMPLE__DEFINITION = eINSTANCE.getATTRIBUTEVALUESIMPLE_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>THEVALUE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUESIMPLE__THEVALUE = eINSTANCE.getATTRIBUTEVALUESIMPLE_THEVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESTypeImpl <em>ATTRIBUTEVALUES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUESType()
		 * @generated
		 */
		EClass ATTRIBUTEVALUES_TYPE = eINSTANCE.getATTRIBUTEVALUESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUES_TYPE__GROUP = eINSTANCE.getATTRIBUTEVALUESType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILEREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEENUMERATIONREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCEREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUESIMPLEREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUES_TYPE__ATTRIBUTEVALUEXMLDATAREF = eINSTANCE.getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEXMLDATAImpl <em>ATTRIBUTEVALUEXMLDATA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEXMLDATAImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getATTRIBUTEVALUEXMLDATA()
		 * @generated
		 */
		EClass ATTRIBUTEVALUEXMLDATA = eINSTANCE.getATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXMLDATA__DESC = eINSTANCE.getATTRIBUTEVALUEXMLDATA_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXMLDATA__IDENTIFIER = eINSTANCE.getATTRIBUTEVALUEXMLDATA_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXMLDATA__LASTCHANGE = eINSTANCE.getATTRIBUTEVALUEXMLDATA_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTEVALUEXMLDATA__LONGNAME = eINSTANCE.getATTRIBUTEVALUEXMLDATA_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>DEFINITION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEXMLDATA__DEFINITION = eINSTANCE.getATTRIBUTEVALUEXMLDATA_DEFINITION();

		/**
		 * The meta object literal for the '<em><b>XMLCONTENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTEVALUEXMLDATA__XMLCONTENT = eINSTANCE.getATTRIBUTEVALUEXMLDATA_XMLCONTENT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.BINARYCONTENTImpl <em>BINARYCONTENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.BINARYCONTENTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getBINARYCONTENT()
		 * @generated
		 */
		EClass BINARYCONTENT = eINSTANCE.getBINARYCONTENT();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARYCONTENT__VALUE = eINSTANCE.getBINARYCONTENT_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.CHILDRENTypeImpl <em>CHILDREN Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.CHILDRENTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getCHILDRENType()
		 * @generated
		 */
		EClass CHILDREN_TYPE = eINSTANCE.getCHILDRENType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_TYPE__GROUP = eINSTANCE.getCHILDRENType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_TYPE__SPECHIERARCHY = eINSTANCE.getCHILDRENType_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.CHILDRENType1Impl <em>CHILDREN Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.CHILDRENType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getCHILDRENType1()
		 * @generated
		 */
		EClass CHILDREN_TYPE1 = eINSTANCE.getCHILDRENType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHILDREN_TYPE1__GROUP = eINSTANCE.getCHILDRENType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHY</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILDREN_TYPE1__SPECHIERARCHY = eINSTANCE.getCHILDRENType1_SPECHIERARCHY();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl <em>DATATYPEDEFINITIONBINARYFILE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONBINARYFILE()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONBINARYFILE = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__DESC = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__EMBEDDED = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_EMBEDDED();

		/**
		 * The meta object literal for the '<em><b>APPLICATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__APPLICATION = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_APPLICATION();

		/**
		 * The meta object literal for the '<em><b>FILENAMESUFFIX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_FILENAMESUFFIX();

		/**
		 * The meta object literal for the '<em><b>FORMATNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__FORMATNAME = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_FORMATNAME();

		/**
		 * The meta object literal for the '<em><b>MIMETYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBINARYFILE__MIMETYPE = eINSTANCE.getDATATYPEDEFINITIONBINARYFILE_MIMETYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBOOLEANImpl <em>DATATYPEDEFINITIONBOOLEAN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONBOOLEANImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONBOOLEAN()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONBOOLEAN = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__DESC = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONBOOLEAN__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONBOOLEAN_LONGNAME();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDATEImpl <em>DATATYPEDEFINITIONDATE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDATEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATE()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONDATE = eINSTANCE.getDATATYPEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__DESC = eINSTANCE.getDATATYPEDEFINITIONDATE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONDATE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONDATE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONDATE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>FORMAT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDATE__FORMAT = eINSTANCE.getDATATYPEDEFINITIONDATE_FORMAT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl <em>DATATYPEDEFINITIONDOCUMENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDOCUMENT()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONDOCUMENT = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDOCUMENT__DESC = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDOCUMENT__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDOCUMENT__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDOCUMENT__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONDOCUMENT__EMBEDDED = eINSTANCE.getDATATYPEDEFINITIONDOCUMENT_EMBEDDED();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl <em>DATATYPEDEFINITIONENUMERATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONENUMERATION()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONENUMERATION = eINSTANCE.getDATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__DESC = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONENUMERATION__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>SPECIFIEDVALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES = eINSTANCE.getDATATYPEDEFINITIONENUMERATION_SPECIFIEDVALUES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONINTEGERImpl <em>DATATYPEDEFINITIONINTEGER</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONINTEGERImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONINTEGER()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONINTEGER = eINSTANCE.getDATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__DESC = eINSTANCE.getDATATYPEDEFINITIONINTEGER_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONINTEGER_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONINTEGER_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONINTEGER_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__MAX = eINSTANCE.getDATATYPEDEFINITIONINTEGER_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONINTEGER__MIN = eINSTANCE.getDATATYPEDEFINITIONINTEGER_MIN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONREALImpl <em>DATATYPEDEFINITIONREAL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONREALImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONREAL()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONREAL = eINSTANCE.getDATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__DESC = eINSTANCE.getDATATYPEDEFINITIONREAL_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONREAL_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONREAL_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONREAL_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>ACCURACY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__ACCURACY = eINSTANCE.getDATATYPEDEFINITIONREAL_ACCURACY();

		/**
		 * The meta object literal for the '<em><b>MAX</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__MAX = eINSTANCE.getDATATYPEDEFINITIONREAL_MAX();

		/**
		 * The meta object literal for the '<em><b>MIN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONREAL__MIN = eINSTANCE.getDATATYPEDEFINITIONREAL_MIN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTRINGImpl <em>DATATYPEDEFINITIONSTRING</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTRINGImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONSTRING()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONSTRING = eINSTANCE.getDATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__DESC = eINSTANCE.getDATATYPEDEFINITIONSTRING_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONSTRING_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONSTRING_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONSTRING_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>MAXLENGTH</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONSTRING__MAXLENGTH = eINSTANCE.getDATATYPEDEFINITIONSTRING_MAXLENGTH();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTypeImpl <em>DATATYPEDEFINITIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONSType()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONS_TYPE = eINSTANCE.getDATATYPEDEFINITIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONS_TYPE__GROUP = eINSTANCE.getDATATYPEDEFINITIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBINARYFILEREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONBOOLEANREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDATEREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONDOCUMENTREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONENUMERATIONREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONINTEGERREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONREALREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONSTRINGREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPEDEFINITIONS_TYPE__DATATYPEDEFINITIONXMLDATAREF = eINSTANCE.getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONXMLDATAImpl <em>DATATYPEDEFINITIONXMLDATA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPEDEFINITIONXMLDATAImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONXMLDATA()
		 * @generated
		 */
		EClass DATATYPEDEFINITIONXMLDATA = eINSTANCE.getDATATYPEDEFINITIONXMLDATA();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__DESC = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__IDENTIFIER = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__LASTCHANGE = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__LONGNAME = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>EMBEDDED</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__EMBEDDED = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_EMBEDDED();

		/**
		 * The meta object literal for the '<em><b>NAMESPACEURI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__NAMESPACEURI = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_NAMESPACEURI();

		/**
		 * The meta object literal for the '<em><b>SCHEMALOCATION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPEDEFINITIONXMLDATA__SCHEMALOCATION = eINSTANCE.getDATATYPEDEFINITIONXMLDATA_SCHEMALOCATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DATATYPESTypeImpl <em>DATATYPES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DATATYPESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPESType()
		 * @generated
		 */
		EClass DATATYPES_TYPE = eINSTANCE.getDATATYPESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATATYPES_TYPE__GROUP = eINSTANCE.getDATATYPESType_Group();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONBINARYFILE = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONBINARYFILE();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONBOOLEAN = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONBOOLEAN();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDATE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONDATE = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONDATE();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONDOCUMENT = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONENUMERATION = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONINTEGER = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONINTEGER();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONREAL = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONREAL();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONSTRING = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONSTRING();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATATYPES_TYPE__DATATYPEDEFINITIONXMLDATA = eINSTANCE.getDATATYPESType_DATATYPEDEFINITIONXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUETypeImpl <em>DEFAULTVALUE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUETypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE = eINSTANCE.getDEFAULTVALUEType();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE__ATTRIBUTEVALUESIMPLE = eINSTANCE.getDEFAULTVALUEType_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType1Impl <em>DEFAULTVALUE Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType1()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE1 = eINSTANCE.getDEFAULTVALUEType1();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE1__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getDEFAULTVALUEType1_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType2Impl <em>DEFAULTVALUE Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFAULTVALUEType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFAULTVALUEType2()
		 * @generated
		 */
		EClass DEFAULTVALUE_TYPE2 = eINSTANCE.getDEFAULTVALUEType2();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getDEFAULTVALUEType2_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getDEFAULTVALUEType2_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTVALUE_TYPE2__ATTRIBUTEVALUEXMLDATA = eINSTANCE.getDEFAULTVALUEType2_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONTypeImpl <em>DEFINITION Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType()
		 * @generated
		 */
		EClass DEFINITION_TYPE = eINSTANCE.getDEFINITIONType();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE.getDEFINITIONType_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType1Impl <em>DEFINITION Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType1()
		 * @generated
		 */
		EClass DEFINITION_TYPE1 = eINSTANCE.getDEFINITIONType1();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE1__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE.getDEFINITIONType1_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType2Impl <em>DEFINITION Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType2()
		 * @generated
		 */
		EClass DEFINITION_TYPE2 = eINSTANCE.getDEFINITIONType2();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE2__ATTRIBUTEDEFINITIONSIMPLEREF = eINSTANCE.getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType3Impl <em>DEFINITION Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType3Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType3()
		 * @generated
		 */
		EClass DEFINITION_TYPE3 = eINSTANCE.getDEFINITIONType3();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE3__ATTRIBUTEDEFINITIONENUMERATIONREF = eINSTANCE.getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType4Impl <em>DEFINITION Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType4Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType4()
		 * @generated
		 */
		EClass DEFINITION_TYPE4 = eINSTANCE.getDEFINITIONType4();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE4__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE.getDEFINITIONType4_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType5Impl <em>DEFINITION Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DEFINITIONType5Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDEFINITIONType5()
		 * @generated
		 */
		EClass DEFINITION_TYPE5 = eINSTANCE.getDEFINITIONType5();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION_TYPE5__ATTRIBUTEDEFINITIONCOMPLEXREF = eINSTANCE.getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.DocumentRootImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>RIF</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RIF = eINSTANCE.getDocumentRoot_RIF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.EMBEDDEDVALUEImpl <em>EMBEDDEDVALUE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.EMBEDDEDVALUEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getEMBEDDEDVALUE()
		 * @generated
		 */
		EClass EMBEDDEDVALUE = eINSTANCE.getEMBEDDEDVALUE();

		/**
		 * The meta object literal for the '<em><b>KEY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDEDVALUE__KEY = eINSTANCE.getEMBEDDEDVALUE_KEY();

		/**
		 * The meta object literal for the '<em><b>OTHERCONTENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDEDVALUE__OTHERCONTENT = eINSTANCE.getEMBEDDEDVALUE_OTHERCONTENT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.ENUMVALUEImpl <em>ENUMVALUE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.ENUMVALUEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getENUMVALUE()
		 * @generated
		 */
		EClass ENUMVALUE = eINSTANCE.getENUMVALUE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__DESC = eINSTANCE.getENUMVALUE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__IDENTIFIER = eINSTANCE.getENUMVALUE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__LASTCHANGE = eINSTANCE.getENUMVALUE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMVALUE__LONGNAME = eINSTANCE.getENUMVALUE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>PROPERTIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMVALUE__PROPERTIES = eINSTANCE.getENUMVALUE_PROPERTIES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.OBJECTTypeImpl <em>OBJECT Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.OBJECTTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getOBJECTType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getOBJECTType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SPECOBJECTREF = eINSTANCE.getOBJECTType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.PROPERTIESTypeImpl <em>PROPERTIES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.PROPERTIESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getPROPERTIESType()
		 * @generated
		 */
		EClass PROPERTIES_TYPE = eINSTANCE.getPROPERTIESType();

		/**
		 * The meta object literal for the '<em><b>EMBEDDEDVALUE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES_TYPE__EMBEDDEDVALUE = eINSTANCE.getPROPERTIESType_EMBEDDEDVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl <em>RELATIONGROUP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUP()
		 * @generated
		 */
		EClass RELATIONGROUP = eINSTANCE.getRELATIONGROUP();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__DESC = eINSTANCE.getRELATIONGROUP_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__IDENTIFIER = eINSTANCE.getRELATIONGROUP_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__LASTCHANGE = eINSTANCE.getRELATIONGROUP_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUP__LONGNAME = eINSTANCE.getRELATIONGROUP_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>RELATIONTYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__RELATIONTYPE = eINSTANCE.getRELATIONGROUP_RELATIONTYPE();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__SPECRELATIONS = eINSTANCE.getRELATIONGROUP_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>TARGETGROUP</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUP__TARGETGROUP = eINSTANCE.getRELATIONGROUP_TARGETGROUP();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSTypeImpl <em>RELATIONGROUPS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUPSType()
		 * @generated
		 */
		EClass RELATIONGROUPS_TYPE = eINSTANCE.getRELATIONGROUPSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPS_TYPE__GROUP = eINSTANCE.getRELATIONGROUPSType_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUPS_TYPE__RELATIONGROUP = eINSTANCE.getRELATIONGROUPSType_RELATIONGROUP();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSType1Impl <em>RELATIONGROUPS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPSType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONGROUPSType1()
		 * @generated
		 */
		EClass RELATIONGROUPS_TYPE1 = eINSTANCE.getRELATIONGROUPSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONGROUPS_TYPE1__GROUP = eINSTANCE.getRELATIONGROUPSType1_Group();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONGROUPS_TYPE1__RELATIONGROUPREF = eINSTANCE.getRELATIONGROUPSType1_RELATIONGROUPREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONTYPETypeImpl <em>RELATIONTYPE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.RELATIONTYPETypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRELATIONTYPEType()
		 * @generated
		 */
		EClass RELATIONTYPE_TYPE = eINSTANCE.getRELATIONTYPEType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONTYPE_TYPE__SPECTYPEREF = eINSTANCE.getRELATIONTYPEType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.RIFImpl <em>RIF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.RIFImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getRIF()
		 * @generated
		 */
		EClass RIF = eINSTANCE.getRIF();

		/**
		 * The meta object literal for the '<em><b>AUTHOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__AUTHOR = eINSTANCE.getRIF_AUTHOR();

		/**
		 * The meta object literal for the '<em><b>COMMENT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COMMENT = eINSTANCE.getRIF_COMMENT();

		/**
		 * The meta object literal for the '<em><b>COUNTRYCODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__COUNTRYCODE = eINSTANCE.getRIF_COUNTRYCODE();

		/**
		 * The meta object literal for the '<em><b>CREATIONTIME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__CREATIONTIME = eINSTANCE.getRIF_CREATIONTIME();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__IDENTIFIER = eINSTANCE.getRIF_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>SOURCETOOLID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__SOURCETOOLID = eINSTANCE.getRIF_SOURCETOOLID();

		/**
		 * The meta object literal for the '<em><b>TITLE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__TITLE = eINSTANCE.getRIF_TITLE();

		/**
		 * The meta object literal for the '<em><b>VERSION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIF__VERSION = eINSTANCE.getRIF_VERSION();

		/**
		 * The meta object literal for the '<em><b>ACCESSPOLICIES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__ACCESSPOLICIES = eINSTANCE.getRIF_ACCESSPOLICIES();

		/**
		 * The meta object literal for the '<em><b>DATATYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__DATATYPES = eINSTANCE.getRIF_DATATYPES();

		/**
		 * The meta object literal for the '<em><b>SPECTYPES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECTYPES = eINSTANCE.getRIF_SPECTYPES();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECOBJECTS = eINSTANCE.getRIF_SPECOBJECTS();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECRELATIONS = eINSTANCE.getRIF_SPECRELATIONS();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECGROUPS = eINSTANCE.getRIF_SPECGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RIF__SPECHIERARCHYROOTS = eINSTANCE.getRIF_SPECHIERARCHYROOTS();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SOURCETypeImpl <em>SOURCE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SOURCETypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSOURCEType()
		 * @generated
		 */
		EClass SOURCE_TYPE = eINSTANCE.getSOURCEType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_TYPE__SPECOBJECTREF = eINSTANCE.getSOURCEType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECATTRIBUTESTypeImpl <em>SPECATTRIBUTES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECATTRIBUTESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECATTRIBUTESType()
		 * @generated
		 */
		EClass SPECATTRIBUTES_TYPE = eINSTANCE.getSPECATTRIBUTESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECATTRIBUTES_TYPE__GROUP = eINSTANCE.getSPECATTRIBUTESType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONCOMPLEX = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONCOMPLEX();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONENUMERATION = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEDEFINITIONSIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECATTRIBUTES_TYPE__ATTRIBUTEDEFINITIONSIMPLE = eINSTANCE.getSPECATTRIBUTESType_ATTRIBUTEDEFINITIONSIMPLE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl <em>SPECGROUP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUP()
		 * @generated
		 */
		EClass SPECGROUP = eINSTANCE.getSPECGROUP();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUP__DESC = eINSTANCE.getSPECGROUP_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUP__IDENTIFIER = eINSTANCE.getSPECGROUP_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUP__LASTCHANGE = eINSTANCE.getSPECGROUP_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUP__LONGNAME = eINSTANCE.getSPECGROUP_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUP__TYPE = eINSTANCE.getSPECGROUP_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUP__VALUES = eINSTANCE.getSPECGROUP_VALUES();

		/**
		 * The meta object literal for the '<em><b>RELATIONGROUPS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUP__RELATIONGROUPS = eINSTANCE.getSPECGROUP_RELATIONGROUPS();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUP__SPECOBJECTS = eINSTANCE.getSPECGROUP_SPECOBJECTS();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSTypeImpl <em>SPECGROUPS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUPSType()
		 * @generated
		 */
		EClass SPECGROUPS_TYPE = eINSTANCE.getSPECGROUPSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUPS_TYPE__GROUP = eINSTANCE.getSPECGROUPSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECGROUP</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUPS_TYPE__SPECGROUP = eINSTANCE.getSPECGROUPSType_SPECGROUP();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSType1Impl <em>SPECGROUPS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECGROUPSType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECGROUPSType1()
		 * @generated
		 */
		EClass SPECGROUPS_TYPE1 = eINSTANCE.getSPECGROUPSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECGROUPS_TYPE1__GROUP = eINSTANCE.getSPECGROUPSType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECGROUPS_TYPE1__SPECGROUPREF = eINSTANCE.getSPECGROUPSType1_SPECGROUPREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHIESTypeImpl <em>SPECHIERARCHIES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHIESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHIESType()
		 * @generated
		 */
		EClass SPECHIERARCHIES_TYPE = eINSTANCE.getSPECHIERARCHIESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHIES_TYPE__GROUP = eINSTANCE.getSPECHIERARCHIESType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHIES_TYPE__SPECHIERARCHYREF = eINSTANCE.getSPECHIERARCHIESType_SPECHIERARCHYREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYImpl <em>SPECHIERARCHY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHY()
		 * @generated
		 */
		EClass SPECHIERARCHY = eINSTANCE.getSPECHIERARCHY();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__DESC = eINSTANCE.getSPECHIERARCHY_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__IDENTIFIER = eINSTANCE.getSPECHIERARCHY_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__LASTCHANGE = eINSTANCE.getSPECHIERARCHY_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHY__LONGNAME = eINSTANCE.getSPECHIERARCHY_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__CHILDREN = eINSTANCE.getSPECHIERARCHY_CHILDREN();

		/**
		 * The meta object literal for the '<em><b>OBJECT</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHY__OBJECT = eINSTANCE.getSPECHIERARCHY_OBJECT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTImpl <em>SPECHIERARCHYROOT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOT()
		 * @generated
		 */
		EClass SPECHIERARCHYROOT = eINSTANCE.getSPECHIERARCHYROOT();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOT__DESC = eINSTANCE.getSPECHIERARCHYROOT_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOT__IDENTIFIER = eINSTANCE.getSPECHIERARCHYROOT_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOT__LASTCHANGE = eINSTANCE.getSPECHIERARCHYROOT_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOT__LONGNAME = eINSTANCE.getSPECHIERARCHYROOT_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHYROOT__TYPE = eINSTANCE.getSPECHIERARCHYROOT_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHYROOT__VALUES = eINSTANCE.getSPECHIERARCHYROOT_VALUES();

		/**
		 * The meta object literal for the '<em><b>CHILDREN</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHYROOT__CHILDREN = eINSTANCE.getSPECHIERARCHYROOT_CHILDREN();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSTypeImpl <em>SPECHIERARCHYROOTS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOTSType()
		 * @generated
		 */
		EClass SPECHIERARCHYROOTS_TYPE = eINSTANCE.getSPECHIERARCHYROOTSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOTS_TYPE__GROUP = eINSTANCE.getSPECHIERARCHYROOTSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHYROOTS_TYPE__SPECHIERARCHYROOT = eINSTANCE.getSPECHIERARCHYROOTSType_SPECHIERARCHYROOT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSType1Impl <em>SPECHIERARCHYROOTS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECHIERARCHYROOTSType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECHIERARCHYROOTSType1()
		 * @generated
		 */
		EClass SPECHIERARCHYROOTS_TYPE1 = eINSTANCE.getSPECHIERARCHYROOTSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECHIERARCHYROOTS_TYPE1__GROUP = eINSTANCE.getSPECHIERARCHYROOTSType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECHIERARCHYROOTREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECHIERARCHYROOTS_TYPE1__SPECHIERARCHYROOTREF = eINSTANCE.getSPECHIERARCHYROOTSType1_SPECHIERARCHYROOTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECIFIEDVALUESTypeImpl <em>SPECIFIEDVALUES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECIFIEDVALUESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECIFIEDVALUESType()
		 * @generated
		 */
		EClass SPECIFIEDVALUES_TYPE = eINSTANCE.getSPECIFIEDVALUESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIEDVALUES_TYPE__GROUP = eINSTANCE.getSPECIFIEDVALUESType_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIEDVALUES_TYPE__ENUMVALUE = eINSTANCE.getSPECIFIEDVALUESType_ENUMVALUE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTImpl <em>SPECOBJECT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECT()
		 * @generated
		 */
		EClass SPECOBJECT = eINSTANCE.getSPECOBJECT();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__DESC = eINSTANCE.getSPECOBJECT_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__IDENTIFIER = eINSTANCE.getSPECOBJECT_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__LASTCHANGE = eINSTANCE.getSPECOBJECT_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECT__LONGNAME = eINSTANCE.getSPECOBJECT_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECT__TYPE = eINSTANCE.getSPECOBJECT_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECT__VALUES = eINSTANCE.getSPECOBJECT_VALUES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSTypeImpl <em>SPECOBJECTS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType()
		 * @generated
		 */
		EClass SPECOBJECTS_TYPE = eINSTANCE.getSPECOBJECTSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTS_TYPE__GROUP = eINSTANCE.getSPECOBJECTSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTS_TYPE__SPECOBJECT = eINSTANCE.getSPECOBJECTSType_SPECOBJECT();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType1Impl <em>SPECOBJECTS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType1()
		 * @generated
		 */
		EClass SPECOBJECTS_TYPE1 = eINSTANCE.getSPECOBJECTSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTS_TYPE1__GROUP = eINSTANCE.getSPECOBJECTSType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTS_TYPE1__SPECOBJECTREF = eINSTANCE.getSPECOBJECTSType1_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType2Impl <em>SPECOBJECTS Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECOBJECTSType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECOBJECTSType2()
		 * @generated
		 */
		EClass SPECOBJECTS_TYPE2 = eINSTANCE.getSPECOBJECTSType2();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECOBJECTS_TYPE2__GROUP = eINSTANCE.getSPECOBJECTSType2_Group();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECOBJECTS_TYPE2__SPECOBJECTREF = eINSTANCE.getSPECOBJECTSType2_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONImpl <em>SPECRELATION</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATION()
		 * @generated
		 */
		EClass SPECRELATION = eINSTANCE.getSPECRELATION();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__DESC = eINSTANCE.getSPECRELATION_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__IDENTIFIER = eINSTANCE.getSPECRELATION_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__LASTCHANGE = eINSTANCE.getSPECRELATION_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATION__LONGNAME = eINSTANCE.getSPECRELATION_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>TYPE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__TYPE = eINSTANCE.getSPECRELATION_TYPE();

		/**
		 * The meta object literal for the '<em><b>VALUES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__VALUES = eINSTANCE.getSPECRELATION_VALUES();

		/**
		 * The meta object literal for the '<em><b>SOURCE</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__SOURCE = eINSTANCE.getSPECRELATION_SOURCE();

		/**
		 * The meta object literal for the '<em><b>TARGET</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATION__TARGET = eINSTANCE.getSPECRELATION_TARGET();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSTypeImpl <em>SPECRELATIONS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType()
		 * @generated
		 */
		EClass SPECRELATIONS_TYPE = eINSTANCE.getSPECRELATIONSType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE__GROUP = eINSTANCE.getSPECRELATIONSType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONS_TYPE__SPECRELATIONREF = eINSTANCE.getSPECRELATIONSType_SPECRELATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType1Impl <em>SPECRELATIONS Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType1()
		 * @generated
		 */
		EClass SPECRELATIONS_TYPE1 = eINSTANCE.getSPECRELATIONSType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE1__GROUP = eINSTANCE.getSPECRELATIONSType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONS_TYPE1__SPECRELATION = eINSTANCE.getSPECRELATIONSType1_SPECRELATION();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType2Impl <em>SPECRELATIONS Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECRELATIONSType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECRELATIONSType2()
		 * @generated
		 */
		EClass SPECRELATIONS_TYPE2 = eINSTANCE.getSPECRELATIONSType2();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECRELATIONS_TYPE2__GROUP = eINSTANCE.getSPECRELATIONSType2_Group();

		/**
		 * The meta object literal for the '<em><b>SPECRELATIONREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECRELATIONS_TYPE2__SPECRELATIONREF = eINSTANCE.getSPECRELATIONSType2_SPECRELATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPEImpl <em>SPECTYPE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPEImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPE()
		 * @generated
		 */
		EClass SPECTYPE = eINSTANCE.getSPECTYPE();

		/**
		 * The meta object literal for the '<em><b>DESC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPE__DESC = eINSTANCE.getSPECTYPE_DESC();

		/**
		 * The meta object literal for the '<em><b>IDENTIFIER</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPE__IDENTIFIER = eINSTANCE.getSPECTYPE_IDENTIFIER();

		/**
		 * The meta object literal for the '<em><b>LASTCHANGE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPE__LASTCHANGE = eINSTANCE.getSPECTYPE_LASTCHANGE();

		/**
		 * The meta object literal for the '<em><b>LONGNAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPE__LONGNAME = eINSTANCE.getSPECTYPE_LONGNAME();

		/**
		 * The meta object literal for the '<em><b>SPECATTRIBUTES</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPE__SPECATTRIBUTES = eINSTANCE.getSPECTYPE_SPECATTRIBUTES();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPESTypeImpl <em>SPECTYPES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPESType()
		 * @generated
		 */
		EClass SPECTYPES_TYPE = eINSTANCE.getSPECTYPESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPES_TYPE__GROUP = eINSTANCE.getSPECTYPESType_Group();

		/**
		 * The meta object literal for the '<em><b>SPECTYPE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE__SPECTYPE = eINSTANCE.getSPECTYPESType_SPECTYPE();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.SPECTYPESType1Impl <em>SPECTYPES Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.SPECTYPESType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getSPECTYPESType1()
		 * @generated
		 */
		EClass SPECTYPES_TYPE1 = eINSTANCE.getSPECTYPESType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECTYPES_TYPE1__GROUP = eINSTANCE.getSPECTYPESType1_Group();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECTYPES_TYPE1__SPECTYPEREF = eINSTANCE.getSPECTYPESType1_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TARGETGROUPTypeImpl <em>TARGETGROUP Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TARGETGROUPTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTARGETGROUPType()
		 * @generated
		 */
		EClass TARGETGROUP_TYPE = eINSTANCE.getTARGETGROUPType();

		/**
		 * The meta object literal for the '<em><b>SPECGROUPREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGETGROUP_TYPE__SPECGROUPREF = eINSTANCE.getTARGETGROUPType_SPECGROUPREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TARGETTypeImpl <em>TARGET Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TARGETTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTARGETType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTARGETType();

		/**
		 * The meta object literal for the '<em><b>SPECOBJECTREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_TYPE__SPECOBJECTREF = eINSTANCE.getTARGETType_SPECOBJECTREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPETypeImpl <em>TYPE Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPETypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType()
		 * @generated
		 */
		EClass TYPE_TYPE = eINSTANCE.getTYPEType();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE__SPECTYPEREF = eINSTANCE.getTYPEType_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType1Impl <em>TYPE Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType1()
		 * @generated
		 */
		EClass TYPE_TYPE1 = eINSTANCE.getTYPEType1();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE1__SPECTYPEREF = eINSTANCE.getTYPEType1_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType2Impl <em>TYPE Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType2()
		 * @generated
		 */
		EClass TYPE_TYPE2 = eINSTANCE.getTYPEType2();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE2__SPECTYPEREF = eINSTANCE.getTYPEType2_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType3Impl <em>TYPE Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType3Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType3()
		 * @generated
		 */
		EClass TYPE_TYPE3 = eINSTANCE.getTYPEType3();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE3__DATATYPEDEFINITIONBOOLEANREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONBOOLEANREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE3__DATATYPEDEFINITIONDATEREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONDATEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE3__DATATYPEDEFINITIONINTEGERREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONINTEGERREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE3__DATATYPEDEFINITIONREALREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONREALREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE3__DATATYPEDEFINITIONSTRINGREF = eINSTANCE.getTYPEType3_DATATYPEDEFINITIONSTRINGREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType4Impl <em>TYPE Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType4Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType4()
		 * @generated
		 */
		EClass TYPE_TYPE4 = eINSTANCE.getTYPEType4();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE4__DATATYPEDEFINITIONENUMERATIONREF = eINSTANCE.getTYPEType4_DATATYPEDEFINITIONENUMERATIONREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType5Impl <em>TYPE Type5</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType5Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType5()
		 * @generated
		 */
		EClass TYPE_TYPE5 = eINSTANCE.getTYPEType5();

		/**
		 * The meta object literal for the '<em><b>SPECTYPEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE5__SPECTYPEREF = eINSTANCE.getTYPEType5_SPECTYPEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.TYPEType6Impl <em>TYPE Type6</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.TYPEType6Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getTYPEType6()
		 * @generated
		 */
		EClass TYPE_TYPE6 = eINSTANCE.getTYPEType6();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE6__DATATYPEDEFINITIONBINARYFILEREF = eINSTANCE.getTYPEType6_DATATYPEDEFINITIONBINARYFILEREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE6__DATATYPEDEFINITIONDOCUMENTREF = eINSTANCE.getTYPEType6_DATATYPEDEFINITIONDOCUMENTREF();

		/**
		 * The meta object literal for the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_TYPE6__DATATYPEDEFINITIONXMLDATAREF = eINSTANCE.getTYPEType6_DATATYPEDEFINITIONXMLDATAREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESTypeImpl <em>VALUES Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESTypeImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType()
		 * @generated
		 */
		EClass VALUES_TYPE = eINSTANCE.getVALUESType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE__GROUP = eINSTANCE.getVALUESType_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getVALUESType_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getVALUESType_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUESIMPLE = eINSTANCE.getVALUESType_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE__ATTRIBUTEVALUEXMLDATA = eINSTANCE.getVALUESType_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType1Impl <em>VALUES Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType1Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType1()
		 * @generated
		 */
		EClass VALUES_TYPE1 = eINSTANCE.getVALUESType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE1__GROUP = eINSTANCE.getVALUESType1_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUESIMPLE = eINSTANCE.getVALUESType1_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE1__ATTRIBUTEVALUEXMLDATA = eINSTANCE.getVALUESType1_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType2Impl <em>VALUES Type2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType2Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType2()
		 * @generated
		 */
		EClass VALUES_TYPE2 = eINSTANCE.getVALUESType2();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE2__GROUP = eINSTANCE.getVALUESType2_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUESIMPLE = eINSTANCE.getVALUESType2_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE2__ATTRIBUTEVALUEXMLDATA = eINSTANCE.getVALUESType2_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType3Impl <em>VALUES Type3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType3Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType3()
		 * @generated
		 */
		EClass VALUES_TYPE3 = eINSTANCE.getVALUESType3();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE3__GROUP = eINSTANCE.getVALUESType3_Group();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDDOCUMENT = eINSTANCE.getVALUESType3_ATTRIBUTEVALUEEMBEDDEDDOCUMENT();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUEEMBEDDEDFILE = eINSTANCE.getVALUESType3_ATTRIBUTEVALUEEMBEDDEDFILE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUEENUMERATION = eINSTANCE.getVALUESType3_ATTRIBUTEVALUEENUMERATION();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUEFILEREFERENCE = eINSTANCE.getVALUESType3_ATTRIBUTEVALUEFILEREFERENCE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUESIMPLE = eINSTANCE.getVALUESType3_ATTRIBUTEVALUESIMPLE();

		/**
		 * The meta object literal for the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE3__ATTRIBUTEVALUEXMLDATA = eINSTANCE.getVALUESType3_ATTRIBUTEVALUEXMLDATA();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.VALUESType4Impl <em>VALUES Type4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.VALUESType4Impl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getVALUESType4()
		 * @generated
		 */
		EClass VALUES_TYPE4 = eINSTANCE.getVALUESType4();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUES_TYPE4__GROUP = eINSTANCE.getVALUESType4_Group();

		/**
		 * The meta object literal for the '<em><b>ENUMVALUEREF</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUES_TYPE4__ENUMVALUEREF = eINSTANCE.getVALUESType4_ENUMVALUEREF();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.XHTMLCONTENTImpl <em>XHTMLCONTENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.XHTMLCONTENTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getXHTMLCONTENT()
		 * @generated
		 */
		EClass XHTMLCONTENT = eINSTANCE.getXHTMLCONTENT();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XHTMLCONTENT__ANY = eINSTANCE.getXHTMLCONTENT_Any();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.impl.XMLCONTENTImpl <em>XMLCONTENT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.impl.XMLCONTENTImpl
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getXMLCONTENT()
		 * @generated
		 */
		EClass XMLCONTENT = eINSTANCE.getXMLCONTENT();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMLCONTENT__ANY = eINSTANCE.getXMLCONTENT_Any();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM <em>ACCESSPOLICYACCESSMODEENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICYACCESSMODEENUM()
		 * @generated
		 */
		EEnum ACCESSPOLICYACCESSMODEENUM = eINSTANCE.getACCESSPOLICYACCESSMODEENUM();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM <em>DATATYPEDEFINITIONDATEFORMATENUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATEFORMATENUM()
		 * @generated
		 */
		EEnum DATATYPEDEFINITIONDATEFORMATENUM = eINSTANCE.getDATATYPEDEFINITIONDATEFORMATENUM();

		/**
		 * The meta object literal for the '<em>ACCESSPOLICYACCESSMODEENUM Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getACCESSPOLICYACCESSMODEENUMObject()
		 * @generated
		 */
		EDataType ACCESSPOLICYACCESSMODEENUM_OBJECT = eINSTANCE.getACCESSPOLICYACCESSMODEENUMObject();

		/**
		 * The meta object literal for the '<em>DATATYPEDEFINITIONDATEFORMATENUM Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONDATEFORMATENUM
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getDATATYPEDEFINITIONDATEFORMATENUMObject()
		 * @generated
		 */
		EDataType DATATYPEDEFINITIONDATEFORMATENUM_OBJECT = eINSTANCE.getDATATYPEDEFINITIONDATEFORMATENUMObject();

		/**
		 * The meta object literal for the '<em>REF</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif11.xsd.impl.RifPackageImpl#getREF()
		 * @generated
		 */
		EDataType REF = eINSTANCE.getREF();

	}

} //RifPackage
