/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.datatypes.util;

import java.math.BigInteger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.rmf.reqif10.datatypes.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.datatypes.DatatypesPackage
 * @generated
 */
public class DatatypesValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DatatypesValidator INSTANCE = new DatatypesValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.rmf.reqif10.datatypes";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypesValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DatatypesPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DatatypesPackage.FRAME_TARGET_MEMBER0:
				return validateFrameTargetMember0((FrameTargetMember0)value, diagnostics, context);
			case DatatypesPackage.CDATA:
				return validateCDATA((String)value, diagnostics, context);
			case DatatypesPackage.CHARACTER:
				return validateCharacter((String)value, diagnostics, context);
			case DatatypesPackage.CHARSET:
				return validateCharset((String)value, diagnostics, context);
			case DatatypesPackage.CHARSETS:
				return validateCharsets((List<?>)value, diagnostics, context);
			case DatatypesPackage.COLOR:
				return validateColor((String)value, diagnostics, context);
			case DatatypesPackage.COLOR_MEMBER1:
				return validateColorMember1((String)value, diagnostics, context);
			case DatatypesPackage.CONTENT_TYPE:
				return validateContentType((String)value, diagnostics, context);
			case DatatypesPackage.CONTENT_TYPES:
				return validateContentTypes((String)value, diagnostics, context);
			case DatatypesPackage.CURIE:
				return validateCURIE((String)value, diagnostics, context);
			case DatatypesPackage.CURI_ES:
				return validateCURIEs((List<?>)value, diagnostics, context);
			case DatatypesPackage.DATETIME:
				return validateDatetime((XMLGregorianCalendar)value, diagnostics, context);
			case DatatypesPackage.FPI:
				return validateFPI((String)value, diagnostics, context);
			case DatatypesPackage.FRAME_TARGET:
				return validateFrameTarget(value, diagnostics, context);
			case DatatypesPackage.FRAME_TARGET_MEMBER0_OBJECT:
				return validateFrameTargetMember0Object((FrameTargetMember0)value, diagnostics, context);
			case DatatypesPackage.FRAME_TARGET_MEMBER1:
				return validateFrameTargetMember1((String)value, diagnostics, context);
			case DatatypesPackage.LANGUAGE_CODE:
				return validateLanguageCode((String)value, diagnostics, context);
			case DatatypesPackage.LANGUAGE_CODES:
				return validateLanguageCodes((String)value, diagnostics, context);
			case DatatypesPackage.LENGTH:
				return validateLength(value, diagnostics, context);
			case DatatypesPackage.LENGTH_MEMBER1:
				return validateLengthMember1((String)value, diagnostics, context);
			case DatatypesPackage.LINK_TYPES:
				return validateLinkTypes((List<?>)value, diagnostics, context);
			case DatatypesPackage.MEDIA_DESC:
				return validateMediaDesc((String)value, diagnostics, context);
			case DatatypesPackage.MULTI_LENGTH:
				return validateMultiLength(value, diagnostics, context);
			case DatatypesPackage.MULTI_LENGTH_MEMBER1:
				return validateMultiLengthMember1((String)value, diagnostics, context);
			case DatatypesPackage.MULTI_LENGTHS:
				return validateMultiLengths((String)value, diagnostics, context);
			case DatatypesPackage.NUMBER:
				return validateNumber((BigInteger)value, diagnostics, context);
			case DatatypesPackage.PIXELS:
				return validatePixels((BigInteger)value, diagnostics, context);
			case DatatypesPackage.SAFE_CURIE:
				return validateSafeCURIE((String)value, diagnostics, context);
			case DatatypesPackage.SAFE_CURI_ES:
				return validateSafeCURIEs((List<?>)value, diagnostics, context);
			case DatatypesPackage.SCRIPT:
				return validateScript((String)value, diagnostics, context);
			case DatatypesPackage.TEXT:
				return validateText((String)value, diagnostics, context);
			case DatatypesPackage.URI:
				return validateURI((String)value, diagnostics, context);
			case DatatypesPackage.UR_IOR_SAFE_CURIE:
				return validateURIorSafeCURIE((String)value, diagnostics, context);
			case DatatypesPackage.UR_IOR_SAFE_CURI_ES:
				return validateURIorSafeCURIEs((List<?>)value, diagnostics, context);
			case DatatypesPackage.URIREF:
				return validateURIREF((String)value, diagnostics, context);
			case DatatypesPackage.UR_IS:
				return validateURIs((List<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTargetMember0(FrameTargetMember0 frameTargetMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDATA(String cdata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacter_MinLength(character, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_MaxLength(character, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MinLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DatatypesPackage.Literals.CHARACTER, character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MaxLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(DatatypesPackage.Literals.CHARACTER, character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharset(String charset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharsets(List<?> charsets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharsets_ItemType(charsets, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Charsets</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharsets_ItemType(List<?> charsets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = charsets.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DatatypesPackage.Literals.CHARSET.isInstance(item)) {
				result &= validateCharset((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DatatypesPackage.Literals.CHARSET, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColor_MemberTypes(color, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Color</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColor_MemberTypes(String color, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NMTOKEN.isInstance(color)) {
				if (xmlTypeValidator.validateNMTOKEN(color, tempDiagnostics, context)) return true;
			}
			if (DatatypesPackage.Literals.COLOR_MEMBER1.isInstance(color)) {
				if (validateColorMember1(color, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NMTOKEN.isInstance(color)) {
				if (xmlTypeValidator.validateNMTOKEN(color, null, context)) return true;
			}
			if (DatatypesPackage.Literals.COLOR_MEMBER1.isInstance(color)) {
				if (validateColorMember1(color, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorMember1(String colorMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateColorMember1_Pattern(colorMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateColorMember1_Pattern
	 */
	public static final  PatternMatcher [][] COLOR_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("#[0-9a-fA-F]{3}([0-9a-fA-F]{3})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Color Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColorMember1_Pattern(String colorMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.COLOR_MEMBER1, colorMember1, COLOR_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(String contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypes(String contentTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURIE(String curie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCURIE_Pattern(curie, diagnostics, context);
		if (result || diagnostics != null) result &= validateCURIE_MinLength(curie, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCURIE_Pattern
	 */
	public static final  PatternMatcher [][] CURIE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(([\\i-[:]][\\c-[:]]*)?:)?.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>CURIE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURIE_Pattern(String curie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.CURIE, curie, CURIE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>CURIE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURIE_MinLength(String curie, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = curie.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DatatypesPackage.Literals.CURIE, curie, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURIEs(List<?> curiEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCURIEs_ItemType(curiEs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>CURI Es</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCURIEs_ItemType(List<?> curiEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = curiEs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DatatypesPackage.Literals.CURIE.isInstance(item)) {
				result &= validateCURIE((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DatatypesPackage.Literals.CURIE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetime(XMLGregorianCalendar datetime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFPI(String fpi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTarget(Object frameTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFrameTarget_MemberTypes(frameTarget, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Frame Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTarget_MemberTypes(Object frameTarget, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (DatatypesPackage.Literals.FRAME_TARGET_MEMBER0.isInstance(frameTarget)) {
				if (validateFrameTargetMember0((FrameTargetMember0)frameTarget, tempDiagnostics, context)) return true;
			}
			if (DatatypesPackage.Literals.FRAME_TARGET_MEMBER1.isInstance(frameTarget)) {
				if (validateFrameTargetMember1((String)frameTarget, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (DatatypesPackage.Literals.FRAME_TARGET_MEMBER0.isInstance(frameTarget)) {
				if (validateFrameTargetMember0((FrameTargetMember0)frameTarget, null, context)) return true;
			}
			if (DatatypesPackage.Literals.FRAME_TARGET_MEMBER1.isInstance(frameTarget)) {
				if (validateFrameTargetMember1((String)frameTarget, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTargetMember0Object(FrameTargetMember0 frameTargetMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTargetMember1(String frameTargetMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateFrameTargetMember1_Pattern(frameTargetMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateFrameTargetMember1_Pattern
	 */
	public static final  PatternMatcher [][] FRAME_TARGET_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[a-zA-Z].*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Frame Target Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameTargetMember1_Pattern(String frameTargetMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.FRAME_TARGET_MEMBER1, frameTargetMember1, FRAME_TARGET_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCode(String languageCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateLanguage_Pattern(languageCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCodes(String languageCodes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(Object length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_MemberTypes(length, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_MemberTypes(Object length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(length)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)length, tempDiagnostics, context)) return true;
			}
			if (DatatypesPackage.Literals.LENGTH_MEMBER1.isInstance(length)) {
				if (validateLengthMember1((String)length, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(length)) {
				if (xmlTypeValidator.validateNonNegativeInteger((BigInteger)length, null, context)) return true;
			}
			if (DatatypesPackage.Literals.LENGTH_MEMBER1.isInstance(length)) {
				if (validateLengthMember1((String)length, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthMember1(String lengthMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLengthMember1_Pattern(lengthMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLengthMember1_Pattern
	 */
	public static final  PatternMatcher [][] LENGTH_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d+[%]|\\d*\\.\\d+[%]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Length Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthMember1_Pattern(String lengthMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.LENGTH_MEMBER1, lengthMember1, LENGTH_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypes(List<?> linkTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLinkTypes_ItemType(linkTypes, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Link Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypes_ItemType(List<?> linkTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = linkTypes.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.NMTOKEN.isInstance(item)) {
				result &= xmlTypeValidator.validateNMTOKEN((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.NMTOKEN, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaDesc(String mediaDesc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength(Object multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMultiLength_MemberTypes(multiLength, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Multi Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength_MemberTypes(Object multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (DatatypesPackage.Literals.LENGTH.isInstance(multiLength)) {
				if (validateLength(multiLength, tempDiagnostics, context)) return true;
			}
			if (DatatypesPackage.Literals.MULTI_LENGTH_MEMBER1.isInstance(multiLength)) {
				if (validateMultiLengthMember1((String)multiLength, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (DatatypesPackage.Literals.LENGTH.isInstance(multiLength)) {
				if (validateLength(multiLength, null, context)) return true;
			}
			if (DatatypesPackage.Literals.MULTI_LENGTH_MEMBER1.isInstance(multiLength)) {
				if (validateMultiLengthMember1((String)multiLength, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLengthMember1(String multiLengthMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMultiLengthMember1_Pattern(multiLengthMember1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMultiLengthMember1_Pattern
	 */
	public static final  PatternMatcher [][] MULTI_LENGTH_MEMBER1__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\d*\\*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Multi Length Member1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLengthMember1_Pattern(String multiLengthMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.MULTI_LENGTH_MEMBER1, multiLengthMember1, MULTI_LENGTH_MEMBER1__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLengths(String multiLengths, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(number, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixels(BigInteger pixels, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(pixels, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafeCURIE(String safeCURIE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSafeCURIE_Pattern(safeCURIE, diagnostics, context);
		if (result || diagnostics != null) result &= validateSafeCURIE_MinLength(safeCURIE, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSafeCURIE_Pattern
	 */
	public static final  PatternMatcher [][] SAFE_CURIE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\[(([\\i-[:]][\\c-[:]]*)?:)?.+\\]")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Safe CURIE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafeCURIE_Pattern(String safeCURIE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.SAFE_CURIE, safeCURIE, SAFE_CURIE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>Safe CURIE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafeCURIE_MinLength(String safeCURIE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = safeCURIE.length();
		boolean result = length >= 3;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DatatypesPackage.Literals.SAFE_CURIE, safeCURIE, length, 3, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafeCURIEs(List<?> safeCURIEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSafeCURIEs_ItemType(safeCURIEs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>Safe CURI Es</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSafeCURIEs_ItemType(List<?> safeCURIEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = safeCURIEs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DatatypesPackage.Literals.SAFE_CURIE.isInstance(item)) {
				result &= validateSafeCURIE((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DatatypesPackage.Literals.SAFE_CURIE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(String script, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(String text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIorSafeCURIE(String urIorSafeCURIE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIorSafeCURIE_MemberTypes(urIorSafeCURIE, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>UR Ior Safe CURIE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIorSafeCURIE_MemberTypes(String urIorSafeCURIE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urIorSafeCURIE)) {
				if (xmlTypeValidator.validateAnyURI(urIorSafeCURIE, tempDiagnostics, context)) return true;
			}
			if (DatatypesPackage.Literals.SAFE_CURIE.isInstance(urIorSafeCURIE)) {
				if (validateSafeCURIE(urIorSafeCURIE, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urIorSafeCURIE)) {
				if (xmlTypeValidator.validateAnyURI(urIorSafeCURIE, null, context)) return true;
			}
			if (DatatypesPackage.Literals.SAFE_CURIE.isInstance(urIorSafeCURIE)) {
				if (validateSafeCURIE(urIorSafeCURIE, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIorSafeCURIEs(List<?> urIorSafeCURIEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIorSafeCURIEs_ItemType(urIorSafeCURIEs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>UR Ior Safe CURI Es</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIorSafeCURIEs_ItemType(List<?> urIorSafeCURIEs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = urIorSafeCURIEs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (DatatypesPackage.Literals.UR_IOR_SAFE_CURIE.isInstance(item)) {
				result &= validateURIorSafeCURIE((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(DatatypesPackage.Literals.UR_IOR_SAFE_CURIE, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIREF(String uriref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIREF_Pattern(uriref, diagnostics, context);
		if (result || diagnostics != null) result &= validateURIREF_MinLength(uriref, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateURIREF_Pattern
	 */
	public static final  PatternMatcher [][] URIREF__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("#\\c*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>URIREF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIREF_Pattern(String uriref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(DatatypesPackage.Literals.URIREF, uriref, URIREF__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Validates the MinLength constraint of '<em>URIREF</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIREF_MinLength(String uriref, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = uriref.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(DatatypesPackage.Literals.URIREF, uriref, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIs(List<?> urIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateURIs_ItemType(urIs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemType constraint of '<em>UR Is</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURIs_ItemType(List<?> urIs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		for (Iterator<?> i = urIs.iterator(); i.hasNext() && (result || diagnostics != null); ) {
			Object item = i.next();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(item)) {
				result &= xmlTypeValidator.validateAnyURI((String)item, diagnostics, context);
			}
			else {
				result = false;
				reportDataValueTypeViolation(XMLTypePackage.Literals.ANY_URI, item, diagnostics, context);
			}
		}
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DatatypesValidator
