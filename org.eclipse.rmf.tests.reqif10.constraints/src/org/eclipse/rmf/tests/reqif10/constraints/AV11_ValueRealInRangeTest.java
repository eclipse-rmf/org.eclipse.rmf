package org.eclipse.rmf.tests.reqif10.constraints;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.ReqIF10Factory;

public class AV11_ValueRealInRangeTest extends AbstractValueInRangeTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.AV1.1";
	}

	@Override
	protected AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionReal attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionReal();
		attributeDefinition.setType((DatatypeDefinitionReal) createDatatypeDefinition());
		return attributeDefinition;
	}

	protected DatatypeDefinition createDatatypeDefinition() {
		DatatypeDefinitionReal datatypeDefinition = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionReal();
		datatypeDefinition.setMin((Double) getMinValue());
		datatypeDefinition.setMax((Double) getMaxValue());
		return datatypeDefinition;
	}

	@Override
	protected Object getMinValue() {
		return 1.0d;
	}

	@Override
	protected Object getMaxValue() {
		return 5.0d;
	}

	@Override
	protected Object getValidValue() {
		return 2.0d;
	}

	@Override
	protected Object getInvalidValueToBig() {
		return 5.1d;
	}

	@Override
	protected Object getInvalidValueToSmall() {
		return 0.5d;
	}

}
