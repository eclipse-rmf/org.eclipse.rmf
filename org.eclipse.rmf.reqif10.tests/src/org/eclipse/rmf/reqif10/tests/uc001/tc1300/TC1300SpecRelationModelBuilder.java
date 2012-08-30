package org.eclipse.rmf.reqif10.tests.uc001.tc1300;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1300SpecRelationModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1300";

	// datatypes
	DatatypeDefinitionString datatypeDefinitionString;
	DatatypeDefinitionXHTML datatypeDefinitionXHTML;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString attributeDefinitionStringForSpecObject;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject2;

	// SpecRelationTypes
	SpecRelationType specRelationType;
	AttributeDefinitionXHTML attributeDefinitionXhtmlForSpecRelation;

	// RelationGroupTypes
	// TODO: why isn't it called SpecRelationGroupType?
	RelationGroupType relationGroupType;

	// TODO: why isn't it called SpecRelationGroup?
	RelationGroup relationGroup;

	// SpecRelation
	SpecRelation specRelation;

	// Specifications
	Specification specification;

	public TC1300SpecRelationModelBuilder() throws Exception {
		super("ID_TC1300_ReqIfHeader", "TC 1300 'SpecRelation'");
	}

	@Override
	public void createDatatypes() throws Exception {

		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC1300_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC1300 String");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("256"));

		// datatypeDefinitionXHTML
		datatypeDefinitionXHTML = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXHTML.setIdentifier("ID_TC1300_DatatypeDefinitionXHTML");
		datatypeDefinitionXHTML.setLongName("TC1300 XHTML");
		datatypeDefinitionXHTML.setLastChange(toDate(LAST_CHANGE_STRING));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionXHTML);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1300_SpecObjectType");
		specObjectType.setLongName("TC1300 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionStringForSpecObject = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionStringForSpecObject.setIdentifier("ID_TC1300_AttributeDefinitionString");
		attributeDefinitionStringForSpecObject.setLongName("TC1300 String");
		attributeDefinitionStringForSpecObject.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionStringForSpecObject.setType(datatypeDefinitionString);

		specObjectType.getSpecAttributes().add(attributeDefinitionStringForSpecObject);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1300_SpecificationType");
		specificationType.setLongName("TC1300 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecifications() throws Exception {
		specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1300_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));

		SpecHierarchy specHierarchy;
		specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC1300_SpecHierarchy1");
		specHierarchy.setLongName("TC1300 SpecHierarchy1");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject1);
		specification.getChildren().add(specHierarchy);

		specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC1300_SpecHierarchy2");
		specHierarchy.setLongName("TC1300 SpecHierarchy2");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject2);
		specification.getChildren().add(specHierarchy);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	@Override
	public void createSpecObjects() throws Exception {
		// specObject1
		specObject1 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject1.setIdentifier("ID_TC1300_SpecObject1");
		specObject1.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject1.setType(specObjectType);

		AttributeValueString attributeValueString;
		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionStringForSpecObject);
		attributeValueString.setTheValue("Requirement 1");
		specObject1.getValues().add(attributeValueString);
		getReqIF().getCoreContent().getSpecObjects().add(specObject1);

		// specObject2
		specObject2 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject2.setIdentifier("ID_TC1300_SpecObject2");
		specObject2.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject2.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionStringForSpecObject);
		attributeValueString.setTheValue("Requirement 2");
		specObject2.getValues().add(attributeValueString);
		getReqIF().getCoreContent().getSpecObjects().add(specObject2);

	}

	@Override
	public void createRelationGroupTypes() throws Exception {
		relationGroupType = ReqIF10Factory.eINSTANCE.createRelationGroupType();
		relationGroupType.setIdentifier("ID_TC1300_SpecRelationGroupType");
		relationGroupType.setLongName("TC 1300 SpecRelationGroupType");
		relationGroupType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(relationGroupType);
	}

	@Override
	public void createRelationGroups() throws Exception {
		relationGroup = ReqIF10Factory.eINSTANCE.createRelationGroup();
		relationGroup.setIdentifier("ID_TC1300_RelationGroup");
		relationGroup.setLongName("TC 1300 RelationGroup");
		relationGroup.setLastChange(toDate(LAST_CHANGE_STRING));
		relationGroup.setType(relationGroupType);
		relationGroup.getSpecRelations().add(specRelation);
		relationGroup.setSourceSpecification(specification);
		relationGroup.setTargetSpecification(specification);
		getReqIF().getCoreContent().getSpecRelationGroups().add(relationGroup);
	}

	@Override
	public void createSpecRelations() throws Exception {

		specRelation = ReqIF10Factory.eINSTANCE.createSpecRelation();
		specRelation.setIdentifier("ID_TC1300_SpecRelation");
		specRelation.setLongName("TC 1300 SpecRelation");
		specRelation.setLastChange(toDate(LAST_CHANGE_STRING));
		specRelation.setType(specRelationType);
		specRelation.setSource(specObject1);
		specRelation.setTarget(specObject2);

		AttributeValueXHTML attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(attributeDefinitionXhtmlForSpecRelation);
		attributeValueXhtml.setTheValue(createXhtmlValue("TC 1300 SpecRelation"));
		specRelation.getValues().add(attributeValueXhtml);

		getReqIF().getCoreContent().getSpecRelations().add(specRelation);
	}

	@Override
	public void createSpecRelationTypes() throws Exception {
		specRelationType = ReqIF10Factory.eINSTANCE.createSpecRelationType();
		specRelationType.setIdentifier("ID_TC1300_SpecRelationType");
		specRelationType.setLongName("TC 1300 SpecRelationType");
		specRelationType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionXhtmlForSpecRelation = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		attributeDefinitionXhtmlForSpecRelation.setIdentifier("ID_TC1300_AttributeDefinitionString_SpecRelation");
		attributeDefinitionXhtmlForSpecRelation.setLongName("ReqIF.Name");
		attributeDefinitionXhtmlForSpecRelation.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionXhtmlForSpecRelation.setType(datatypeDefinitionXHTML);

		specRelationType.getSpecAttributes().add(attributeDefinitionXhtmlForSpecRelation);

		getReqIF().getCoreContent().getSpecTypes().add(specRelationType);
	}

}
