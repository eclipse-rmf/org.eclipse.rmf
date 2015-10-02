package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.junit.Test;

public abstract class AbstractValueInRangeTest extends AbstractConstraintTest {

	@Test
	public void testValid() {
		AttributeValue attributeValue = createModel();
		ReqIF10Util.setTheValue(attributeValue, getValidValue());
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testInvalidValueToBig() {
		AttributeValue attributeValue = createModel();
		ReqIF10Util.setTheValue(attributeValue, getInvalidValueToBig());
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testInvalidValueToSmall() {
		AttributeValue attributeValue = createModel();
		ReqIF10Util.setTheValue(attributeValue, getInvalidValueToSmall());
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testValidMin() {
		AttributeValue attributeValue = createModel();
		ReqIF10Util.setTheValue(attributeValue, getMinValue());
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testValidMax() {
		AttributeValue attributeValue = createModel();
		ReqIF10Util.setTheValue(attributeValue, getMaxValue());
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	protected AttributeValue createModel() {
		return ReqIF10Util.createAttributeValue(createAttributeDefinition());
	}

	protected abstract AttributeDefinition createAttributeDefinition();

	protected abstract Object getValidValue();

	protected abstract Object getInvalidValueToBig();

	protected abstract Object getInvalidValueToSmall();

	protected abstract Object getMinValue();

	protected abstract Object getMaxValue();
}
