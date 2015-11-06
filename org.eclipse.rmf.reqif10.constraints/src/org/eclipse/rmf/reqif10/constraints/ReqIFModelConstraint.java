package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.ConstraintStatus;
import org.osgi.framework.Bundle;

public abstract class ReqIFModelConstraint extends AbstractModelConstraint {

	private final static String bundleId = "org.eclipse.rmf.reqif10.constraints"; //$NON-NLS-1$
	private final static String constraintPrefix = "org.eclipse.rmf.reqif10.constraints."; //$NON-NLS-1$

	@Override
	public IStatus validate(IValidationContext ctx) {
		try {
			return doValidate(ctx);
		} catch (Throwable ex) {
			Bundle bundle = Platform.getBundle(bundleId);
			ILog log = Platform.getLog(bundle);
			log.log(new Status(IStatus.ERROR, bundleId, "Exception while running Validator", ex)); //$NON-NLS-1$

			String constraintId = ctx.getCurrentConstraintId();
			constraintId = constraintId.replace(constraintPrefix, "");

			return ConstraintStatus.createStatus(ctx, null, IStatus.ERROR, Integer.MAX_VALUE, "Constraint " + constraintId
					+ " was not evaluated: An Exception occured while validating {0}: {1}", ctx.getTarget(), ex.toString());
		}
	}

	protected abstract IStatus doValidate(IValidationContext ctx);

}
