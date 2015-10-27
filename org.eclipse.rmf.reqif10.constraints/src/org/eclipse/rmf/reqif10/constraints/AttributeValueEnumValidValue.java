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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class AttributeValueEnumValidValue extends ReqIFModelConstraint {

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();
		if (target == null) {
			return Status.OK_STATUS;
		}

		if (target instanceof AttributeValueEnumeration) {
			AttributeValueEnumeration av = (AttributeValueEnumeration) target;

			DatatypeDefinitionEnumeration datatypeDefinition = (DatatypeDefinitionEnumeration) ReqIF10Util.getDatatypeDefinition(av);

			EList<EnumValue> specifiedValues = datatypeDefinition.getSpecifiedValues();
			EList<EnumValue> values = av.getValues();

			for (EnumValue value : values) {
				if (!containsId(value.getIdentifier(), specifiedValues)) {
					return ctx.createFailureStatus();
				}
			}

		}

		return Status.OK_STATUS;

	}

	private boolean containsId(String id, EList<? extends Identifiable> haystack) {
		for (Identifiable identifiable : haystack) {
			if (identifiable.getIdentifier().equals(id)) {
				return true;
			}
		}
		return false;
	}
}
