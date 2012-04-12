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

package org.eclipse.rmf.rif12.its.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.rif12.its.DirRuleType;
import org.eclipse.rmf.rif12.its.DirType;
import org.eclipse.rmf.rif12.its.DirType1;
import org.eclipse.rmf.rif12.its.DirType2;
import org.eclipse.rmf.rif12.its.DocumentRoot;
import org.eclipse.rmf.rif12.its.ItsFactory;
import org.eclipse.rmf.rif12.its.ItsLocNoteContent;
import org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.ItsRbContent;
import org.eclipse.rmf.rif12.its.ItsRbcContent;
import org.eclipse.rmf.rif12.its.ItsRtContent;
import org.eclipse.rmf.rif12.its.ItsRtcContent;
import org.eclipse.rmf.rif12.its.ItsRubyContent;
import org.eclipse.rmf.rif12.its.ItsRubyRuleContent;
import org.eclipse.rmf.rif12.its.ItsRulesContent;
import org.eclipse.rmf.rif12.its.ItsSpanContent;
import org.eclipse.rmf.rif12.its.LangRuleType;
import org.eclipse.rmf.rif12.its.LocNoteRuleType;
import org.eclipse.rmf.rif12.its.LocNoteType;
import org.eclipse.rmf.rif12.its.LocNoteTypeType;
import org.eclipse.rmf.rif12.its.LocNoteTypeType1;
import org.eclipse.rmf.rif12.its.RbType;
import org.eclipse.rmf.rif12.its.RbcType;
import org.eclipse.rmf.rif12.its.RpType;
import org.eclipse.rmf.rif12.its.RtType;
import org.eclipse.rmf.rif12.its.RtcType;
import org.eclipse.rmf.rif12.its.RubyRuleType;
import org.eclipse.rmf.rif12.its.RubyTextType;
import org.eclipse.rmf.rif12.its.RubyType;
import org.eclipse.rmf.rif12.its.RulesType;
import org.eclipse.rmf.rif12.its.SpanType;
import org.eclipse.rmf.rif12.its.TermRuleType;
import org.eclipse.rmf.rif12.its.TermType;
import org.eclipse.rmf.rif12.its.TermType1;
import org.eclipse.rmf.rif12.its.TranslateRuleType;
import org.eclipse.rmf.rif12.its.TranslateType;
import org.eclipse.rmf.rif12.its.TranslateType1;
import org.eclipse.rmf.rif12.its.WithinTextRuleType;
import org.eclipse.rmf.rif12.its.WithinTextType;
import org.eclipse.rmf.rif12.xlink.XlinkPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ItsPackageImpl extends EPackageImpl implements ItsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dirRuleTypeEClass = null;

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
	private EClass itsLocNoteContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsLocNoteRuleContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRbcContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRbContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRtcContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRtContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRubyContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRubyRuleContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsRulesContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itsSpanContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass langRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locNoteRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locNoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rbTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rubyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass translateRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass withinTextRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dirTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dirType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dirType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locNoteTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum locNoteTypeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum termTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum termType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum translateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum translateType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum withinTextTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dirTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dirTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dirTypeObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locNoteTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType locNoteTypeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType termTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType termTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType translateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType translateTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType withinTextTypeObjectEDataType = null;

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
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ItsPackageImpl() {
		super(eNS_URI, ItsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ItsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ItsPackage init() {
		if (isInited) return (ItsPackage)EPackage.Registry.INSTANCE.getEPackage(ItsPackage.eNS_URI);

		// Obtain or create and register package
		ItsPackageImpl theItsPackage = (ItsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ItsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ItsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theItsPackage.createPackageContents();

		// Initialize created meta-data
		theItsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theItsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ItsPackage.eNS_URI, theItsPackage);
		return theItsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirRuleType() {
		return dirRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirRuleType_Dir() {
		return (EAttribute)dirRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDirRuleType_Selector() {
		return (EAttribute)dirRuleTypeEClass.getEStructuralFeatures().get(1);
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
	public EReference getDocumentRoot_DirRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LangRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocNote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LocNoteRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rb() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rbc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rtc() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ruby() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RubyRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RubyText() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Rules() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Span() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TermRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TranslateRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WithinTextRule() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsLocNoteContent() {
		return itsLocNoteContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsLocNoteContent_Mixed() {
		return (EAttribute)itsLocNoteContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsLocNoteContent_Group() {
		return (EAttribute)itsLocNoteContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsLocNoteContent_Ruby() {
		return (EReference)itsLocNoteContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsLocNoteContent_Span() {
		return (EReference)itsLocNoteContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsLocNoteRuleContent() {
		return itsLocNoteRuleContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsLocNoteRuleContent_LocNote() {
		return (EReference)itsLocNoteRuleContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRbcContent() {
		return itsRbcContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRbcContent_Rb() {
		return (EReference)itsRbcContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRbContent() {
		return itsRbContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsRbContent_Mixed() {
		return (EAttribute)itsRbContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRbContent_Span() {
		return (EReference)itsRbContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRtcContent() {
		return itsRtcContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRtcContent_Rt() {
		return (EReference)itsRtcContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRtContent() {
		return itsRtContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsRtContent_Mixed() {
		return (EAttribute)itsRtContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRtContent_Span() {
		return (EReference)itsRtContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRubyContent() {
		return itsRubyContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rb() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rt() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rp() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rt1() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rp1() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rbc() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rtc() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyContent_Rtc1() {
		return (EReference)itsRubyContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRubyRuleContent() {
		return itsRubyRuleContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRubyRuleContent_RubyText() {
		return (EReference)itsRubyRuleContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsRulesContent() {
		return itsRulesContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsRulesContent_Group() {
		return (EAttribute)itsRulesContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_TranslateRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_LocNoteRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_TermRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_DirRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_RubyRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_LangRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsRulesContent_WithinTextRule() {
		return (EReference)itsRulesContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItsSpanContent() {
		return itsSpanContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsSpanContent_Mixed() {
		return (EAttribute)itsSpanContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItsSpanContent_Group() {
		return (EAttribute)itsSpanContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsSpanContent_Ruby() {
		return (EReference)itsSpanContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItsSpanContent_Span() {
		return (EReference)itsSpanContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLangRuleType() {
		return langRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangRuleType_LangPointer() {
		return (EAttribute)langRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLangRuleType_Selector() {
		return (EAttribute)langRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocNoteRuleType() {
		return locNoteRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteRuleType_LocNotePointer() {
		return (EAttribute)locNoteRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteRuleType_LocNoteRef() {
		return (EAttribute)locNoteRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteRuleType_LocNoteRefPointer() {
		return (EAttribute)locNoteRuleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteRuleType_LocNoteType() {
		return (EAttribute)locNoteRuleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteRuleType_Selector() {
		return (EAttribute)locNoteRuleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocNoteType() {
		return locNoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_Dir() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_LocNote() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_LocNoteRef() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_LocNoteType() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_Term() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_TermInfoRef() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocNoteType_Translate() {
		return (EAttribute)locNoteTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRbcType() {
		return rbcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_Dir() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_LocNote() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_LocNoteRef() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_LocNoteType() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_Term() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_TermInfoRef() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbcType_Translate() {
		return (EAttribute)rbcTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRbType() {
		return rbTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_Dir() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_LocNote() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_LocNoteRef() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_LocNoteType() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_Term() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_TermInfoRef() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRbType_Translate() {
		return (EAttribute)rbTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRpType() {
		return rpTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_Mixed() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_Dir() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_LocNote() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_LocNoteRef() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_LocNoteType() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_Term() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_TermInfoRef() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRpType_Translate() {
		return (EAttribute)rpTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtcType() {
		return rtcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_Dir() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_LocNote() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_LocNoteRef() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_LocNoteType() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_Term() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_TermInfoRef() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtcType_Translate() {
		return (EAttribute)rtcTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRtType() {
		return rtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_Dir() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_LocNote() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_LocNoteRef() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_LocNoteType() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_Rbspan() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_Term() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_TermInfoRef() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRtType_Translate() {
		return (EAttribute)rtTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyRuleType() {
		return rubyRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RbcPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RbspanPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RpPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RtcPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RtPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_RubyPointer() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyRuleType_Selector() {
		return (EAttribute)rubyRuleTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyTextType() {
		return rubyTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Mixed() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Dir() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_LocNote() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_LocNoteRef() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_LocNoteType() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Rbspan() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Term() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_TermInfoRef() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyTextType_Translate() {
		return (EAttribute)rubyTextTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRubyType() {
		return rubyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_Dir() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_LocNote() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_LocNoteRef() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_LocNoteType() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_Term() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_TermInfoRef() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRubyType_Translate() {
		return (EAttribute)rubyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRulesType() {
		return rulesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulesType_Href() {
		return (EAttribute)rulesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulesType_Type() {
		return (EAttribute)rulesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRulesType_Version() {
		return (EAttribute)rulesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpanType() {
		return spanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Dir() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_LocNote() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_LocNoteRef() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_LocNoteType() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Term() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_TermInfoRef() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Translate() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermRuleType() {
		return termRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermRuleType_Selector() {
		return (EAttribute)termRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermRuleType_Term() {
		return (EAttribute)termRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermRuleType_TermInfoPointer() {
		return (EAttribute)termRuleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermRuleType_TermInfoRef() {
		return (EAttribute)termRuleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermRuleType_TermInfoRefPointer() {
		return (EAttribute)termRuleTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTranslateRuleType() {
		return translateRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslateRuleType_Selector() {
		return (EAttribute)translateRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTranslateRuleType_Translate() {
		return (EAttribute)translateRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWithinTextRuleType() {
		return withinTextRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithinTextRuleType_Selector() {
		return (EAttribute)withinTextRuleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWithinTextRuleType_WithinText() {
		return (EAttribute)withinTextRuleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirType() {
		return dirTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirType1() {
		return dirType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirType2() {
		return dirType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocNoteTypeType() {
		return locNoteTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLocNoteTypeType1() {
		return locNoteTypeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTermType() {
		return termTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTermType1() {
		return termType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTranslateType() {
		return translateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTranslateType1() {
		return translateType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWithinTextType() {
		return withinTextTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirTypeObject() {
		return dirTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirTypeObject1() {
		return dirTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDirTypeObject2() {
		return dirTypeObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocNoteTypeTypeObject() {
		return locNoteTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLocNoteTypeTypeObject1() {
		return locNoteTypeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTermTypeObject() {
		return termTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTermTypeObject1() {
		return termTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTranslateTypeObject() {
		return translateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTranslateTypeObject1() {
		return translateTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getWithinTextTypeObject() {
		return withinTextTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItsFactory getItsFactory() {
		return (ItsFactory)getEFactoryInstance();
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
		dirRuleTypeEClass = createEClass(DIR_RULE_TYPE);
		createEAttribute(dirRuleTypeEClass, DIR_RULE_TYPE__DIR);
		createEAttribute(dirRuleTypeEClass, DIR_RULE_TYPE__SELECTOR);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIR_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LANG_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOC_NOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOC_NOTE_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RBC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RTC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RUBY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RUBY_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RUBY_TEXT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RULES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TERM_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSLATE_RULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__WITHIN_TEXT_RULE);

		itsLocNoteContentEClass = createEClass(ITS_LOC_NOTE_CONTENT);
		createEAttribute(itsLocNoteContentEClass, ITS_LOC_NOTE_CONTENT__MIXED);
		createEAttribute(itsLocNoteContentEClass, ITS_LOC_NOTE_CONTENT__GROUP);
		createEReference(itsLocNoteContentEClass, ITS_LOC_NOTE_CONTENT__RUBY);
		createEReference(itsLocNoteContentEClass, ITS_LOC_NOTE_CONTENT__SPAN);

		itsLocNoteRuleContentEClass = createEClass(ITS_LOC_NOTE_RULE_CONTENT);
		createEReference(itsLocNoteRuleContentEClass, ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE);

		itsRbcContentEClass = createEClass(ITS_RBC_CONTENT);
		createEReference(itsRbcContentEClass, ITS_RBC_CONTENT__RB);

		itsRbContentEClass = createEClass(ITS_RB_CONTENT);
		createEAttribute(itsRbContentEClass, ITS_RB_CONTENT__MIXED);
		createEReference(itsRbContentEClass, ITS_RB_CONTENT__SPAN);

		itsRtcContentEClass = createEClass(ITS_RTC_CONTENT);
		createEReference(itsRtcContentEClass, ITS_RTC_CONTENT__RT);

		itsRtContentEClass = createEClass(ITS_RT_CONTENT);
		createEAttribute(itsRtContentEClass, ITS_RT_CONTENT__MIXED);
		createEReference(itsRtContentEClass, ITS_RT_CONTENT__SPAN);

		itsRubyContentEClass = createEClass(ITS_RUBY_CONTENT);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RB);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RT);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RP);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RT1);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RP1);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RBC);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RTC);
		createEReference(itsRubyContentEClass, ITS_RUBY_CONTENT__RTC1);

		itsRubyRuleContentEClass = createEClass(ITS_RUBY_RULE_CONTENT);
		createEReference(itsRubyRuleContentEClass, ITS_RUBY_RULE_CONTENT__RUBY_TEXT);

		itsRulesContentEClass = createEClass(ITS_RULES_CONTENT);
		createEAttribute(itsRulesContentEClass, ITS_RULES_CONTENT__GROUP);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__TRANSLATE_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__LOC_NOTE_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__TERM_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__DIR_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__RUBY_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__LANG_RULE);
		createEReference(itsRulesContentEClass, ITS_RULES_CONTENT__WITHIN_TEXT_RULE);

		itsSpanContentEClass = createEClass(ITS_SPAN_CONTENT);
		createEAttribute(itsSpanContentEClass, ITS_SPAN_CONTENT__MIXED);
		createEAttribute(itsSpanContentEClass, ITS_SPAN_CONTENT__GROUP);
		createEReference(itsSpanContentEClass, ITS_SPAN_CONTENT__RUBY);
		createEReference(itsSpanContentEClass, ITS_SPAN_CONTENT__SPAN);

		langRuleTypeEClass = createEClass(LANG_RULE_TYPE);
		createEAttribute(langRuleTypeEClass, LANG_RULE_TYPE__LANG_POINTER);
		createEAttribute(langRuleTypeEClass, LANG_RULE_TYPE__SELECTOR);

		locNoteRuleTypeEClass = createEClass(LOC_NOTE_RULE_TYPE);
		createEAttribute(locNoteRuleTypeEClass, LOC_NOTE_RULE_TYPE__LOC_NOTE_POINTER);
		createEAttribute(locNoteRuleTypeEClass, LOC_NOTE_RULE_TYPE__LOC_NOTE_REF);
		createEAttribute(locNoteRuleTypeEClass, LOC_NOTE_RULE_TYPE__LOC_NOTE_REF_POINTER);
		createEAttribute(locNoteRuleTypeEClass, LOC_NOTE_RULE_TYPE__LOC_NOTE_TYPE);
		createEAttribute(locNoteRuleTypeEClass, LOC_NOTE_RULE_TYPE__SELECTOR);

		locNoteTypeEClass = createEClass(LOC_NOTE_TYPE);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__DIR);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__LOC_NOTE);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__LOC_NOTE_REF);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__LOC_NOTE_TYPE);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__TERM);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__TERM_INFO_REF);
		createEAttribute(locNoteTypeEClass, LOC_NOTE_TYPE__TRANSLATE);

		rbcTypeEClass = createEClass(RBC_TYPE);
		createEAttribute(rbcTypeEClass, RBC_TYPE__DIR);
		createEAttribute(rbcTypeEClass, RBC_TYPE__LOC_NOTE);
		createEAttribute(rbcTypeEClass, RBC_TYPE__LOC_NOTE_REF);
		createEAttribute(rbcTypeEClass, RBC_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rbcTypeEClass, RBC_TYPE__TERM);
		createEAttribute(rbcTypeEClass, RBC_TYPE__TERM_INFO_REF);
		createEAttribute(rbcTypeEClass, RBC_TYPE__TRANSLATE);

		rbTypeEClass = createEClass(RB_TYPE);
		createEAttribute(rbTypeEClass, RB_TYPE__DIR);
		createEAttribute(rbTypeEClass, RB_TYPE__LOC_NOTE);
		createEAttribute(rbTypeEClass, RB_TYPE__LOC_NOTE_REF);
		createEAttribute(rbTypeEClass, RB_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rbTypeEClass, RB_TYPE__TERM);
		createEAttribute(rbTypeEClass, RB_TYPE__TERM_INFO_REF);
		createEAttribute(rbTypeEClass, RB_TYPE__TRANSLATE);

		rpTypeEClass = createEClass(RP_TYPE);
		createEAttribute(rpTypeEClass, RP_TYPE__MIXED);
		createEAttribute(rpTypeEClass, RP_TYPE__DIR);
		createEAttribute(rpTypeEClass, RP_TYPE__LOC_NOTE);
		createEAttribute(rpTypeEClass, RP_TYPE__LOC_NOTE_REF);
		createEAttribute(rpTypeEClass, RP_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rpTypeEClass, RP_TYPE__TERM);
		createEAttribute(rpTypeEClass, RP_TYPE__TERM_INFO_REF);
		createEAttribute(rpTypeEClass, RP_TYPE__TRANSLATE);

		rtcTypeEClass = createEClass(RTC_TYPE);
		createEAttribute(rtcTypeEClass, RTC_TYPE__DIR);
		createEAttribute(rtcTypeEClass, RTC_TYPE__LOC_NOTE);
		createEAttribute(rtcTypeEClass, RTC_TYPE__LOC_NOTE_REF);
		createEAttribute(rtcTypeEClass, RTC_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rtcTypeEClass, RTC_TYPE__TERM);
		createEAttribute(rtcTypeEClass, RTC_TYPE__TERM_INFO_REF);
		createEAttribute(rtcTypeEClass, RTC_TYPE__TRANSLATE);

		rtTypeEClass = createEClass(RT_TYPE);
		createEAttribute(rtTypeEClass, RT_TYPE__DIR);
		createEAttribute(rtTypeEClass, RT_TYPE__LOC_NOTE);
		createEAttribute(rtTypeEClass, RT_TYPE__LOC_NOTE_REF);
		createEAttribute(rtTypeEClass, RT_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rtTypeEClass, RT_TYPE__RBSPAN);
		createEAttribute(rtTypeEClass, RT_TYPE__TERM);
		createEAttribute(rtTypeEClass, RT_TYPE__TERM_INFO_REF);
		createEAttribute(rtTypeEClass, RT_TYPE__TRANSLATE);

		rubyRuleTypeEClass = createEClass(RUBY_RULE_TYPE);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RBC_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RBSPAN_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RP_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RTC_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RT_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__RUBY_POINTER);
		createEAttribute(rubyRuleTypeEClass, RUBY_RULE_TYPE__SELECTOR);

		rubyTextTypeEClass = createEClass(RUBY_TEXT_TYPE);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__MIXED);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__DIR);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__LOC_NOTE);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__LOC_NOTE_REF);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__RBSPAN);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__TERM);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__TERM_INFO_REF);
		createEAttribute(rubyTextTypeEClass, RUBY_TEXT_TYPE__TRANSLATE);

		rubyTypeEClass = createEClass(RUBY_TYPE);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__DIR);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__LOC_NOTE);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__LOC_NOTE_REF);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__LOC_NOTE_TYPE);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__TERM);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__TERM_INFO_REF);
		createEAttribute(rubyTypeEClass, RUBY_TYPE__TRANSLATE);

		rulesTypeEClass = createEClass(RULES_TYPE);
		createEAttribute(rulesTypeEClass, RULES_TYPE__HREF);
		createEAttribute(rulesTypeEClass, RULES_TYPE__TYPE);
		createEAttribute(rulesTypeEClass, RULES_TYPE__VERSION);

		spanTypeEClass = createEClass(SPAN_TYPE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__DIR);
		createEAttribute(spanTypeEClass, SPAN_TYPE__LOC_NOTE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__LOC_NOTE_REF);
		createEAttribute(spanTypeEClass, SPAN_TYPE__LOC_NOTE_TYPE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__TERM);
		createEAttribute(spanTypeEClass, SPAN_TYPE__TERM_INFO_REF);
		createEAttribute(spanTypeEClass, SPAN_TYPE__TRANSLATE);

		termRuleTypeEClass = createEClass(TERM_RULE_TYPE);
		createEAttribute(termRuleTypeEClass, TERM_RULE_TYPE__SELECTOR);
		createEAttribute(termRuleTypeEClass, TERM_RULE_TYPE__TERM);
		createEAttribute(termRuleTypeEClass, TERM_RULE_TYPE__TERM_INFO_POINTER);
		createEAttribute(termRuleTypeEClass, TERM_RULE_TYPE__TERM_INFO_REF);
		createEAttribute(termRuleTypeEClass, TERM_RULE_TYPE__TERM_INFO_REF_POINTER);

		translateRuleTypeEClass = createEClass(TRANSLATE_RULE_TYPE);
		createEAttribute(translateRuleTypeEClass, TRANSLATE_RULE_TYPE__SELECTOR);
		createEAttribute(translateRuleTypeEClass, TRANSLATE_RULE_TYPE__TRANSLATE);

		withinTextRuleTypeEClass = createEClass(WITHIN_TEXT_RULE_TYPE);
		createEAttribute(withinTextRuleTypeEClass, WITHIN_TEXT_RULE_TYPE__SELECTOR);
		createEAttribute(withinTextRuleTypeEClass, WITHIN_TEXT_RULE_TYPE__WITHIN_TEXT);

		// Create enums
		dirTypeEEnum = createEEnum(DIR_TYPE);
		dirType1EEnum = createEEnum(DIR_TYPE1);
		dirType2EEnum = createEEnum(DIR_TYPE2);
		locNoteTypeTypeEEnum = createEEnum(LOC_NOTE_TYPE_TYPE);
		locNoteTypeType1EEnum = createEEnum(LOC_NOTE_TYPE_TYPE1);
		termTypeEEnum = createEEnum(TERM_TYPE);
		termType1EEnum = createEEnum(TERM_TYPE1);
		translateTypeEEnum = createEEnum(TRANSLATE_TYPE);
		translateType1EEnum = createEEnum(TRANSLATE_TYPE1);
		withinTextTypeEEnum = createEEnum(WITHIN_TEXT_TYPE);

		// Create data types
		dirTypeObjectEDataType = createEDataType(DIR_TYPE_OBJECT);
		dirTypeObject1EDataType = createEDataType(DIR_TYPE_OBJECT1);
		dirTypeObject2EDataType = createEDataType(DIR_TYPE_OBJECT2);
		locNoteTypeTypeObjectEDataType = createEDataType(LOC_NOTE_TYPE_TYPE_OBJECT);
		locNoteTypeTypeObject1EDataType = createEDataType(LOC_NOTE_TYPE_TYPE_OBJECT1);
		termTypeObjectEDataType = createEDataType(TERM_TYPE_OBJECT);
		termTypeObject1EDataType = createEDataType(TERM_TYPE_OBJECT1);
		translateTypeObjectEDataType = createEDataType(TRANSLATE_TYPE_OBJECT);
		translateTypeObject1EDataType = createEDataType(TRANSLATE_TYPE_OBJECT1);
		withinTextTypeObjectEDataType = createEDataType(WITHIN_TEXT_TYPE_OBJECT);
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
		XlinkPackage theXlinkPackage = (XlinkPackage)EPackage.Registry.INSTANCE.getEPackage(XlinkPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		locNoteRuleTypeEClass.getESuperTypes().add(this.getItsLocNoteRuleContent());
		locNoteTypeEClass.getESuperTypes().add(this.getItsLocNoteContent());
		rbcTypeEClass.getESuperTypes().add(this.getItsRbcContent());
		rbTypeEClass.getESuperTypes().add(this.getItsRbContent());
		rtcTypeEClass.getESuperTypes().add(this.getItsRtcContent());
		rtTypeEClass.getESuperTypes().add(this.getItsRtContent());
		rubyRuleTypeEClass.getESuperTypes().add(this.getItsRubyRuleContent());
		rubyTypeEClass.getESuperTypes().add(this.getItsRubyContent());
		rulesTypeEClass.getESuperTypes().add(this.getItsRulesContent());
		spanTypeEClass.getESuperTypes().add(this.getItsSpanContent());

		// Initialize classes and features; add operations and parameters
		initEClass(dirRuleTypeEClass, DirRuleType.class, "DirRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirRuleType_Dir(), this.getDirType2(), "dir", null, 1, 1, DirRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, DirRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DirRule(), this.getDirRuleType(), null, "dirRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LangRule(), this.getLangRuleType(), null, "langRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocNote(), this.getLocNoteType(), null, "locNote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_LocNoteRule(), this.getLocNoteRuleType(), null, "locNoteRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rb(), this.getRbType(), null, "rb", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rbc(), this.getRbcType(), null, "rbc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rp(), this.getRpType(), null, "rp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rt(), this.getRtType(), null, "rt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rtc(), this.getRtcType(), null, "rtc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ruby(), this.getRubyType(), null, "ruby", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RubyRule(), this.getRubyRuleType(), null, "rubyRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RubyText(), this.getRubyTextType(), null, "rubyText", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Rules(), this.getRulesType(), null, "rules", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Span(), this.getSpanType(), null, "span", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TermRule(), this.getTermRuleType(), null, "termRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TranslateRule(), this.getTranslateRuleType(), null, "translateRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_WithinTextRule(), this.getWithinTextRuleType(), null, "withinTextRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itsLocNoteContentEClass, ItsLocNoteContent.class, "ItsLocNoteContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItsLocNoteContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ItsLocNoteContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItsLocNoteContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ItsLocNoteContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsLocNoteContent_Ruby(), this.getRubyType(), null, "ruby", null, 0, -1, ItsLocNoteContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsLocNoteContent_Span(), this.getSpanType(), null, "span", null, 0, -1, ItsLocNoteContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itsLocNoteRuleContentEClass, ItsLocNoteRuleContent.class, "ItsLocNoteRuleContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItsLocNoteRuleContent_LocNote(), this.getLocNoteType(), null, "locNote", null, 0, 1, ItsLocNoteRuleContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itsRbcContentEClass, ItsRbcContent.class, "ItsRbcContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItsRbcContent_Rb(), this.getRbType(), null, "rb", null, 1, -1, ItsRbcContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itsRbContentEClass, ItsRbContent.class, "ItsRbContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItsRbContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ItsRbContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRbContent_Span(), this.getSpanType(), null, "span", null, 0, -1, ItsRbContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itsRtcContentEClass, ItsRtcContent.class, "ItsRtcContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItsRtcContent_Rt(), this.getRtType(), null, "rt", null, 1, -1, ItsRtcContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itsRtContentEClass, ItsRtContent.class, "ItsRtContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItsRtContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ItsRtContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRtContent_Span(), this.getSpanType(), null, "span", null, 0, -1, ItsRtContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itsRubyContentEClass, ItsRubyContent.class, "ItsRubyContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItsRubyContent_Rb(), this.getRbType(), null, "rb", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rt(), this.getRtType(), null, "rt", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rp(), this.getRpType(), null, "rp", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rt1(), this.getRtType(), null, "rt1", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rp1(), this.getRpType(), null, "rp1", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rbc(), this.getRbcType(), null, "rbc", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rtc(), this.getRtcType(), null, "rtc", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRubyContent_Rtc1(), this.getRtcType(), null, "rtc1", null, 0, 1, ItsRubyContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itsRubyRuleContentEClass, ItsRubyRuleContent.class, "ItsRubyRuleContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItsRubyRuleContent_RubyText(), this.getRubyTextType(), null, "rubyText", null, 0, 1, ItsRubyRuleContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itsRulesContentEClass, ItsRulesContent.class, "ItsRulesContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItsRulesContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ItsRulesContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_TranslateRule(), this.getTranslateRuleType(), null, "translateRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_LocNoteRule(), this.getLocNoteRuleType(), null, "locNoteRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_TermRule(), this.getTermRuleType(), null, "termRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_DirRule(), this.getDirRuleType(), null, "dirRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_RubyRule(), this.getRubyRuleType(), null, "rubyRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_LangRule(), this.getLangRuleType(), null, "langRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsRulesContent_WithinTextRule(), this.getWithinTextRuleType(), null, "withinTextRule", null, 0, -1, ItsRulesContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(itsSpanContentEClass, ItsSpanContent.class, "ItsSpanContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItsSpanContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ItsSpanContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItsSpanContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ItsSpanContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsSpanContent_Ruby(), this.getRubyType(), null, "ruby", null, 0, -1, ItsSpanContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getItsSpanContent_Span(), this.getSpanType(), null, "span", null, 0, -1, ItsSpanContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(langRuleTypeEClass, LangRuleType.class, "LangRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLangRuleType_LangPointer(), theXMLTypePackage.getString(), "langPointer", null, 1, 1, LangRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLangRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, LangRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locNoteRuleTypeEClass, LocNoteRuleType.class, "LocNoteRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocNoteRuleType_LocNotePointer(), theXMLTypePackage.getString(), "locNotePointer", null, 0, 1, LocNoteRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteRuleType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, LocNoteRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteRuleType_LocNoteRefPointer(), theXMLTypePackage.getString(), "locNoteRefPointer", null, 0, 1, LocNoteRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteRuleType_LocNoteType(), this.getLocNoteTypeType(), "locNoteType", null, 1, 1, LocNoteRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, LocNoteRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locNoteTypeEClass, LocNoteType.class, "LocNoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocNoteType_Dir(), this.getDirType1(), "dir", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_Term(), this.getTermType1(), "term", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocNoteType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, LocNoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbcTypeEClass, RbcType.class, "RbcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRbcType_Dir(), this.getDirType1(), "dir", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_Term(), this.getTermType1(), "term", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbcType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RbcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rbTypeEClass, RbType.class, "RbType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRbType_Dir(), this.getDirType1(), "dir", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_Term(), this.getTermType1(), "term", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRbType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RbType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpTypeEClass, RpType.class, "RpType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRpType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_Dir(), this.getDirType1(), "dir", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_Term(), this.getTermType1(), "term", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRpType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RpType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtcTypeEClass, RtcType.class, "RtcType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtcType_Dir(), this.getDirType1(), "dir", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_Term(), this.getTermType1(), "term", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtcType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RtcType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rtTypeEClass, RtType.class, "RtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRtType_Dir(), this.getDirType1(), "dir", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_Rbspan(), theXMLTypePackage.getString(), "rbspan", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_Term(), this.getTermType1(), "term", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRtType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rubyRuleTypeEClass, RubyRuleType.class, "RubyRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRubyRuleType_RbcPointer(), theXMLTypePackage.getString(), "rbcPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_RbspanPointer(), theXMLTypePackage.getString(), "rbspanPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_RpPointer(), theXMLTypePackage.getString(), "rpPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_RtcPointer(), theXMLTypePackage.getString(), "rtcPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_RtPointer(), theXMLTypePackage.getString(), "rtPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_RubyPointer(), theXMLTypePackage.getString(), "rubyPointer", null, 0, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, RubyRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rubyTextTypeEClass, RubyTextType.class, "RubyTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRubyTextType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_Dir(), this.getDirType1(), "dir", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_Rbspan(), theXMLTypePackage.getString(), "rbspan", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_Term(), this.getTermType1(), "term", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyTextType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RubyTextType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rubyTypeEClass, RubyType.class, "RubyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRubyType_Dir(), this.getDirType1(), "dir", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_Term(), this.getTermType1(), "term", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRubyType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, RubyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rulesTypeEClass, RulesType.class, "RulesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRulesType_Href(), theXMLTypePackage.getAnyURI(), "href", null, 0, 1, RulesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRulesType_Type(), theXlinkPackage.getTypeType(), "type", null, 0, 1, RulesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRulesType_Version(), theXMLTypePackage.getFloat(), "version", null, 1, 1, RulesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanTypeEClass, SpanType.class, "SpanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanType_Dir(), this.getDirType1(), "dir", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_LocNote(), theXMLTypePackage.getString(), "locNote", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_LocNoteRef(), theXMLTypePackage.getAnyURI(), "locNoteRef", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_LocNoteType(), this.getLocNoteTypeType1(), "locNoteType", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Term(), this.getTermType1(), "term", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Translate(), this.getTranslateType1(), "translate", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termRuleTypeEClass, TermRuleType.class, "TermRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, TermRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermRuleType_Term(), this.getTermType(), "term", null, 1, 1, TermRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermRuleType_TermInfoPointer(), theXMLTypePackage.getString(), "termInfoPointer", null, 0, 1, TermRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermRuleType_TermInfoRef(), theXMLTypePackage.getAnyURI(), "termInfoRef", null, 0, 1, TermRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTermRuleType_TermInfoRefPointer(), theXMLTypePackage.getString(), "termInfoRefPointer", null, 0, 1, TermRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(translateRuleTypeEClass, TranslateRuleType.class, "TranslateRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTranslateRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, TranslateRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTranslateRuleType_Translate(), this.getTranslateType(), "translate", null, 1, 1, TranslateRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(withinTextRuleTypeEClass, WithinTextRuleType.class, "WithinTextRuleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWithinTextRuleType_Selector(), theXMLTypePackage.getString(), "selector", null, 1, 1, WithinTextRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWithinTextRuleType_WithinText(), this.getWithinTextType(), "withinText", null, 1, 1, WithinTextRuleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dirTypeEEnum, DirType.class, "DirType");
		addEEnumLiteral(dirTypeEEnum, DirType.LTR);
		addEEnumLiteral(dirTypeEEnum, DirType.RTL);
		addEEnumLiteral(dirTypeEEnum, DirType.LRO);
		addEEnumLiteral(dirTypeEEnum, DirType.RLO);

		initEEnum(dirType1EEnum, DirType1.class, "DirType1");
		addEEnumLiteral(dirType1EEnum, DirType1.LTR);
		addEEnumLiteral(dirType1EEnum, DirType1.RTL);
		addEEnumLiteral(dirType1EEnum, DirType1.LRO);
		addEEnumLiteral(dirType1EEnum, DirType1.RLO);

		initEEnum(dirType2EEnum, DirType2.class, "DirType2");
		addEEnumLiteral(dirType2EEnum, DirType2.LTR);
		addEEnumLiteral(dirType2EEnum, DirType2.RTL);
		addEEnumLiteral(dirType2EEnum, DirType2.LRO);
		addEEnumLiteral(dirType2EEnum, DirType2.RLO);

		initEEnum(locNoteTypeTypeEEnum, LocNoteTypeType.class, "LocNoteTypeType");
		addEEnumLiteral(locNoteTypeTypeEEnum, LocNoteTypeType.ALERT);
		addEEnumLiteral(locNoteTypeTypeEEnum, LocNoteTypeType.DESCRIPTION);

		initEEnum(locNoteTypeType1EEnum, LocNoteTypeType1.class, "LocNoteTypeType1");
		addEEnumLiteral(locNoteTypeType1EEnum, LocNoteTypeType1.ALERT);
		addEEnumLiteral(locNoteTypeType1EEnum, LocNoteTypeType1.DESCRIPTION);

		initEEnum(termTypeEEnum, TermType.class, "TermType");
		addEEnumLiteral(termTypeEEnum, TermType.YES);
		addEEnumLiteral(termTypeEEnum, TermType.NO);

		initEEnum(termType1EEnum, TermType1.class, "TermType1");
		addEEnumLiteral(termType1EEnum, TermType1.YES);
		addEEnumLiteral(termType1EEnum, TermType1.NO);

		initEEnum(translateTypeEEnum, TranslateType.class, "TranslateType");
		addEEnumLiteral(translateTypeEEnum, TranslateType.YES);
		addEEnumLiteral(translateTypeEEnum, TranslateType.NO);

		initEEnum(translateType1EEnum, TranslateType1.class, "TranslateType1");
		addEEnumLiteral(translateType1EEnum, TranslateType1.YES);
		addEEnumLiteral(translateType1EEnum, TranslateType1.NO);

		initEEnum(withinTextTypeEEnum, WithinTextType.class, "WithinTextType");
		addEEnumLiteral(withinTextTypeEEnum, WithinTextType.YES);
		addEEnumLiteral(withinTextTypeEEnum, WithinTextType.NO);
		addEEnumLiteral(withinTextTypeEEnum, WithinTextType.NESTED);

		// Initialize data types
		initEDataType(dirTypeObjectEDataType, DirType1.class, "DirTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dirTypeObject1EDataType, DirType.class, "DirTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dirTypeObject2EDataType, DirType2.class, "DirTypeObject2", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(locNoteTypeTypeObjectEDataType, LocNoteTypeType.class, "LocNoteTypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(locNoteTypeTypeObject1EDataType, LocNoteTypeType1.class, "LocNoteTypeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(termTypeObjectEDataType, TermType.class, "TermTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(termTypeObject1EDataType, TermType1.class, "TermTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(translateTypeObjectEDataType, TranslateType.class, "TranslateTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(translateTypeObject1EDataType, TranslateType1.class, "TranslateTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(withinTextTypeObjectEDataType, WithinTextType.class, "WithinTextTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

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
		  (dirRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dirRule_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getDirRuleType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getDirRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });		
		addAnnotation
		  (dirTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "dir_._1_._type"
		   });						
		addAnnotation
		  (dirType1EEnum, 
		   source, 
		   new String[] {
			 "name", "dir_._2_._type"
		   });						
		addAnnotation
		  (dirType2EEnum, 
		   source, 
		   new String[] {
			 "name", "dir_._type"
		   });						
		addAnnotation
		  (dirTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "dir_._2_._type:Object",
			 "baseType", "dir_._2_._type"
		   });		
		addAnnotation
		  (dirTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "dir_._1_._type:Object",
			 "baseType", "dir_._1_._type"
		   });		
		addAnnotation
		  (dirTypeObject2EDataType, 
		   source, 
		   new String[] {
			 "name", "dir_._type:Object",
			 "baseType", "dir_._type"
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
		  (getDocumentRoot_DirRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dirRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LangRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "langRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locNote",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_LocNoteRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locNoteRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rb",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rbc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rbc",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rt",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rtc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtc",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Ruby(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ruby",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RubyRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rubyRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_RubyText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rubyText",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Rules(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rules",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TermRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "termRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_TranslateRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "translateRule",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_WithinTextRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "withinTextRule",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsLocNoteContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-locNote.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getItsLocNoteContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getItsLocNoteContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getItsLocNoteContent_Ruby(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ruby",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getItsLocNoteContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (itsLocNoteRuleContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-locNoteRule.content",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItsLocNoteRuleContent_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locNote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRbcContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rbc.content",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItsRbcContent_Rb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rb",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRbContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rb.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getItsRbContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getItsRbContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRtcContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rtc.content",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItsRtcContent_Rt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rt",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRtContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rt.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getItsRtContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getItsRtContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRubyContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-ruby.content",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItsRubyContent_Rb(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rb",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rt",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rt1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rt",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rp1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rbc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rbc",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rtc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtc",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getItsRubyContent_Rtc1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rtc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRubyRuleContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rubyRule.content",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getItsRubyRuleContent_RubyText(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rubyText",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itsRulesContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-rules.content",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItsRulesContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_TranslateRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "translateRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_LocNoteRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "locNoteRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_TermRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "termRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_DirRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dirRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_RubyRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "rubyRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_LangRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "langRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getItsRulesContent_WithinTextRule(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "withinTextRule",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (itsSpanContentEClass, 
		   source, 
		   new String[] {
			 "name", "its-span.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getItsSpanContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getItsSpanContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getItsSpanContent_Ruby(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ruby",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getItsSpanContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (langRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "langRule_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getLangRuleType_LangPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "langPointer"
		   });			
		addAnnotation
		  (getLangRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });		
		addAnnotation
		  (locNoteRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "locNoteRule_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLocNoteRuleType_LocNotePointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNotePointer"
		   });			
		addAnnotation
		  (getLocNoteRuleType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getLocNoteRuleType_LocNoteRefPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRefPointer"
		   });			
		addAnnotation
		  (getLocNoteRuleType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getLocNoteRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });		
		addAnnotation
		  (locNoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "locNote_._type",
			 "kind", "mixed"
		   });			
		addAnnotation
		  (getLocNoteType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getLocNoteType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getLocNoteType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getLocNoteType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getLocNoteType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getLocNoteType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getLocNoteType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (locNoteTypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "locNoteType_._type"
		   });				
		addAnnotation
		  (locNoteTypeType1EEnum, 
		   source, 
		   new String[] {
			 "name", "locNoteType_._1_._type"
		   });				
		addAnnotation
		  (locNoteTypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "locNoteType_._type:Object",
			 "baseType", "locNoteType_._type"
		   });		
		addAnnotation
		  (locNoteTypeTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "locNoteType_._1_._type:Object",
			 "baseType", "locNoteType_._1_._type"
		   });		
		addAnnotation
		  (rbcTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rbc_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRbcType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRbcType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRbcType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRbcType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRbcType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRbcType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRbcType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rbTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rb_._type",
			 "kind", "mixed"
		   });			
		addAnnotation
		  (getRbType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRbType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRbType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRbType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRbType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRbType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRbType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rpTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rp_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getRpType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getRpType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRpType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRpType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRpType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRpType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRpType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRpType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rtcTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rtc_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRtcType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRtcType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRtcType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRtcType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRtcType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRtcType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRtcType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rtTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rt_._type",
			 "kind", "mixed"
		   });			
		addAnnotation
		  (getRtType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRtType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRtType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRtType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRtType_Rbspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rbspan"
		   });			
		addAnnotation
		  (getRtType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRtType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRtType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rubyRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rubyRule_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRubyRuleType_RbcPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rbcPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_RbspanPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rbspanPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_RpPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rpPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_RtcPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rtcPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_RtPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rtPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_RubyPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rubyPointer"
		   });			
		addAnnotation
		  (getRubyRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });		
		addAnnotation
		  (rubyTextTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rubyText_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getRubyTextType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });			
		addAnnotation
		  (getRubyTextType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRubyTextType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRubyTextType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRubyTextType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRubyTextType_Rbspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rbspan"
		   });			
		addAnnotation
		  (getRubyTextType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRubyTextType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRubyTextType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rubyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ruby_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRubyType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getRubyType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getRubyType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getRubyType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getRubyType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getRubyType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getRubyType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (rulesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "rules_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getRulesType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getRulesType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "http://www.w3.org/1999/xlink"
		   });			
		addAnnotation
		  (getRulesType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (spanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "span_._type",
			 "kind", "mixed"
		   });			
		addAnnotation
		  (getSpanType_Dir(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "dir"
		   });			
		addAnnotation
		  (getSpanType_LocNote(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNote"
		   });			
		addAnnotation
		  (getSpanType_LocNoteRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteRef"
		   });			
		addAnnotation
		  (getSpanType_LocNoteType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "locNoteType"
		   });			
		addAnnotation
		  (getSpanType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getSpanType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getSpanType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (termRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "termRule_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getTermRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });			
		addAnnotation
		  (getTermRuleType_Term(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "term"
		   });			
		addAnnotation
		  (getTermRuleType_TermInfoPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoPointer"
		   });			
		addAnnotation
		  (getTermRuleType_TermInfoRef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRef"
		   });			
		addAnnotation
		  (getTermRuleType_TermInfoRefPointer(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "termInfoRefPointer"
		   });		
		addAnnotation
		  (termTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "term_._type"
		   });				
		addAnnotation
		  (termType1EEnum, 
		   source, 
		   new String[] {
			 "name", "term_._1_._type"
		   });				
		addAnnotation
		  (termTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "term_._type:Object",
			 "baseType", "term_._type"
		   });		
		addAnnotation
		  (termTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "term_._1_._type:Object",
			 "baseType", "term_._1_._type"
		   });		
		addAnnotation
		  (translateRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "translateRule_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getTranslateRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });			
		addAnnotation
		  (getTranslateRuleType_Translate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "translate"
		   });		
		addAnnotation
		  (translateTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "translate_._type"
		   });				
		addAnnotation
		  (translateType1EEnum, 
		   source, 
		   new String[] {
			 "name", "translate_._1_._type"
		   });				
		addAnnotation
		  (translateTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "translate_._type:Object",
			 "baseType", "translate_._type"
		   });		
		addAnnotation
		  (translateTypeObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "translate_._1_._type:Object",
			 "baseType", "translate_._1_._type"
		   });		
		addAnnotation
		  (withinTextRuleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "withinTextRule_._type",
			 "kind", "empty"
		   });			
		addAnnotation
		  (getWithinTextRuleType_Selector(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "selector"
		   });			
		addAnnotation
		  (getWithinTextRuleType_WithinText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "withinText"
		   });		
		addAnnotation
		  (withinTextTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "withinText_._type"
		   });					
		addAnnotation
		  (withinTextTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "withinText_._type:Object",
			 "baseType", "withinText_._type"
		   });
	}

} //ItsPackageImpl
