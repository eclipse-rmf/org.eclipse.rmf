package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.junit.Test;

/**
 * Copyright (c) 2015 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt
 *
 */
@SuppressWarnings("nls")
public abstract class AbstractAttributeDefinitionDatatypeDefinitionExistenceConstraintTests extends AbstractConstraintTest {

	protected abstract AttributeDefinition createAttributeDefinition();

	protected abstract AttributeDefinition createValidModel();

	protected AttributeDefinition createInvalidUnsetDatatypeDefinition() {
		AttributeDefinition attributeDefinition = createAttributeDefinition();
		return attributeDefinition;
	}

	@Test
	public void testInvalidUnsetDatatypeDefinition() {
		IStatus status = validator.validate(createInvalidUnsetDatatypeDefinition());
		assertEquals(IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testValid() {
		IStatus status = validator.validate(createValidModel());
		assertEquals(IStatus.OK, status.getSeverity());
	}

}