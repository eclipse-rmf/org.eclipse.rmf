package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeDefinition;

public class AttributeNamePrefix extends AbstractModelConstraint {

	public AttributeNamePrefix() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof AttributeDefinition) {
			AttributeDefinition attributeDefinition = (AttributeDefinition) target;

			String longName = attributeDefinition.getLongName();
			if (longName.startsWith("ReqIF.")) {
				return ctx.createFailureStatus(longName);
			}
		}

		return Status.OK_STATUS;
	}

}
