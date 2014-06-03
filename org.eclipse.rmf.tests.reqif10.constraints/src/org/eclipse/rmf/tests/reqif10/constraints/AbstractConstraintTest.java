/**
 * Copyright (c) 2014 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.reqif10.constraints;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.validation.model.EvaluationMode;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.emf.validation.service.IConstraintFilter;
import org.eclipse.emf.validation.service.IValidator;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class AbstractConstraintTest {

	static IValidator<EObject> validator = null;
	static IConstraintFilter filter = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		validator = ModelValidationService.getInstance().newValidator(EvaluationMode.BATCH);
		validator.setReportSuccesses(true);
	}

	@Before
	public void setUp() throws Exception {
		if (null == filter) {
			filter = new IConstraintFilter() {
				public boolean accept(IConstraintDescriptor constraint, EObject target) {
					return constraint.getId().equals(getConstraintID());
				}
			};

			validator.addConstraintFilter(filter);
		}
	}

	protected abstract String getConstraintID();

}