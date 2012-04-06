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
package org.eclipse.rmf.reqif10.tests.util;

import java.math.BigInteger;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDtType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlLiType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlOlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlUlType;

/**
 * <h2>TC3000FormatedContent</h2> 
 * <h3>Purpose</h3> 
 * my purpose 
 * <h3>Description of Reference Data</h3> 
 * <h4>ReqIFHeader</h4>
 * mandatory data only
 * <h4>ReqIFToolExtension</h4> 
 * none 
 * <h4>ReqIFContent</h4>
 * <table border="1">
 *  <thead>
 * 	<tr>
 *    <th>ReqIF element name</th>
 *    <th>Multiplicity</th>
 *    <th>Description</th>
 *  </tr>
 *  </thead>
 *  <tfoot>
 *  </tfoot>
 *  <tbody>
 *  <tr>
 *    <td>SpecObjectType</td>
 *    <td>1</td>
 *    <td>one SpecObjectType with two attributes: a description and the formated text</td>
 *  </tr>
 *  <tr>
 *    <td>SpecificationType</td>
 *    <td>1</td>
 *    <td>one SpecificationType with no additional attributes</td>
 *  </tr>
 *  <tr>
 *    <td>Specification</td>
 *    <td>1</td>
 *    <td>one Specification for all SpecObjects</td>
 *  </tr>
 *  <tr>
 *    <td>SpecHierarchy</td>
 *    <td>1</td>
 *    <td>Specification is structured as a flat list</td>
 *  </tr>
 *  <tr>
 *    <td>SpecObject</td>
 *    <td>*</td>
 *    <td>one specObject per ComplexType in XHTML XML schema</td>
 *  </tr>
 *  </tbody>
 * </table>
 * <h5>SpecObjectType</h5>
 * <table border="1">
 *  <thead>
 * 	<tr>
 *    <th>Attribute Name</th>
 *    <th>Attribute Type (ReqIF AttributeDefinition...)</th>
 *    <th>Properties</th>
 *    <th>Description</th>
 *  </tr>
 *  </thead>
 *  <tfoot>
 *  </tfoot>
 *  <tbody>
 *  <tr>
 *    <td>TC3000 String</td>
 *    <td>String</td>
 *    <td>maxLength=255</td>
 *    <td>Short description of the formated text</td>
 *  </tr>
 *  <tr>
 *    <td>TC3000 XHTML</td>
 *    <td>XHTML</td>
 *    <td>&nbsp;</td>
 *    <td>The formated text</td>
 *  </tr>
 *  </tbody>
 * </table>
 * <h5>SpecObjects</h5>
 * The set of SpecObjects shall follow the following rules:
 * <ul>
 *  <li>One SpecObject per ComplexType that occurs in the XHTML XML schema. 
 *      Within this SpecObject all XHTML sub elements and attributes of the 
 *      XHTML ComplexType are set.</li>
 *  <li>If the XHTML ComplexType is a mixed type, then dummy text is added between all XML elements</li>
 *  <li>The formated text starts with an "p" element or a "div" element</li>
 *  <li>The shortest possible XML path is used</li>
 *  <li>If the XHTML XML schema enforces sub elements, then only mandatory data is set for the sub elements</li> 
 * </ul>
 */
@SuppressWarnings("nls")
public class TC3000ModelBuilder extends SimpleModelBuilder {
	int id_counter = 0;
	int specHierarchyCounter = 0;
	int specObjectCounter = 0;

	// datatypes
	DatatypeDefinitionXHTML datatypeDefinitionXHTML;
	DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionXHTML attributeDefinitionXHTML;
	AttributeDefinitionString attributeDefinitionString;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	/**
	 * 
	 */
	public TC3000ModelBuilder() {
		super(new Date(), "ID_TC3000_ReqIfHeader", "TC 3000 'Formated Content'");
	}

