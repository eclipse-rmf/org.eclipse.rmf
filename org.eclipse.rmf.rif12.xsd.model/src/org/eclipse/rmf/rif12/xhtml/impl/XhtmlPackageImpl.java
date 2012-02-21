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

package org.eclipse.rmf.rif12.xhtml.impl;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.rif12.xhtml.AContent;
import org.eclipse.rmf.rif12.xhtml.AType;
import org.eclipse.rmf.rif12.xhtml.AbbrType;
import org.eclipse.rmf.rif12.xhtml.AcronymType;
import org.eclipse.rmf.rif12.xhtml.AddressType;
import org.eclipse.rmf.rif12.xhtml.AlignType;
import org.eclipse.rmf.rif12.xhtml.BType;
import org.eclipse.rmf.rif12.xhtml.BigType;
import org.eclipse.rmf.rif12.xhtml.Block;
import org.eclipse.rmf.rif12.xhtml.BlockquoteType;
import org.eclipse.rmf.rif12.xhtml.BodyType;
import org.eclipse.rmf.rif12.xhtml.BrType;
import org.eclipse.rmf.rif12.xhtml.CaptionType;
import org.eclipse.rmf.rif12.xhtml.CiteType;
import org.eclipse.rmf.rif12.xhtml.CodeType;
import org.eclipse.rmf.rif12.xhtml.ColType;
import org.eclipse.rmf.rif12.xhtml.ColgroupType;
import org.eclipse.rmf.rif12.xhtml.DdType;
import org.eclipse.rmf.rif12.xhtml.DeclareType;
import org.eclipse.rmf.rif12.xhtml.DelType;
import org.eclipse.rmf.rif12.xhtml.DfnType;
import org.eclipse.rmf.rif12.xhtml.DivType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.DocumentRoot;
import org.eclipse.rmf.rif12.xhtml.DtType;
import org.eclipse.rmf.rif12.xhtml.EmType;
import org.eclipse.rmf.rif12.xhtml.Flow;
import org.eclipse.rmf.rif12.xhtml.FormContent;
import org.eclipse.rmf.rif12.xhtml.H1Type;
import org.eclipse.rmf.rif12.xhtml.H2Type;
import org.eclipse.rmf.rif12.xhtml.H3Type;
import org.eclipse.rmf.rif12.xhtml.H4Type;
import org.eclipse.rmf.rif12.xhtml.H5Type;
import org.eclipse.rmf.rif12.xhtml.H6Type;
import org.eclipse.rmf.rif12.xhtml.HrType;
import org.eclipse.rmf.rif12.xhtml.HtmlType;
import org.eclipse.rmf.rif12.xhtml.IType;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.Inline;
import org.eclipse.rmf.rif12.xhtml.InsType;
import org.eclipse.rmf.rif12.xhtml.IsmapType;
import org.eclipse.rmf.rif12.xhtml.KbdType;
import org.eclipse.rmf.rif12.xhtml.LiType;
import org.eclipse.rmf.rif12.xhtml.ObjectType;
import org.eclipse.rmf.rif12.xhtml.OlType;
import org.eclipse.rmf.rif12.xhtml.PType;
import org.eclipse.rmf.rif12.xhtml.ParamType;
import org.eclipse.rmf.rif12.xhtml.PreContent;
import org.eclipse.rmf.rif12.xhtml.PreType;
import org.eclipse.rmf.rif12.xhtml.QType;
import org.eclipse.rmf.rif12.xhtml.SampType;
import org.eclipse.rmf.rif12.xhtml.Scope;
import org.eclipse.rmf.rif12.xhtml.Shape;
import org.eclipse.rmf.rif12.xhtml.SmallType;
import org.eclipse.rmf.rif12.xhtml.SpanType;
import org.eclipse.rmf.rif12.xhtml.StrikeType;
import org.eclipse.rmf.rif12.xhtml.StrongType;
import org.eclipse.rmf.rif12.xhtml.SubType;
import org.eclipse.rmf.rif12.xhtml.SupType;
import org.eclipse.rmf.rif12.xhtml.TableType;
import org.eclipse.rmf.rif12.xhtml.TbodyType;
import org.eclipse.rmf.rif12.xhtml.TdType;
import org.eclipse.rmf.rif12.xhtml.TfootType;
import org.eclipse.rmf.rif12.xhtml.ThType;
import org.eclipse.rmf.rif12.xhtml.TheadType;
import org.eclipse.rmf.rif12.xhtml.TrType;
import org.eclipse.rmf.rif12.xhtml.TtType;
import org.eclipse.rmf.rif12.xhtml.UType;
import org.eclipse.rmf.rif12.xhtml.UlType;
import org.eclipse.rmf.rif12.xhtml.ValignType;
import org.eclipse.rmf.rif12.xhtml.ValuetypeType;
import org.eclipse.rmf.rif12.xhtml.VarType;
import org.eclipse.rmf.rif12.xhtml.XhtmlFactory;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;
import org.eclipse.rmf.rif12.xhtml.util.XhtmlValidator;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XhtmlPackageImpl extends EPackageImpl implements XhtmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abbrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acronymTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockquoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass captionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dfnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dlTypeEClass = null;

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
	private EClass dtTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h3TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h4TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h5TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass h6TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass htmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kbdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass liTypeEClass = null;

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
	private EClass olTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smallTypeEClass = null;

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
	private EClass strikeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tfootTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum declareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ismapTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valuetypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charsetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charsetsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType contentTypesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType coordsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datetimeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType declareTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ismapTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType languageCodeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linkTypesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiLengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pixelsEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scriptEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType shapeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType styleSheetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tabindexNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriListEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valignTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valuetypeTypeObjectEDataType = null;

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
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XhtmlPackageImpl() {
		super(eNS_URI, XhtmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XhtmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XhtmlPackage init() {
		if (isInited) return (XhtmlPackage)EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI);

		// Obtain or create and register package
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof XhtmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new XhtmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXhtmlPackage.createPackageContents();

		// Initialize created meta-data
		theXhtmlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theXhtmlPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return XhtmlValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theXhtmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XhtmlPackage.eNS_URI, theXhtmlPackage);
		return theXhtmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbbrType() {
		return abbrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbrType_Class() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbrType_Id() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbrType_Style() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbbrType_Title() {
		return (EAttribute)abbrTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAContent() {
		return aContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAContent_Mixed() {
		return (EAttribute)aContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAContent_Group() {
		return (EAttribute)aContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Br() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Span() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Object() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Img() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Tt() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_I() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_B() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Big() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Small() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_U() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Strike() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Em() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Strong() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Dfn() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Code() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Q() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Samp() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Kbd() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Var() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Cite() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Abbr() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Acronym() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Sub() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Sup() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Ins() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAContent_Del() {
		return (EReference)aContentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcronymType() {
		return acronymTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcronymType_Class() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcronymType_Id() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcronymType_Style() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcronymType_Title() {
		return (EAttribute)acronymTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Class() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Id() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Style() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Title() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAType() {
		return aTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Charset() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Class() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Coords() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Href() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Hreflang() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Id() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Name() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Rel() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Rev() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Shape() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Style() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Title() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAType_Type() {
		return (EAttribute)aTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBigType() {
		return bigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigType_Class() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigType_Id() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigType_Style() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBigType_Title() {
		return (EAttribute)bigTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlock_Group() {
		return (EAttribute)blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_P() {
		return (EReference)blockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H1() {
		return (EReference)blockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H2() {
		return (EReference)blockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H3() {
		return (EReference)blockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H4() {
		return (EReference)blockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H5() {
		return (EReference)blockEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_H6() {
		return (EReference)blockEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Div() {
		return (EReference)blockEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Ul() {
		return (EReference)blockEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Ol() {
		return (EReference)blockEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Dl() {
		return (EReference)blockEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Pre() {
		return (EReference)blockEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Hr() {
		return (EReference)blockEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Blockquote() {
		return (EReference)blockEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Address() {
		return (EReference)blockEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Table() {
		return (EReference)blockEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Ins() {
		return (EReference)blockEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Del() {
		return (EReference)blockEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockquoteType() {
		return blockquoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquoteType_Cite() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquoteType_Class() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquoteType_Id() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquoteType_Style() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlockquoteType_Title() {
		return (EAttribute)blockquoteTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyType() {
		return bodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyType_Class() {
		return (EAttribute)bodyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyType_Id() {
		return (EAttribute)bodyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyType_Style() {
		return (EAttribute)bodyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBodyType_Title() {
		return (EAttribute)bodyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrType() {
		return brTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrType_Class() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrType_Id() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrType_Style() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrType_Title() {
		return (EAttribute)brTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBType() {
		return bTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBType_Class() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBType_Id() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBType_Style() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBType_Title() {
		return (EAttribute)bTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCaptionType() {
		return captionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Class() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Id() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Style() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCaptionType_Title() {
		return (EAttribute)captionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCiteType() {
		return citeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiteType_Class() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiteType_Id() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiteType_Style() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCiteType_Title() {
		return (EAttribute)citeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeType() {
		return codeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_Class() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_Id() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_Style() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeType_Title() {
		return (EAttribute)codeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColgroupType() {
		return colgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColgroupType_Col() {
		return (EReference)colgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Align() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Char() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Charoff() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Class() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Id() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Span() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Style() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Title() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Valign() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColgroupType_Width() {
		return (EAttribute)colgroupTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColType() {
		return colTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Align() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Char() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Charoff() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Class() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Id() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Span() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Style() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Title() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Valign() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColType_Width() {
		return (EAttribute)colTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDdType() {
		return ddTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdType_Class() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdType_Id() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdType_Style() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDdType_Title() {
		return (EAttribute)ddTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDelType() {
		return delTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Cite1() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Class() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Datetime() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Id() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Style() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDelType_Title() {
		return (EAttribute)delTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDfnType() {
		return dfnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDfnType_Class() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDfnType_Id() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDfnType_Style() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDfnType_Title() {
		return (EAttribute)dfnTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDivType() {
		return divTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivType_Class() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivType_Id() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivType_Style() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDivType_Title() {
		return (EAttribute)divTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDlType() {
		return dlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDlType_Group() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDlType_Dt() {
		return (EReference)dlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDlType_Dd() {
		return (EReference)dlTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDlType_Class() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDlType_Id() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDlType_Style() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDlType_Title() {
		return (EAttribute)dlTypeEClass.getEStructuralFeatures().get(6);
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
	public EReference getDocumentRoot_A() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Abbr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Acronym() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_B() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Big() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Blockquote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Body() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Br() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Caption() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cite() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Code() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Col() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Colgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dd() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Del() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dfn() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Div() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Dt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Em() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H1() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H2() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H3() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H4() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H5() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_H6() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Hr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Html() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_I() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Img() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ins() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Kbd() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Li() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Object() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ol() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_P() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Param() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Pre() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Q() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Samp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Small() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Span() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Strike() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Strong() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sub() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Sup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Table() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tbody() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Td() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tfoot() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Th() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Thead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_U() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ul() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Var() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDtType() {
		return dtTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDtType_Class() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDtType_Id() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDtType_Style() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDtType_Title() {
		return (EAttribute)dtTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmType() {
		return emTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmType_Class() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmType_Id() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmType_Style() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmType_Title() {
		return (EAttribute)emTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Mixed() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Group() {
		return (EAttribute)flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_P() {
		return (EReference)flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H1() {
		return (EReference)flowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H2() {
		return (EReference)flowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H3() {
		return (EReference)flowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H4() {
		return (EReference)flowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H5() {
		return (EReference)flowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_H6() {
		return (EReference)flowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Div() {
		return (EReference)flowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Ul() {
		return (EReference)flowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Ol() {
		return (EReference)flowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Dl() {
		return (EReference)flowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Pre() {
		return (EReference)flowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Hr() {
		return (EReference)flowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Blockquote() {
		return (EReference)flowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Address() {
		return (EReference)flowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Table() {
		return (EReference)flowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_A() {
		return (EReference)flowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Br() {
		return (EReference)flowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Span() {
		return (EReference)flowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Object() {
		return (EReference)flowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Img() {
		return (EReference)flowEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Tt() {
		return (EReference)flowEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_I() {
		return (EReference)flowEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_B() {
		return (EReference)flowEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Big() {
		return (EReference)flowEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Small() {
		return (EReference)flowEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_U() {
		return (EReference)flowEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Strike() {
		return (EReference)flowEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Em() {
		return (EReference)flowEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Strong() {
		return (EReference)flowEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Dfn() {
		return (EReference)flowEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Code() {
		return (EReference)flowEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Q() {
		return (EReference)flowEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Samp() {
		return (EReference)flowEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Kbd() {
		return (EReference)flowEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Var() {
		return (EReference)flowEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Cite() {
		return (EReference)flowEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Abbr() {
		return (EReference)flowEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Acronym() {
		return (EReference)flowEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Sub() {
		return (EReference)flowEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Sup() {
		return (EReference)flowEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Ins() {
		return (EReference)flowEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Del() {
		return (EReference)flowEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormContent() {
		return formContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormContent_Group() {
		return (EAttribute)formContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_P() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H1() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H2() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H3() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H4() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H5() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_H6() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Div() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Ul() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Ol() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Dl() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Pre() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Hr() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Blockquote() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Address() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Table() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Ins() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormContent_Del() {
		return (EReference)formContentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH1Type() {
		return h1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1Type_Class() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1Type_Id() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1Type_Style() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH1Type_Title() {
		return (EAttribute)h1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH2Type() {
		return h2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH2Type_Class() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH2Type_Id() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH2Type_Style() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH2Type_Title() {
		return (EAttribute)h2TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH3Type() {
		return h3TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH3Type_Class() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH3Type_Id() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH3Type_Style() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH3Type_Title() {
		return (EAttribute)h3TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH4Type() {
		return h4TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH4Type_Class() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH4Type_Id() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH4Type_Style() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH4Type_Title() {
		return (EAttribute)h4TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH5Type() {
		return h5TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH5Type_Class() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH5Type_Id() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH5Type_Style() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH5Type_Title() {
		return (EAttribute)h5TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getH6Type() {
		return h6TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH6Type_Class() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH6Type_Id() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH6Type_Style() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getH6Type_Title() {
		return (EAttribute)h6TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHrType() {
		return hrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHrType_Class() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHrType_Id() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHrType_Style() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHrType_Title() {
		return (EAttribute)hrTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHtmlType() {
		return htmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHtmlType_Body() {
		return (EReference)htmlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHtmlType_Id() {
		return (EAttribute)htmlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImgType() {
		return imgTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Alt() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Class() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Height() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Id() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Ismap() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Longdesc() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Src() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Style() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Title() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Usemap() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImgType_Width() {
		return (EAttribute)imgTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInline() {
		return inlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInline_Mixed() {
		return (EAttribute)inlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInline_Group() {
		return (EAttribute)inlineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_A() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Br() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Span() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Object() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Img() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Tt() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_I() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_B() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Big() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Small() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_U() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Strike() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Em() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Strong() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Dfn() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Code() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Q() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Samp() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Kbd() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Var() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Cite() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Abbr() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Acronym() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Sub() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Sup() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Ins() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInline_Del() {
		return (EReference)inlineEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsType() {
		return insTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Cite1() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Class() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Datetime() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Id() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Style() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsType_Title() {
		return (EAttribute)insTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIType() {
		return iTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIType_Class() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIType_Id() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIType_Style() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIType_Title() {
		return (EAttribute)iTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKbdType() {
		return kbdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKbdType_Class() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKbdType_Id() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKbdType_Style() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKbdType_Title() {
		return (EAttribute)kbdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiType() {
		return liTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiType_Class() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiType_Id() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiType_Style() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiType_Title() {
		return (EAttribute)liTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Mixed() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Group() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Param() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_P() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H1() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H2() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H3() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H4() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H5() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_H6() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Div() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Ul() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Ol() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Dl() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Pre() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Hr() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Blockquote() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Address() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Table() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_A() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Br() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Span() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Object() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Img() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Tt() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_I() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_B() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Big() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Small() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_U() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Strike() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Em() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Strong() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Dfn() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Code() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Q() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Samp() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Kbd() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Var() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Cite() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Abbr() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Acronym() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Sub() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Sup() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Ins() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectType_Del() {
		return (EReference)objectTypeEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Archive() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Class() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Classid() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Codebase() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Codetype() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Data() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Declare() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Height() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Id() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Name() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Standby() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Style() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Tabindex() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Title() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Type() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Usemap() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectType_Width() {
		return (EAttribute)objectTypeEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOlType() {
		return olTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOlType_Li() {
		return (EReference)olTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlType_Class() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlType_Id() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlType_Style() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOlType_Title() {
		return (EAttribute)olTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType() {
		return paramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Id() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Name() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Type() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Value() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamType_Valuetype() {
		return (EAttribute)paramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreContent() {
		return preContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreContent_Mixed() {
		return (EAttribute)preContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreContent_Group() {
		return (EAttribute)preContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_A() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Tt() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_I() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_B() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Big() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Small() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_U() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Strike() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Em() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Strong() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Dfn() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Code() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Q() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Samp() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Kbd() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Var() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Cite() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Abbr() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Acronym() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Sub() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Sup() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Br() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Span() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Ins() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreContent_Del() {
		return (EReference)preContentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreType() {
		return preTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreType_Class() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreType_Id() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreType_Style() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreType_Title() {
		return (EAttribute)preTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPType() {
		return pTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Class() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Id() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Style() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPType_Title() {
		return (EAttribute)pTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQType() {
		return qTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQType_Cite1() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQType_Class() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQType_Id() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQType_Style() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQType_Title() {
		return (EAttribute)qTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSampType() {
		return sampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampType_Class() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampType_Id() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampType_Style() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSampType_Title() {
		return (EAttribute)sampTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmallType() {
		return smallTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallType_Class() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallType_Id() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallType_Style() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSmallType_Title() {
		return (EAttribute)smallTypeEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getSpanType_Class() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Id() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Style() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpanType_Title() {
		return (EAttribute)spanTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrikeType() {
		return strikeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeType_Class() {
		return (EAttribute)strikeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeType_Id() {
		return (EAttribute)strikeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeType_Style() {
		return (EAttribute)strikeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrikeType_Title() {
		return (EAttribute)strikeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrongType() {
		return strongTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrongType_Class() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrongType_Id() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrongType_Style() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStrongType_Title() {
		return (EAttribute)strongTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubType() {
		return subTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubType_Class() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubType_Id() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubType_Style() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubType_Title() {
		return (EAttribute)subTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupType() {
		return supTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupType_Class() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupType_Id() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupType_Style() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupType_Title() {
		return (EAttribute)supTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Caption() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Col() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Colgroup() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Thead() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Tfoot() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Tbody() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Tr() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Border() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Cellpadding() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Cellspacing() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Class() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Style() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Summary() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Title() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Width() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTbodyType() {
		return tbodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTbodyType_Tr() {
		return (EReference)tbodyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Align() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Char() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Charoff() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Class() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Id() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Style() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Title() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTbodyType_Valign() {
		return (EAttribute)tbodyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTdType() {
		return tdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Abbr1() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Align() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Axis() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Char() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Charoff() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Class() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Colspan() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Headers() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Id() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Rowspan() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Scope() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Style() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Title() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTdType_Valign() {
		return (EAttribute)tdTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTfootType() {
		return tfootTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTfootType_Tr() {
		return (EReference)tfootTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Align() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Char() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Charoff() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Class() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Id() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Style() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Title() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTfootType_Valign() {
		return (EAttribute)tfootTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheadType() {
		return theadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheadType_Tr() {
		return (EReference)theadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Align() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Char() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Charoff() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Class() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Id() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Style() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Title() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTheadType_Valign() {
		return (EAttribute)theadTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThType() {
		return thTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Abbr1() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Align() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Axis() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Char() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Charoff() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Class() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Colspan() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Headers() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Id() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Rowspan() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Scope() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Style() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Title() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThType_Valign() {
		return (EAttribute)thTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrType() {
		return trTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Group() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrType_Th() {
		return (EReference)trTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrType_Td() {
		return (EReference)trTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Align() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Char() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Charoff() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Class() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Id() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Style() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Title() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrType_Valign() {
		return (EAttribute)trTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTtType() {
		return ttTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtType_Class() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtType_Id() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtType_Style() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTtType_Title() {
		return (EAttribute)ttTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUlType() {
		return ulTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUlType_Li() {
		return (EReference)ulTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlType_Class() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlType_Id() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlType_Style() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlType_Title() {
		return (EAttribute)ulTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUType() {
		return uTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUType_Class() {
		return (EAttribute)uTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUType_Id() {
		return (EAttribute)uTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUType_Style() {
		return (EAttribute)uTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUType_Title() {
		return (EAttribute)uTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarType() {
		return varTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Class() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Id() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Style() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarType_Title() {
		return (EAttribute)varTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignType() {
		return alignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeclareType() {
		return declareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIsmapType() {
		return ismapTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShape() {
		return shapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValignType() {
		return valignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValuetypeType() {
		return valuetypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlignTypeObject() {
		return alignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharacter() {
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharset() {
		return charsetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharsets() {
		return charsetsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentType() {
		return contentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContentTypes() {
		return contentTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCoords() {
		return coordsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDatetime() {
		return datetimeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDeclareTypeObject() {
		return declareTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIsmapTypeObject() {
		return ismapTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLanguageCode() {
		return languageCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLength() {
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLinkTypes() {
		return linkTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiLength() {
		return multiLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPixels() {
		return pixelsEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScopeObject() {
		return scopeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScript() {
		return scriptEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getShapeObject() {
		return shapeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getStyleSheet() {
		return styleSheetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTabindexNumber() {
		return tabindexNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getText() {
		return textEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUriList() {
		return uriListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValignTypeObject() {
		return valignTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValuetypeTypeObject() {
		return valuetypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlFactory getXhtmlFactory() {
		return (XhtmlFactory)getEFactoryInstance();
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
		abbrTypeEClass = createEClass(ABBR_TYPE);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__CLASS);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__ID);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__STYLE);
		createEAttribute(abbrTypeEClass, ABBR_TYPE__TITLE);

		aContentEClass = createEClass(ACONTENT);
		createEAttribute(aContentEClass, ACONTENT__MIXED);
		createEAttribute(aContentEClass, ACONTENT__GROUP);
		createEReference(aContentEClass, ACONTENT__BR);
		createEReference(aContentEClass, ACONTENT__SPAN);
		createEReference(aContentEClass, ACONTENT__OBJECT);
		createEReference(aContentEClass, ACONTENT__IMG);
		createEReference(aContentEClass, ACONTENT__TT);
		createEReference(aContentEClass, ACONTENT__I);
		createEReference(aContentEClass, ACONTENT__B);
		createEReference(aContentEClass, ACONTENT__BIG);
		createEReference(aContentEClass, ACONTENT__SMALL);
		createEReference(aContentEClass, ACONTENT__U);
		createEReference(aContentEClass, ACONTENT__STRIKE);
		createEReference(aContentEClass, ACONTENT__EM);
		createEReference(aContentEClass, ACONTENT__STRONG);
		createEReference(aContentEClass, ACONTENT__DFN);
		createEReference(aContentEClass, ACONTENT__CODE);
		createEReference(aContentEClass, ACONTENT__Q);
		createEReference(aContentEClass, ACONTENT__SAMP);
		createEReference(aContentEClass, ACONTENT__KBD);
		createEReference(aContentEClass, ACONTENT__VAR);
		createEReference(aContentEClass, ACONTENT__CITE);
		createEReference(aContentEClass, ACONTENT__ABBR);
		createEReference(aContentEClass, ACONTENT__ACRONYM);
		createEReference(aContentEClass, ACONTENT__SUB);
		createEReference(aContentEClass, ACONTENT__SUP);
		createEReference(aContentEClass, ACONTENT__INS);
		createEReference(aContentEClass, ACONTENT__DEL);

		acronymTypeEClass = createEClass(ACRONYM_TYPE);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__CLASS);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__ID);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__STYLE);
		createEAttribute(acronymTypeEClass, ACRONYM_TYPE__TITLE);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__CLASS);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__ID);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__STYLE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__TITLE);

		aTypeEClass = createEClass(ATYPE);
		createEAttribute(aTypeEClass, ATYPE__CHARSET);
		createEAttribute(aTypeEClass, ATYPE__CLASS);
		createEAttribute(aTypeEClass, ATYPE__COORDS);
		createEAttribute(aTypeEClass, ATYPE__HREF);
		createEAttribute(aTypeEClass, ATYPE__HREFLANG);
		createEAttribute(aTypeEClass, ATYPE__ID);
		createEAttribute(aTypeEClass, ATYPE__NAME);
		createEAttribute(aTypeEClass, ATYPE__REL);
		createEAttribute(aTypeEClass, ATYPE__REV);
		createEAttribute(aTypeEClass, ATYPE__SHAPE);
		createEAttribute(aTypeEClass, ATYPE__STYLE);
		createEAttribute(aTypeEClass, ATYPE__TITLE);
		createEAttribute(aTypeEClass, ATYPE__TYPE);

		bigTypeEClass = createEClass(BIG_TYPE);
		createEAttribute(bigTypeEClass, BIG_TYPE__CLASS);
		createEAttribute(bigTypeEClass, BIG_TYPE__ID);
		createEAttribute(bigTypeEClass, BIG_TYPE__STYLE);
		createEAttribute(bigTypeEClass, BIG_TYPE__TITLE);

		blockEClass = createEClass(BLOCK);
		createEAttribute(blockEClass, BLOCK__GROUP);
		createEReference(blockEClass, BLOCK__P);
		createEReference(blockEClass, BLOCK__H1);
		createEReference(blockEClass, BLOCK__H2);
		createEReference(blockEClass, BLOCK__H3);
		createEReference(blockEClass, BLOCK__H4);
		createEReference(blockEClass, BLOCK__H5);
		createEReference(blockEClass, BLOCK__H6);
		createEReference(blockEClass, BLOCK__DIV);
		createEReference(blockEClass, BLOCK__UL);
		createEReference(blockEClass, BLOCK__OL);
		createEReference(blockEClass, BLOCK__DL);
		createEReference(blockEClass, BLOCK__PRE);
		createEReference(blockEClass, BLOCK__HR);
		createEReference(blockEClass, BLOCK__BLOCKQUOTE);
		createEReference(blockEClass, BLOCK__ADDRESS);
		createEReference(blockEClass, BLOCK__TABLE);
		createEReference(blockEClass, BLOCK__INS);
		createEReference(blockEClass, BLOCK__DEL);

		blockquoteTypeEClass = createEClass(BLOCKQUOTE_TYPE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__CITE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__CLASS);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__ID);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__STYLE);
		createEAttribute(blockquoteTypeEClass, BLOCKQUOTE_TYPE__TITLE);

		bodyTypeEClass = createEClass(BODY_TYPE);
		createEAttribute(bodyTypeEClass, BODY_TYPE__CLASS);
		createEAttribute(bodyTypeEClass, BODY_TYPE__ID);
		createEAttribute(bodyTypeEClass, BODY_TYPE__STYLE);
		createEAttribute(bodyTypeEClass, BODY_TYPE__TITLE);

		brTypeEClass = createEClass(BR_TYPE);
		createEAttribute(brTypeEClass, BR_TYPE__CLASS);
		createEAttribute(brTypeEClass, BR_TYPE__ID);
		createEAttribute(brTypeEClass, BR_TYPE__STYLE);
		createEAttribute(brTypeEClass, BR_TYPE__TITLE);

		bTypeEClass = createEClass(BTYPE);
		createEAttribute(bTypeEClass, BTYPE__CLASS);
		createEAttribute(bTypeEClass, BTYPE__ID);
		createEAttribute(bTypeEClass, BTYPE__STYLE);
		createEAttribute(bTypeEClass, BTYPE__TITLE);

		captionTypeEClass = createEClass(CAPTION_TYPE);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__CLASS);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__ID);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__STYLE);
		createEAttribute(captionTypeEClass, CAPTION_TYPE__TITLE);

		citeTypeEClass = createEClass(CITE_TYPE);
		createEAttribute(citeTypeEClass, CITE_TYPE__CLASS);
		createEAttribute(citeTypeEClass, CITE_TYPE__ID);
		createEAttribute(citeTypeEClass, CITE_TYPE__STYLE);
		createEAttribute(citeTypeEClass, CITE_TYPE__TITLE);

		codeTypeEClass = createEClass(CODE_TYPE);
		createEAttribute(codeTypeEClass, CODE_TYPE__CLASS);
		createEAttribute(codeTypeEClass, CODE_TYPE__ID);
		createEAttribute(codeTypeEClass, CODE_TYPE__STYLE);
		createEAttribute(codeTypeEClass, CODE_TYPE__TITLE);

		colgroupTypeEClass = createEClass(COLGROUP_TYPE);
		createEReference(colgroupTypeEClass, COLGROUP_TYPE__COL);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__ALIGN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CHAR);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CHAROFF);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__CLASS);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__ID);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__SPAN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__STYLE);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__TITLE);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__VALIGN);
		createEAttribute(colgroupTypeEClass, COLGROUP_TYPE__WIDTH);

		colTypeEClass = createEClass(COL_TYPE);
		createEAttribute(colTypeEClass, COL_TYPE__ALIGN);
		createEAttribute(colTypeEClass, COL_TYPE__CHAR);
		createEAttribute(colTypeEClass, COL_TYPE__CHAROFF);
		createEAttribute(colTypeEClass, COL_TYPE__CLASS);
		createEAttribute(colTypeEClass, COL_TYPE__ID);
		createEAttribute(colTypeEClass, COL_TYPE__SPAN);
		createEAttribute(colTypeEClass, COL_TYPE__STYLE);
		createEAttribute(colTypeEClass, COL_TYPE__TITLE);
		createEAttribute(colTypeEClass, COL_TYPE__VALIGN);
		createEAttribute(colTypeEClass, COL_TYPE__WIDTH);

		ddTypeEClass = createEClass(DD_TYPE);
		createEAttribute(ddTypeEClass, DD_TYPE__CLASS);
		createEAttribute(ddTypeEClass, DD_TYPE__ID);
		createEAttribute(ddTypeEClass, DD_TYPE__STYLE);
		createEAttribute(ddTypeEClass, DD_TYPE__TITLE);

		delTypeEClass = createEClass(DEL_TYPE);
		createEAttribute(delTypeEClass, DEL_TYPE__CITE1);
		createEAttribute(delTypeEClass, DEL_TYPE__CLASS);
		createEAttribute(delTypeEClass, DEL_TYPE__DATETIME);
		createEAttribute(delTypeEClass, DEL_TYPE__ID);
		createEAttribute(delTypeEClass, DEL_TYPE__STYLE);
		createEAttribute(delTypeEClass, DEL_TYPE__TITLE);

		dfnTypeEClass = createEClass(DFN_TYPE);
		createEAttribute(dfnTypeEClass, DFN_TYPE__CLASS);
		createEAttribute(dfnTypeEClass, DFN_TYPE__ID);
		createEAttribute(dfnTypeEClass, DFN_TYPE__STYLE);
		createEAttribute(dfnTypeEClass, DFN_TYPE__TITLE);

		divTypeEClass = createEClass(DIV_TYPE);
		createEAttribute(divTypeEClass, DIV_TYPE__CLASS);
		createEAttribute(divTypeEClass, DIV_TYPE__ID);
		createEAttribute(divTypeEClass, DIV_TYPE__STYLE);
		createEAttribute(divTypeEClass, DIV_TYPE__TITLE);

		dlTypeEClass = createEClass(DL_TYPE);
		createEAttribute(dlTypeEClass, DL_TYPE__GROUP);
		createEReference(dlTypeEClass, DL_TYPE__DT);
		createEReference(dlTypeEClass, DL_TYPE__DD);
		createEAttribute(dlTypeEClass, DL_TYPE__CLASS);
		createEAttribute(dlTypeEClass, DL_TYPE__ID);
		createEAttribute(dlTypeEClass, DL_TYPE__STYLE);
		createEAttribute(dlTypeEClass, DL_TYPE__TITLE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__A);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABBR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ACRONYM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__B);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BIG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BLOCKQUOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CAPTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CITE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CODE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLGROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DFN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIV);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H1);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H2);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H3);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H4);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H5);
		createEReference(documentRootEClass, DOCUMENT_ROOT__H6);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HTML);
		createEReference(documentRootEClass, DOCUMENT_ROOT__I);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KBD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LI);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__P);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__Q);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SAMP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SMALL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SPAN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRIKE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STRONG);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUB);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TBODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TFOOT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TH);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THEAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__U);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__VAR);

		dtTypeEClass = createEClass(DT_TYPE);
		createEAttribute(dtTypeEClass, DT_TYPE__CLASS);
		createEAttribute(dtTypeEClass, DT_TYPE__ID);
		createEAttribute(dtTypeEClass, DT_TYPE__STYLE);
		createEAttribute(dtTypeEClass, DT_TYPE__TITLE);

		emTypeEClass = createEClass(EM_TYPE);
		createEAttribute(emTypeEClass, EM_TYPE__CLASS);
		createEAttribute(emTypeEClass, EM_TYPE__ID);
		createEAttribute(emTypeEClass, EM_TYPE__STYLE);
		createEAttribute(emTypeEClass, EM_TYPE__TITLE);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__MIXED);
		createEAttribute(flowEClass, FLOW__GROUP);
		createEReference(flowEClass, FLOW__P);
		createEReference(flowEClass, FLOW__H1);
		createEReference(flowEClass, FLOW__H2);
		createEReference(flowEClass, FLOW__H3);
		createEReference(flowEClass, FLOW__H4);
		createEReference(flowEClass, FLOW__H5);
		createEReference(flowEClass, FLOW__H6);
		createEReference(flowEClass, FLOW__DIV);
		createEReference(flowEClass, FLOW__UL);
		createEReference(flowEClass, FLOW__OL);
		createEReference(flowEClass, FLOW__DL);
		createEReference(flowEClass, FLOW__PRE);
		createEReference(flowEClass, FLOW__HR);
		createEReference(flowEClass, FLOW__BLOCKQUOTE);
		createEReference(flowEClass, FLOW__ADDRESS);
		createEReference(flowEClass, FLOW__TABLE);
		createEReference(flowEClass, FLOW__A);
		createEReference(flowEClass, FLOW__BR);
		createEReference(flowEClass, FLOW__SPAN);
		createEReference(flowEClass, FLOW__OBJECT);
		createEReference(flowEClass, FLOW__IMG);
		createEReference(flowEClass, FLOW__TT);
		createEReference(flowEClass, FLOW__I);
		createEReference(flowEClass, FLOW__B);
		createEReference(flowEClass, FLOW__BIG);
		createEReference(flowEClass, FLOW__SMALL);
		createEReference(flowEClass, FLOW__U);
		createEReference(flowEClass, FLOW__STRIKE);
		createEReference(flowEClass, FLOW__EM);
		createEReference(flowEClass, FLOW__STRONG);
		createEReference(flowEClass, FLOW__DFN);
		createEReference(flowEClass, FLOW__CODE);
		createEReference(flowEClass, FLOW__Q);
		createEReference(flowEClass, FLOW__SAMP);
		createEReference(flowEClass, FLOW__KBD);
		createEReference(flowEClass, FLOW__VAR);
		createEReference(flowEClass, FLOW__CITE);
		createEReference(flowEClass, FLOW__ABBR);
		createEReference(flowEClass, FLOW__ACRONYM);
		createEReference(flowEClass, FLOW__SUB);
		createEReference(flowEClass, FLOW__SUP);
		createEReference(flowEClass, FLOW__INS);
		createEReference(flowEClass, FLOW__DEL);

		formContentEClass = createEClass(FORM_CONTENT);
		createEAttribute(formContentEClass, FORM_CONTENT__GROUP);
		createEReference(formContentEClass, FORM_CONTENT__P);
		createEReference(formContentEClass, FORM_CONTENT__H1);
		createEReference(formContentEClass, FORM_CONTENT__H2);
		createEReference(formContentEClass, FORM_CONTENT__H3);
		createEReference(formContentEClass, FORM_CONTENT__H4);
		createEReference(formContentEClass, FORM_CONTENT__H5);
		createEReference(formContentEClass, FORM_CONTENT__H6);
		createEReference(formContentEClass, FORM_CONTENT__DIV);
		createEReference(formContentEClass, FORM_CONTENT__UL);
		createEReference(formContentEClass, FORM_CONTENT__OL);
		createEReference(formContentEClass, FORM_CONTENT__DL);
		createEReference(formContentEClass, FORM_CONTENT__PRE);
		createEReference(formContentEClass, FORM_CONTENT__HR);
		createEReference(formContentEClass, FORM_CONTENT__BLOCKQUOTE);
		createEReference(formContentEClass, FORM_CONTENT__ADDRESS);
		createEReference(formContentEClass, FORM_CONTENT__TABLE);
		createEReference(formContentEClass, FORM_CONTENT__INS);
		createEReference(formContentEClass, FORM_CONTENT__DEL);

		h1TypeEClass = createEClass(H1_TYPE);
		createEAttribute(h1TypeEClass, H1_TYPE__CLASS);
		createEAttribute(h1TypeEClass, H1_TYPE__ID);
		createEAttribute(h1TypeEClass, H1_TYPE__STYLE);
		createEAttribute(h1TypeEClass, H1_TYPE__TITLE);

		h2TypeEClass = createEClass(H2_TYPE);
		createEAttribute(h2TypeEClass, H2_TYPE__CLASS);
		createEAttribute(h2TypeEClass, H2_TYPE__ID);
		createEAttribute(h2TypeEClass, H2_TYPE__STYLE);
		createEAttribute(h2TypeEClass, H2_TYPE__TITLE);

		h3TypeEClass = createEClass(H3_TYPE);
		createEAttribute(h3TypeEClass, H3_TYPE__CLASS);
		createEAttribute(h3TypeEClass, H3_TYPE__ID);
		createEAttribute(h3TypeEClass, H3_TYPE__STYLE);
		createEAttribute(h3TypeEClass, H3_TYPE__TITLE);

		h4TypeEClass = createEClass(H4_TYPE);
		createEAttribute(h4TypeEClass, H4_TYPE__CLASS);
		createEAttribute(h4TypeEClass, H4_TYPE__ID);
		createEAttribute(h4TypeEClass, H4_TYPE__STYLE);
		createEAttribute(h4TypeEClass, H4_TYPE__TITLE);

		h5TypeEClass = createEClass(H5_TYPE);
		createEAttribute(h5TypeEClass, H5_TYPE__CLASS);
		createEAttribute(h5TypeEClass, H5_TYPE__ID);
		createEAttribute(h5TypeEClass, H5_TYPE__STYLE);
		createEAttribute(h5TypeEClass, H5_TYPE__TITLE);

		h6TypeEClass = createEClass(H6_TYPE);
		createEAttribute(h6TypeEClass, H6_TYPE__CLASS);
		createEAttribute(h6TypeEClass, H6_TYPE__ID);
		createEAttribute(h6TypeEClass, H6_TYPE__STYLE);
		createEAttribute(h6TypeEClass, H6_TYPE__TITLE);

		hrTypeEClass = createEClass(HR_TYPE);
		createEAttribute(hrTypeEClass, HR_TYPE__CLASS);
		createEAttribute(hrTypeEClass, HR_TYPE__ID);
		createEAttribute(hrTypeEClass, HR_TYPE__STYLE);
		createEAttribute(hrTypeEClass, HR_TYPE__TITLE);

		htmlTypeEClass = createEClass(HTML_TYPE);
		createEReference(htmlTypeEClass, HTML_TYPE__BODY);
		createEAttribute(htmlTypeEClass, HTML_TYPE__ID);

		imgTypeEClass = createEClass(IMG_TYPE);
		createEAttribute(imgTypeEClass, IMG_TYPE__ALT);
		createEAttribute(imgTypeEClass, IMG_TYPE__CLASS);
		createEAttribute(imgTypeEClass, IMG_TYPE__HEIGHT);
		createEAttribute(imgTypeEClass, IMG_TYPE__ID);
		createEAttribute(imgTypeEClass, IMG_TYPE__ISMAP);
		createEAttribute(imgTypeEClass, IMG_TYPE__LONGDESC);
		createEAttribute(imgTypeEClass, IMG_TYPE__SRC);
		createEAttribute(imgTypeEClass, IMG_TYPE__STYLE);
		createEAttribute(imgTypeEClass, IMG_TYPE__TITLE);
		createEAttribute(imgTypeEClass, IMG_TYPE__USEMAP);
		createEAttribute(imgTypeEClass, IMG_TYPE__WIDTH);

		inlineEClass = createEClass(INLINE);
		createEAttribute(inlineEClass, INLINE__MIXED);
		createEAttribute(inlineEClass, INLINE__GROUP);
		createEReference(inlineEClass, INLINE__A);
		createEReference(inlineEClass, INLINE__BR);
		createEReference(inlineEClass, INLINE__SPAN);
		createEReference(inlineEClass, INLINE__OBJECT);
		createEReference(inlineEClass, INLINE__IMG);
		createEReference(inlineEClass, INLINE__TT);
		createEReference(inlineEClass, INLINE__I);
		createEReference(inlineEClass, INLINE__B);
		createEReference(inlineEClass, INLINE__BIG);
		createEReference(inlineEClass, INLINE__SMALL);
		createEReference(inlineEClass, INLINE__U);
		createEReference(inlineEClass, INLINE__STRIKE);
		createEReference(inlineEClass, INLINE__EM);
		createEReference(inlineEClass, INLINE__STRONG);
		createEReference(inlineEClass, INLINE__DFN);
		createEReference(inlineEClass, INLINE__CODE);
		createEReference(inlineEClass, INLINE__Q);
		createEReference(inlineEClass, INLINE__SAMP);
		createEReference(inlineEClass, INLINE__KBD);
		createEReference(inlineEClass, INLINE__VAR);
		createEReference(inlineEClass, INLINE__CITE);
		createEReference(inlineEClass, INLINE__ABBR);
		createEReference(inlineEClass, INLINE__ACRONYM);
		createEReference(inlineEClass, INLINE__SUB);
		createEReference(inlineEClass, INLINE__SUP);
		createEReference(inlineEClass, INLINE__INS);
		createEReference(inlineEClass, INLINE__DEL);

		insTypeEClass = createEClass(INS_TYPE);
		createEAttribute(insTypeEClass, INS_TYPE__CITE1);
		createEAttribute(insTypeEClass, INS_TYPE__CLASS);
		createEAttribute(insTypeEClass, INS_TYPE__DATETIME);
		createEAttribute(insTypeEClass, INS_TYPE__ID);
		createEAttribute(insTypeEClass, INS_TYPE__STYLE);
		createEAttribute(insTypeEClass, INS_TYPE__TITLE);

		iTypeEClass = createEClass(ITYPE);
		createEAttribute(iTypeEClass, ITYPE__CLASS);
		createEAttribute(iTypeEClass, ITYPE__ID);
		createEAttribute(iTypeEClass, ITYPE__STYLE);
		createEAttribute(iTypeEClass, ITYPE__TITLE);

		kbdTypeEClass = createEClass(KBD_TYPE);
		createEAttribute(kbdTypeEClass, KBD_TYPE__CLASS);
		createEAttribute(kbdTypeEClass, KBD_TYPE__ID);
		createEAttribute(kbdTypeEClass, KBD_TYPE__STYLE);
		createEAttribute(kbdTypeEClass, KBD_TYPE__TITLE);

		liTypeEClass = createEClass(LI_TYPE);
		createEAttribute(liTypeEClass, LI_TYPE__CLASS);
		createEAttribute(liTypeEClass, LI_TYPE__ID);
		createEAttribute(liTypeEClass, LI_TYPE__STYLE);
		createEAttribute(liTypeEClass, LI_TYPE__TITLE);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__MIXED);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__GROUP);
		createEReference(objectTypeEClass, OBJECT_TYPE__PARAM);
		createEReference(objectTypeEClass, OBJECT_TYPE__P);
		createEReference(objectTypeEClass, OBJECT_TYPE__H1);
		createEReference(objectTypeEClass, OBJECT_TYPE__H2);
		createEReference(objectTypeEClass, OBJECT_TYPE__H3);
		createEReference(objectTypeEClass, OBJECT_TYPE__H4);
		createEReference(objectTypeEClass, OBJECT_TYPE__H5);
		createEReference(objectTypeEClass, OBJECT_TYPE__H6);
		createEReference(objectTypeEClass, OBJECT_TYPE__DIV);
		createEReference(objectTypeEClass, OBJECT_TYPE__UL);
		createEReference(objectTypeEClass, OBJECT_TYPE__OL);
		createEReference(objectTypeEClass, OBJECT_TYPE__DL);
		createEReference(objectTypeEClass, OBJECT_TYPE__PRE);
		createEReference(objectTypeEClass, OBJECT_TYPE__HR);
		createEReference(objectTypeEClass, OBJECT_TYPE__BLOCKQUOTE);
		createEReference(objectTypeEClass, OBJECT_TYPE__ADDRESS);
		createEReference(objectTypeEClass, OBJECT_TYPE__TABLE);
		createEReference(objectTypeEClass, OBJECT_TYPE__A);
		createEReference(objectTypeEClass, OBJECT_TYPE__BR);
		createEReference(objectTypeEClass, OBJECT_TYPE__SPAN);
		createEReference(objectTypeEClass, OBJECT_TYPE__OBJECT);
		createEReference(objectTypeEClass, OBJECT_TYPE__IMG);
		createEReference(objectTypeEClass, OBJECT_TYPE__TT);
		createEReference(objectTypeEClass, OBJECT_TYPE__I);
		createEReference(objectTypeEClass, OBJECT_TYPE__B);
		createEReference(objectTypeEClass, OBJECT_TYPE__BIG);
		createEReference(objectTypeEClass, OBJECT_TYPE__SMALL);
		createEReference(objectTypeEClass, OBJECT_TYPE__U);
		createEReference(objectTypeEClass, OBJECT_TYPE__STRIKE);
		createEReference(objectTypeEClass, OBJECT_TYPE__EM);
		createEReference(objectTypeEClass, OBJECT_TYPE__STRONG);
		createEReference(objectTypeEClass, OBJECT_TYPE__DFN);
		createEReference(objectTypeEClass, OBJECT_TYPE__CODE);
		createEReference(objectTypeEClass, OBJECT_TYPE__Q);
		createEReference(objectTypeEClass, OBJECT_TYPE__SAMP);
		createEReference(objectTypeEClass, OBJECT_TYPE__KBD);
		createEReference(objectTypeEClass, OBJECT_TYPE__VAR);
		createEReference(objectTypeEClass, OBJECT_TYPE__CITE);
		createEReference(objectTypeEClass, OBJECT_TYPE__ABBR);
		createEReference(objectTypeEClass, OBJECT_TYPE__ACRONYM);
		createEReference(objectTypeEClass, OBJECT_TYPE__SUB);
		createEReference(objectTypeEClass, OBJECT_TYPE__SUP);
		createEReference(objectTypeEClass, OBJECT_TYPE__INS);
		createEReference(objectTypeEClass, OBJECT_TYPE__DEL);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ARCHIVE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__CLASS);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__CLASSID);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__CODEBASE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__CODETYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__DATA);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__DECLARE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__HEIGHT);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__ID);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__NAME);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__STANDBY);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__STYLE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__TABINDEX);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__TITLE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__USEMAP);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__WIDTH);

		olTypeEClass = createEClass(OL_TYPE);
		createEReference(olTypeEClass, OL_TYPE__LI);
		createEAttribute(olTypeEClass, OL_TYPE__CLASS);
		createEAttribute(olTypeEClass, OL_TYPE__ID);
		createEAttribute(olTypeEClass, OL_TYPE__STYLE);
		createEAttribute(olTypeEClass, OL_TYPE__TITLE);

		paramTypeEClass = createEClass(PARAM_TYPE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__ID);
		createEAttribute(paramTypeEClass, PARAM_TYPE__NAME);
		createEAttribute(paramTypeEClass, PARAM_TYPE__TYPE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__VALUE);
		createEAttribute(paramTypeEClass, PARAM_TYPE__VALUETYPE);

		preContentEClass = createEClass(PRE_CONTENT);
		createEAttribute(preContentEClass, PRE_CONTENT__MIXED);
		createEAttribute(preContentEClass, PRE_CONTENT__GROUP);
		createEReference(preContentEClass, PRE_CONTENT__A);
		createEReference(preContentEClass, PRE_CONTENT__TT);
		createEReference(preContentEClass, PRE_CONTENT__I);
		createEReference(preContentEClass, PRE_CONTENT__B);
		createEReference(preContentEClass, PRE_CONTENT__BIG);
		createEReference(preContentEClass, PRE_CONTENT__SMALL);
		createEReference(preContentEClass, PRE_CONTENT__U);
		createEReference(preContentEClass, PRE_CONTENT__STRIKE);
		createEReference(preContentEClass, PRE_CONTENT__EM);
		createEReference(preContentEClass, PRE_CONTENT__STRONG);
		createEReference(preContentEClass, PRE_CONTENT__DFN);
		createEReference(preContentEClass, PRE_CONTENT__CODE);
		createEReference(preContentEClass, PRE_CONTENT__Q);
		createEReference(preContentEClass, PRE_CONTENT__SAMP);
		createEReference(preContentEClass, PRE_CONTENT__KBD);
		createEReference(preContentEClass, PRE_CONTENT__VAR);
		createEReference(preContentEClass, PRE_CONTENT__CITE);
		createEReference(preContentEClass, PRE_CONTENT__ABBR);
		createEReference(preContentEClass, PRE_CONTENT__ACRONYM);
		createEReference(preContentEClass, PRE_CONTENT__SUB);
		createEReference(preContentEClass, PRE_CONTENT__SUP);
		createEReference(preContentEClass, PRE_CONTENT__BR);
		createEReference(preContentEClass, PRE_CONTENT__SPAN);
		createEReference(preContentEClass, PRE_CONTENT__INS);
		createEReference(preContentEClass, PRE_CONTENT__DEL);

		preTypeEClass = createEClass(PRE_TYPE);
		createEAttribute(preTypeEClass, PRE_TYPE__CLASS);
		createEAttribute(preTypeEClass, PRE_TYPE__ID);
		createEAttribute(preTypeEClass, PRE_TYPE__STYLE);
		createEAttribute(preTypeEClass, PRE_TYPE__TITLE);

		pTypeEClass = createEClass(PTYPE);
		createEAttribute(pTypeEClass, PTYPE__CLASS);
		createEAttribute(pTypeEClass, PTYPE__ID);
		createEAttribute(pTypeEClass, PTYPE__STYLE);
		createEAttribute(pTypeEClass, PTYPE__TITLE);

		qTypeEClass = createEClass(QTYPE);
		createEAttribute(qTypeEClass, QTYPE__CITE1);
		createEAttribute(qTypeEClass, QTYPE__CLASS);
		createEAttribute(qTypeEClass, QTYPE__ID);
		createEAttribute(qTypeEClass, QTYPE__STYLE);
		createEAttribute(qTypeEClass, QTYPE__TITLE);

		sampTypeEClass = createEClass(SAMP_TYPE);
		createEAttribute(sampTypeEClass, SAMP_TYPE__CLASS);
		createEAttribute(sampTypeEClass, SAMP_TYPE__ID);
		createEAttribute(sampTypeEClass, SAMP_TYPE__STYLE);
		createEAttribute(sampTypeEClass, SAMP_TYPE__TITLE);

		smallTypeEClass = createEClass(SMALL_TYPE);
		createEAttribute(smallTypeEClass, SMALL_TYPE__CLASS);
		createEAttribute(smallTypeEClass, SMALL_TYPE__ID);
		createEAttribute(smallTypeEClass, SMALL_TYPE__STYLE);
		createEAttribute(smallTypeEClass, SMALL_TYPE__TITLE);

		spanTypeEClass = createEClass(SPAN_TYPE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__CLASS);
		createEAttribute(spanTypeEClass, SPAN_TYPE__ID);
		createEAttribute(spanTypeEClass, SPAN_TYPE__STYLE);
		createEAttribute(spanTypeEClass, SPAN_TYPE__TITLE);

		strikeTypeEClass = createEClass(STRIKE_TYPE);
		createEAttribute(strikeTypeEClass, STRIKE_TYPE__CLASS);
		createEAttribute(strikeTypeEClass, STRIKE_TYPE__ID);
		createEAttribute(strikeTypeEClass, STRIKE_TYPE__STYLE);
		createEAttribute(strikeTypeEClass, STRIKE_TYPE__TITLE);

		strongTypeEClass = createEClass(STRONG_TYPE);
		createEAttribute(strongTypeEClass, STRONG_TYPE__CLASS);
		createEAttribute(strongTypeEClass, STRONG_TYPE__ID);
		createEAttribute(strongTypeEClass, STRONG_TYPE__STYLE);
		createEAttribute(strongTypeEClass, STRONG_TYPE__TITLE);

		subTypeEClass = createEClass(SUB_TYPE);
		createEAttribute(subTypeEClass, SUB_TYPE__CLASS);
		createEAttribute(subTypeEClass, SUB_TYPE__ID);
		createEAttribute(subTypeEClass, SUB_TYPE__STYLE);
		createEAttribute(subTypeEClass, SUB_TYPE__TITLE);

		supTypeEClass = createEClass(SUP_TYPE);
		createEAttribute(supTypeEClass, SUP_TYPE__CLASS);
		createEAttribute(supTypeEClass, SUP_TYPE__ID);
		createEAttribute(supTypeEClass, SUP_TYPE__STYLE);
		createEAttribute(supTypeEClass, SUP_TYPE__TITLE);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__CAPTION);
		createEReference(tableTypeEClass, TABLE_TYPE__COL);
		createEReference(tableTypeEClass, TABLE_TYPE__COLGROUP);
		createEReference(tableTypeEClass, TABLE_TYPE__THEAD);
		createEReference(tableTypeEClass, TABLE_TYPE__TFOOT);
		createEReference(tableTypeEClass, TABLE_TYPE__TBODY);
		createEReference(tableTypeEClass, TABLE_TYPE__TR);
		createEAttribute(tableTypeEClass, TABLE_TYPE__BORDER);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CELLPADDING);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CELLSPACING);
		createEAttribute(tableTypeEClass, TABLE_TYPE__CLASS);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);
		createEAttribute(tableTypeEClass, TABLE_TYPE__STYLE);
		createEAttribute(tableTypeEClass, TABLE_TYPE__SUMMARY);
		createEAttribute(tableTypeEClass, TABLE_TYPE__TITLE);
		createEAttribute(tableTypeEClass, TABLE_TYPE__WIDTH);

		tbodyTypeEClass = createEClass(TBODY_TYPE);
		createEReference(tbodyTypeEClass, TBODY_TYPE__TR);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__ALIGN);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CHAR);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CHAROFF);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__CLASS);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__ID);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__STYLE);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__TITLE);
		createEAttribute(tbodyTypeEClass, TBODY_TYPE__VALIGN);

		tdTypeEClass = createEClass(TD_TYPE);
		createEAttribute(tdTypeEClass, TD_TYPE__ABBR1);
		createEAttribute(tdTypeEClass, TD_TYPE__ALIGN);
		createEAttribute(tdTypeEClass, TD_TYPE__AXIS);
		createEAttribute(tdTypeEClass, TD_TYPE__CHAR);
		createEAttribute(tdTypeEClass, TD_TYPE__CHAROFF);
		createEAttribute(tdTypeEClass, TD_TYPE__CLASS);
		createEAttribute(tdTypeEClass, TD_TYPE__COLSPAN);
		createEAttribute(tdTypeEClass, TD_TYPE__HEADERS);
		createEAttribute(tdTypeEClass, TD_TYPE__ID);
		createEAttribute(tdTypeEClass, TD_TYPE__ROWSPAN);
		createEAttribute(tdTypeEClass, TD_TYPE__SCOPE);
		createEAttribute(tdTypeEClass, TD_TYPE__STYLE);
		createEAttribute(tdTypeEClass, TD_TYPE__TITLE);
		createEAttribute(tdTypeEClass, TD_TYPE__VALIGN);

		tfootTypeEClass = createEClass(TFOOT_TYPE);
		createEReference(tfootTypeEClass, TFOOT_TYPE__TR);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__ALIGN);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CHAR);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CHAROFF);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__CLASS);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__ID);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__STYLE);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__TITLE);
		createEAttribute(tfootTypeEClass, TFOOT_TYPE__VALIGN);

		theadTypeEClass = createEClass(THEAD_TYPE);
		createEReference(theadTypeEClass, THEAD_TYPE__TR);
		createEAttribute(theadTypeEClass, THEAD_TYPE__ALIGN);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CHAR);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CHAROFF);
		createEAttribute(theadTypeEClass, THEAD_TYPE__CLASS);
		createEAttribute(theadTypeEClass, THEAD_TYPE__ID);
		createEAttribute(theadTypeEClass, THEAD_TYPE__STYLE);
		createEAttribute(theadTypeEClass, THEAD_TYPE__TITLE);
		createEAttribute(theadTypeEClass, THEAD_TYPE__VALIGN);

		thTypeEClass = createEClass(TH_TYPE);
		createEAttribute(thTypeEClass, TH_TYPE__ABBR1);
		createEAttribute(thTypeEClass, TH_TYPE__ALIGN);
		createEAttribute(thTypeEClass, TH_TYPE__AXIS);
		createEAttribute(thTypeEClass, TH_TYPE__CHAR);
		createEAttribute(thTypeEClass, TH_TYPE__CHAROFF);
		createEAttribute(thTypeEClass, TH_TYPE__CLASS);
		createEAttribute(thTypeEClass, TH_TYPE__COLSPAN);
		createEAttribute(thTypeEClass, TH_TYPE__HEADERS);
		createEAttribute(thTypeEClass, TH_TYPE__ID);
		createEAttribute(thTypeEClass, TH_TYPE__ROWSPAN);
		createEAttribute(thTypeEClass, TH_TYPE__SCOPE);
		createEAttribute(thTypeEClass, TH_TYPE__STYLE);
		createEAttribute(thTypeEClass, TH_TYPE__TITLE);
		createEAttribute(thTypeEClass, TH_TYPE__VALIGN);

		trTypeEClass = createEClass(TR_TYPE);
		createEAttribute(trTypeEClass, TR_TYPE__GROUP);
		createEReference(trTypeEClass, TR_TYPE__TH);
		createEReference(trTypeEClass, TR_TYPE__TD);
		createEAttribute(trTypeEClass, TR_TYPE__ALIGN);
		createEAttribute(trTypeEClass, TR_TYPE__CHAR);
		createEAttribute(trTypeEClass, TR_TYPE__CHAROFF);
		createEAttribute(trTypeEClass, TR_TYPE__CLASS);
		createEAttribute(trTypeEClass, TR_TYPE__ID);
		createEAttribute(trTypeEClass, TR_TYPE__STYLE);
		createEAttribute(trTypeEClass, TR_TYPE__TITLE);
		createEAttribute(trTypeEClass, TR_TYPE__VALIGN);

		ttTypeEClass = createEClass(TT_TYPE);
		createEAttribute(ttTypeEClass, TT_TYPE__CLASS);
		createEAttribute(ttTypeEClass, TT_TYPE__ID);
		createEAttribute(ttTypeEClass, TT_TYPE__STYLE);
		createEAttribute(ttTypeEClass, TT_TYPE__TITLE);

		ulTypeEClass = createEClass(UL_TYPE);
		createEReference(ulTypeEClass, UL_TYPE__LI);
		createEAttribute(ulTypeEClass, UL_TYPE__CLASS);
		createEAttribute(ulTypeEClass, UL_TYPE__ID);
		createEAttribute(ulTypeEClass, UL_TYPE__STYLE);
		createEAttribute(ulTypeEClass, UL_TYPE__TITLE);

		uTypeEClass = createEClass(UTYPE);
		createEAttribute(uTypeEClass, UTYPE__CLASS);
		createEAttribute(uTypeEClass, UTYPE__ID);
		createEAttribute(uTypeEClass, UTYPE__STYLE);
		createEAttribute(uTypeEClass, UTYPE__TITLE);

		varTypeEClass = createEClass(VAR_TYPE);
		createEAttribute(varTypeEClass, VAR_TYPE__CLASS);
		createEAttribute(varTypeEClass, VAR_TYPE__ID);
		createEAttribute(varTypeEClass, VAR_TYPE__STYLE);
		createEAttribute(varTypeEClass, VAR_TYPE__TITLE);

		// Create enums
		alignTypeEEnum = createEEnum(ALIGN_TYPE);
		declareTypeEEnum = createEEnum(DECLARE_TYPE);
		ismapTypeEEnum = createEEnum(ISMAP_TYPE);
		scopeEEnum = createEEnum(SCOPE);
		shapeEEnum = createEEnum(SHAPE);
		valignTypeEEnum = createEEnum(VALIGN_TYPE);
		valuetypeTypeEEnum = createEEnum(VALUETYPE_TYPE);

		// Create data types
		alignTypeObjectEDataType = createEDataType(ALIGN_TYPE_OBJECT);
		characterEDataType = createEDataType(CHARACTER);
		charsetEDataType = createEDataType(CHARSET);
		charsetsEDataType = createEDataType(CHARSETS);
		contentTypeEDataType = createEDataType(CONTENT_TYPE);
		contentTypesEDataType = createEDataType(CONTENT_TYPES);
		coordsEDataType = createEDataType(COORDS);
		datetimeEDataType = createEDataType(DATETIME);
		declareTypeObjectEDataType = createEDataType(DECLARE_TYPE_OBJECT);
		ismapTypeObjectEDataType = createEDataType(ISMAP_TYPE_OBJECT);
		languageCodeEDataType = createEDataType(LANGUAGE_CODE);
		lengthEDataType = createEDataType(LENGTH);
		linkTypesEDataType = createEDataType(LINK_TYPES);
		multiLengthEDataType = createEDataType(MULTI_LENGTH);
		numberEDataType = createEDataType(NUMBER);
		pixelsEDataType = createEDataType(PIXELS);
		scopeObjectEDataType = createEDataType(SCOPE_OBJECT);
		scriptEDataType = createEDataType(SCRIPT);
		shapeObjectEDataType = createEDataType(SHAPE_OBJECT);
		styleSheetEDataType = createEDataType(STYLE_SHEET);
		tabindexNumberEDataType = createEDataType(TABINDEX_NUMBER);
		textEDataType = createEDataType(TEXT);
		uriEDataType = createEDataType(URI);
		uriListEDataType = createEDataType(URI_LIST);
		valignTypeObjectEDataType = createEDataType(VALIGN_TYPE_OBJECT);
		valuetypeTypeObjectEDataType = createEDataType(VALUETYPE_TYPE_OBJECT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abbrTypeEClass.getESuperTypes().add(this.getInline());
		acronymTypeEClass.getESuperTypes().add(this.getInline());
		addressTypeEClass.getESuperTypes().add(this.getInline());
		aTypeEClass.getESuperTypes().add(this.getAContent());
		bigTypeEClass.getESuperTypes().add(this.getInline());
		blockquoteTypeEClass.getESuperTypes().add(this.getBlock());
		bodyTypeEClass.getESuperTypes().add(this.getBlock());
		bTypeEClass.getESuperTypes().add(this.getInline());
		captionTypeEClass.getESuperTypes().add(this.getInline());
		citeTypeEClass.getESuperTypes().add(this.getInline());
		codeTypeEClass.getESuperTypes().add(this.getInline());
		ddTypeEClass.getESuperTypes().add(this.getFlow());
		delTypeEClass.getESuperTypes().add(this.getFlow());
		dfnTypeEClass.getESuperTypes().add(this.getInline());
		divTypeEClass.getESuperTypes().add(this.getFlow());
		dtTypeEClass.getESuperTypes().add(this.getInline());
		emTypeEClass.getESuperTypes().add(this.getInline());
		h1TypeEClass.getESuperTypes().add(this.getInline());
		h2TypeEClass.getESuperTypes().add(this.getInline());
		h3TypeEClass.getESuperTypes().add(this.getInline());
		h4TypeEClass.getESuperTypes().add(this.getInline());
		h5TypeEClass.getESuperTypes().add(this.getInline());
		h6TypeEClass.getESuperTypes().add(this.getInline());
		insTypeEClass.getESuperTypes().add(this.getFlow());
		iTypeEClass.getESuperTypes().add(this.getInline());
		kbdTypeEClass.getESuperTypes().add(this.getInline());
		liTypeEClass.getESuperTypes().add(this.getFlow());
		preTypeEClass.getESuperTypes().add(this.getPreContent());
		pTypeEClass.getESuperTypes().add(this.getInline());
		qTypeEClass.getESuperTypes().add(this.getInline());
		sampTypeEClass.getESuperTypes().add(this.getInline());
		smallTypeEClass.getESuperTypes().add(this.getInline());
		spanTypeEClass.getESuperTypes().add(this.getInline());
		strikeTypeEClass.getESuperTypes().add(this.getInline());
		strongTypeEClass.getESuperTypes().add(this.getInline());
		subTypeEClass.getESuperTypes().add(this.getInline());
		supTypeEClass.getESuperTypes().add(this.getInline());
		tdTypeEClass.getESuperTypes().add(this.getFlow());
		thTypeEClass.getESuperTypes().add(this.getFlow());
		ttTypeEClass.getESuperTypes().add(this.getInline());
		uTypeEClass.getESuperTypes().add(this.getInline());
		varTypeEClass.getESuperTypes().add(this.getInline());

		// Initialize classes and features; add operations and parameters
		initEClass(abbrTypeEClass, AbbrType.class, "AbbrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbbrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Style(), this.getStyleSheet(), "style", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbbrType_Title(), this.getText(), "title", null, 0, 1, AbbrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aContentEClass, AContent.class, "AContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Br(), this.getBrType(), null, "br", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Span(), this.getSpanType(), null, "span", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Object(), this.getObjectType(), null, "object", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Img(), this.getImgType(), null, "img", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Tt(), this.getTtType(), null, "tt", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_I(), this.getIType(), null, "i", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_B(), this.getBType(), null, "b", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Big(), this.getBigType(), null, "big", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Small(), this.getSmallType(), null, "small", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_U(), this.getUType(), null, "u", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Strike(), this.getStrikeType(), null, "strike", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Em(), this.getEmType(), null, "em", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Strong(), this.getStrongType(), null, "strong", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Code(), this.getCodeType(), null, "code", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Q(), this.getQType(), null, "q", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Samp(), this.getSampType(), null, "samp", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Var(), this.getVarType(), null, "var", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Cite(), this.getCiteType(), null, "cite", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Sub(), this.getSubType(), null, "sub", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Sup(), this.getSupType(), null, "sup", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Ins(), this.getInsType(), null, "ins", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getAContent_Del(), this.getDelType(), null, "del", null, 0, -1, AContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(acronymTypeEClass, AcronymType.class, "AcronymType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcronymType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Style(), this.getStyleSheet(), "style", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAcronymType_Title(), this.getText(), "title", null, 0, 1, AcronymType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Style(), this.getStyleSheet(), "style", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Title(), this.getText(), "title", null, 0, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aTypeEClass, AType.class, "AType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAType_Charset(), this.getCharset(), "charset", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Coords(), this.getCoords(), "coords", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Href(), this.getURI(), "href", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Hreflang(), this.getLanguageCode(), "hreflang", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Rel(), this.getLinkTypes(), "rel", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Rev(), this.getLinkTypes(), "rev", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Shape(), this.getShape(), "shape", "rect", 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Style(), this.getStyleSheet(), "style", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Title(), this.getText(), "title", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAType_Type(), this.getContentType(), "type", null, 0, 1, AType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bigTypeEClass, BigType.class, "BigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBigType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Style(), this.getStyleSheet(), "style", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBigType_Title(), this.getText(), "title", null, 0, 1, BigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_P(), this.getPType(), null, "p", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H1(), this.getH1Type(), null, "h1", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H2(), this.getH2Type(), null, "h2", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H3(), this.getH3Type(), null, "h3", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H4(), this.getH4Type(), null, "h4", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H5(), this.getH5Type(), null, "h5", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_H6(), this.getH6Type(), null, "h6", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Div(), this.getDivType(), null, "div", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ul(), this.getUlType(), null, "ul", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ol(), this.getOlType(), null, "ol", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Dl(), this.getDlType(), null, "dl", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Pre(), this.getPreType(), null, "pre", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Hr(), this.getHrType(), null, "hr", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Address(), this.getAddressType(), null, "address", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Table(), this.getTableType(), null, "table", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Ins(), this.getInsType(), null, "ins", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Del(), this.getDelType(), null, "del", null, 0, -1, Block.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(blockquoteTypeEClass, BlockquoteType.class, "BlockquoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockquoteType_Cite(), this.getURI(), "cite", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Style(), this.getStyleSheet(), "style", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlockquoteType_Title(), this.getText(), "title", null, 0, 1, BlockquoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyTypeEClass, BodyType.class, "BodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBodyType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyType_Style(), this.getStyleSheet(), "style", null, 0, 1, BodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBodyType_Title(), this.getText(), "title", null, 0, 1, BodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(brTypeEClass, BrType.class, "BrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Style(), this.getStyleSheet(), "style", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBrType_Title(), this.getText(), "title", null, 0, 1, BrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bTypeEClass, BType.class, "BType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Style(), this.getStyleSheet(), "style", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBType_Title(), this.getText(), "title", null, 0, 1, BType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(captionTypeEClass, CaptionType.class, "CaptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaptionType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Style(), this.getStyleSheet(), "style", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCaptionType_Title(), this.getText(), "title", null, 0, 1, CaptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(citeTypeEClass, CiteType.class, "CiteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCiteType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Style(), this.getStyleSheet(), "style", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCiteType_Title(), this.getText(), "title", null, 0, 1, CiteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeTypeEClass, CodeType.class, "CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Style(), this.getStyleSheet(), "style", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeType_Title(), this.getText(), "title", null, 0, 1, CodeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colgroupTypeEClass, ColgroupType.class, "ColgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColgroupType_Col(), this.getColType(), null, "col", null, 0, -1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Align(), this.getAlignType(), "align", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Char(), this.getCharacter(), "char", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Charoff(), this.getLength(), "charoff", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Span(), this.getNumber(), "span", "1", 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Style(), this.getStyleSheet(), "style", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Title(), this.getText(), "title", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Valign(), this.getValignType(), "valign", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColgroupType_Width(), this.getMultiLength(), "width", null, 0, 1, ColgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colTypeEClass, ColType.class, "ColType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColType_Align(), this.getAlignType(), "align", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Char(), this.getCharacter(), "char", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Charoff(), this.getLength(), "charoff", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Span(), this.getNumber(), "span", "1", 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Style(), this.getStyleSheet(), "style", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Title(), this.getText(), "title", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Valign(), this.getValignType(), "valign", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColType_Width(), this.getMultiLength(), "width", null, 0, 1, ColType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ddTypeEClass, DdType.class, "DdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Style(), this.getStyleSheet(), "style", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDdType_Title(), this.getText(), "title", null, 0, 1, DdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delTypeEClass, DelType.class, "DelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelType_Cite1(), this.getURI(), "cite1", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelType_Datetime(), this.getDatetime(), "datetime", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelType_Style(), this.getStyleSheet(), "style", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDelType_Title(), this.getText(), "title", null, 0, 1, DelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dfnTypeEClass, DfnType.class, "DfnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDfnType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Style(), this.getStyleSheet(), "style", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDfnType_Title(), this.getText(), "title", null, 0, 1, DfnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divTypeEClass, DivType.class, "DivType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDivType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Style(), this.getStyleSheet(), "style", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDivType_Title(), this.getText(), "title", null, 0, 1, DivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dlTypeEClass, DlType.class, "DlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDlType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDlType_Dt(), this.getDtType(), null, "dt", null, 0, -1, DlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDlType_Dd(), this.getDdType(), null, "dd", null, 0, -1, DlType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Style(), this.getStyleSheet(), "style", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDlType_Title(), this.getText(), "title", null, 0, 1, DlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_A(), this.getAType(), null, "a", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_B(), this.getBType(), null, "b", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Big(), this.getBigType(), null, "big", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Body(), this.getBodyType(), null, "body", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Br(), this.getBrType(), null, "br", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Caption(), this.getCaptionType(), null, "caption", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cite(), this.getCiteType(), null, "cite", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Code(), this.getCodeType(), null, "code", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Col(), this.getColType(), null, "col", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Colgroup(), this.getColgroupType(), null, "colgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dd(), this.getDdType(), null, "dd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Del(), this.getDelType(), null, "del", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dfn(), this.getDfnType(), null, "dfn", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Div(), this.getDivType(), null, "div", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dl(), this.getDlType(), null, "dl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Dt(), this.getDtType(), null, "dt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Em(), this.getEmType(), null, "em", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H1(), this.getH1Type(), null, "h1", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H2(), this.getH2Type(), null, "h2", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H3(), this.getH3Type(), null, "h3", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H4(), this.getH4Type(), null, "h4", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H5(), this.getH5Type(), null, "h5", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_H6(), this.getH6Type(), null, "h6", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Hr(), this.getHrType(), null, "hr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Html(), this.getHtmlType(), null, "html", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_I(), this.getIType(), null, "i", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Img(), this.getImgType(), null, "img", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ins(), this.getInsType(), null, "ins", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Kbd(), this.getKbdType(), null, "kbd", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Li(), this.getLiType(), null, "li", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Object(), this.getObjectType(), null, "object", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ol(), this.getOlType(), null, "ol", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_P(), this.getPType(), null, "p", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Param(), this.getParamType(), null, "param", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Pre(), this.getPreType(), null, "pre", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Q(), this.getQType(), null, "q", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Samp(), this.getSampType(), null, "samp", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Small(), this.getSmallType(), null, "small", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Span(), this.getSpanType(), null, "span", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Strike(), this.getStrikeType(), null, "strike", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Strong(), this.getStrongType(), null, "strong", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sub(), this.getSubType(), null, "sub", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Sup(), this.getSupType(), null, "sup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Table(), this.getTableType(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Td(), this.getTdType(), null, "td", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tfoot(), this.getTfootType(), null, "tfoot", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Th(), this.getThType(), null, "th", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Thead(), this.getTheadType(), null, "thead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tr(), this.getTrType(), null, "tr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tt(), this.getTtType(), null, "tt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_U(), this.getUType(), null, "u", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ul(), this.getUlType(), null, "ul", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Var(), this.getVarType(), null, "var", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dtTypeEClass, DtType.class, "DtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDtType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Style(), this.getStyleSheet(), "style", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDtType_Title(), this.getText(), "title", null, 0, 1, DtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(emTypeEClass, EmType.class, "EmType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Style(), this.getStyleSheet(), "style", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmType_Title(), this.getText(), "title", null, 0, 1, EmType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Flow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_P(), this.getPType(), null, "p", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H1(), this.getH1Type(), null, "h1", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H2(), this.getH2Type(), null, "h2", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H3(), this.getH3Type(), null, "h3", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H4(), this.getH4Type(), null, "h4", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H5(), this.getH5Type(), null, "h5", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_H6(), this.getH6Type(), null, "h6", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Div(), this.getDivType(), null, "div", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Ul(), this.getUlType(), null, "ul", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Ol(), this.getOlType(), null, "ol", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Dl(), this.getDlType(), null, "dl", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Pre(), this.getPreType(), null, "pre", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Hr(), this.getHrType(), null, "hr", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Address(), this.getAddressType(), null, "address", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Table(), this.getTableType(), null, "table", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_A(), this.getAType(), null, "a", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Br(), this.getBrType(), null, "br", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Span(), this.getSpanType(), null, "span", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Object(), this.getObjectType(), null, "object", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Img(), this.getImgType(), null, "img", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Tt(), this.getTtType(), null, "tt", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_I(), this.getIType(), null, "i", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_B(), this.getBType(), null, "b", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Big(), this.getBigType(), null, "big", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Small(), this.getSmallType(), null, "small", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_U(), this.getUType(), null, "u", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Strike(), this.getStrikeType(), null, "strike", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Em(), this.getEmType(), null, "em", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Strong(), this.getStrongType(), null, "strong", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Code(), this.getCodeType(), null, "code", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Q(), this.getQType(), null, "q", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Samp(), this.getSampType(), null, "samp", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Var(), this.getVarType(), null, "var", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Cite(), this.getCiteType(), null, "cite", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Sub(), this.getSubType(), null, "sub", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Sup(), this.getSupType(), null, "sup", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Ins(), this.getInsType(), null, "ins", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Del(), this.getDelType(), null, "del", null, 0, -1, Flow.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(formContentEClass, FormContent.class, "FormContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, FormContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_P(), this.getPType(), null, "p", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H1(), this.getH1Type(), null, "h1", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H2(), this.getH2Type(), null, "h2", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H3(), this.getH3Type(), null, "h3", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H4(), this.getH4Type(), null, "h4", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H5(), this.getH5Type(), null, "h5", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_H6(), this.getH6Type(), null, "h6", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Div(), this.getDivType(), null, "div", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Ul(), this.getUlType(), null, "ul", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Ol(), this.getOlType(), null, "ol", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Dl(), this.getDlType(), null, "dl", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Pre(), this.getPreType(), null, "pre", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Hr(), this.getHrType(), null, "hr", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Address(), this.getAddressType(), null, "address", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Table(), this.getTableType(), null, "table", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Ins(), this.getInsType(), null, "ins", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getFormContent_Del(), this.getDelType(), null, "del", null, 0, -1, FormContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(h1TypeEClass, H1Type.class, "H1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH1Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH1Type_Title(), this.getText(), "title", null, 0, 1, H1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h2TypeEClass, H2Type.class, "H2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH2Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH2Type_Title(), this.getText(), "title", null, 0, 1, H2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h3TypeEClass, H3Type.class, "H3Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH3Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH3Type_Title(), this.getText(), "title", null, 0, 1, H3Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h4TypeEClass, H4Type.class, "H4Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH4Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH4Type_Title(), this.getText(), "title", null, 0, 1, H4Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h5TypeEClass, H5Type.class, "H5Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH5Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH5Type_Title(), this.getText(), "title", null, 0, 1, H5Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(h6TypeEClass, H6Type.class, "H6Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getH6Type_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Style(), this.getStyleSheet(), "style", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getH6Type_Title(), this.getText(), "title", null, 0, 1, H6Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hrTypeEClass, HrType.class, "HrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Style(), this.getStyleSheet(), "style", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHrType_Title(), this.getText(), "title", null, 0, 1, HrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(htmlTypeEClass, HtmlType.class, "HtmlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHtmlType_Body(), this.getBodyType(), null, "body", null, 1, 1, HtmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHtmlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, HtmlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imgTypeEClass, ImgType.class, "ImgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImgType_Alt(), this.getText(), "alt", null, 1, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Height(), this.getLength(), "height", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Ismap(), this.getIsmapType(), "ismap", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Longdesc(), this.getURI(), "longdesc", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Src(), this.getURI(), "src", null, 1, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Style(), this.getStyleSheet(), "style", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Title(), this.getText(), "title", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Usemap(), this.getURI(), "usemap", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImgType_Width(), this.getLength(), "width", null, 0, 1, ImgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineEClass, Inline.class, "Inline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInline_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Inline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInline_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_A(), this.getAType(), null, "a", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Br(), this.getBrType(), null, "br", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Span(), this.getSpanType(), null, "span", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Object(), this.getObjectType(), null, "object", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Img(), this.getImgType(), null, "img", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Tt(), this.getTtType(), null, "tt", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_I(), this.getIType(), null, "i", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_B(), this.getBType(), null, "b", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Big(), this.getBigType(), null, "big", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Small(), this.getSmallType(), null, "small", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_U(), this.getUType(), null, "u", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Strike(), this.getStrikeType(), null, "strike", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Em(), this.getEmType(), null, "em", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Strong(), this.getStrongType(), null, "strong", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Code(), this.getCodeType(), null, "code", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Q(), this.getQType(), null, "q", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Samp(), this.getSampType(), null, "samp", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Var(), this.getVarType(), null, "var", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Cite(), this.getCiteType(), null, "cite", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Sub(), this.getSubType(), null, "sub", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Sup(), this.getSupType(), null, "sup", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Ins(), this.getInsType(), null, "ins", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInline_Del(), this.getDelType(), null, "del", null, 0, -1, Inline.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(insTypeEClass, InsType.class, "InsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsType_Cite1(), this.getURI(), "cite1", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsType_Datetime(), this.getDatetime(), "datetime", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsType_Style(), this.getStyleSheet(), "style", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsType_Title(), this.getText(), "title", null, 0, 1, InsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iTypeEClass, IType.class, "IType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Style(), this.getStyleSheet(), "style", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIType_Title(), this.getText(), "title", null, 0, 1, IType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kbdTypeEClass, KbdType.class, "KbdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKbdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Style(), this.getStyleSheet(), "style", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKbdType_Title(), this.getText(), "title", null, 0, 1, KbdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(liTypeEClass, LiType.class, "LiType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Style(), this.getStyleSheet(), "style", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiType_Title(), this.getText(), "title", null, 0, 1, LiType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Param(), this.getParamType(), null, "param", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_P(), this.getPType(), null, "p", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H1(), this.getH1Type(), null, "h1", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H2(), this.getH2Type(), null, "h2", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H3(), this.getH3Type(), null, "h3", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H4(), this.getH4Type(), null, "h4", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H5(), this.getH5Type(), null, "h5", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_H6(), this.getH6Type(), null, "h6", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Div(), this.getDivType(), null, "div", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Ul(), this.getUlType(), null, "ul", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Ol(), this.getOlType(), null, "ol", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Dl(), this.getDlType(), null, "dl", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Pre(), this.getPreType(), null, "pre", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Hr(), this.getHrType(), null, "hr", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Blockquote(), this.getBlockquoteType(), null, "blockquote", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Address(), this.getAddressType(), null, "address", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Table(), this.getTableType(), null, "table", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_A(), this.getAType(), null, "a", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Br(), this.getBrType(), null, "br", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Span(), this.getSpanType(), null, "span", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Object(), this.getObjectType(), null, "object", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Img(), this.getImgType(), null, "img", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Tt(), this.getTtType(), null, "tt", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_I(), this.getIType(), null, "i", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_B(), this.getBType(), null, "b", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Big(), this.getBigType(), null, "big", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Small(), this.getSmallType(), null, "small", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_U(), this.getUType(), null, "u", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Strike(), this.getStrikeType(), null, "strike", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Em(), this.getEmType(), null, "em", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Strong(), this.getStrongType(), null, "strong", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Code(), this.getCodeType(), null, "code", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Q(), this.getQType(), null, "q", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Samp(), this.getSampType(), null, "samp", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Var(), this.getVarType(), null, "var", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Cite(), this.getCiteType(), null, "cite", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Sub(), this.getSubType(), null, "sub", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Sup(), this.getSupType(), null, "sup", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Ins(), this.getInsType(), null, "ins", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Del(), this.getDelType(), null, "del", null, 0, -1, ObjectType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Archive(), this.getUriList(), "archive", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Classid(), this.getURI(), "classid", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Codebase(), this.getURI(), "codebase", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Codetype(), this.getContentType(), "codetype", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Data(), this.getURI(), "data", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Declare(), this.getDeclareType(), "declare", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Height(), this.getLength(), "height", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Name(), theXMLTypePackage.getNMTOKEN(), "name", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Standby(), this.getText(), "standby", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Style(), this.getStyleSheet(), "style", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Tabindex(), this.getTabindexNumber(), "tabindex", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Title(), this.getText(), "title", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Type(), this.getContentType(), "type", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Usemap(), this.getURI(), "usemap", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectType_Width(), this.getLength(), "width", null, 0, 1, ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(olTypeEClass, OlType.class, "OlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOlType_Li(), this.getLiType(), null, "li", null, 1, -1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Style(), this.getStyleSheet(), "style", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOlType_Title(), this.getText(), "title", null, 0, 1, OlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramTypeEClass, ParamType.class, "ParamType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Name(), theXMLTypePackage.getAnySimpleType(), "name", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Type(), this.getContentType(), "type", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParamType_Valuetype(), this.getValuetypeType(), "valuetype", "data", 0, 1, ParamType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preContentEClass, PreContent.class, "PreContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PreContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreContent_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_A(), this.getAType(), null, "a", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Tt(), this.getTtType(), null, "tt", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_I(), this.getIType(), null, "i", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_B(), this.getBType(), null, "b", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Big(), this.getBigType(), null, "big", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Small(), this.getSmallType(), null, "small", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_U(), this.getUType(), null, "u", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Strike(), this.getStrikeType(), null, "strike", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Em(), this.getEmType(), null, "em", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Strong(), this.getStrongType(), null, "strong", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Dfn(), this.getDfnType(), null, "dfn", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Code(), this.getCodeType(), null, "code", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Q(), this.getQType(), null, "q", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Samp(), this.getSampType(), null, "samp", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Kbd(), this.getKbdType(), null, "kbd", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Var(), this.getVarType(), null, "var", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Cite(), this.getCiteType(), null, "cite", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Abbr(), this.getAbbrType(), null, "abbr", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Acronym(), this.getAcronymType(), null, "acronym", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Sub(), this.getSubType(), null, "sub", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Sup(), this.getSupType(), null, "sup", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Br(), this.getBrType(), null, "br", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Span(), this.getSpanType(), null, "span", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Ins(), this.getInsType(), null, "ins", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getPreContent_Del(), this.getDelType(), null, "del", null, 0, -1, PreContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(preTypeEClass, PreType.class, "PreType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPreType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Style(), this.getStyleSheet(), "style", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreType_Title(), this.getText(), "title", null, 0, 1, PreType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pTypeEClass, PType.class, "PType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Style(), this.getStyleSheet(), "style", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPType_Title(), this.getText(), "title", null, 0, 1, PType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qTypeEClass, QType.class, "QType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQType_Cite1(), this.getURI(), "cite1", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Style(), this.getStyleSheet(), "style", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQType_Title(), this.getText(), "title", null, 0, 1, QType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sampTypeEClass, SampType.class, "SampType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSampType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Style(), this.getStyleSheet(), "style", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSampType_Title(), this.getText(), "title", null, 0, 1, SampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(smallTypeEClass, SmallType.class, "SmallType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSmallType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Style(), this.getStyleSheet(), "style", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSmallType_Title(), this.getText(), "title", null, 0, 1, SmallType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanTypeEClass, SpanType.class, "SpanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Style(), this.getStyleSheet(), "style", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanType_Title(), this.getText(), "title", null, 0, 1, SpanType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strikeTypeEClass, StrikeType.class, "StrikeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrikeType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, StrikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrikeType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StrikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrikeType_Style(), this.getStyleSheet(), "style", null, 0, 1, StrikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrikeType_Title(), this.getText(), "title", null, 0, 1, StrikeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strongTypeEClass, StrongType.class, "StrongType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrongType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Style(), this.getStyleSheet(), "style", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStrongType_Title(), this.getText(), "title", null, 0, 1, StrongType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subTypeEClass, SubType.class, "SubType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Style(), this.getStyleSheet(), "style", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubType_Title(), this.getText(), "title", null, 0, 1, SubType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supTypeEClass, SupType.class, "SupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Style(), this.getStyleSheet(), "style", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupType_Title(), this.getText(), "title", null, 0, 1, SupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Caption(), this.getCaptionType(), null, "caption", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Col(), this.getColType(), null, "col", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Colgroup(), this.getColgroupType(), null, "colgroup", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Thead(), this.getTheadType(), null, "thead", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tfoot(), this.getTfootType(), null, "tfoot", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tr(), this.getTrType(), null, "tr", null, 0, -1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Border(), this.getPixels(), "border", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Cellpadding(), this.getLength(), "cellpadding", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Cellspacing(), this.getLength(), "cellspacing", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Style(), this.getStyleSheet(), "style", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Summary(), this.getText(), "summary", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Title(), this.getText(), "title", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Width(), this.getLength(), "width", null, 0, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tbodyTypeEClass, TbodyType.class, "TbodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTbodyType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Align(), this.getAlignType(), "align", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Char(), this.getCharacter(), "char", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Charoff(), this.getLength(), "charoff", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Style(), this.getStyleSheet(), "style", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Title(), this.getText(), "title", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTbodyType_Valign(), this.getValignType(), "valign", null, 0, 1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdTypeEClass, TdType.class, "TdType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTdType_Abbr1(), this.getText(), "abbr1", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Align(), this.getAlignType(), "align", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Axis(), theXMLTypePackage.getAnySimpleType(), "axis", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Char(), this.getCharacter(), "char", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Charoff(), this.getLength(), "charoff", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Colspan(), this.getNumber(), "colspan", "1", 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Headers(), theXMLTypePackage.getIDREFS(), "headers", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Rowspan(), this.getNumber(), "rowspan", "1", 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Scope(), this.getScope(), "scope", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Style(), this.getStyleSheet(), "style", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Title(), this.getText(), "title", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTdType_Valign(), this.getValignType(), "valign", null, 0, 1, TdType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tfootTypeEClass, TfootType.class, "TfootType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTfootType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Align(), this.getAlignType(), "align", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Char(), this.getCharacter(), "char", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Charoff(), this.getLength(), "charoff", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Style(), this.getStyleSheet(), "style", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Title(), this.getText(), "title", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTfootType_Valign(), this.getValignType(), "valign", null, 0, 1, TfootType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theadTypeEClass, TheadType.class, "TheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheadType_Tr(), this.getTrType(), null, "tr", null, 1, -1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Align(), this.getAlignType(), "align", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Char(), this.getCharacter(), "char", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Charoff(), this.getLength(), "charoff", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Style(), this.getStyleSheet(), "style", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Title(), this.getText(), "title", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTheadType_Valign(), this.getValignType(), "valign", null, 0, 1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thTypeEClass, ThType.class, "ThType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThType_Abbr1(), this.getText(), "abbr1", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Align(), this.getAlignType(), "align", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Axis(), theXMLTypePackage.getAnySimpleType(), "axis", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Char(), this.getCharacter(), "char", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Charoff(), this.getLength(), "charoff", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Colspan(), this.getNumber(), "colspan", "1", 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Headers(), theXMLTypePackage.getIDREFS(), "headers", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Rowspan(), this.getNumber(), "rowspan", "1", 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Scope(), this.getScope(), "scope", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Style(), this.getStyleSheet(), "style", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Title(), this.getText(), "title", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThType_Valign(), this.getValignType(), "valign", null, 0, 1, ThType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trTypeEClass, TrType.class, "TrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrType_Th(), this.getThType(), null, "th", null, 0, -1, TrType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrType_Td(), this.getTdType(), null, "td", null, 0, -1, TrType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Align(), this.getAlignType(), "align", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Char(), this.getCharacter(), "char", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Charoff(), this.getLength(), "charoff", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Style(), this.getStyleSheet(), "style", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Title(), this.getText(), "title", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrType_Valign(), this.getValignType(), "valign", null, 0, 1, TrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ttTypeEClass, TtType.class, "TtType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTtType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Style(), this.getStyleSheet(), "style", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTtType_Title(), this.getText(), "title", null, 0, 1, TtType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ulTypeEClass, UlType.class, "UlType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUlType_Li(), this.getLiType(), null, "li", null, 1, -1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Style(), this.getStyleSheet(), "style", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlType_Title(), this.getText(), "title", null, 0, 1, UlType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uTypeEClass, UType.class, "UType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, UType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, UType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUType_Style(), this.getStyleSheet(), "style", null, 0, 1, UType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUType_Title(), this.getText(), "title", null, 0, 1, UType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varTypeEClass, VarType.class, "VarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarType_Class(), theXMLTypePackage.getNMTOKENS(), "class", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Style(), this.getStyleSheet(), "style", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarType_Title(), this.getText(), "title", null, 0, 1, VarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(alignTypeEEnum, AlignType.class, "AlignType");
		addEEnumLiteral(alignTypeEEnum, AlignType.LEFT);
		addEEnumLiteral(alignTypeEEnum, AlignType.CENTER);
		addEEnumLiteral(alignTypeEEnum, AlignType.RIGHT);
		addEEnumLiteral(alignTypeEEnum, AlignType.JUSTIFY);
		addEEnumLiteral(alignTypeEEnum, AlignType.CHAR);

		initEEnum(declareTypeEEnum, DeclareType.class, "DeclareType");
		addEEnumLiteral(declareTypeEEnum, DeclareType.DECLARE);

		initEEnum(ismapTypeEEnum, IsmapType.class, "IsmapType");
		addEEnumLiteral(ismapTypeEEnum, IsmapType.ISMAP);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.ROW);
		addEEnumLiteral(scopeEEnum, Scope.COL);
		addEEnumLiteral(scopeEEnum, Scope.ROWGROUP);
		addEEnumLiteral(scopeEEnum, Scope.COLGROUP);

		initEEnum(shapeEEnum, Shape.class, "Shape");
		addEEnumLiteral(shapeEEnum, Shape.RECT);
		addEEnumLiteral(shapeEEnum, Shape.CIRCLE);
		addEEnumLiteral(shapeEEnum, Shape.POLY);
		addEEnumLiteral(shapeEEnum, Shape.DEFAULT);

		initEEnum(valignTypeEEnum, ValignType.class, "ValignType");
		addEEnumLiteral(valignTypeEEnum, ValignType.TOP);
		addEEnumLiteral(valignTypeEEnum, ValignType.MIDDLE);
		addEEnumLiteral(valignTypeEEnum, ValignType.BOTTOM);
		addEEnumLiteral(valignTypeEEnum, ValignType.BASELINE);

		initEEnum(valuetypeTypeEEnum, ValuetypeType.class, "ValuetypeType");
		addEEnumLiteral(valuetypeTypeEEnum, ValuetypeType.DATA);
		addEEnumLiteral(valuetypeTypeEEnum, ValuetypeType.REF);
		addEEnumLiteral(valuetypeTypeEEnum, ValuetypeType.OBJECT);

		// Initialize data types
		initEDataType(alignTypeObjectEDataType, AlignType.class, "AlignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(characterEDataType, String.class, "Character", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charsetEDataType, String.class, "Charset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charsetsEDataType, String.class, "Charsets", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentTypeEDataType, String.class, "ContentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(contentTypesEDataType, String.class, "ContentTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(coordsEDataType, String.class, "Coords", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datetimeEDataType, XMLGregorianCalendar.class, "Datetime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(declareTypeObjectEDataType, DeclareType.class, "DeclareTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ismapTypeObjectEDataType, IsmapType.class, "IsmapTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(languageCodeEDataType, String.class, "LanguageCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lengthEDataType, String.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(linkTypesEDataType, List.class, "LinkTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multiLengthEDataType, String.class, "MultiLength", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(numberEDataType, BigInteger.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pixelsEDataType, BigInteger.class, "Pixels", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scopeObjectEDataType, Scope.class, "ScopeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(scriptEDataType, String.class, "Script", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(shapeObjectEDataType, Shape.class, "ShapeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(styleSheetEDataType, String.class, "StyleSheet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tabindexNumberEDataType, BigInteger.class, "TabindexNumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(textEDataType, String.class, "Text", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriListEDataType, String.class, "UriList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valignTypeObjectEDataType, ValignType.class, "ValignTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(valuetypeTypeObjectEDataType, ValuetypeType.class, "ValuetypeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.w3.org/XML/1998/namespace
		createNamespaceAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNamespaceAnnotations() {
		String source = "http://www.w3.org/XML/1998/namespace";			
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "lang", "en"
		   });																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
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
		  (abbrTypeEClass, 
		   source, 
		   new String[] {
			 "name", "abbr_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAbbrType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getAbbrType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAbbrType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getAbbrType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (aContentEClass, 
		   source, 
		   new String[] {
			 "name", "a.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getAContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getAContent_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAContent_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAContent_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getAContent_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAContent_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getAContent_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (acronymTypeEClass, 
		   source, 
		   new String[] {
			 "name", "acronym_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAcronymType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getAcronymType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAcronymType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getAcronymType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (addressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "address_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAddressType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getAddressType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAddressType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getAddressType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (alignTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "align_._type"
		   });		
		addAnnotation
		  (alignTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "align_._type:Object",
			 "baseType", "align_._type"
		   });		
		addAnnotation
		  (aTypeEClass, 
		   source, 
		   new String[] {
			 "name", "a_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAType_Charset(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charset"
		   });		
		addAnnotation
		  (getAType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getAType_Coords(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "coords"
		   });		
		addAnnotation
		  (getAType_Href(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "href"
		   });		
		addAnnotation
		  (getAType_Hreflang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hreflang"
		   });		
		addAnnotation
		  (getAType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getAType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getAType_Rel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rel"
		   });		
		addAnnotation
		  (getAType_Rev(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rev"
		   });		
		addAnnotation
		  (getAType_Shape(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "shape"
		   });		
		addAnnotation
		  (getAType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getAType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getAType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (bigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "big_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getBigType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getBigType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBigType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getBigType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (blockEClass, 
		   source, 
		   new String[] {
			 "name", "Block",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlock_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getBlock_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h1",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h2",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h3",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h4",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h5",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_H6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h6",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getBlock_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getBlock_Ul(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ul",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getBlock_Ol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ol",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Dl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dl",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getBlock_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Hr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hr",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Blockquote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockquote",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getBlock_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getBlock_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (blockquoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "blockquote_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBlockquoteType_Cite(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cite"
		   });		
		addAnnotation
		  (getBlockquoteType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getBlockquoteType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBlockquoteType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getBlockquoteType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (bodyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "body_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBodyType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getBodyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBodyType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getBodyType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (brTypeEClass, 
		   source, 
		   new String[] {
			 "name", "br_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getBrType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getBrType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBrType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getBrType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (bTypeEClass, 
		   source, 
		   new String[] {
			 "name", "b_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getBType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getBType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getBType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (captionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "caption_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCaptionType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getCaptionType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCaptionType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getCaptionType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (characterEDataType, 
		   source, 
		   new String[] {
			 "name", "Character",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "length", "1"
		   });			
		addAnnotation
		  (charsetEDataType, 
		   source, 
		   new String[] {
			 "name", "Charset",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (charsetsEDataType, 
		   source, 
		   new String[] {
			 "name", "Charsets",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (citeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cite_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCiteType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getCiteType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCiteType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getCiteType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (codeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "code_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCodeType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getCodeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCodeType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getCodeType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (colgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "colgroup_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getColgroupType_Col(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "col",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getColgroupType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getColgroupType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getColgroupType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getColgroupType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getColgroupType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getColgroupType_Span(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "span"
		   });		
		addAnnotation
		  (getColgroupType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getColgroupType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getColgroupType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (getColgroupType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (colTypeEClass, 
		   source, 
		   new String[] {
			 "name", "col_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getColType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getColType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getColType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getColType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getColType_Span(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "span"
		   });		
		addAnnotation
		  (getColType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getColType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getColType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (getColType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });			
		addAnnotation
		  (contentTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ContentType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (contentTypesEDataType, 
		   source, 
		   new String[] {
			 "name", "ContentTypes",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (coordsEDataType, 
		   source, 
		   new String[] {
			 "name", "Coords",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (datetimeEDataType, 
		   source, 
		   new String[] {
			 "name", "Datetime",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime"
		   });		
		addAnnotation
		  (ddTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dd_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDdType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDdType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDdType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDdType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (declareTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "declare_._type"
		   });		
		addAnnotation
		  (declareTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "declare_._type:Object",
			 "baseType", "declare_._type"
		   });		
		addAnnotation
		  (delTypeEClass, 
		   source, 
		   new String[] {
			 "name", "del_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDelType_Cite1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cite"
		   });		
		addAnnotation
		  (getDelType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDelType_Datetime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datetime"
		   });		
		addAnnotation
		  (getDelType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDelType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDelType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (dfnTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dfn_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDfnType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDfnType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDfnType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDfnType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (divTypeEClass, 
		   source, 
		   new String[] {
			 "name", "div_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDivType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDivType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDivType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDivType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (dlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dl_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDlType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDlType_Dt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dt",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDlType_Dd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dd",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDlType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDlType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDlType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDlType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
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
		  (getDocumentRoot_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Blockquote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockquote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "body",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Caption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caption",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Col(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "col",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Colgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dd",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Dt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dt",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h1",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h2",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h3",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h4",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h5",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_H6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h6",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Hr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Html(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "html",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Li(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "li",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Ol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
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
		  (getDocumentRoot_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Td(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "td",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tfoot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tfoot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Th(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "th",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tr",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Ul(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ul",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDocumentRoot_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (dtTypeEClass, 
		   source, 
		   new String[] {
			 "name", "dt_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDtType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getDtType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDtType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getDtType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (emTypeEClass, 
		   source, 
		   new String[] {
			 "name", "em_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEmType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getEmType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getEmType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getEmType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (flowEClass, 
		   source, 
		   new String[] {
			 "name", "Flow",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFlow_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getFlow_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getFlow_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h1",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h2",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h3",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h4",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h5",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_H6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h6",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Ul(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ul",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Ol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ol",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Dl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dl",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Hr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Blockquote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockquote",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getFlow_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getFlow_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (formContentEClass, 
		   source, 
		   new String[] {
			 "name", "form.content",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFormContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getFormContent_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h1",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h2",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h3",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h4",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h5",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_H6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h6",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getFormContent_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getFormContent_Ul(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ul",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getFormContent_Ol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ol",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Dl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dl",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getFormContent_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Hr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hr",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Blockquote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockquote",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });			
		addAnnotation
		  (getFormContent_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getFormContent_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (h1TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h1_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH1Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH1Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH1Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH1Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (h2TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h2_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH2Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH2Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH2Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH2Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (h3TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h3_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH3Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH3Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH3Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH3Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (h4TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h4_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH4Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH4Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH4Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH4Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (h5TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h5_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH5Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH5Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH5Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH5Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (h6TypeEClass, 
		   source, 
		   new String[] {
			 "name", "h6_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getH6Type_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getH6Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getH6Type_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getH6Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (hrTypeEClass, 
		   source, 
		   new String[] {
			 "name", "hr_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getHrType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getHrType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getHrType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getHrType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (htmlTypeEClass, 
		   source, 
		   new String[] {
			 "name", "html_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHtmlType_Body(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "body",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHtmlType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (imgTypeEClass, 
		   source, 
		   new String[] {
			 "name", "img_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getImgType_Alt(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "alt"
		   });		
		addAnnotation
		  (getImgType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getImgType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height"
		   });		
		addAnnotation
		  (getImgType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getImgType_Ismap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ismap"
		   });		
		addAnnotation
		  (getImgType_Longdesc(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "longdesc"
		   });		
		addAnnotation
		  (getImgType_Src(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "src"
		   });		
		addAnnotation
		  (getImgType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getImgType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (getImgType_Usemap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "usemap"
		   });		
		addAnnotation
		  (getImgType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });			
		addAnnotation
		  (inlineEClass, 
		   source, 
		   new String[] {
			 "name", "Inline",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getInline_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getInline_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getInline_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getInline_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getInline_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getInline_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getInline_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getInline_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (insTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ins_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getInsType_Cite1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cite"
		   });		
		addAnnotation
		  (getInsType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getInsType_Datetime(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "datetime"
		   });		
		addAnnotation
		  (getInsType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getInsType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getInsType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (ismapTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "ismap_._type"
		   });		
		addAnnotation
		  (ismapTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "ismap_._type:Object",
			 "baseType", "ismap_._type"
		   });		
		addAnnotation
		  (iTypeEClass, 
		   source, 
		   new String[] {
			 "name", "i_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getIType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getIType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getIType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getIType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (kbdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "kbd_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getKbdType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getKbdType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getKbdType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getKbdType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (languageCodeEDataType, 
		   source, 
		   new String[] {
			 "name", "LanguageCode",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#language"
		   });			
		addAnnotation
		  (lengthEDataType, 
		   source, 
		   new String[] {
			 "name", "Length",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });			
		addAnnotation
		  (linkTypesEDataType, 
		   source, 
		   new String[] {
			 "name", "LinkTypes",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKENS"
		   });		
		addAnnotation
		  (liTypeEClass, 
		   source, 
		   new String[] {
			 "name", "li_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getLiType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getLiType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getLiType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getLiType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (multiLengthEDataType, 
		   source, 
		   new String[] {
			 "name", "MultiLength",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[-+]?(\\d+|\\d+(\\.\\d+)?%25)|[1-9]?(\\d+)?\\*"
		   });			
		addAnnotation
		  (numberEDataType, 
		   source, 
		   new String[] {
			 "name", "Number",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger",
			 "pattern", "[0-9]+"
		   });		
		addAnnotation
		  (objectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "object_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getObjectType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getObjectType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getObjectType_Param(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "param",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_P(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "p",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H1(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h1",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h2",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h3",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h4",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h5",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_H6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "h6",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Div(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "div",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Ul(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ul",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Ol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ol",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Dl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dl",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Pre(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pre",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Hr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Blockquote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "blockquote",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Object(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "object",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Img(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "img",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getObjectType_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getObjectType_Archive(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "archive"
		   });		
		addAnnotation
		  (getObjectType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getObjectType_Classid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "classid"
		   });		
		addAnnotation
		  (getObjectType_Codebase(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codebase"
		   });		
		addAnnotation
		  (getObjectType_Codetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "codetype"
		   });		
		addAnnotation
		  (getObjectType_Data(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data"
		   });		
		addAnnotation
		  (getObjectType_Declare(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "declare"
		   });		
		addAnnotation
		  (getObjectType_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height"
		   });		
		addAnnotation
		  (getObjectType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getObjectType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getObjectType_Standby(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "standby"
		   });		
		addAnnotation
		  (getObjectType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getObjectType_Tabindex(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tabindex"
		   });		
		addAnnotation
		  (getObjectType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getObjectType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getObjectType_Usemap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "usemap"
		   });		
		addAnnotation
		  (getObjectType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (olTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ol_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getOlType_Li(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "li",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOlType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getOlType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getOlType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getOlType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (paramTypeEClass, 
		   source, 
		   new String[] {
			 "name", "param_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getParamType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getParamType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getParamType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getParamType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (getParamType_Valuetype(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valuetype"
		   });			
		addAnnotation
		  (pixelsEDataType, 
		   source, 
		   new String[] {
			 "name", "Pixels",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger"
		   });			
		addAnnotation
		  (preContentEClass, 
		   source, 
		   new String[] {
			 "name", "pre.content",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPreContent_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getPreContent_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });			
		addAnnotation
		  (getPreContent_A(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "a",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Tt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tt",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_I(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "i",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_B(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "b",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Big(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "big",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Small(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "small",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_U(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "u",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Strike(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strike",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Em(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "em",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Strong(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "strong",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Dfn(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "dfn",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Q(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "q",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Samp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "samp",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Kbd(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "kbd",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Var(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "var",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Cite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cite",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Abbr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abbr",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Acronym(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "acronym",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Sub(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sub",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Sup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sup",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Br(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "br",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });			
		addAnnotation
		  (getPreContent_Span(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "span",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPreContent_Ins(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ins",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getPreContent_Del(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "del",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (preTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pre_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPreType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getPreType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPreType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getPreType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (pTypeEClass, 
		   source, 
		   new String[] {
			 "name", "p_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getPType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getPType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (qTypeEClass, 
		   source, 
		   new String[] {
			 "name", "q_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getQType_Cite1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cite"
		   });		
		addAnnotation
		  (getQType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getQType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getQType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getQType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (sampTypeEClass, 
		   source, 
		   new String[] {
			 "name", "samp_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSampType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSampType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSampType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getSampType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (scopeEEnum, 
		   source, 
		   new String[] {
			 "name", "Scope"
		   });		
		addAnnotation
		  (scopeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Scope:Object",
			 "baseType", "Scope"
		   });			
		addAnnotation
		  (scriptEDataType, 
		   source, 
		   new String[] {
			 "name", "Script",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (shapeEEnum, 
		   source, 
		   new String[] {
			 "name", "Shape"
		   });		
		addAnnotation
		  (shapeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "Shape:Object",
			 "baseType", "Shape"
		   });		
		addAnnotation
		  (smallTypeEClass, 
		   source, 
		   new String[] {
			 "name", "small_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSmallType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSmallType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSmallType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getSmallType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (spanTypeEClass, 
		   source, 
		   new String[] {
			 "name", "span_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSpanType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSpanType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSpanType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getSpanType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (strikeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "strike_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getStrikeType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getStrikeType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStrikeType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getStrikeType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (strongTypeEClass, 
		   source, 
		   new String[] {
			 "name", "strong_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getStrongType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getStrongType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStrongType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getStrongType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (styleSheetEDataType, 
		   source, 
		   new String[] {
			 "name", "StyleSheet",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (subTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sub_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSubType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSubType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSubType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getSubType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (supTypeEClass, 
		   source, 
		   new String[] {
			 "name", "sup_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSupType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getSupType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getSupType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getSupType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (tabindexNumberEDataType, 
		   source, 
		   new String[] {
			 "name", "tabindexNumber",
			 "baseType", "Number",
			 "minInclusive", "0",
			 "maxInclusive", "32767"
		   });		
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "table_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableType_Caption(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caption",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTableType_Col(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "col",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getTableType_Colgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Tfoot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tfoot",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Tr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Border(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "border"
		   });		
		addAnnotation
		  (getTableType_Cellpadding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cellpadding"
		   });		
		addAnnotation
		  (getTableType_Cellspacing(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cellspacing"
		   });		
		addAnnotation
		  (getTableType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTableType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTableType_Summary(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "summary"
		   });		
		addAnnotation
		  (getTableType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTableType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (tbodyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tbody_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTbodyType_Tr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTbodyType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getTbodyType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getTbodyType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getTbodyType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTbodyType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTbodyType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTbodyType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTbodyType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (tdTypeEClass, 
		   source, 
		   new String[] {
			 "name", "td_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTdType_Abbr1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abbr"
		   });		
		addAnnotation
		  (getTdType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getTdType_Axis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "axis"
		   });		
		addAnnotation
		  (getTdType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getTdType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getTdType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTdType_Colspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colspan"
		   });		
		addAnnotation
		  (getTdType_Headers(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "headers"
		   });		
		addAnnotation
		  (getTdType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTdType_Rowspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowspan"
		   });		
		addAnnotation
		  (getTdType_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });		
		addAnnotation
		  (getTdType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTdType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTdType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });			
		addAnnotation
		  (textEDataType, 
		   source, 
		   new String[] {
			 "name", "Text",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (tfootTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tfoot_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTfootType_Tr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTfootType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getTfootType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getTfootType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getTfootType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTfootType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTfootType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTfootType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTfootType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (theadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "thead_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTheadType_Tr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTheadType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getTheadType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getTheadType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getTheadType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTheadType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTheadType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTheadType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTheadType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (thTypeEClass, 
		   source, 
		   new String[] {
			 "name", "th_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getThType_Abbr1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "abbr"
		   });		
		addAnnotation
		  (getThType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getThType_Axis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "axis"
		   });		
		addAnnotation
		  (getThType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getThType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getThType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getThType_Colspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colspan"
		   });		
		addAnnotation
		  (getThType_Headers(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "headers"
		   });		
		addAnnotation
		  (getThType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getThType_Rowspan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowspan"
		   });		
		addAnnotation
		  (getThType_Scope(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scope"
		   });		
		addAnnotation
		  (getThType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getThType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getThType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (trTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tr_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTrType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getTrType_Th(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "th",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTrType_Td(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "td",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getTrType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align"
		   });		
		addAnnotation
		  (getTrType_Char(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "char"
		   });		
		addAnnotation
		  (getTrType_Charoff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "charoff"
		   });		
		addAnnotation
		  (getTrType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTrType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTrType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTrType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getTrType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign"
		   });		
		addAnnotation
		  (ttTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tt_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTtType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getTtType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTtType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getTtType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (ulTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ul_._type",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getUlType_Li(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "li",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUlType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getUlType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getUlType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getUlType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });			
		addAnnotation
		  (uriEDataType, 
		   source, 
		   new String[] {
			 "name", "URI",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI"
		   });			
		addAnnotation
		  (uriListEDataType, 
		   source, 
		   new String[] {
			 "name", "UriList",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (uTypeEClass, 
		   source, 
		   new String[] {
			 "name", "u_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getUType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getUType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getUType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getUType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (valignTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "valign_._type"
		   });		
		addAnnotation
		  (valignTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "valign_._type:Object",
			 "baseType", "valign_._type"
		   });		
		addAnnotation
		  (valuetypeTypeEEnum, 
		   source, 
		   new String[] {
			 "name", "valuetype_._type"
		   });		
		addAnnotation
		  (valuetypeTypeObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "valuetype_._type:Object",
			 "baseType", "valuetype_._type"
		   });		
		addAnnotation
		  (varTypeEClass, 
		   source, 
		   new String[] {
			 "name", "var_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getVarType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getVarType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getVarType_Style(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "style"
		   });		
		addAnnotation
		  (getVarType_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });
	}

} //XhtmlPackageImpl
