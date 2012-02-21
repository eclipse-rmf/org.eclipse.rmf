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

package org.eclipse.rmf.rif12.xhtml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AContent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *       a elements use "Inline" excluding a
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getImg <em>Img</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.AContent#getDel <em>Del</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent()
 * @model extendedMetaData="name='a.content' kind='mixed'"
 * @generated
 */
public interface AContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       forced line break
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SpanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.ImgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImgType> getImg();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.TtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       fixed pitch font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TtType> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.IType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       italic font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IType> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bold font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BType> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.BigType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bigger font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BigType> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SmallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       smaller font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SmallType> getSmall();

	/**
	 * Returns the value of the '<em><b>U</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.UType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 				underline
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>U</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_U()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='u' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UType> getU();

	/**
	 * Returns the value of the '<em><b>Strike</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.StrikeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * 			strike-through
	 * 			
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strike</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Strike()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strike' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StrikeType> getStrike();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.EmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.StrongType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       strong emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DfnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       definitional
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       program code
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.QType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       inlined quote
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<QType> getQ();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SampType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       sample
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.KbdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       something user would type
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.VarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       variable
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.CiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       citation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AbbrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       abbreviation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.AcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       acronym
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       subscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.SupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       superscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SupType> getSup();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.InsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InsType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xhtml.DelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.xhtml.XhtmlPackage#getAContent_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DelType> getDel();

} // AContent
