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

import java.math.BigInteger;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;

public class DatatypeDefinitionIntegerMinMax extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof DatatypeDefinitionInteger) {
			DatatypeDefinitionInteger datatypeDefinition = (DatatypeDefinitionInteger) target;
			BigInteger min = datatypeDefinition.getMin();
			BigInteger max = datatypeDefinition.getMax();

			if (max.compareTo(min) < 0) {
				return ctx.createFailureStatus();
			}

		}

		return Status.OK_STATUS;

	}

}
