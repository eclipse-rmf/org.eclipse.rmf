package org.eclipse.rmf.reqif10.tests.uc001.tc1700;

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
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1700SpecRelationMultifile1ModelBuilder extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1700";

	// datatypes
	DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString attributeDefinitionString;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject2;

	// Specifications
	Specification specification;

	public TC1700SpecRelationMultifile1ModelBuilder() throws Exception {
		super("ID_TC1700_ReqIfHeader_1", "TC 1700 'SpecRelation'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC1700_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("ReqIF.Name");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("256"));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);

	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1700_SpecObjectType");
		specObjectType.setLongName("TC1700 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC1000_AttributeDefinitionString");
		attributeDefinitionString.setLongName("TC1000 String");
		attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionString.setType(datatypeDefinitionString);

		specObjectType.getSpecAttributes().add(attributeDefinitionString);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1700_SpecificationType");
		specificationType.setLongName("TC1700 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecifications() throws Exception {
		specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1700_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));

		SpecHierarchy specHierarchy;
		specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC1700_SpecHierarchy1");
		specHierarchy.setLongName("TC1700 SpecHierarchy1");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject1);
		specification.getChildren().add(specHierarchy);

		specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC1700_SpecHierarchy2");
		specHierarchy.setLongName("TC1700 SpecHierarchy2");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject2);
		specification.getChildren().add(specHierarchy);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

	@Override
	public void createSpecObjects() throws Exception {
		// specObject1
		specObject1 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject1.setIdentifier("ID_TC1700_SpecObject1");
		specObject1.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject1.setType(specObjectType);

		AttributeValueString attributeValueString;
		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue("Requirement 1");
		specObject1.getValues().add(attributeValueString);
		getReqIF().getCoreContent().getSpecObjects().add(specObject1);

		// specObject2
		specObject2 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject2.setIdentifier("ID_TC1700_SpecObject2");
		specObject2.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject2.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(attributeDefinitionString);
		attributeValueString.setTheValue("Requirement 2");
		specObject2.getValues().add(attributeValueString);
		getReqIF().getCoreContent().getSpecObjects().add(specObject2);

	}

	public SpecObject getSpecObject1() {
		return specObject1;
	}

	public SpecObject getSpecObject2() {
		return specObject2;
	}

	public Specification getSpecification() {
		return specification;
	}

}
