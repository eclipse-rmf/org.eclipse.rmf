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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.xhtml.AType;
import org.eclipse.rmf.rif12.xhtml.AbbrType;
import org.eclipse.rmf.rif12.xhtml.AcronymType;
import org.eclipse.rmf.rif12.xhtml.AddressType;
import org.eclipse.rmf.rif12.xhtml.BType;
import org.eclipse.rmf.rif12.xhtml.BigType;
import org.eclipse.rmf.rif12.xhtml.BlockquoteType;
import org.eclipse.rmf.rif12.xhtml.BrType;
import org.eclipse.rmf.rif12.xhtml.CiteType;
import org.eclipse.rmf.rif12.xhtml.CodeType;
import org.eclipse.rmf.rif12.xhtml.DelType;
import org.eclipse.rmf.rif12.xhtml.DfnType;
import org.eclipse.rmf.rif12.xhtml.DivType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.EmType;
import org.eclipse.rmf.rif12.xhtml.Flow;
import org.eclipse.rmf.rif12.xhtml.H1Type;
import org.eclipse.rmf.rif12.xhtml.H2Type;
import org.eclipse.rmf.rif12.xhtml.H3Type;
import org.eclipse.rmf.rif12.xhtml.H4Type;
import org.eclipse.rmf.rif12.xhtml.H5Type;
import org.eclipse.rmf.rif12.xhtml.H6Type;
import org.eclipse.rmf.rif12.xhtml.HrType;
import org.eclipse.rmf.rif12.xhtml.IType;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.InsType;
import org.eclipse.rmf.rif12.xhtml.KbdType;
import org.eclipse.rmf.rif12.xhtml.ObjectType;
import org.eclipse.rmf.rif12.xhtml.OlType;
import org.eclipse.rmf.rif12.xhtml.PType;
import org.eclipse.rmf.rif12.xhtml.PreType;
import org.eclipse.rmf.rif12.xhtml.QType;
import org.eclipse.rmf.rif12.xhtml.SampType;
import org.eclipse.rmf.rif12.xhtml.SmallType;
import org.eclipse.rmf.rif12.xhtml.SpanType;
import org.eclipse.rmf.rif12.xhtml.StrikeType;
import org.eclipse.rmf.rif12.xhtml.StrongType;
import org.eclipse.rmf.rif12.xhtml.SubType;
import org.eclipse.rmf.rif12.xhtml.SupType;
import org.eclipse.rmf.rif12.xhtml.TableType;
import org.eclipse.rmf.rif12.xhtml.TtType;
import org.eclipse.rmf.rif12.xhtml.UType;
import org.eclipse.rmf.rif12.xhtml.UlType;
import org.eclipse.rmf.rif12.xhtml.VarType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl#getDel <em>Del</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends EObjectImpl implements Flow {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.FLOW__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.Literals.FLOW__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H1Type> getH1() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H2Type> getH2() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H3Type> getH3() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H4Type> getH4() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H5Type> getH5() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H6Type> getH6() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__H6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DivType> getDiv() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UlType> getUl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OlType> getOl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DlType> getDl() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreType> getPre() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HrType> getHr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressType> getAddress() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrType> getBr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImgType> getImg() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TtType> getTt() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getI() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BType> getB() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigType> getBig() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallType> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UType> getU() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__U);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrikeType> getStrike() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__STRIKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmType> getEm() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrongType> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DfnType> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getCode() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QType> getQ() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampType> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KbdType> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getVar() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CiteType> getCite() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbrType> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcronymType> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSub() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupType> getSup() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__INS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(XhtmlPackage.Literals.FLOW__DEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.FLOW__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.FLOW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.FLOW__P:
				return getP();
			case XhtmlPackage.FLOW__H1:
				return getH1();
			case XhtmlPackage.FLOW__H2:
				return getH2();
			case XhtmlPackage.FLOW__H3:
				return getH3();
			case XhtmlPackage.FLOW__H4:
				return getH4();
			case XhtmlPackage.FLOW__H5:
				return getH5();
			case XhtmlPackage.FLOW__H6:
				return getH6();
			case XhtmlPackage.FLOW__DIV:
				return getDiv();
			case XhtmlPackage.FLOW__UL:
				return getUl();
			case XhtmlPackage.FLOW__OL:
				return getOl();
			case XhtmlPackage.FLOW__DL:
				return getDl();
			case XhtmlPackage.FLOW__PRE:
				return getPre();
			case XhtmlPackage.FLOW__HR:
				return getHr();
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.FLOW__ADDRESS:
				return getAddress();
			case XhtmlPackage.FLOW__TABLE:
				return getTable();
			case XhtmlPackage.FLOW__A:
				return getA();
			case XhtmlPackage.FLOW__BR:
				return getBr();
			case XhtmlPackage.FLOW__SPAN:
				return getSpan();
			case XhtmlPackage.FLOW__OBJECT:
				return getObject();
			case XhtmlPackage.FLOW__IMG:
				return getImg();
			case XhtmlPackage.FLOW__TT:
				return getTt();
			case XhtmlPackage.FLOW__I:
				return getI();
			case XhtmlPackage.FLOW__B:
				return getB();
			case XhtmlPackage.FLOW__BIG:
				return getBig();
			case XhtmlPackage.FLOW__SMALL:
				return getSmall();
			case XhtmlPackage.FLOW__U:
				return getU();
			case XhtmlPackage.FLOW__STRIKE:
				return getStrike();
			case XhtmlPackage.FLOW__EM:
				return getEm();
			case XhtmlPackage.FLOW__STRONG:
				return getStrong();
			case XhtmlPackage.FLOW__DFN:
				return getDfn();
			case XhtmlPackage.FLOW__CODE:
				return getCode();
			case XhtmlPackage.FLOW__Q:
				return getQ();
			case XhtmlPackage.FLOW__SAMP:
				return getSamp();
			case XhtmlPackage.FLOW__KBD:
				return getKbd();
			case XhtmlPackage.FLOW__VAR:
				return getVar();
			case XhtmlPackage.FLOW__CITE:
				return getCite();
			case XhtmlPackage.FLOW__ABBR:
				return getAbbr();
			case XhtmlPackage.FLOW__ACRONYM:
				return getAcronym();
			case XhtmlPackage.FLOW__SUB:
				return getSub();
			case XhtmlPackage.FLOW__SUP:
				return getSup();
			case XhtmlPackage.FLOW__INS:
				return getIns();
			case XhtmlPackage.FLOW__DEL:
				return getDel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.FLOW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.FLOW__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case XhtmlPackage.FLOW__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case XhtmlPackage.FLOW__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case XhtmlPackage.FLOW__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case XhtmlPackage.FLOW__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case XhtmlPackage.FLOW__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case XhtmlPackage.FLOW__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case XhtmlPackage.FLOW__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case XhtmlPackage.FLOW__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case XhtmlPackage.FLOW__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case XhtmlPackage.FLOW__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case XhtmlPackage.FLOW__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case XhtmlPackage.FLOW__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case XhtmlPackage.FLOW__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case XhtmlPackage.FLOW__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case XhtmlPackage.FLOW__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XhtmlPackage.FLOW__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XhtmlPackage.FLOW__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XhtmlPackage.FLOW__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType>)newValue);
				return;
			case XhtmlPackage.FLOW__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XhtmlPackage.FLOW__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XhtmlPackage.FLOW__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XhtmlPackage.FLOW__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XhtmlPackage.FLOW__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XhtmlPackage.FLOW__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XhtmlPackage.FLOW__U:
				getU().clear();
				getU().addAll((Collection<? extends UType>)newValue);
				return;
			case XhtmlPackage.FLOW__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case XhtmlPackage.FLOW__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XhtmlPackage.FLOW__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XhtmlPackage.FLOW__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XhtmlPackage.FLOW__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XhtmlPackage.FLOW__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XhtmlPackage.FLOW__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XhtmlPackage.FLOW__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XhtmlPackage.FLOW__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XhtmlPackage.FLOW__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XhtmlPackage.FLOW__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XhtmlPackage.FLOW__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XhtmlPackage.FLOW__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XhtmlPackage.FLOW__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case XhtmlPackage.FLOW__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case XhtmlPackage.FLOW__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.FLOW__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.FLOW__P:
				getP().clear();
				return;
			case XhtmlPackage.FLOW__H1:
				getH1().clear();
				return;
			case XhtmlPackage.FLOW__H2:
				getH2().clear();
				return;
			case XhtmlPackage.FLOW__H3:
				getH3().clear();
				return;
			case XhtmlPackage.FLOW__H4:
				getH4().clear();
				return;
			case XhtmlPackage.FLOW__H5:
				getH5().clear();
				return;
			case XhtmlPackage.FLOW__H6:
				getH6().clear();
				return;
			case XhtmlPackage.FLOW__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.FLOW__UL:
				getUl().clear();
				return;
			case XhtmlPackage.FLOW__OL:
				getOl().clear();
				return;
			case XhtmlPackage.FLOW__DL:
				getDl().clear();
				return;
			case XhtmlPackage.FLOW__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.FLOW__HR:
				getHr().clear();
				return;
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.FLOW__ADDRESS:
				getAddress().clear();
				return;
			case XhtmlPackage.FLOW__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.FLOW__A:
				getA().clear();
				return;
			case XhtmlPackage.FLOW__BR:
				getBr().clear();
				return;
			case XhtmlPackage.FLOW__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.FLOW__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.FLOW__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.FLOW__TT:
				getTt().clear();
				return;
			case XhtmlPackage.FLOW__I:
				getI().clear();
				return;
			case XhtmlPackage.FLOW__B:
				getB().clear();
				return;
			case XhtmlPackage.FLOW__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.FLOW__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.FLOW__U:
				getU().clear();
				return;
			case XhtmlPackage.FLOW__STRIKE:
				getStrike().clear();
				return;
			case XhtmlPackage.FLOW__EM:
				getEm().clear();
				return;
			case XhtmlPackage.FLOW__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.FLOW__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.FLOW__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.FLOW__Q:
				getQ().clear();
				return;
			case XhtmlPackage.FLOW__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.FLOW__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.FLOW__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.FLOW__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.FLOW__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.FLOW__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.FLOW__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.FLOW__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.FLOW__INS:
				getIns().clear();
				return;
			case XhtmlPackage.FLOW__DEL:
				getDel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XhtmlPackage.FLOW__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.FLOW__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.FLOW__P:
				return !getP().isEmpty();
			case XhtmlPackage.FLOW__H1:
				return !getH1().isEmpty();
			case XhtmlPackage.FLOW__H2:
				return !getH2().isEmpty();
			case XhtmlPackage.FLOW__H3:
				return !getH3().isEmpty();
			case XhtmlPackage.FLOW__H4:
				return !getH4().isEmpty();
			case XhtmlPackage.FLOW__H5:
				return !getH5().isEmpty();
			case XhtmlPackage.FLOW__H6:
				return !getH6().isEmpty();
			case XhtmlPackage.FLOW__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.FLOW__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.FLOW__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.FLOW__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.FLOW__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.FLOW__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.FLOW__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.FLOW__ADDRESS:
				return !getAddress().isEmpty();
			case XhtmlPackage.FLOW__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.FLOW__A:
				return !getA().isEmpty();
			case XhtmlPackage.FLOW__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.FLOW__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.FLOW__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.FLOW__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.FLOW__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.FLOW__I:
				return !getI().isEmpty();
			case XhtmlPackage.FLOW__B:
				return !getB().isEmpty();
			case XhtmlPackage.FLOW__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.FLOW__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.FLOW__U:
				return !getU().isEmpty();
			case XhtmlPackage.FLOW__STRIKE:
				return !getStrike().isEmpty();
			case XhtmlPackage.FLOW__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.FLOW__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.FLOW__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.FLOW__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.FLOW__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.FLOW__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.FLOW__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.FLOW__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.FLOW__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.FLOW__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.FLOW__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.FLOW__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.FLOW__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.FLOW__INS:
				return !getIns().isEmpty();
			case XhtmlPackage.FLOW__DEL:
				return !getDel().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //FlowImpl
