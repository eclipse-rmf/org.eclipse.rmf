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
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.AttributeDefinitionDate;
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionReal;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeDefinitionXHTML;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 *
 */
public class AttributeDefinitionDatatypeDefinitionTypeConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof AttributeDefinition) {
			AttributeDefinition attributeDefinition = (AttributeDefinition) target;
			DatatypeDefinition datatypeDefinition = ReqIF10Util.getDatatypeDefinition(attributeDefinition);

			if (datatypeDefinition == null) {
				// DatatypeDefinition not set is covered by another constraint
				return Status.OK_STATUS;
			}

			if (attributeDefinition instanceof AttributeDefinitionBoolean && !(datatypeDefinition instanceof DatatypeDefinitionBoolean)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionDate && !(datatypeDefinition instanceof DatatypeDefinitionDate)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionEnumeration && !(datatypeDefinition instanceof DatatypeDefinitionEnumeration)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionInteger && !(datatypeDefinition instanceof DatatypeDefinitionInteger)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionReal && !(datatypeDefinition instanceof DatatypeDefinitionReal)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionString && !(datatypeDefinition instanceof DatatypeDefinitionString)) {
				return ctx.createFailureStatus();
			}

			if (attributeDefinition instanceof AttributeDefinitionXHTML && !(datatypeDefinition instanceof DatatypeDefinitionXHTML)) {
				return ctx.createFailureStatus();
			}

			return Status.OK_STATUS;
		} else {
			return Status.OK_STATUS;
		}
	}
}