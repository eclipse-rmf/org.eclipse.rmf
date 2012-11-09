/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Said Salem - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.tests.uc001.tc4000;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AlternativeID;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
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
public class TC4000ModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-09-06T11:51:00.112+02:00";
	final static String TEST_CASE_ID = "TC4000";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionBoolean datatypeDefinitionBoolean;
	protected DatatypeDefinitionInteger datatypeDefinitionInteger;
	protected DatatypeDefinitionReal datatypeDefinitionReal;
	protected DatatypeDefinitionDate datatypeDefinitionDate;

	int specHierarchiesCount;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString attributeDefinitionString;
	AttributeDefinitionBoolean attributeDefinitionBooleanTc4000;
	AttributeDefinitionInteger attributeDefinitionInteger;
	AttributeDefinitionReal attributeDefinitionReal;
	AttributeDefinitionDate attributeDefinitionDate;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	/**
	 * @throws Exception 
	 * 
	 */
	public TC4000ModelBuilder(int specHierarchiesCount) throws Exception {
		super("ID_TC4000_ReqIfHeader", "TC 4000 'Tool Extensions'");
		this.specHierarchiesCount = specHierarchiesCount;
	}

	public TC4000ModelBuilder(String creationTimeString, String identifier, String title) throws Exception {
		super(creationTimeString, identifier, title);
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC4000_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC4000 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));

		datatypeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean.setIdentifier("ID_TC4000_DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLongName("TC4000 DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLastChange(toDate(LAST_CHANGE_STRING));

		datatypeDefinitionInteger = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger.setIdentifier("ID_TC4000_DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLongName("TC4000 DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionInteger.setMin(new BigInteger("-17496"));
		datatypeDefinitionInteger.setMax(new BigInteger("5000"));

		datatypeDefinitionReal = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		datatypeDefinitionReal.setIdentifier("ID_TC4000_DatatypeDefinitionReal");
		datatypeDefinitionReal.setLongName("TC4000 DatatypeDefinitionReal");
		datatypeDefinitionReal.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionReal.setMin(-1234.5678);
		datatypeDefinitionReal.setMax(1234.5678);
		datatypeDefinitionReal.setAccuracy(new BigInteger("10"));

		datatypeDefinitionDate = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		datatypeDefinitionDate.setIdentifier("ID_TC4000_DatatypeDefinitionDate");
		datatypeDefinitionDate.setLongName("TC4000 DatatypeDefinitionDate");
		datatypeDefinitionDate.setLastChange(toDate(LAST_CHANGE_STRING));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionBoolean);
		datatypes.add(datatypeDefinitionInteger);
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionReal);
		datatypes.add(datatypeDefinitionDate);

	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC4000_SpecObjectType");
		specObjectType.setLongName("TC4000 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC4000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC4000 String");
		attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionString.setType(datatypeDefinitionString);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);

		attributeDefinitionBooleanTc4000 = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		attributeDefinitionBooleanTc4000.setIdentifier("ID_TC4000_AttributeDefinitionBoolean_TC4000");
		attributeDefinitionBooleanTc4000.setLongName("TC4000 Boolean");
		attributeDefinitionBooleanTc4000.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionBooleanTc4000.setType(datatypeDefinitionBoolean);
		specObjectType.getSpecAttributes().add(attributeDefinitionBooleanTc4000);

		attributeDefinitionInteger = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		attributeDefinitionInteger.setIdentifier("ID_TC4000_AttributeDefinitionInteger");
		attributeDefinitionInteger.setLongName("TC4000 Integer");
		attributeDefinitionInteger.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionInteger.setType(datatypeDefinitionInteger);
		specObjectType.getSpecAttributes().add(attributeDefinitionInteger);

		attributeDefinitionDate = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		attributeDefinitionDate.setIdentifier("ID_TC4000_AttributeDefinitionDate");
		attributeDefinitionDate.setLongName("TC4000 Date");
		attributeDefinitionDate.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionDate.setType(datatypeDefinitionDate);
		specObjectType.getSpecAttributes().add(attributeDefinitionDate);

		attributeDefinitionReal = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		attributeDefinitionReal.setIdentifier("ID_TC4000_AttributeDefinitionReal");
		attributeDefinitionReal.setLongName("TC4000 Real");
		attributeDefinitionReal.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionReal.setType(datatypeDefinitionReal);
		specObjectType.getSpecAttributes().add(attributeDefinitionReal);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC4000_SpecificationType");
		specificationType.setLongName("TC4000 SpecificationType");
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
		specification.setIdentifier("ID_TC4000_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));
		String longTestString = "Life's but a walking shadow, a poor player, that struts and frets his hour upon the stage, and then is heard no more; it is a tale told by an idiot, full of sound and fury, signifying nothing. William Shakespeare";

		for (int i = 0; i < specHierarchiesCount; i++) {
			SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
			specHierarchy.setIdentifier("ID_TC4000_SpecHierarchy_" + i);
			specHierarchy.setLongName("TC4000 SpecHierarchy_" + i);
			specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));

			SpecObject specObj = createTC4000SpecObject("ID_TC4000_SpecObject" + i, toDate(LAST_CHANGE_STRING), true, new BigInteger("5000"),
					"test String", 1234.5, toDate(LAST_CHANGE_STRING));
			specHierarchy.setObject(specObj);
			specification.getChildren().add(specHierarchy);

		}
		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecObject</li>
	 * <li>AlternativeID</li>
	 * <li>AttributeValueBoolean</li>
	 * <li>AttributeValueInteger</li>
	 * <li>AttributeValueString</li>
	 * <li>AttributeValueReal</li>
	 * <li>AttributeValueDate</li>
	 * <li>AttributeValueEnumeration</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecObjects() throws Exception {
		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setDesc("description");
		specObject.setIdentifier("ID_TC4000_SpecObject");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setLongName("TC4000 SpecObject");
		specObject.setType(specObjectType);

		AlternativeID alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC4000_specObject_AlternativeID");
		specObject.setAlternativeID(alternativeID);

		AttributeValueBoolean attributeValueBooleanTC4000 = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTC4000.setDefinition(attributeDefinitionBooleanTc4000);
		attributeValueBooleanTC4000.setTheValue(true);

		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(attributeDefinitionInteger);
		attributeValueInteger.setTheValue(new BigInteger("5000"));

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue("Plain");

		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(attributeDefinitionReal);
		attributeValueReal.setTheValue(1234.5);

		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(attributeDefinitionDate);
		attributeValueDate.setTheValue(toDate(LAST_CHANGE_STRING));

		specObject.getValues().add(attributeValueBooleanTC4000);
		specObject.getValues().add(attributeValueInteger);
		specObject.getValues().add(attributeValueString);
		specObject.getValues().add(attributeValueReal);
		specObject.getValues().add(attributeValueDate);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	public SpecObject createTC4000SpecObject(String identifier, XMLGregorianCalendar lastChangeDate, boolean tc4000_boolean,
			BigInteger tc4000_integer, String tc4000_text, Double tc4000_real, XMLGregorianCalendar tc4000_lastChangeDate) throws Exception {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setIdentifier(identifier);
		specObject.setLastChange(tc4000_lastChangeDate);
		specObject.setType(specObjectType);

		AttributeValueBoolean attributeValueBooleanTc4000t = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTc4000t.setDefinition(attributeDefinitionBooleanTc4000);
		attributeValueBooleanTc4000t.setTheValue(tc4000_boolean);

		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(attributeDefinitionInteger);
		attributeValueInteger.setTheValue(tc4000_integer);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue(tc4000_text);

		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(attributeDefinitionReal);
		attributeValueReal.setTheValue(tc4000_real);

		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(attributeDefinitionDate);
		attributeValueDate.setTheValue(tc4000_lastChangeDate);

		specObject.getValues().add(attributeValueBooleanTc4000t);
		specObject.getValues().add(attributeValueInteger);
		specObject.getValues().add(attributeValueString);
		specObject.getValues().add(attributeValueReal);
		specObject.getValues().add(attributeValueDate);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

		return specObject;

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
