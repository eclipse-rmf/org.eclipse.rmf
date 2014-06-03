/**
 * Copyright (c) 2013 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.datatypes.impl;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.rmf.reqif10.datatypes.DatatypesFactory;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.datatypes.FrameTargetMember0;
import org.eclipse.rmf.reqif10.datatypes.util.DatatypesValidator;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class DatatypesPackageImpl extends EPackageImpl implements DatatypesPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum frameTargetMember0EEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType cdataEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType characterEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType charsetEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType charsetsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType colorMember1EDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType contentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType contentTypesEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType curieEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType curiEsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType datetimeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType fpiEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType frameTargetEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType frameTargetMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType frameTargetMember1EDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType languageCodeEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType languageCodesEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType lengthMember1EDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType linkTypesEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType mediaDescEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType multiLengthEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType multiLengthMember1EDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType multiLengthsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType numberEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType pixelsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType safeCURIEEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType safeCURIEsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType scriptEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType textEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType urIorSafeCURIEEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType urIorSafeCURIEsEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType urirefEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType urIsEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.rmf.reqif10.datatypes.DatatypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatatypesPackageImpl() {
		super(eNS_URI, DatatypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * <p>
	 * This method is used to initialize {@link DatatypesPackage#eINSTANCE} when that field is accessed. Clients should
	 * not invoke it directly. Instead, they should simply access that field to obtain the package. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatatypesPackage init() {
		if (isInited)
			return (DatatypesPackage) EPackage.Registry.INSTANCE.getEPackage(DatatypesPackage.eNS_URI);

		// Obtain or create and register package
		DatatypesPackageImpl theDatatypesPackage = (DatatypesPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DatatypesPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new DatatypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLNamespacePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		XhtmlPackageImpl theXhtmlPackage = (XhtmlPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(XhtmlPackage.eNS_URI) instanceof XhtmlPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(XhtmlPackage.eNS_URI) : XhtmlPackage.eINSTANCE);

		// Load packages
		theXhtmlPackage.loadPackage();

		// Create package meta-data objects
		theDatatypesPackage.createPackageContents();

		// Initialize created meta-data
		theDatatypesPackage.initializePackageContents();

		// Fix loaded packages
		theXhtmlPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theDatatypesPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return DatatypesValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theDatatypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, theDatatypesPackage);
		return theDatatypesPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getFrameTargetMember0() {
		return frameTargetMember0EEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCDATA() {
		return cdataEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCharacter() {
		return characterEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCharset() {
		return charsetEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCharsets() {
		return charsetsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getColorMember1() {
		return colorMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getContentType() {
		return contentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getContentTypes() {
		return contentTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCURIE() {
		return curieEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getCURIEs() {
		return curiEsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getDatetime() {
		return datetimeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFPI() {
		return fpiEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFrameTarget() {
		return frameTargetEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFrameTargetMember0Object() {
		return frameTargetMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getFrameTargetMember1() {
		return frameTargetMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLanguageCode() {
		return languageCodeEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLanguageCodes() {
		return languageCodesEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLength() {
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLengthMember1() {
		return lengthMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getLinkTypes() {
		return linkTypesEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMediaDesc() {
		return mediaDescEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMultiLength() {
		return multiLengthEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMultiLengthMember1() {
		return multiLengthMember1EDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getMultiLengths() {
		return multiLengthsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNumber() {
		return numberEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getPixels() {
		return pixelsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getSafeCURIE() {
		return safeCURIEEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getSafeCURIEs() {
		return safeCURIEsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getScript() {
		return scriptEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getText() {
		return textEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURIorSafeCURIE() {
		return urIorSafeCURIEEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURIorSafeCURIEs() {
		return urIorSafeCURIEsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURIREF() {
		return urirefEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getURIs() {
		return urIsEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DatatypesFactory getDatatypesFactory() {
		return (DatatypesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
	 * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create enums
		frameTargetMember0EEnum = createEEnum(FRAME_TARGET_MEMBER0);

		// Create data types
		cdataEDataType = createEDataType(CDATA);
		characterEDataType = createEDataType(CHARACTER);
		charsetEDataType = createEDataType(CHARSET);
		charsetsEDataType = createEDataType(CHARSETS);
		colorEDataType = createEDataType(COLOR);
		colorMember1EDataType = createEDataType(COLOR_MEMBER1);
		contentTypeEDataType = createEDataType(CONTENT_TYPE);
		contentTypesEDataType = createEDataType(CONTENT_TYPES);
		curieEDataType = createEDataType(CURIE);
		curiEsEDataType = createEDataType(CURI_ES);
		datetimeEDataType = createEDataType(DATETIME);
		fpiEDataType = createEDataType(FPI);
		frameTargetEDataType = createEDataType(FRAME_TARGET);
		frameTargetMember0ObjectEDataType = createEDataType(FRAME_TARGET_MEMBER0_OBJECT);
		frameTargetMember1EDataType = createEDataType(FRAME_TARGET_MEMBER1);
		languageCodeEDataType = createEDataType(LANGUAGE_CODE);
		languageCodesEDataType = createEDataType(LANGUAGE_CODES);
		lengthEDataType = createEDataType(LENGTH);
		lengthMember1EDataType = createEDataType(LENGTH_MEMBER1);
		linkTypesEDataType = createEDataType(LINK_TYPES);
		mediaDescEDataType = createEDataType(MEDIA_DESC);
		multiLengthEDataType = createEDataType(MULTI_LENGTH);
		multiLengthMember1EDataType = createEDataType(MULTI_LENGTH_MEMBER1);
		multiLengthsEDataType = createEDataType(MULTI_LENGTHS);
		numberEDataType = createEDataType(NUMBER);
		pixelsEDataType = createEDataType(PIXELS);
		safeCURIEEDataType = createEDataType(SAFE_CURIE);
		safeCURIEsEDataType = createEDataType(SAFE_CURI_ES);
		scriptEDataType = createEDataType(SCRIPT);
		textEDataType = createEDataType(TEXT);
		uriEDataType = createEDataType(URI);
		urIorSafeCURIEEDataType = createEDataType(UR_IOR_SAFE_CURIE);
		urIorSafeCURIEsEDataType = createEDataType(UR_IOR_SAFE_CURI_ES);
		urirefEDataType = createEDataType(URIREF);
		urIsEDataType = createEDataType(UR_IS);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
	 * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(frameTargetMember0EEnum, FrameTargetMember0.class, "FrameTargetMember0"); //$NON-NLS-1$
		addEEnumLiteral(frameTargetMember0EEnum, FrameTargetMember0.BLANK);
		addEEnumLiteral(frameTargetMember0EEnum, FrameTargetMember0.SELF);
		addEEnumLiteral(frameTargetMember0EEnum, FrameTargetMember0.PARENT);
		addEEnumLiteral(frameTargetMember0EEnum, FrameTargetMember0.TOP);

		// Initialize data types
		initEDataType(cdataEDataType, String.class, "CDATA", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(characterEDataType, String.class, "Character", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(charsetEDataType, String.class, "Charset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(charsetsEDataType, List.class, "Charsets", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(colorEDataType, String.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(colorMember1EDataType, String.class, "ColorMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(contentTypeEDataType, String.class, "ContentType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(contentTypesEDataType, String.class, "ContentTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(curieEDataType, String.class, "CURIE", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(curiEsEDataType, List.class, "CURIEs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(datetimeEDataType, XMLGregorianCalendar.class, "Datetime", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(fpiEDataType, String.class, "FPI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(frameTargetEDataType, Object.class, "FrameTarget", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(frameTargetMember0ObjectEDataType, FrameTargetMember0.class,
				"FrameTargetMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(frameTargetMember1EDataType, String.class, "FrameTargetMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(languageCodeEDataType, String.class, "LanguageCode", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(languageCodesEDataType, String.class, "LanguageCodes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(lengthEDataType, Object.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(lengthMember1EDataType, String.class, "LengthMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(linkTypesEDataType, List.class, "LinkTypes", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(mediaDescEDataType, String.class, "MediaDesc", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(multiLengthEDataType, Object.class, "MultiLength", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(multiLengthMember1EDataType, String.class, "MultiLengthMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(multiLengthsEDataType, String.class, "MultiLengths", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(numberEDataType, BigInteger.class, "Number", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(pixelsEDataType, BigInteger.class, "Pixels", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(safeCURIEEDataType, String.class, "SafeCURIE", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(safeCURIEsEDataType, List.class, "SafeCURIEs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(scriptEDataType, String.class, "Script", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(textEDataType, String.class, "Text", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(uriEDataType, String.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(urIorSafeCURIEEDataType, String.class, "URIorSafeCURIE", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(urIorSafeCURIEsEDataType, List.class, "URIorSafeCURIEs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(urirefEDataType, String.class, "URIREF", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEDataType(urIsEDataType, List.class, "URIs", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$			
		addAnnotation(cdataEDataType, source, new String[] { "name", "CDATA", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(characterEDataType, source, new String[] { "name", "Character", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
				"length", "1" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(charsetEDataType, source, new String[] { "name", "Charset", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(charsetsEDataType, source, new String[] { "name", "Charsets", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "Charset" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(colorEDataType, source, new String[] { "name", "Color", //$NON-NLS-1$ //$NON-NLS-2$
				"memberTypes", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN Color_._member_._1" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(colorMember1EDataType, source, new String[] { "name", "Color_._member_._1", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "#[0-9a-fA-F]{3}([0-9a-fA-F]{3})?" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(contentTypeEDataType, source, new String[] { "name", "ContentType", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(contentTypesEDataType, source, new String[] { "name", "ContentTypes", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(curieEDataType, source, new String[] { "name", "CURIE", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
				"minLength", "1", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "(([\\i-[:]][\\c-[:]]*)?:)?.+" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(curiEsEDataType, source, new String[] { "name", "CURIEs", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "CURIE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(datetimeEDataType, source, new String[] { "name", "Datetime", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#dateTime" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(fpiEDataType, source, new String[] { "name", "FPI", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#normalizedString" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(frameTargetEDataType, source, new String[] { "name", "FrameTarget", //$NON-NLS-1$ //$NON-NLS-2$
				"memberTypes", "FrameTarget_._member_._0 FrameTarget_._member_._1" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(frameTargetMember0EEnum, source, new String[] { "name", "FrameTarget_._member_._0" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(frameTargetMember0ObjectEDataType, source, new String[] { "name", "FrameTarget_._member_._0:Object", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "FrameTarget_._member_._0" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(frameTargetMember1EDataType, source, new String[] { "name", "FrameTarget_._member_._1", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "[a-zA-Z].*" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(languageCodeEDataType, source, new String[] { "name", "LanguageCode", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#language" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(languageCodesEDataType, source, new String[] { "name", "LanguageCodes", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(lengthEDataType, source, new String[] { "name", "Length", //$NON-NLS-1$ //$NON-NLS-2$
				"memberTypes", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger Length_._member_._1" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(lengthMember1EDataType, source, new String[] { "name", "Length_._member_._1", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "\\d+[%25]|\\d*\\.\\d+[%25]" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(linkTypesEDataType, source, new String[] { "name", "LinkTypes", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "http://www.eclipse.org/emf/2003/XMLType#NMTOKEN" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(mediaDescEDataType, source, new String[] { "name", "MediaDesc", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(multiLengthEDataType, source, new String[] { "name", "MultiLength", //$NON-NLS-1$ //$NON-NLS-2$
				"memberTypes", "Length MultiLength_._member_._1" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(multiLengthMember1EDataType, source, new String[] { "name", "MultiLength_._member_._1", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#token", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "\\d*\\*" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(multiLengthsEDataType, source, new String[] { "name", "MultiLengths", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(numberEDataType, source, new String[] { "name", "Number", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(pixelsEDataType, source, new String[] { "name", "Pixels", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(safeCURIEEDataType, source, new String[] { "name", "SafeCURIE", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
				"minLength", "3", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "\\[(([\\i-[:]][\\c-[:]]*)?:)?.+\\]" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(safeCURIEsEDataType, source, new String[] { "name", "SafeCURIEs", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "SafeCURIE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(scriptEDataType, source, new String[] { "name", "Script", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(textEDataType, source, new String[] { "name", "Text", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(uriEDataType, source, new String[] { "name", "URI", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#anyURI" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(urIorSafeCURIEEDataType, source, new String[] { "name", "URIorSafeCURIE", //$NON-NLS-1$ //$NON-NLS-2$
				"memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI SafeCURIE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(urIorSafeCURIEsEDataType, source, new String[] { "name", "URIorSafeCURIEs", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "URIorSafeCURIE" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(urirefEDataType, source, new String[] { "name", "URIREF", //$NON-NLS-1$ //$NON-NLS-2$
				"baseType", "http://www.eclipse.org/emf/2003/XMLType#string", //$NON-NLS-1$ //$NON-NLS-2$
				"minLength", "1", //$NON-NLS-1$ //$NON-NLS-2$
				"pattern", "#\\c*" //$NON-NLS-1$ //$NON-NLS-2$
		});
		addAnnotation(urIsEDataType, source, new String[] { "name", "URIs", //$NON-NLS-1$ //$NON-NLS-2$
				"itemType", "http://www.eclipse.org/emf/2003/XMLType#anyURI" //$NON-NLS-1$ //$NON-NLS-2$
		});
	}

} // DatatypesPackageImpl
