package org.eclipse.rmf.reqif10.tests.uc001.tc1400;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.tests.util.CommonSystemAttributes;
import org.eclipse.rmf.reqif10.tests.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC1400InternalTableModelBuilder extends SimpleModelBuilder implements CommonSystemAttributes {
	final static String LAST_CHANGE_STRING = "2012-04-07T01:51:37.112+02:00";
	final static String TEST_CASE_ID = "TC1400";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;
	protected DatatypeDefinitionInteger datatypeDefinitionInteger;

	// SpecObjectTypes
	SpecObjectType specObjectTypeRegular;
	AttributeDefinitionString specObjectTypeRegularAttributeDefinitionStringName;

	SpecObjectType specObjectTypeInternalTable;
	AttributeDefinitionString specObjectTypeInternalTableAttributeDefinitionStringName;
	AttributeDefinitionInteger specObjectTypeInternalTableAttributeDefinitionIntegerRevivision;
	AttributeDefinitionString specObjectTypeInternalTableAttributeDefinitionStringChangeDescription;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject11;
	SpecObject specObject111;
	SpecObject specObject112;
	SpecObject specObject113;

	public TC1400InternalTableModelBuilder() throws Exception {
		super("ID_TC1400_ReqIfHeader", "TC 1400 'Internal Table'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC1400_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC1400 DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));

		datatypeDefinitionInteger = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinitionInteger.setIdentifier("ID_TC1400_DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLongName("TC1400 DatatypeDefinitionInteger");
		datatypeDefinitionInteger.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionInteger.setMax(new BigInteger("1000000"));
		datatypeDefinitionInteger.setMin(new BigInteger("0"));

		EList<DatatypeDefinition> datatypes = getReqIF().getCoreContent().getDatatypes();
		datatypes.add(datatypeDefinitionString);
		datatypes.add(datatypeDefinitionInteger);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		// specObjectTypeRegular
		specObjectTypeRegular = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectTypeRegular.setIdentifier("ID_TC1400_SpecObjectTypeRegular");
		specObjectTypeRegular.setLongName("TC1400 SpecObjectType Regular");
		specObjectTypeRegular.setLastChange(toDate(LAST_CHANGE_STRING));

		specObjectTypeRegularAttributeDefinitionStringName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeRegularAttributeDefinitionStringName.setIdentifier("ID_TC1400_SpecObjectTypeRegularAttributeDefinitionString_" + REQIF_NAME);
		specObjectTypeRegularAttributeDefinitionStringName.setLongName(REQIF_NAME);
		specObjectTypeRegularAttributeDefinitionStringName.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeRegularAttributeDefinitionStringName.setType(datatypeDefinitionString);

		specObjectTypeRegular.getSpecAttributes().add(specObjectTypeRegularAttributeDefinitionStringName);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectTypeRegular);

		// specObjectTypeInternalTable
		specObjectTypeInternalTable = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectTypeInternalTable.setIdentifier("ID_TC1400_SpecObjectTypeInternalTable");
		specObjectTypeInternalTable.setLongName("TC1400 SpecObjectType Internal Table");
		specObjectTypeInternalTable.setLastChange(toDate(LAST_CHANGE_STRING));

		specObjectTypeInternalTableAttributeDefinitionStringName = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeInternalTableAttributeDefinitionStringName.setIdentifier("ID_TC1400_SpecObjectTypeInternalTableAttributeDefinitionString_"
				+ REQIF_NAME);
		specObjectTypeInternalTableAttributeDefinitionStringName.setLongName(REQIF_NAME);
		specObjectTypeInternalTableAttributeDefinitionStringName.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeInternalTableAttributeDefinitionStringName.setType(datatypeDefinitionString);

		specObjectTypeInternalTableAttributeDefinitionStringChangeDescription = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		specObjectTypeInternalTableAttributeDefinitionStringChangeDescription
				.setIdentifier("ID_TC1400_SpecObjectTypeInternalTableAttributeDefinitionString_" + REQIF_CHANGE_DESCRIPTION);
		specObjectTypeInternalTableAttributeDefinitionStringChangeDescription.setLongName(REQIF_CHANGE_DESCRIPTION);
		specObjectTypeInternalTableAttributeDefinitionStringChangeDescription.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeInternalTableAttributeDefinitionStringChangeDescription.setType(datatypeDefinitionString);

		specObjectTypeInternalTableAttributeDefinitionIntegerRevivision = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		specObjectTypeInternalTableAttributeDefinitionIntegerRevivision
				.setIdentifier("ID_TC1400_SpecObjectTypeInternalTableAttributeDefinitionInteger_" + REQIF_REVISION);
		specObjectTypeInternalTableAttributeDefinitionIntegerRevivision.setLongName(REQIF_REVISION);
		specObjectTypeInternalTableAttributeDefinitionIntegerRevivision.setLastChange(toDate(LAST_CHANGE_STRING));
		specObjectTypeInternalTableAttributeDefinitionIntegerRevivision.setType(datatypeDefinitionInteger);

		specObjectTypeInternalTable.getSpecAttributes().add(specObjectTypeInternalTableAttributeDefinitionStringName);
		specObjectTypeInternalTable.getSpecAttributes().add(specObjectTypeInternalTableAttributeDefinitionStringChangeDescription);
		specObjectTypeInternalTable.getSpecAttributes().add(specObjectTypeInternalTableAttributeDefinitionIntegerRevivision);

		getReqIF().getCoreContent().getSpecTypes().add(specObjectTypeInternalTable);

	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC1400_SpecificationType");
		specificationType.setLongName("TC1400 SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));

		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecObjects() throws Exception {
		AttributeValueString attributeValueString;
		AttributeValueInteger attributeValueInteger;

		// regular requirements
		// specObject1
		specObject1 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject1.setIdentifier("ID_TC1400_SpecObject1");
		specObject1.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject1.setType(specObjectTypeRegular);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeRegularAttributeDefinitionStringName);
		attributeValueString.setTheValue("Obj1");
		specObject1.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject1);

		// specObject11
		specObject11 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject11.setIdentifier("ID_TC1400_SpecObject11");
		specObject11.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject11.setType(specObjectTypeRegular);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeRegularAttributeDefinitionStringName);
		attributeValueString.setTheValue("Obj1.1");
		specObject11.getValues().add(attributeValueString);

		getReqIF().getCoreContent().getSpecObjects().add(specObject11);

		// internal table requirements
		// specObject111
		specObject111 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject111.setIdentifier("ID_TC1400_SpecObject111");
		specObject111.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject111.setType(specObjectTypeInternalTable);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringName);
		attributeValueString.setTheValue("TableObj1.1.1");
		specObject111.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringChangeDescription);
		attributeValueString.setTheValue("Changed name");
		specObject111.getValues().add(attributeValueString);

		attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(specObjectTypeInternalTableAttributeDefinitionIntegerRevivision);
		attributeValueInteger.setTheValue(new BigInteger("3"));
		specObject111.getValues().add(attributeValueInteger);

		getReqIF().getCoreContent().getSpecObjects().add(specObject111);

		// specObject112
		specObject112 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject112.setIdentifier("ID_TC1400_SpecObject112");
		specObject112.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject112.setType(specObjectTypeInternalTable);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringName);
		attributeValueString.setTheValue("TableObj1.1.2");
		specObject112.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringChangeDescription);
		attributeValueString.setTheValue("Changed name in order to comply to company naming conventions");
		specObject112.getValues().add(attributeValueString);

		attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(specObjectTypeInternalTableAttributeDefinitionIntegerRevivision);
		attributeValueInteger.setTheValue(new BigInteger("20"));
		specObject112.getValues().add(attributeValueInteger);

		getReqIF().getCoreContent().getSpecObjects().add(specObject112);

		// specObject113
		specObject113 = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject113.setIdentifier("ID_TC1400_SpecObject113");
		specObject113.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject113.setType(specObjectTypeInternalTable);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringName);
		attributeValueString.setTheValue("TableObj1.1.3");
		specObject113.getValues().add(attributeValueString);

		attributeValueString = ReqIF10Factory.eINSTANCE.createAttributeValueString();
		attributeValueString.setDefinition(specObjectTypeInternalTableAttributeDefinitionStringChangeDescription);
		attributeValueString.setTheValue("initial revision");
		specObject113.getValues().add(attributeValueString);

		attributeValueInteger = ReqIF10Factory.eINSTANCE.createAttributeValueInteger();
		attributeValueInteger.setDefinition(specObjectTypeInternalTableAttributeDefinitionIntegerRevivision);
		attributeValueInteger.setTheValue(new BigInteger("1"));
		specObject113.getValues().add(attributeValueInteger);

		getReqIF().getCoreContent().getSpecObjects().add(specObject113);

	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC1400_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));

		// set spec hierarchy
		SpecHierarchy specHierarchy1;
		specHierarchy1 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy1.setIdentifier("ID_TC1400_SpecHierarchy1");
		specHierarchy1.setLongName("TC1400 SpecHierarchy 1");
		specHierarchy1.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy1.setObject(specObject1);
		specification.getChildren().add(specHierarchy1);

		SpecHierarchy specHierarchy11;
		specHierarchy11 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy11.setIdentifier("ID_TC1400_SpecHierarchy11");
		specHierarchy11.setLongName("TC1400 SpecHierarchy 11");
		specHierarchy11.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy11.setObject(specObject11);
		specHierarchy11.setTableInternal(true);
		specHierarchy1.getChildren().add(specHierarchy11);

		SpecHierarchy specHierarchy111;
		specHierarchy111 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy111.setIdentifier("ID_TC1400_SpecHierarchy111");
		specHierarchy111.setLongName("TC1400 SpecHierarchy Internal Table 111");
		specHierarchy111.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy111.setObject(specObject111);
		specHierarchy111.setTableInternal(true);
		specHierarchy11.getChildren().add(specHierarchy111);

		SpecHierarchy specHierarchy112;
		specHierarchy112 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy112.setIdentifier("ID_TC1400_SpecHierarchy112");
		specHierarchy112.setLongName("TC1400 SpecHierarchy Internal Table 112");
		specHierarchy112.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy112.setObject(specObject112);
		specHierarchy112.setTableInternal(true);
		specHierarchy11.getChildren().add(specHierarchy112);

		SpecHierarchy specHierarchy113;
		specHierarchy113 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy113.setIdentifier("ID_TC1400_SpecHierarchy113");
		specHierarchy113.setLongName("TC1400 SpecHierarchy Internal Table 113");
		specHierarchy113.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy113.setObject(specObject113);
		specHierarchy113.setTableInternal(true);
		specHierarchy11.getChildren().add(specHierarchy113);

		getReqIF().getCoreContent().getSpecifications().add(specification);

	}

}
