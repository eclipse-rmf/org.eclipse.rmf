/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt (Formal Mind GmbH)
 *******************************************************************************/
package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeDefinition;

public class AttributeNamePrefix extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
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
