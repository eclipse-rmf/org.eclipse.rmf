package org.eclipse.rmf.reqif10.constraints;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

public class ConflictingIsEditableForAttributeDefinitionEnumeration extends AbstractModelConstraint {

	public ConflictingIsEditableForAttributeDefinitionEnumeration() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof DatatypeDefinitionEnumeration) {
			DatatypeDefinitionEnumeration datatypeDefinition = (DatatypeDefinitionEnumeration) target;

			ReqIF reqIF = ReqIF10Util.getReqIF(datatypeDefinition);

			EList<SpecType> specTypes = reqIF.getCoreContent().getSpecTypes();

			List<AttributeDefinition> definitions = new LinkedList<AttributeDefinition>();
			for (SpecType specType : specTypes) {
				EList<AttributeDefinition> specAttributes = specType.getSpecAttributes();
				for (AttributeDefinition attributeDefinition : specAttributes) {
					if (datatypeDefinition.equals(ReqIF10Util.getDatatypeDefinition(attributeDefinition))) {
						definitions.add(attributeDefinition);
					}
				}
			}

			boolean foundEditable = false;
			boolean foundNotEditable = false;
			for (AttributeDefinition attributeDefinition : definitions) {
				if (attributeDefinition.isEditable()) {
					foundEditable = true;
				} else {
					foundNotEditable = true;
				}

			}

			if (foundEditable && foundNotEditable) {
				return ctx.createFailureStatus(datatypeDefinition.getLongName());
			}
		}

		return Status.OK_STATUS;
	}

}
