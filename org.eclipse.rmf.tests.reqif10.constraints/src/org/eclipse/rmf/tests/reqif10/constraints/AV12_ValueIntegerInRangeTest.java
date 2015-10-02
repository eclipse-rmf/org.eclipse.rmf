package org.eclipse.rmf.tests.reqif10.constraints;

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.ReqIF10Factory;

public class AV12_ValueIntegerInRangeTest extends AbstractValueInRangeTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.AV1.2";
	}

	@Override
	protected AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionInteger attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionInteger();
		attributeDefinition.setType((DatatypeDefinitionInteger) createDatatypeDefinition());
		return attributeDefinition;
	}

	protected DatatypeDefinition createDatatypeDefinition() {
		DatatypeDefinitionInteger datatypeDefinition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionInteger();
		datatypeDefinition.setMin((BigInteger) getMinValue());
		datatypeDefinition.setMax((BigInteger) getMaxValue());
		return datatypeDefinition;
	}

	@Override
	protected Object getMinValue() {
		return BigInteger.valueOf(1);
	}

	@Override
	protected Object getMaxValue() {
		return BigInteger.valueOf(5);
	}

	@Override
	protected Object getValidValue() {
		return BigInteger.valueOf(2);
	}

	@Override
	protected Object getInvalidValueToBig() {
		return BigInteger.valueOf(6);
	}

	@Override
	protected Object getInvalidValueToSmall() {
		return BigInteger.valueOf(0);
	}

}
