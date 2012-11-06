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
package org.eclipse.rmf.reqif10.tests.uc001.tc3000;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.common.util.ReqIFToolExtensionUtil;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlineFactory;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC3000ToolExtensionsModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC3000";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString attributeDefinitionString;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	/**
	 * @throws Exception 
	 * 
	 */
	public TC3000ToolExtensionsModelBuilder() throws Exception {
		super("ID_TC3000_ReqIfHeader", "TC 3000 'Tool Extensions'");
	}

	public TC3000ToolExtensionsModelBuilder(String creationTimeString, String identifier, String title) throws Exception {
		super(creationTimeString, identifier, title);
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC3000_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC3000 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC3000_SpecObjectType");
		specObjectType.setLongName("TC3000 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC3000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC3000 String");
		attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionString.setType(datatypeDefinitionString);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC3000_SpecificationType");
		specificationType.setLongName("TC3000 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createRelationGroups() throws Exception {
		// TODO Auto-generated method stub
		super.createRelationGroups();
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC3000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC3000_SpecHierarchy");
		specHierarchy.setLongName("TC3000 SpecHierarchy");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject);
		specification.getChildren().add(specHierarchy);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	@Override
	public void createSpecObjects() throws Exception {
		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier("ID_TC3000_SpecObject");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setType(specObjectType);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue("Plain");

		specObject.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	@Override
	public void createToolExtensions() throws Exception {
		// TODO: remove dependency to ProR
		ProrToolExtension prorToolExtension = ConfigurationFactory.eINSTANCE.createProrToolExtension();

		ProrSpecViewConfiguration prorSpecViewConfiguration;
		prorSpecViewConfiguration = ConfigurationFactory.eINSTANCE.createProrSpecViewConfiguration();
		prorToolExtension.getSpecViewConfigurations().add(prorSpecViewConfiguration);
		prorSpecViewConfiguration = ConfigurationFactory.eINSTANCE.createProrSpecViewConfiguration();
		prorToolExtension.getSpecViewConfigurations().add(prorSpecViewConfiguration);

		ProrGeneralConfiguration prorGeneralConfiguration = ConfigurationFactory.eINSTANCE.createProrGeneralConfiguration();
		prorToolExtension.setGeneralConfiguration(prorGeneralConfiguration);
		LabelConfiguration labelConfiguration = ConfigurationFactory.eINSTANCE.createLabelConfiguration();
		prorGeneralConfiguration.setLabelConfiguration(labelConfiguration);

		ProrPresentationConfigurations prorPresentationConfigurations;
		HeadlineConfiguration headlineConfiguration;
		prorPresentationConfigurations = ConfigurationFactory.eINSTANCE.createProrPresentationConfigurations();
		prorToolExtension.setPresentationConfigurations(prorPresentationConfigurations);
		headlineConfiguration = HeadlineFactory.eINSTANCE.createHeadlineConfiguration();
		prorPresentationConfigurations.getPresentationConfigurations().add(headlineConfiguration);
		headlineConfiguration.setDatatype(datatypeDefinitionString);

		prorToolExtension.setPresentationConfigurations(prorPresentationConfigurations);
		headlineConfiguration = HeadlineFactory.eINSTANCE.createHeadlineConfiguration();
		prorPresentationConfigurations.getPresentationConfigurations().add(headlineConfiguration);
		headlineConfiguration.setDatatype(datatypeDefinitionString);

		ReqIFToolExtensionUtil.addToolExtension(getReqIF(), prorToolExtension);
	}
}
