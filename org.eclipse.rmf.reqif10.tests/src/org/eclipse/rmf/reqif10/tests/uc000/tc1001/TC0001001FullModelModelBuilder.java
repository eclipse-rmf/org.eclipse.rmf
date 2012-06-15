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
package org.eclipse.rmf.reqif10.tests.uc000.tc1001;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AlternativeID;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueBoolean;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC0001001FullModelModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC0001001";

	// datatypes
	protected DatatypeDefinitionBoolean datatypeDefinitionBoolean;
	protected DatatypeDefinitionInteger datatypeDefinitionInteger;
	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionReal datatypeDefinitionReal;
	protected DatatypeDefinitionDate datatypeDefinitionDate;
	protected DatatypeDefinitionEnumeration datatypeDefinitionEnumeration;
	protected EnumValue enumValueRed;
	protected EnumValue enumValueYellow;
	protected EnumValue enumValueGreen;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionBoolean specObjectTypeAttributeDefinitionBoolean;
	AttributeDefinitionInteger specObjectTypeAttributeDefinitionInteger;
	AttributeDefinitionString specObjectTypeAttributeDefinitionString;
	AttributeDefinitionReal specObjectTypeAttributeDefinitionReal;
	AttributeDefinitionDate specObjectTypeAttributeDefinitionDate;
	AttributeDefinitionEnumeration specObjectTypeAttributeDefinitionEnumeration;

	// SpecificationTypes
	SpecificationType specificationType;
	AttributeDefinitionString specificationTypeAttributeDefinitionString;

	// SpecRelationTypes
	SpecRelationType specRelationType;
	AttributeDefinitionString specRelationTypeAttributeDefinitionString;

	// RelationGroupTypes
	RelationGroupType relationGroupType;
	AttributeDefinitionString relationGroupTypeAttributeDefinitionString;

	// SpecObjects
	SpecObject specObject;

	// Specifications
	Specification specification;

	// SpecRelations
	SpecRelation specRelation;

	/**
	 * @throws Exception 
	 * 
	 */
	public TC0001001FullModelModelBuilder() throws Exception {
		super("comment", LAST_CHANGE_STRING, "ID_TC0001001_ReqIfHeader", "repositoryId", "reqIFToolId", "1.0", "sourceToolId",
				"UC000 TC1001 'FullModel'");
	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>DatatypeDefinitionBoolean</li>
	 * <li>DatatypeDefinitionInteger</li>
	 * <li>DatatypeDefinitionString</li>
	 * <li>DatatypeDefinitionReal</li>
	 * <li>DatatypeDefinitionDate</li>
	 * <li>DatatypeDefinitionEnumeration</li>
	 * <li>EnumValue</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		datatypeDefinitionBoolean.setDesc("description");
		datatypeDefinitionBoolean.setIdentifier("ID_TC0001001_DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLongName("TC0001001 DatatypeDefinitionBoolean");
		datatypeDefinitionBoolean.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionBoolean_AlternativeID");
		datatypeDefinitionBoolean.setAlternativeID(alternativeID);

		datatypeDefinitionInteger = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger.setDesc("description");
		datatypeDefinitionInteger.setIdentifier("ID_TC0001001_DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLongName("TC0001001 DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionInteger
				.setMin(new BigInteger(
						"-012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"));
		datatypeDefinitionInteger
				.setMax(new BigInteger(
						"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"));
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionInteger_AlternativeID");
		datatypeDefinitionInteger.setAlternativeID(alternativeID);

		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setDesc("description");
		datatypeDefinitionString.setIdentifier("ID_TC0001001_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC0001001 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("256"));
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionString_AlternativeID");
		datatypeDefinitionString.setAlternativeID(alternativeID);

		datatypeDefinitionReal = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		datatypeDefinitionReal.setDesc("description");
		datatypeDefinitionReal.setIdentifier("ID_TC0001001_DatatypeDefinitionReal");
		datatypeDefinitionReal.setLongName("TC0001001 DatatypeDefinitionReal");
		datatypeDefinitionReal.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionReal.setMin(-1234.5678);
		datatypeDefinitionReal.setMax(1234.5678);
		datatypeDefinitionReal.setAccuracy(new BigInteger("10"));
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionReal_AlternativeID");
		datatypeDefinitionReal.setAlternativeID(alternativeID);

		datatypeDefinitionDate = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		datatypeDefinitionDate.setDesc("description");
		datatypeDefinitionDate.setIdentifier("ID_TC0001001_DatatypeDefinitionDate");
		datatypeDefinitionDate.setLongName("TC0001001 DatatypeDefinitionDate");
		datatypeDefinitionDate.setLastChange(toDate(LAST_CHANGE_STRING));
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionDate_AlternativeID");
		datatypeDefinitionDate.setAlternativeID(alternativeID);

		datatypeDefinitionEnumeration = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		datatypeDefinitionEnumeration.setDesc("description");
		datatypeDefinitionEnumeration.setIdentifier("ID_TC0001001_DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLongName("TC0001001 DatatypeDefinitionEnumeration");
		datatypeDefinitionEnumeration.setLastChange(toDate(LAST_CHANGE_STRING));
		// red
		enumValueRed = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueRed.setIdentifier("ID_TC0001001_DatatypeDefinitionEnumeration_EnumValue_Red");
		enumValueRed.setLongName("TC0001001 Red");
		enumValueRed.setLastChange(toDate(LAST_CHANGE_STRING));
		EmbeddedValue embeddedValueRed = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueRed.setKey(new BigInteger("0"));
		embeddedValueRed.setOtherContent("");
		enumValueRed.setProperties(embeddedValueRed);
		// green
		enumValueGreen = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueGreen.setIdentifier("ID_TC0001001_DatatypeDefinitionEnumeration_EnumValue_Green");
		enumValueGreen.setLongName("TC0001001 Green");
		enumValueGreen.setLastChange(toDate(LAST_CHANGE_STRING));
		EmbeddedValue embeddedValueGreen = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueGreen.setKey(new BigInteger("1"));
		embeddedValueGreen.setOtherContent("");
		enumValueGreen.setProperties(embeddedValueGreen);
		// yellow
		enumValueYellow = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValueYellow.setIdentifier("ID_TC0001001_DatatypeDefinitionEnumeration_EnumValue_Yellow");
		enumValueYellow.setLongName("TC0001001 Yellow");
		enumValueYellow.setLastChange(toDate(LAST_CHANGE_STRING));
		EmbeddedValue embeddedValueYellow = ReqIF10Factory.eINSTANCE.createEmbeddedValue();
		embeddedValueYellow.setKey(new BigInteger("2"));
		embeddedValueYellow.setOtherContent("");
		enumValueYellow.setProperties(embeddedValueYellow);

		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueRed);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueGreen);
		datatypeDefinitionEnumeration.getSpecifiedValues().add(enumValueYellow);

		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_datatypeDefinitionEnumeration_AlternativeID");
		datatypeDefinitionEnumeration.setAlternativeID(alternativeID);

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionBoolean);
		datatypes.add(datatypeDefinitionInteger);
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionReal);
		datatypes.add(datatypeDefinitionDate);
		datatypes.add(datatypeDefinitionEnumeration);
	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecObjectType</li>
	 * <li>AttributeDefinitionBoolean</li>
	 * <li>AttributeDefinitionInteger</li>
	 * <li>AttributeDefinitionString</li>
	 * <li>AttributeDefinitionReal</li>
	 * <li>AttributeDefinitionDate</li>
	 * <li>AttributeDefinitionEnumeration</li>
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
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setDesc("description");
		specObjectType.setIdentifier("ID_TC0001001_SpecObjectType");
		specObjectType.setLongName("TC0001001 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectType_AlternativeID");
		specObjectType.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionBoolean = ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
		specObjectTypeAttributeDefinitionBoolean.setDesc("description");
		specObjectTypeAttributeDefinitionBoolean.setEditable(false);
		specObjectTypeAttributeDefinitionBoolean.setIdentifier("ID_TC0001001_AttributeDefinitionBoolean");
		specObjectTypeAttributeDefinitionBoolean.setLongName("TC0001001 Boolean");
		specObjectTypeAttributeDefinitionBoolean.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionBoolean.setType(datatypeDefinitionBoolean);
		AttributeValueBoolean attributeValueBoolean = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBoolean.setTheValue(false);
		specObjectTypeAttributeDefinitionBoolean.setDefaultValue(attributeValueBoolean);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionBoolean_AlternativeID");
		specObjectTypeAttributeDefinitionBoolean.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionInteger = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		specObjectTypeAttributeDefinitionInteger.setDesc("description");
		specObjectTypeAttributeDefinitionInteger.setEditable(true);
		specObjectTypeAttributeDefinitionInteger.setIdentifier("ID_TC0001001_AttributeDefinitionInteger");
		specObjectTypeAttributeDefinitionInteger.setLongName("TC0001001 Integer");
		specObjectTypeAttributeDefinitionInteger.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionInteger.setType(datatypeDefinitionInteger);
		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger
				.setTheValue(new BigInteger("012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"));
		specObjectTypeAttributeDefinitionInteger.setDefaultValue(attributeValueInteger);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionInteger_AlternativeID");
		specObjectTypeAttributeDefinitionInteger.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionString.setDesc("description");
		specObjectTypeAttributeDefinitionString.setEditable(true);
		specObjectTypeAttributeDefinitionString.setIdentifier("ID_TC0001001_AttributeDefinitionString");
		specObjectTypeAttributeDefinitionString.setLongName("TC0001001 String");
		specObjectTypeAttributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionString.setType(datatypeDefinitionString);
		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setTheValue("");
		specObjectTypeAttributeDefinitionString.setDefaultValue(attributeValueString);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionString_AlternativeID");
		specObjectTypeAttributeDefinitionString.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionReal = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		specObjectTypeAttributeDefinitionReal.setDesc("description");
		specObjectTypeAttributeDefinitionReal.setEditable(true);
		specObjectTypeAttributeDefinitionReal.setIdentifier("ID_TC0001001_AttributeDefinitionReal");
		specObjectTypeAttributeDefinitionReal.setLongName("TC0001001 Real");
		specObjectTypeAttributeDefinitionReal.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionReal.setType(datatypeDefinitionReal);
		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setTheValue(0.0);
		specObjectTypeAttributeDefinitionReal.setDefaultValue(attributeValueReal);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionReal_AlternativeID");
		specObjectTypeAttributeDefinitionReal.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionDate = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		specObjectTypeAttributeDefinitionDate.setDesc("description");
		specObjectTypeAttributeDefinitionDate.setEditable(true);
		specObjectTypeAttributeDefinitionDate.setIdentifier("ID_TC0001001_AttributeDefinitionDate");
		specObjectTypeAttributeDefinitionDate.setLongName("TC0001001 Date");
		specObjectTypeAttributeDefinitionDate.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionDate.setType(datatypeDefinitionDate);
		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setTheValue(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionDate.setDefaultValue(attributeValueDate);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionDate_AlternativeID");
		specObjectTypeAttributeDefinitionDate.setAlternativeID(alternativeID);

		specObjectTypeAttributeDefinitionEnumeration = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		specObjectTypeAttributeDefinitionEnumeration.setDesc("description");
		specObjectTypeAttributeDefinitionEnumeration.setEditable(true);
		specObjectTypeAttributeDefinitionEnumeration.setIdentifier("ID_TC0001001_AttributeDefinitionEnumeration");
		specObjectTypeAttributeDefinitionEnumeration.setLongName("TC0001001 Enum");
		specObjectTypeAttributeDefinitionEnumeration.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionEnumeration.setType(datatypeDefinitionEnumeration);
		specObjectTypeAttributeDefinitionEnumeration.setMultiValued(true);
		AttributeValueEnumeration attributeValueEnumeration = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValueEnumeration.getValues().add(enumValueGreen);
		attributeValueEnumeration.getValues().add(enumValueRed);
		attributeValueEnumeration.getValues().add(enumValueYellow);
		specObjectTypeAttributeDefinitionEnumeration.setDefaultValue(attributeValueEnumeration);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObjectTypeAttributeDefinitionEnumeration_AlternativeID");
		specObjectTypeAttributeDefinitionEnumeration.setAlternativeID(alternativeID);

		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionBoolean);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionInteger);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionString);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionReal);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionDate);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionEnumeration);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecificationType</li>
	 * <li>AttributeDefinitionString</li>
	 * <li>AttributeValueString</li>
	 * <li>AlternativeID</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();

		specificationType.setIdentifier("ID_TC0001001_SpecificationType");
		specificationType.setDesc("description");
		specificationType.setLongName("TC0001001 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specificationType_AlternativeID");
		specificationType.setAlternativeID(alternativeID);

		specificationTypeAttributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specificationTypeAttributeDefinitionString.setDesc("description");
		specificationTypeAttributeDefinitionString.setEditable(true);
		specificationTypeAttributeDefinitionString.setIdentifier("ID_TC0001001_specificationTypeAttributeDefinitionString");
		specificationTypeAttributeDefinitionString.setLongName("TC0001001 String");
		specificationTypeAttributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		specificationTypeAttributeDefinitionString.setType(datatypeDefinitionString);
		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setTheValue("  ");
		specificationTypeAttributeDefinitionString.setDefaultValue(attributeValueString);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specificationTypeAttributeDefinitionString_AlternativeID");
		specificationTypeAttributeDefinitionString.setAlternativeID(alternativeID);

		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionString);

		getReqIF().getCoreContent().getSpecTypes().add(specificationType);

	}

	@Override
	public void createRelationGroups() throws Exception {
		RelationGroup relationGroup = ReqIF10Factory.eINSTANCE.createRelationGroup();
		relationGroup.setIdentifier("ID_TC0001001_RelationGrpoup");
		relationGroup.setDesc("description");
		relationGroup.setLongName("TC0001001 RelationGroup");
		relationGroup.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_relationGroup_AlternativeID");
		relationGroup.setAlternativeID(alternativeID);

		relationGroup.setSourceSpecification(specification);
		relationGroup.setTargetSpecification(specification);
		relationGroup.setType(relationGroupType);
		relationGroup.getSpecRelations().add(specRelation);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specRelationTypeAttributeDefinitionString);
		attributeValueString.setTheValue("self");
		// due to a bug in the metamodel we cannot create the attributes
		// specRelation.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecRelationGroups().add(relationGroup);
	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>Specification</li>
	 * <li>SpecHierarchy</li>
	 * <li>AlternativeID</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecifications() throws Exception {
		specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setDesc("description");
		specification.setIdentifier("ID_TC0001001_Specification");
		specification.setLongName("TC0001001 Specificationy");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specification_AlternativeID");
		specification.setAlternativeID(alternativeID);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specificationTypeAttributeDefinitionString);
		attributeValueString.setTheValue("Plain");
		specification.getValues().add(attributeValueString);

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setDesc("description");
		specHierarchy.setIdentifier("ID_TC0001001_SpecHierarchy");
		specHierarchy.setLongName("TC0001001 SpecHierarchy");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject);
		specHierarchy.getEditableAtts().add(specObjectTypeAttributeDefinitionBoolean);
		specHierarchy.getEditableAtts().add(specObjectTypeAttributeDefinitionInteger);
		specHierarchy.getEditableAtts().add(specObjectTypeAttributeDefinitionString);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specHierarchy_AlternativeID");
		specHierarchy.setAlternativeID(alternativeID);
		specification.getChildren().add(specHierarchy);

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
		specObject.setIdentifier("ID_TC0001001_SpecObject");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setLongName("TC0001001 SpecObject");
		specObject.setType(specObjectType);

		AlternativeID alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specObject_AlternativeID");
		specObject.setAlternativeID(alternativeID);

		AttributeValueBoolean attributeValueBooleanTC0001001 = ReqIF10Factory.eINSTANCE.createAttributeValueBoolean();
		attributeValueBooleanTC0001001.setDefinition(specObjectTypeAttributeDefinitionBoolean);
		attributeValueBooleanTC0001001.setTheValue(true);

		AttributeValueInteger attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(specObjectTypeAttributeDefinitionInteger);
		attributeValueInteger.setTheValue(new BigInteger("5000"));

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionString);
		attributeValueString.setTheValue("Plain");

		AttributeValueReal attributeValueReal = ReqIF10Factory.eINSTANCE.createAttributeValueReal();
		attributeValueReal.setDefinition(specObjectTypeAttributeDefinitionReal);
		attributeValueReal.setTheValue(1234.5);

		AttributeValueDate attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDate);
		attributeValueDate.setTheValue(toDate("2002-05-30T09:30:10+06:00"));

		AttributeValueEnumeration attributeValueEnumerationMultiValue = ReqIF10Factory.eINSTANCE.createAttributeValueEnumeration();
		attributeValueEnumerationMultiValue.setDefinition(specObjectTypeAttributeDefinitionEnumeration);
		attributeValueEnumerationMultiValue.getValues().add(enumValueYellow);
		attributeValueEnumerationMultiValue.getValues().add(enumValueRed);
		attributeValueEnumerationMultiValue.getValues().add(enumValueGreen);

		specObject.getValues().add(attributeValueBooleanTC0001001);
		specObject.getValues().add(attributeValueInteger);
		specObject.getValues().add(attributeValueString);
		specObject.getValues().add(attributeValueReal);
		specObject.getValues().add(attributeValueDate);
		specObject.getValues().add(attributeValueEnumerationMultiValue);

		getReqIF().getCoreContent().getSpecObjects().add(specObject);

	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecRelationType</li>
	 * <li>AttributeDefinitionString</li>
	 * <li>AttributeValueString</li>
	 * <li>AlternativeID</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecRelations() throws Exception {
		specRelation = ReqIF10Factory.eINSTANCE.createSpecRelation();
		specRelation.setIdentifier("ID_TC0001001_SpecRelation");
		specRelation.setDesc("description");
		specRelation.setLongName("TC0001001 SpecRelation");
		specRelation.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specRelation_AlternativeID");
		specRelation.setAlternativeID(alternativeID);

		specRelation.setSource(specObject);
		specRelation.setTarget(specObject);
		specRelation.setType(specRelationType);

		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specRelationTypeAttributeDefinitionString);
		attributeValueString.setTheValue("self");
		specRelation.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecRelations().add(specRelation);
	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecRelationType</li>
	 * <li>AttributeDefinitionString</li>
	 * <li>AttributeValueString</li>
	 * <li>AlternativeID</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecRelationTypes() throws Exception {
		specRelationType = ReqIF10Factory.eINSTANCE.createSpecRelationType();

		specRelationType.setIdentifier("ID_TC0001001_SpecRelationType");
		specRelationType.setDesc("description");
		specRelationType.setLongName("TC0001001 SpecRelationType");
		specRelationType.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specRelationType_AlternativeID");
		specRelationType.setAlternativeID(alternativeID);

		specRelationTypeAttributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specRelationTypeAttributeDefinitionString.setDesc("description");
		specRelationTypeAttributeDefinitionString.setEditable(true);
		specRelationTypeAttributeDefinitionString.setIdentifier("ID_TC0001001_specRelationTypeAttributeDefinitionString");
		specRelationTypeAttributeDefinitionString.setLongName("TC0001001 String");
		specRelationTypeAttributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		specRelationTypeAttributeDefinitionString.setType(datatypeDefinitionString);
		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setTheValue("  ");
		specRelationTypeAttributeDefinitionString.setDefaultValue(attributeValueString);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_specRelationTypeAttributeDefinitionString_AlternativeID");
		specRelationTypeAttributeDefinitionString.setAlternativeID(alternativeID);

		specRelationType.getSpecAttributes().add(specRelationTypeAttributeDefinitionString);

		getReqIF().getCoreContent().getSpecTypes().add(specRelationType);

	}

	@Override
	public void createRelationGroupTypes() throws Exception {
		relationGroupType = ReqIF10Factory.eINSTANCE.createRelationGroupType();
		relationGroupType.setIdentifier("ID_TC0001001_RelationGroupType");
		relationGroupType.setDesc("description");
		relationGroupType.setLongName("TC0001001 RelationGroupType");
		relationGroupType.setLastChange(toDate(LAST_CHANGE_STRING));
		AlternativeID alternativeID;
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_relationGroupType_AlternativeID");
		relationGroupType.setAlternativeID(alternativeID);

		relationGroupTypeAttributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		relationGroupTypeAttributeDefinitionString.setDesc("description");
		relationGroupTypeAttributeDefinitionString.setEditable(true);
		relationGroupTypeAttributeDefinitionString.setIdentifier("ID_TC0001001_relationGroupTypeAttributeDefinitionString");
		relationGroupTypeAttributeDefinitionString.setLongName("TC0001001 String");
		relationGroupTypeAttributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		relationGroupTypeAttributeDefinitionString.setType(datatypeDefinitionString);
		AttributeValueString attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setTheValue("  ");
		relationGroupTypeAttributeDefinitionString.setDefaultValue(attributeValueString);
		alternativeID = ReqIF10Factory.eINSTANCE.createAlternativeID();
		alternativeID.setIdentifier("ID_TC0001001_relationGroupTypeAttributeDefinitionString_AlternativeID");
		relationGroupTypeAttributeDefinitionString.setAlternativeID(alternativeID);

		relationGroupType.getSpecAttributes().add(relationGroupTypeAttributeDefinitionString);

		getReqIF().getCoreContent().getSpecTypes().add(relationGroupType);
	}

	@Override
	public void createToolExtensions() throws Exception {
		ReqIFToolExtension reqIFToolExtension = ReqIF10Factory.eINSTANCE.createReqIFToolExtension();
		getReqIF().getToolExtensions().add(reqIFToolExtension);
	}

	@Override
	public void postProcessing() throws Exception {
		getReqIF().setLang("en");
	}

}
