package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.junit.BeforeClass;
import org.junit.Test;

public class AV14_EnumValueTest extends AbstractConstraintTest {

	private static EnumValue enumValue1;
	private static EnumValue enumValue2;

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.AV1.4";
	}

	@BeforeClass
	public static void setupOnce() throws Exception {
		enumValue1 = ReqIF10Factory.eINSTANCE.createEnumValue();
		enumValue2 = ReqIF10Factory.eINSTANCE.createEnumValue();
	}

	@Test
	public void testValid() {
		AttributeValueEnumeration attributeValue = createModel();
		attributeValue.getValues().add(enumValue1);
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testInvalidValueToManyValues() {
		AttributeValueEnumeration attributeValue = createModel();
		attributeValue.getValues().add(enumValue1);
		attributeValue.getValues().add(enumValue2);
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.ERROR, status.getSeverity());
	}

	protected AttributeValueEnumeration createModel() {
		return (AttributeValueEnumeration) ReqIF10Util.createAttributeValue(createAttributeDefinition());
	}

	protected AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionEnumeration attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
		attributeDefinition.setType(createDatatypeDefinition());
		attributeDefinition.setMultiValued(false);
		return attributeDefinition;
	}

	protected DatatypeDefinitionEnumeration createDatatypeDefinition() {
		DatatypeDefinitionEnumeration datatypeDefinition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionEnumeration();
		datatypeDefinition.getSpecifiedValues().add(enumValue1);
		datatypeDefinition.getSpecifiedValues().add(enumValue2);
		return datatypeDefinition;
	}

}
