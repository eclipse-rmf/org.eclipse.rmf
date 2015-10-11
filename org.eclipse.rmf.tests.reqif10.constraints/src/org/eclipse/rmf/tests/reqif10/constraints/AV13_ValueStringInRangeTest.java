package org.eclipse.rmf.tests.reqif10.constraints;

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;

public class AV13_ValueStringInRangeTest extends AbstractValueInRangeTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.AV1.3";
	}

	@Override
	protected AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionString attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setType((DatatypeDefinitionString) createDatatypeDefinition());
		return attributeDefinition;
	}

	protected DatatypeDefinition createDatatypeDefinition() {
		DatatypeDefinitionString datatypeDefinition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinition.setMaxLength(BigInteger.valueOf(2));
		return datatypeDefinition;
	}

	@Override
	protected Object getMinValue() {
		return "12";
	}

	@Override
	protected Object getMaxValue() {
		return "12";
	}

	@Override
	protected Object getValidValue() {
		return "a";
	}

	@Override
	protected Object getInvalidValueToBig() {
		return "123";
	}

	@Override
	protected Object getInvalidValueToSmall() {
		return BigInteger.valueOf(5);
	}

	@Override
	public void testInvalidValueToSmall() {
	}

}