	public TC3000ModelBuilder(Date creationTime, String identifier, String title) {
		super(creationTime, identifier, title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createDatatypes() throws Exception {
		// datatypeDefinitionXHTML
		datatypeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXHTML.setIdentifier("ID_TC3000_DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLongName("TC3000 DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLastChange(getLastChangeDate());

		// datatypeDefinitionString
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC3000_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC3000 DatatypeDefinitionString");
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));
		datatypeDefinitionString.setLastChange(getLastChangeDate());

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionXHTML);
		datatypes.add(datatypeDefinitionString);

	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		// SpecObjectType
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC3000_SpecObjectType");
		specObjectType.setLongName("TC3000 SpecObjectType");
		specObjectType.setLastChange(getLastChangeDate());

		// AttributeDefinitionXHTML
		attributeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinitionXHTML.setIdentifier("ID_TC3000_AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLongName("TC3000 AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLastChange(getLastChangeDate());
		attributeDefinitionXHTML.setType(datatypeDefinitionXHTML);

		// AttributeDefinitionString
		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC3000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC3000 AttributeDefinitionString");
		attributeDefinitionString.setLastChange(getLastChangeDate());
		attributeDefinitionString.setType(datatypeDefinitionString);

		specObjectType.getSpecAttributes().add(attributeDefinitionXHTML);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);
		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC3000_SpecificationType");
		specificationType.setLongName("TC3000 SpecificationType");
		specificationType.setLastChange(getLastChangeDate());
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecRelationGroups() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelationGroups();
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC3000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(getLastChangeDate());

		SpecHierarchy specHierarchy;
		for (SpecObject specObject : getReqIF().getCoreContent().getSpecObjects()) {
			specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
			specHierarchy.setIdentifier("ID_TC3000_SpecHierarchy_" + specHierarchyCounter++);
			specHierarchy.setLastChange(getLastChangeDate());
			specHierarchy.setObject(specObject);
			specification.getChildren().add(specHierarchy);
			getReqIF().getCoreContent().getSpecifications().add(specification);
		}

	}

