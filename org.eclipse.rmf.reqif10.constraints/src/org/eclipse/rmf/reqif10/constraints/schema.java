package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

/**
 * Dummy constraint that only exists to allow the user to disable the xml-schema validation through the EMFValidation Preferences
 *
 */
public class schema extends AbstractModelConstraint {

	public schema() {
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		return null;
	}

}
