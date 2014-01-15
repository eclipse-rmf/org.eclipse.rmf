package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.rmf.reqif10.Identifiable;

public class IdentifiableLongNameExistenceConstraint extends AbstractModelConstraint {

	@Override
	public IStatus validate(IValidationContext ctx) {
		Object target = ctx.getTarget();

		if (target != null && target instanceof Identifiable) {
			Identifiable identifiable = (Identifiable) target;
			String longName = identifiable.getLongName();
			if (!identifiable.isSetLongName() || null == longName || "".equals(longName)) { //$NON-NLS-1$
				return ctx.createFailureStatus();
			} else {
				return Status.OK_STATUS;
			}
		} else {
			return Status.OK_STATUS;
		}
	}
}