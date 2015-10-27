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
import org.eclipse.rmf.reqif10.AttributeValueReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class AttributeValueRealInRange extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueReal) {
			AttributeValueReal avReal = (AttributeValueReal) target;
			avReal.getTheValue();

			DatatypeDefinitionReal datatypeDefinition = (DatatypeDefinitionReal) ReqIF10Util.getDatatypeDefinition(avReal);
			double min = datatypeDefinition.getMin();
			double max = datatypeDefinition.getMax();
			double theValue = avReal.getTheValue();

			if (theValue < min) {
				return ctx.createFailureStatus("smaller", "minValue");
			}
			if (theValue > max) {
				return ctx.createFailureStatus("greater", "maxValue");
			}
		}

		return Status.OK_STATUS;

	}

}
