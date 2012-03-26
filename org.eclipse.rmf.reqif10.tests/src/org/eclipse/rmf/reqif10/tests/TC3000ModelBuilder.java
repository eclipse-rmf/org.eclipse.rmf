/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Bršrkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests;

import java.math.BigInteger;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.util.FeatureMap.Entry;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.XhtmlContent;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlFactory;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;

public class TC3000ModelBuilder extends SimpleModelBuilder {

	// datatypes
	DatatypeDefinitionXHTML datatypeDefinitionXHTML;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionXHTML attributeDefinitionXHTML;


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
	public void createDatatypes() throws DatatypeConfigurationException {
		datatypeDefinitionXHTML = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionXHTML();
		datatypeDefinitionXHTML.setIdentifier("ID_TC3000_DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLongName("TC3000 DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLastChange(getLastChangeDate());
		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent()
				.getDatatypes();
		datatypes.add(datatypeDefinitionXHTML);
	}

	@Override
	public void createSpecObjectTypes() throws DatatypeConfigurationException {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC3000_SpecObjectType");
		specObjectType.setLongName("TC3000 SpecObjectType");
		specObjectType.setLastChange(getLastChangeDate());

		attributeDefinitionXHTML = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionXHTML();
		attributeDefinitionXHTML.setIdentifier("ID_TC3000_AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLongName("TC3000 AttributeDefinitionXHTML");
		attributeDefinitionXHTML.setLastChange(getLastChangeDate());
		attributeDefinitionXHTML.setType(datatypeDefinitionXHTML);

		specObjectType.getSpecAttributes().add(
				attributeDefinitionXHTML);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws DatatypeConfigurationException {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC3000_SpecificationType");
		specificationType.setLongName("TC3000 SpecificationType");
		specificationType.setLastChange(getLastChangeDate());
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecRelationGroups() {
		// TODO Auto-generated method stub
		super.createSpecRelationGroups();
	}

	@Override
	public void createSpecifications() throws DatatypeConfigurationException {
		Specification specification = ReqIF10Factory.eINSTANCE
				.createSpecification();
		specification.setIdentifier("ID_TCs000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(getLastChangeDate());

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE
				.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC3000_SpecHierarchy");
		specHierarchy.setLongName("TC3000 SpecHierarchy");
		specHierarchy.setLastChange(getLastChangeDate());
		specHierarchy.setObject(specObject);
		specification.getChildren().add(specHierarchy);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	@Override
	public void createSpecObjects() throws DatatypeConfigurationException {
		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC3000_SpecObject");
		specObject.setLastChange(getLastChangeDate());
		specObject.setType(specObjectType);

		AttributeValueXHTML attributeValueXHTML = ReqIF10Factory.eINSTANCE
				.createAttributeValueXHTML();
		attributeValueXHTML.setDefinition(attributeDefinitionXHTML);
		XhtmlContent xhtmlContent = ReqIF10Factory.eINSTANCE.createXhtmlContent();
		attributeValueXHTML.setTheValue(xhtmlContent);
		
		XhtmlDivType div = XhtmlFactory.eINSTANCE.createXhtmlDivType();
		xhtmlContent.setDiv(div);
		div.getMixed().add(FeatureMapUtil.createTextEntry("first text content"));
		
		XhtmlH1Type h1 = XhtmlFactory.eINSTANCE.createXhtmlH1Type();
		div.getH1().add(h1);
		h1.getXhtmlInlineMix().add(FeatureMapUtil.createTextEntry("Hello"));
		div.getMixed().add(FeatureMapUtil.createTextEntry("last text content"));
		
		specObject.getValues().add(attributeValueXHTML);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}


	@Override
	public void createSpecRelations() {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}

}
