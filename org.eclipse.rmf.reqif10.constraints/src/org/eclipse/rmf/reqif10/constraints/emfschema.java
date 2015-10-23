package org.eclipse.rmf.reqif10.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;

/**
 * Dummy constraint that only exists to allow the user to disable the emf-schema validation through the EMFValidation Preferences
 *
 */
public class emfschema extends AbstractModelConstraint {

	public emfschema() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IStatus validate(IValidationContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
