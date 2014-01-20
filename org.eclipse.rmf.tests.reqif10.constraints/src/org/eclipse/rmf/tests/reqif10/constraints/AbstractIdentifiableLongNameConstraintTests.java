package org.eclipse.rmf.tests.reqif10.constraints;

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.rmf.reqif10.Identifiable;
import org.junit.Test;

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
@SuppressWarnings("nls")
public abstract class AbstractIdentifiableLongNameConstraintTests extends AbstractConstraintTest {

	protected abstract Identifiable createIdentifiable();

	protected Identifiable createInvalidEmptyLongName() {
		Identifiable identifiable = createIdentifiable();
		identifiable.setLongName("");
		return identifiable;
	}

	protected Identifiable createInvalidUnsetLongName() {
		Identifiable identifiable = createIdentifiable();
		return identifiable;
	}

	protected Identifiable createInvalidNullLongName() {
		Identifiable identifiable = createIdentifiable();
		identifiable.setLongName(null);
		return identifiable;
	}

	protected Identifiable createValidModel() {
		Identifiable identifiable = createIdentifiable();
		identifiable.setLongName("Valid Long Name");
		return identifiable;
	}

	@Test
	public void testInvalidEmptyLongName() {
		IStatus status = validator.validate(createInvalidEmptyLongName());
		assertEquals(IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testInvalidUnsetLongName() {
		IStatus status = validator.validate(createInvalidUnsetLongName());
		assertEquals(IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testInvalidNullLongName() {
		IStatus status = validator.validate(createInvalidNullLongName());
		assertEquals(IStatus.ERROR, status.getSeverity());
	}

	@Test
	public void testValid() {
		IStatus status = validator.validate(createValidModel());
		assertEquals(IStatus.OK, status.getSeverity());
	}
}