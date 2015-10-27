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
import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class AttributeValueEnumObeysMultiValued extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueEnumeration) {
			AttributeValueEnumeration av = (AttributeValueEnumeration) target;

			if (av.getValues().size() <= 1) {
				return Status.OK_STATUS;
			}

			AttributeDefinitionEnumeration attributeDefinition = (AttributeDefinitionEnumeration) ReqIF10Util.getAttributeDefinition(av);
			if (!attributeDefinition.isMultiValued()) {
				return ctx.createFailureStatus(av.getValues().size());
			}

		}

		return Status.OK_STATUS;

	}

}
