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

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class AttributeNamePrefix extends ReqIFModelConstraint {

	private static final String SPEC_OBJECT = "SPEC_OBJECT"; //$NON-NLS-1$
	private static final String SPECIFICATION = "SPECIFICATION"; //$NON-NLS-1$
	private static final String SPEC_RELATION = "SPEC_RELATION"; //$NON-NLS-1$
	private static HashMap<String, Collection<String>> systemAttributes = null;

	@Override
	public IStatus doValidate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof AttributeDefinition) {
			AttributeDefinition attributeDefinition = (AttributeDefinition) target;

			SpecType specType = ReqIF10Util.getSpecType(attributeDefinition);

			String longName = attributeDefinition.getLongName();
			if (longName.startsWith("ReqIF.")) { //$NON-NLS-1$
				String type = null;
				if (specType instanceof SpecObjectType) {
					type = SPEC_OBJECT;
				} else if (specType instanceof SpecificationType) {
					type = SPECIFICATION;
				} else if (specType instanceof SpecRelationType) {
					type = SPEC_RELATION;
				}

				if (type != null) {
					if (getSystemAttributes().get(type).contains(longName)) {
						return Status.OK_STATUS;
					}
				}

				return ctx.createFailureStatus(longName);
			}
		}

		return Status.OK_STATUS;
	}

	static HashMap<String, Collection<String>> getSystemAttributes() {
		if (systemAttributes == null) {
			systemAttributes = new HashMap<String, Collection<String>>();

			HashSet<String> specObjectSystemAttributes = new HashSet<String>();
			specObjectSystemAttributes.add("ReqIF.ForeignID"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ForeignCreatedBy"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ForeignCreatedOn"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ForeignCreatedThru"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ForeignModifiedBy"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ChapterName"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ChapterNumber"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.Name"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.Text"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.AssociatedFiles"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.Category"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.Revision"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.ChangeDescription"); //$NON-NLS-1$
			specObjectSystemAttributes.add("ReqIF.FitCriteria"); //$NON-NLS-1$

			HashSet<String> specificationSystemAttributes = new HashSet<String>();
			specificationSystemAttributes.add("ReqIF.Name"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.Prefix"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ForeignCreatedBy"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ForeignCreatedOn"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ForeignModifiedBy"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ForeignState"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.Project"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ForeignID"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.Description"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.Revision"); //$NON-NLS-1$
			specificationSystemAttributes.add("ReqIF.ChangeDescription"); //$NON-NLS-1$

			HashSet<String> specRelationSystemAttributes = new HashSet<String>();
			specRelationSystemAttributes.add("ReqIF.Name"); //$NON-NLS-1$
			specRelationSystemAttributes.add("ReqIF.ForeignCreatedBy"); //$NON-NLS-1$
			specRelationSystemAttributes.add("ReqIF.ForeignCreatedOn"); //$NON-NLS-1$
			specRelationSystemAttributes.add("ReqIF.ForeignModifiedBy"); //$NON-NLS-1$
			specRelationSystemAttributes.add("ReqIF.ForeignID"); //$NON-NLS-1$
			specRelationSystemAttributes.add("ReqIF.Description"); //$NON-NLS-1$

			systemAttributes.put(SPEC_OBJECT, specObjectSystemAttributes);
			systemAttributes.put(SPECIFICATION, specificationSystemAttributes);
			systemAttributes.put(SPEC_RELATION, specRelationSystemAttributes);
		}
		return systemAttributes;
	}

}
