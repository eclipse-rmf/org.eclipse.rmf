package org.eclipse.rmf.reqif10.tests.uc001.tc1100;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.AttributeValueDate;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.AttributeValueXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.tests.util.CommonSystemAttributes;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1100UnformattedSystemAttributesAndSpecHierarchyModelBuilder extends SimpleModelBuilder implements CommonSystemAttributes {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1100";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionXHTML datatypeDefinitionXhtml;
	protected DatatypeDefinitionDate datatypeDefinitionDate;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringForeignId;
	AttributeDefinitionXHTML specObjectTypeAttributeDefinitionXhtmlName;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringForeignCreatedBy;
	AttributeDefinitionString specObjectTypeAttributeDefinitionStringForeignModifiedBy;
	AttributeDefinitionDate specObjectTypeAttributeDefinitionDateForeignCreatedOn;

	// SpecificationTypes
	SpecificationType specificationType;
	AttributeDefinitionXHTML specificationTypeAttributeDefinitionXhtmlName;
	AttributeDefinitionString specificationTypeAttributeDefinitionStringForeignCreatedBy;
	AttributeDefinitionString specificationTypeAttributeDefinitionStringForeignModifiedBy;
	AttributeDefinitionDate specificationTypeAttributeDefinitionDateForeignCreatedOn;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject11;
	SpecObject specObject111;
	SpecObject specObject12;
	SpecObject specObject2;

	public TC1100UnformattedSystemAttributesAndSpecHierarchyModelBuilder() throws Exception {
		super("ID_TC1100_ReqIfHeader", "TC 1100 'Unformatted common system attributes & SpecHierarchy'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC1100_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC1100 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));

		datatypeDefinitionXhtml = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionXHTML();
		datatypeDefinitionXhtml.setIdentifier("ID_TC18xx_DatatypeDefinitionXhtml");
		datatypeDefinitionXhtml.setLongName("TC18xx DatatypeDefinitionXhtml");
		datatypeDefinitionXhtml.setLastChange(toDate(LAST_CHANGE_STRING));

		datatypeDefinitionDate = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionDate();
		datatypeDefinitionDate.setIdentifier("ID_TC1100_DatatypeDefinitionDate");
		datatypeDefinitionDate.setLongName("TC1100 DatatypeDefinitionDate");
		datatypeDefinitionDate.setLastChange(toDate(LAST_CHANGE_STRING));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionDate);
		datatypes.add(datatypeDefinitionXhtml);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC1100_SpecObjectType");
		specObjectType.setLongName("TC1100 SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		specObjectTypeAttributeDefinitionStringForeignId = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringForeignId.setIdentifier("ID_TC1100_SpecObjectTypeAttributeDefinitionString_" + REQIF_FOREIGN_ID);
		specObjectTypeAttributeDefinitionStringForeignId.setLongName(REQIF_FOREIGN_ID);
		specObjectTypeAttributeDefinitionStringForeignId.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionStringForeignId.setType(datatypeDefinitionString);

		specObjectTypeAttributeDefinitionXhtmlName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		specObjectTypeAttributeDefinitionXhtmlName.setIdentifier("ID_TC1100_SpecObjectTypeAttributeDefinitionXhtml_" + REQIF_NAME);
		specObjectTypeAttributeDefinitionXhtmlName.setLongName(REQIF_NAME);
		specObjectTypeAttributeDefinitionXhtmlName.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionXhtmlName.setType(datatypeDefinitionXhtml);

		specObjectTypeAttributeDefinitionStringForeignCreatedBy = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringForeignCreatedBy.setIdentifier("ID_TC1100_SpecObjectTypeAttributeDefinitionString_"
				+ REQIF_FOREIGN_CREATED_BY);
		specObjectTypeAttributeDefinitionStringForeignCreatedBy.setLongName(REQIF_FOREIGN_CREATED_BY);
		specObjectTypeAttributeDefinitionStringForeignCreatedBy.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionStringForeignCreatedBy.setType(datatypeDefinitionString);

		specObjectTypeAttributeDefinitionDateForeignCreatedOn = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		specObjectTypeAttributeDefinitionDateForeignCreatedOn.setIdentifier("ID_TC1100_SpecObjectTypeAttributeDefinitionDate_"
				+ REQIF_FOREIGN_CREATED_ON);
		specObjectTypeAttributeDefinitionDateForeignCreatedOn.setLongName(REQIF_FOREIGN_CREATED_ON);
		specObjectTypeAttributeDefinitionDateForeignCreatedOn.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionDateForeignCreatedOn.setType(datatypeDefinitionDate);

		specObjectTypeAttributeDefinitionStringForeignModifiedBy = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeAttributeDefinitionStringForeignModifiedBy.setIdentifier("ID_TC1100_SpecObjectTypeAttributeDefinitionString_"
				+ REQIF_FOREIGN_MODIFIED_BY);
		specObjectTypeAttributeDefinitionStringForeignModifiedBy.setLongName(REQIF_FOREIGN_MODIFIED_BY);
		specObjectTypeAttributeDefinitionStringForeignModifiedBy.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeAttributeDefinitionStringForeignModifiedBy.setType(datatypeDefinitionString);

		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringForeignId);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionXhtmlName);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		specObjectType.getSpecAttributes().add(specObjectTypeAttributeDefinitionStringForeignModifiedBy);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1100_SpecificationType");
		specificationType.setLongName("TC1100 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));

		specificationTypeAttributeDefinitionXhtmlName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionXHTML();
		specificationTypeAttributeDefinitionXhtmlName.setIdentifier("ID_TC1100_SpecificationTypeAttributeDefinitionXHTML_" + REQIF_NAME);
		specificationTypeAttributeDefinitionXhtmlName.setLongName(REQIF_NAME);
		specificationTypeAttributeDefinitionXhtmlName.setLastChange(toDate(LAST_CHANGE_STRING));
		specificationTypeAttributeDefinitionXhtmlName.setType(datatypeDefinitionXhtml);

		specificationTypeAttributeDefinitionStringForeignCreatedBy = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specificationTypeAttributeDefinitionStringForeignCreatedBy.setIdentifier("ID_TC1100_SpecificationTypeAttributeDefinitionString_"
				+ REQIF_FOREIGN_CREATED_BY);
		specificationTypeAttributeDefinitionStringForeignCreatedBy.setLongName(REQIF_FOREIGN_CREATED_BY);
		specificationTypeAttributeDefinitionStringForeignCreatedBy.setLastChange(toDate(LAST_CHANGE_STRING));
		specificationTypeAttributeDefinitionStringForeignCreatedBy.setType(datatypeDefinitionString);

		specificationTypeAttributeDefinitionDateForeignCreatedOn = ReqIF10Factory.eINSTANCE.createAttributeDefinitionDate();
		specificationTypeAttributeDefinitionDateForeignCreatedOn.setIdentifier("ID_TC1100_SpecificationTypeAttributeDefinitionDate_"
				+ REQIF_FOREIGN_CREATED_ON);
		specificationTypeAttributeDefinitionDateForeignCreatedOn.setLongName(REQIF_FOREIGN_CREATED_ON);
		specificationTypeAttributeDefinitionDateForeignCreatedOn.setLastChange(toDate(LAST_CHANGE_STRING));
		specificationTypeAttributeDefinitionDateForeignCreatedOn.setType(datatypeDefinitionDate);

		specificationTypeAttributeDefinitionStringForeignModifiedBy = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specificationTypeAttributeDefinitionStringForeignModifiedBy.setIdentifier("ID_TC1100_SpecificationTypeAttributeDefinitionString_"
				+ REQIF_FOREIGN_MODIFIED_BY);
		specificationTypeAttributeDefinitionStringForeignModifiedBy.setLongName(REQIF_FOREIGN_MODIFIED_BY);
		specificationTypeAttributeDefinitionStringForeignModifiedBy.setLastChange(toDate(LAST_CHANGE_STRING));
		specificationTypeAttributeDefinitionStringForeignModifiedBy.setType(datatypeDefinitionString);

		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionXhtmlName);
		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionStringForeignCreatedBy);
		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionDateForeignCreatedOn);
		specificationType.getSpecAttributes().add(specificationTypeAttributeDefinitionStringForeignModifiedBy);

		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecObjects() throws Exception {
		AttributeValueString attributeValueString;
		AttributeValueXHTML attributeValueXhtml;
		AttributeValueDate attributeValueDate;

		// specObject1
		specObject1 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject1.setIdentifier("ID_TC1100_SpecObject1");
		specObject1.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject1.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignId);
		attributeValueString.setTheValue("1");
		specObject1.getValues().add(attributeValueString);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specObjectTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Obj1"));
		specObject1.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Max Mustermann");
		specObject1.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2002-01-01T00:00:00"));
		specObject1.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("Jane Q. Public");
		specObject1.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject1);

		// specObject11
		specObject11 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject11.setIdentifier("ID_TC1100_SpecObject11");
		specObject11.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject11.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignId);
		attributeValueString.setTheValue("1.1");
		specObject11.getValues().add(attributeValueString);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specObjectTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Obj1.1"));
		specObject11.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Otto Normal");
		specObject11.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2003-02-02T00:00:00"));
		specObject11.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("John Q. Public");
		specObject11.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject11);

		// specObject111
		specObject111 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject111.setIdentifier("ID_TC1100_SpecObject111");
		specObject111.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject111.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignId);
		attributeValueString.setTheValue("1.1.1");
		specObject111.getValues().add(attributeValueString);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specObjectTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Obj1.1.1"));
		specObject111.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Fulanito");
		specObject111.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2004-03-03T00:00:00"));
		specObject111.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("John Doe");
		specObject111.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject111);

		// specObject12
		specObject12 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject12.setIdentifier("ID_TC1100_SpecObject12");
		specObject12.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject12.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignId);
		attributeValueString.setTheValue("1.2");
		specObject12.getValues().add(attributeValueString);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specObjectTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Obj1.2"));
		specObject12.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Juan Nadie");
		specObject12.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2005-04-04T00:00:00"));
		specObject12.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("Jane Q. Citizen");
		specObject12.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject12);

		// specObject2
		specObject2 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject2.setIdentifier("ID_TC1100_SpecObject2");
		specObject2.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject2.setType(specObjectType);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignId);
		attributeValueString.setTheValue("2");
		specObject2.getValues().add(attributeValueString);

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specObjectTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Obj2"));
		specObject2.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Jean Dupont");
		specObject2.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specObjectTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2006-05-05T00:00:00"));
		specObject2.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("John Q. Citizen");
		specObject2.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject2);

	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1100_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));

		// set the specification attributes
		AttributeValueString attributeValueString;
		AttributeValueXHTML attributeValueXhtml;
		AttributeValueDate attributeValueDate;

		attributeValueXhtml = ReqIF10Factory.eINSTANCE.createAttributeValueXHTML();
		attributeValueXhtml.setDefinition(specificationTypeAttributeDefinitionXhtmlName);
		attributeValueXhtml.setTheValue(createXhtmlValue("Specification1"));
		specification.getValues().add(attributeValueXhtml);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specificationTypeAttributeDefinitionStringForeignCreatedBy);
		attributeValueString.setTheValue("Fulanito");
		specification.getValues().add(attributeValueString);

		attributeValueDate = ReqIF10Factory.eINSTANCE.createAttributeValueDate();
		attributeValueDate.setDefinition(specificationTypeAttributeDefinitionDateForeignCreatedOn);
		attributeValueDate.setTheValue(toDate("2002-01-01T00:00:00"));
		specification.getValues().add(attributeValueDate);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specificationTypeAttributeDefinitionStringForeignModifiedBy);
		attributeValueString.setTheValue("Jane Q. Public");
		specification.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecifications().add(specification);

		// set spec hierarchy
		SpecHierarchy specHierarchy1;
		specHierarchy1 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy1.setIdentifier("ID_TC1100_SpecHierarchy1");
		specHierarchy1.setLongName("TC1100 SpecHierarchy 1");
		specHierarchy1.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy1.setObject(specObject1);
		specification.getChildren().add(specHierarchy1);

		SpecHierarchy specHierarchy11;
		specHierarchy11 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy11.setIdentifier("ID_TC1100_SpecHierarchy11");
		specHierarchy11.setLongName("TC1100 SpecHierarchy 11");
		specHierarchy11.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy11.setObject(specObject11);
		specHierarchy1.getChildren().add(specHierarchy11);

		SpecHierarchy specHierarchy111;
		specHierarchy111 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy111.setIdentifier("ID_TC1100_SpecHierarchy111");
		specHierarchy111.setLongName("TC1100 SpecHierarchy 111");
		specHierarchy111.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy111.setObject(specObject111);
		specHierarchy11.getChildren().add(specHierarchy111);

		SpecHierarchy specHierarchy12;
		specHierarchy12 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy12.setIdentifier("ID_TC1100_SpecHierarchy12");
		specHierarchy12.setLongName("TC1100 SpecHierarchy 12");
		specHierarchy12.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy12.setObject(specObject12);
		specHierarchy1.getChildren().add(specHierarchy12);

		SpecHierarchy specHierarchy2;
		specHierarchy2 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy2.setIdentifier("ID_TC1100_SpecHierarchy2");
		specHierarchy2.setLongName("TC1100 SpecHierarchy 12");
		specHierarchy2.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy2.setObject(specObject2);
		specification.getChildren().add(specHierarchy2);

	}

}
