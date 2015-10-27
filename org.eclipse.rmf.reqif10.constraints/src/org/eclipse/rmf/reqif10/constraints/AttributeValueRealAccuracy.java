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

public class AttributeValueRealAccuracy extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		// if (target instanceof AttributeValueReal) {
		// AttributeValueReal avReal = (AttributeValueReal) target;
		// avReal.getTheValue();
		// double theValue = avReal.getTheValue();
		//
		// DatatypeDefinitionReal datatypeDefinition = (DatatypeDefinitionReal)
		// ReqIF10Util.getDatatypeDefinition(avReal);
		// BigInteger accuracy = datatypeDefinition.getAccuracy();
		//
		// String string = Double.toString(theValue);
		// String[] split = string.split("\\.");
		// String frac = split[1];
		//
		// if (accuracy.compareTo(BigInteger.valueOf(frac.length())) < 0) {
		// return ctx.createFailureStatus(string, frac.length(), accuracy);
		// }
		// }

		return Status.OK_STATUS;

	}

}
