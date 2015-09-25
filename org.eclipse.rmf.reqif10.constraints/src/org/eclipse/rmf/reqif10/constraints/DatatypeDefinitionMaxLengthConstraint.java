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
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;

/**
 * maxValue of DatatypeDefinitionReal or DatatypeDefinitionInteger is set.
 */
public class DatatypeDefinitionMaxLengthConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof DatatypeDefinitionString) {
			DatatypeDefinitionString datatypeDefinition = (DatatypeDefinitionString) target;
			if (!datatypeDefinition.isSetMaxLength()) {
				return ctx.createFailureStatus("DatatypeDefinitionString (" + datatypeDefinition.getIdentifier() + ")");
			} else {
				return Status.OK_STATUS;
			}
		} else {
			return Status.OK_STATUS;
		}
	}
}