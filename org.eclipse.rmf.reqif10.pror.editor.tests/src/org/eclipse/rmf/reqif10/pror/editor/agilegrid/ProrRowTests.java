/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Said Salem - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import static org.junit.Assert.assertSame;

import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrRow;
import org.junit.Test;

/**
 * Tests {@link ProrRow}
 * 
 * @author salem
 */
public class ProrRowTests extends AbstractContentProviderTests {

	@Test
	public void testCreateProrRowSpecHierarchy() {
		ProrRow prorRow = ProrRow.createProrRow(specHierarchy, 0, 0);

		assertSame(specHierarchy,
				((ProrRow.ProrRowSpecHierarchy) prorRow).getSpecHierarchy());

	}

	@Test
	public void testProrRowObject() {
		ProrRow prorRow = ProrRow.createProrRow(specHierarchy, 0, 0);
		assertSame(specObject,
				((ProrRow.ProrRowSpecHierarchy) prorRow).getSpecElement());
	}

	@Test
	public void testCreateProrRowSpecRelation() {
		SpecRelation specRelation = reqif.getCoreContent().getSpecRelations().get(0);
		ProrRow prorRow = ProrRow.createProrRow(specRelation, 0, 0);

		assertSame(specRelation, prorRow.getSpecElement());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCreateProrRowIllegalArgument() {
		ProrRow.createProrRow(new String("ProrRowIllegalArgument"), 0, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testCreateProrRowNull() {
		ProrRow.createProrRow(null, 0, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testParameterValues() {
		int negativValue = -1;
		ProrRow.createProrRow(null, negativValue, negativValue);
	}

}
