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
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 *
 */
public class AttributeDefinitionDatatypeDefinitionExistenceConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof AttributeDefinition) {
			AttributeDefinition attributeDefinition = (AttributeDefinition) target;
			DatatypeDefinition datatypeDefinition = ReqIF10Util.getDatatypeDefinition(attributeDefinition);
			if (datatypeDefinition == null) {
				return ctx.createFailureStatus();
			} else {
				return Status.OK_STATUS;
			}
		} else {
			return Status.OK_STATUS;
		}
	}
}