	@Override
	public void createSpecObjects() throws Exception {
		SpecObject specObject;
		String description;
		EObject xhtmlLevel1;
		EObject xhtmlLevel2;
		EObject xhtmlLevel3;
		EObject xhtmlLevel4;
		// level 0 / empty xhtml input
		description = "empty";
		specObject = createSpecObject(description, null);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		// level 1 / top level
		// create full XhtmlPType in XhtmlContent.p
		description = "xhtml.p.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlPType(), true);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		// create fill XhtmlDivType in XhtmlContent.div
		description = "xhtml.div.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), true);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		// level 2
		// objects that are contained on xhtml.p.type
		createSpecObjectWithPXhtml("xhtml.br.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Br(), XhtmlPackage.eINSTANCE.getXhtmlBrType());
		createSpecObjectWithPXhtml("xhtml.span.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Span(), XhtmlPackage.eINSTANCE.getXhtmlSpanType());
		createSpecObjectWithPXhtml("xhtml.em.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Em(), XhtmlPackage.eINSTANCE.getXhtmlEmType());
		createSpecObjectWithPXhtml("xhtml.strong.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Strong(), XhtmlPackage.eINSTANCE.getXhtmlStrongType());
		createSpecObjectWithPXhtml("xhtml.dfn.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Dfn(), XhtmlPackage.eINSTANCE.getXhtmlDfnType());
		createSpecObjectWithPXhtml("xhtml.code.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Code(), XhtmlPackage.eINSTANCE.getXhtmlCodeType());
		createSpecObjectWithPXhtml("xhtml.samp.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Samp(), XhtmlPackage.eINSTANCE.getXhtmlSampType());
		createSpecObjectWithPXhtml("xhtml.kbd.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Kbd(), XhtmlPackage.eINSTANCE.getXhtmlKbdType());
		createSpecObjectWithPXhtml("xhtml.var.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Var(), XhtmlPackage.eINSTANCE.getXhtmlVarType());
		createSpecObjectWithPXhtml("xhtml.cite.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Cite(), XhtmlPackage.eINSTANCE.getXhtmlCiteType());
		createSpecObjectWithPXhtml("xhtml.abbr.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Abbr(), XhtmlPackage.eINSTANCE.getXhtmlAbbrType());
		createSpecObjectWithPXhtml("xhtml.acronym.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Acronym(), XhtmlPackage.eINSTANCE.getXhtmlAcronymType());
		createSpecObjectWithPXhtml("xhtml.q.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Q(), XhtmlPackage.eINSTANCE.getXhtmlQType());
		createSpecObjectWithPXhtml("xhtml.inl.pres.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Tt(), XhtmlPackage.eINSTANCE.getXhtmlInlPresType());
		createSpecObjectWithPXhtml("xhtml.a.type", XhtmlPackage.eINSTANCE.getXhtmlPType_A(), XhtmlPackage.eINSTANCE.getXhtmlAType());
		createSpecObjectWithPXhtml("xhtml.object.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Object(), XhtmlPackage.eINSTANCE.getXhtmlObjectType());
		createSpecObjectWithPXhtml("xhtml.edit.type", XhtmlPackage.eINSTANCE.getXhtmlPType_Ins(), XhtmlPackage.eINSTANCE.getXhtmlEditType());

		// first level objects that are contained in xhtml.div.type and are not already covered by xhtml.p.type
		createSpecObjectWithDivXhtml("xhtml.h1.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H1(), XhtmlPackage.eINSTANCE.getXhtmlH1Type());
		createSpecObjectWithDivXhtml("xhtml.h2.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H2(), XhtmlPackage.eINSTANCE.getXhtmlH2Type());
		createSpecObjectWithDivXhtml("xhtml.h3.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H3(), XhtmlPackage.eINSTANCE.getXhtmlH3Type());
		createSpecObjectWithDivXhtml("xhtml.h4.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H4(), XhtmlPackage.eINSTANCE.getXhtmlH4Type());
		createSpecObjectWithDivXhtml("xhtml.h5.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H5(), XhtmlPackage.eINSTANCE.getXhtmlH5Type());
		createSpecObjectWithDivXhtml("xhtml.h6.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_H6(), XhtmlPackage.eINSTANCE.getXhtmlH6Type());
		createSpecObjectWithDivXhtml("xhtml.ul.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Ul(), XhtmlPackage.eINSTANCE.getXhtmlUlType());
		createSpecObjectWithDivXhtml("xhtml.ol.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Ol(), XhtmlPackage.eINSTANCE.getXhtmlOlType());
		createSpecObjectWithDivXhtml("xhtml.dl.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Dl(), XhtmlPackage.eINSTANCE.getXhtmlDlType());
		createSpecObjectWithDivXhtml("xhtml.pre.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Pre(), XhtmlPackage.eINSTANCE.getXhtmlPreType());
		createSpecObjectWithDivXhtml("xhtml.blockquote.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Blockquote(),
				XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType());
		createSpecObjectWithDivXhtml("xhtml.address.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Address(),
				XhtmlPackage.eINSTANCE.getXhtmlAddressType());
		createSpecObjectWithDivXhtml("xhtml.hr.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Hr(), XhtmlPackage.eINSTANCE.getXhtmlHrType());
		createSpecObjectWithDivXhtml("xhtml.table.type", XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), XhtmlPackage.eINSTANCE.getXhtmlTableType());

		// level 3
		// xhtml.li.type
		description = "xhtml.li.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlUlType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Ul(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlLiType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlUlType_Li(), xhtmlLevel3);

		// xhtml.dt.type
		description = "xhtml.dt.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDlType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Dl(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDtType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlDlType_Dt(), xhtmlLevel3);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDdType(), false);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlDlType_Dd(), xhtmlLevel3);

		// xhtml.dd.type
		description = "xhtml.dd.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDlType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Dl(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDtType(), false);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlDlType_Dt(), xhtmlLevel3);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDdType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlDlType_Dd(), xhtmlLevel3);

		// xhtml.caption.type
		description = "xhtml.caption.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlCaptionType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Caption(), xhtmlLevel3);

		// xhtml.thead.type
		description = "xhtml.thead.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTheadType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Thead(), xhtmlLevel3);

		// xhtml.col.type
		description = "xhtml.col.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlColType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Col(), xhtmlLevel3);

		// xhtml.colgroup.type
		description = "xhtml.colgroup.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlColgroupType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Colgroup(), xhtmlLevel3);

		// xhtml.tfoot.type
		description = "xhtml.tfoot.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTfootType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Tfoot(), xhtmlLevel3);

		// xhtml.tbody.type
		description = "xhtml.tbody.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTbodyType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Tbody(), xhtmlLevel3);

		// xhtml.tr.type
		description = "xhtml.tr.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTrType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Tr(), xhtmlLevel3);

		// xhtml.param.type
		description = "xhtml.param.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlObjectType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Object(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlParamType(), true);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlObjectType_Param(), xhtmlLevel3);

		// level 4
		// xhtml.td.type
		description = "xhtml.td.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTrType(), false);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Tr(), xhtmlLevel3);

		xhtmlLevel4 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTdType(), true);
		setValue(xhtmlLevel3, XhtmlPackage.eINSTANCE.getXhtmlTrType_Td(), xhtmlLevel4);

		// xhtml.th.type
		description = "xhtml.td.type";
		xhtmlLevel1 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		specObject = createSpecObject(description, xhtmlLevel1);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		xhtmlLevel2 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTableType(), false);
		setValue(xhtmlLevel1, XhtmlPackage.eINSTANCE.getXhtmlDivType_Table(), xhtmlLevel2);

		xhtmlLevel3 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlTrType(), false);
		setValue(xhtmlLevel2, XhtmlPackage.eINSTANCE.getXhtmlTableType_Tr(), xhtmlLevel3);

		xhtmlLevel4 = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlThType(), true);
		setValue(xhtmlLevel3, XhtmlPackage.eINSTANCE.getXhtmlTrType_Th(), xhtmlLevel4);

	}

	private void createSpecObjectWithPXhtml(String description, EReference eReference, EClass targetType) throws Exception {
		EObject xhtmlRoot = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlPType(), false);
		setValue(xhtmlRoot, eReference, createXhtmlInstance(targetType, true));
		SpecObject specObject = createSpecObject(description, xhtmlRoot);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);
	}

	private void createSpecObjectWithDivXhtml(String description, EReference eReference, EClass targetType) throws Exception {
		EObject xhtmlRoot = createXhtmlInstance(XhtmlPackage.eINSTANCE.getXhtmlDivType(), false);
		setValue(xhtmlRoot, eReference, createXhtmlInstance(targetType, true));
		SpecObject specObject = createSpecObject(description, xhtmlRoot);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);
	}

	private SpecObject createSpecObject(String text, EObject eObject) throws Exception {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC3000_SpecObject_" + text);
		specObject.setLastChange(getLastChangeDate());
		specObject.setType(specObjectType);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue(text);
		specObject.getValues().add(attributeValueString);

		AttributeValueXHTML attributeValueXHTML = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXHTML.setDefinition(attributeDefinitionXHTML);
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		attributeValueXHTML.setTheValue(xhtmlContent);

		if (null != eObject) {
			// do nothing
			if (eObject instanceof XhtmlDivType) {

				xhtmlContent.setDiv((XhtmlDivType) eObject);
			} else if (eObject instanceof XhtmlPType) {
				xhtmlContent.setP((XhtmlPType) eObject);
			} else {
				System.out.println("unsupported xhtml type");
			}
		} else {
			// null
		}

		specObject.getValues().add(attributeValueXHTML);

		return specObject;
	}

	@Override
	public void createSpecRelations() throws Exception {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

	private EObject createXhtmlInstance(EClass eClass, boolean createAll) {
		EObject eObject = EcoreUtil.create(eClass);
		setAttributes(eObject, createAll);
		setSubElements(eObject, createAll);
		setMixedText(eObject, createAll);

		return eObject;
	}

	private void setMixedText(EObject eObject, boolean createAll) {
		// get the mixed attribute
		EAttribute mixedAttribute = null;
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
			if ("mixed".equals(eAttribute.getName()) && EcorePackage.eINSTANCE.getEFeatureMapEntry() == eAttribute.getEAttributeType()) {
				mixedAttribute = eAttribute;
				break;
			}
		}
		if (null != mixedAttribute) {
			FeatureMap featureMap = (FeatureMap) eObject.eGet(mixedAttribute);
			int featureMapSize = featureMap.size();
			if (0 == featureMapSize) {
				featureMap.add(FeatureMapUtil.createTextEntry(eObject.eClass().getName()));
			} else {
				if (createAll) {
					for (int i = 0; i < featureMapSize * 3; i = i + 3) {
						FeatureMap.Entry entry = featureMap.get(i);
						EStructuralFeature feature = entry.getEStructuralFeature();
						featureMap.add(i, FeatureMapUtil.createTextEntry("\n                    text before " + feature.getName()));
						featureMap.add(i + 2, FeatureMapUtil.createTextEntry("text after " + feature.getName()));

					}
				}

			}
		} else {
			System.out.println("no mixed Attribute found in " + eObject);
		}
	}

	private void setSubElements(EObject eObject, boolean createAll) {
		if (createAll) {
			// create full set of sub elements
			for (EReference eReference : eObject.eClass().getEAllContainments()) {
				EObject subEObject = createXhtmlInstance(eReference.getEReferenceType(), false);
				setValue(eObject, eReference, subEObject);
			}
		} else {
			// create mandatory sub elements only
			if (eObject instanceof XhtmlTableType) {
				XhtmlTrType tr = XhtmlFactory.eINSTANCE.createXhtmlTrType();
				setAttributes(tr, false);
				((XhtmlTableType) eObject).getTr().add(tr);
				XhtmlTdType td = XhtmlFactory.eINSTANCE.createXhtmlTdType();
				setAttributes(td, false);
				tr.getTd().add(td);
			} else if (eObject instanceof XhtmlTbodyType) {
				XhtmlTrType tr = XhtmlFactory.eINSTANCE.createXhtmlTrType();
				setAttributes(tr, false);
				((XhtmlTbodyType) eObject).getTr().add(tr);
				XhtmlTdType td = XhtmlFactory.eINSTANCE.createXhtmlTdType();
				setAttributes(td, false);
				tr.getTd().add(td);
			} else if (eObject instanceof XhtmlDlType) {
				XhtmlDtType dt = XhtmlFactory.eINSTANCE.createXhtmlDtType();
				setAttributes(dt, false);
				setMixedText(dt, false);
				XhtmlDdType dd = XhtmlFactory.eINSTANCE.createXhtmlDdType();
				setAttributes(dd, false);
				setMixedText(dd, false);
				((XhtmlDlType) eObject).getDt().add(dt);
				((XhtmlDlType) eObject).getDd().add(dd);
			} else if (eObject instanceof XhtmlUlType) {
				XhtmlLiType li = XhtmlFactory.eINSTANCE.createXhtmlLiType();
				setAttributes(li, false);
				setMixedText(li, false);
				((XhtmlUlType) eObject).getLi().add(li);
			} else if (eObject instanceof XhtmlOlType) {
				XhtmlLiType li = XhtmlFactory.eINSTANCE.createXhtmlLiType();
				setAttributes(li, false);
				setMixedText(li, false);
				((XhtmlOlType) eObject).getLi().add(li);
			}
		}
	}

	private void setAttributes(EObject eObject, boolean createAll) {
		for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
			if (createAll || eAttribute.isRequired()) {
				Object value = getValue(eAttribute);
				if (null != value && eAttribute.isChangeable()) {
					setValue(eObject, eAttribute, value);
				}
			}
		}
	}

	private Object getValue(EAttribute eAttribute) {
		EDataType eDataType = eAttribute.getEAttributeType();
		String datatypeName = eDataType.getName();

		if ("class".equals(eAttribute.getName())) {
			// ReqIF never use class
			return null;
		}
		if ("style".equals(eAttribute.getName())) {
			// ReqIF only limited support
			return EcoreUtil.createFromString(eDataType, "text-decoration:underline");
		}
		if (XhtmlPackage.eINSTANCE.getXhtmlObjectType_Class() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Archive() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Classid() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codebase() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Codetype() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Declare() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Id() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Lang() == eAttribute || XhtmlPackage.eINSTANCE.getXhtmlObjectType_Name() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Space() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Standby() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Style() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Tabindex() == eAttribute
				|| XhtmlPackage.eINSTANCE.getXhtmlObjectType_Title() == eAttribute) {
			// ReqIF: only attributes data, type, width, height are allowed
			return null;
		}

		if ("String".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text");
		}
		if ("LangType".equals(datatypeName)) {
			return null;
		}
		if ("SpaceType".equals(datatypeName)) {
			return null;
		}
		if ("ID".equals(datatypeName)) {
			return null;
			// return EcoreUtil.createFromString(eDataType, "ID" + id_counter++);
		}
		if ("CDATA".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "CDATA\"CDATA");
		}
		if ("Datetime".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "2012-04-05T02:39:33.005+02:00");
		}
		if ("URI".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "http://eclipse.org/rmf");
		}
		if ("EFeatureMapEntry".equals(datatypeName)) {
			return null;
		}
		if ("Character".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "a");
		}
		if ("LanguageCode".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "en");
		}
		if ("Number".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "1");
		}
		if ("Charset".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "UTF-8");
		}
		if ("MimeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text/html");
		}
		if ("ContentType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text/html");
		}
		if ("Text".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "text");
		}
		if ("Length".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("LinkTypes".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "LinkTypes");
		}
		if ("RulesType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "rows");
		}
		if ("AlignType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "left");
		}
		if ("ValignType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "top");
		}
		if ("MultiLength".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("Pixels".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "100");
		}
		if ("FrameType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "above");
		}
		if ("ValuetypeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "data");
		}
		if ("IDREFS".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "a123");
		}
		if ("ScopeType".equals(datatypeName)) {
			return EcoreUtil.createFromString(eDataType, "row");
		}
		System.out.println("Not Implemented Datatype: " + datatypeName);
		return null;
	}

	@SuppressWarnings("unchecked")
	private void setValue(EObject eObject, EStructuralFeature eStructuralFeature, Object value) {
		if (eStructuralFeature.isMany()) {
			((EList<Object>) eObject.eGet(eStructuralFeature)).add(value);
		} else {
			eObject.eSet(eStructuralFeature, value);
		}
	}

}
