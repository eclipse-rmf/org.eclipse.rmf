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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridContentProvider;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrRow.ProrRowSpecHierarchy;
import org.junit.Test;

/**
 * Tests {@link ProrAgileGridContentProvider}
 * 
 * 
 * @author salem
 * 
 */
public class ContentProviderBasicTests extends AbstractContentProviderTests {


	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetProrNonExistingRow() {
		contentProvider.getProrRow(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetContentNonExistingRow() {
		contentProvider.getContentAt(2, 0);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetContentNonExistingColumn() {
		contentProvider.getContentAt(0, 2);
	}

	@Test
	public void testGetContentOfEmptyColumn() {
		addColumn("NonExistingAttribute");
		assertNull(contentProvider.getContentAt(0, 0));

	}

	/**
	 * Tests for getProrRow()
	 */
	@Test
	public void testGetProrRow0() {
		SpecHierarchy[] sh = createSpecHierarchies();
		assertEquals(sh[0],
				((ProrRowSpecHierarchy) contentProvider.getProrRow(0))
						.getSpecHierarchy());
	}

	@Test
	public void testGetProrRow1() {
		SpecHierarchy[] sh = createSpecHierarchies();
		assertEquals(specification.getChildren().get(1), sh[1]);
		ProrRowSpecHierarchy prorRowSpecHierarchy = (ProrRowSpecHierarchy) contentProvider
				.getProrRow(1);
		assertEquals(sh[1], prorRowSpecHierarchy.getSpecHierarchy());

	}

	@Test
	public void testGetProrRow2() {
		SpecHierarchy[] sh = createSpecHierarchies();
		assertEquals(sh[2],
				((ProrRowSpecHierarchy) contentProvider.getProrRow(2))
						.getSpecHierarchy());
	}

	@Test
	public void testGetProrRow3() {
		SpecHierarchy[] sh = createSpecHierarchies();
		assertEquals(sh[3],
				((ProrRowSpecHierarchy) contentProvider.getProrRow(3))
						.getSpecHierarchy());
	}

	@Test
	public void testGetProrRow4() {
		SpecHierarchy[] sh = createSpecHierarchies();
		assertEquals(sh[4],
				((ProrRowSpecHierarchy) contentProvider.getProrRow(4))
						.getSpecHierarchy());
	}

	@Test
	public void testGetProrRowSpecRelationRow0() {
		SpecRelation[] sr = createSpecRelations();

		assertEquals(sr[0], (contentProvider.getProrRow(1)).getSpecElement());
	}

	@Test
	public void testGetProrRowSpecRelationRow1() {
		SpecRelation[] sr = createSpecRelations();

		assertEquals(sr[1], contentProvider.getProrRow(3).getSpecElement());
	}

	@Test
	public void testGetProrRowSpecRelationRow2() {
		SpecRelation[] sr = createSpecRelations();

		assertEquals(sr[2], contentProvider.getProrRow(4).getSpecElement());
	}

	/**
	 * 
	 * The link column is always the last column
	 * 
	 * */
	@Test
	public void testGetContentOfLinkColumnSpecObject() {
		addColumn("First Column");
		addColumn("Second Column");
		addColumn("Third Column");

		assertEquals(specObject, contentProvider.getContentAt(0, 3));
	}

	/**
	 * The link column is always the last column
	 * */

	@Test
	public void testGetContentOfLinkColumnEmptySpecHierarchy() {
		addColumn("First Column");
		addColumn("Second Column");
		addColumn("Third Column");

		createSpecHierarchies();

		assertNull(contentProvider.getContentAt(3, 3));
		assertNull(contentProvider.getContentAt(4, 3));
	}

	/**
	 * The link column is always the last column
	 * */

	@Test
	public void testGetContentOfLinkColumnSpecRelation() {
		addColumn("First Column");
		addColumn("Second Column");
		addColumn("Third Column");

		SpecRelation[] sr = createSpecRelations();

		assertEquals(sr[0], contentProvider.getContentAt(1, 3));
		assertEquals(sr[1], contentProvider.getContentAt(3, 3));
		assertEquals(sr[2], contentProvider.getContentAt(4, 3));
	}

	@Test
	public void testInitialCellValueWithColumn() {
		addColumn("Description");
		assertEquals(1, specViewConfig.getColumns().size());
		assertTrue(contentProvider.getContentAt(0, 0) instanceof AttributeValueString);
	}

	/**
	 * Adds another label config element to the column configurations
	 */
	private void addColumn(String label) {
		Column column = ConfigurationFactory.eINSTANCE.createColumn();
		column.setLabel(label);
		column.setWidth(100);
		setViaCommand(
				specViewConfig,
				ConfigurationPackage.Literals.PROR_SPEC_VIEW_CONFIGURATION__COLUMNS,
				column);
	}

	/**
	 * Creates the following test structure:
	 * 
	 * <pre>
	 *          +-------------+
	 *          |specification|
	 *          +--+----------+
	 *             |
	 *             |  +------------+   +---------+
	 *             +--+  specH 0   +---+SpecObj 0|
	 *             |  +------------+   +---------+
	 *             |
	 *             |  +------------+   +---------+
	 *             +--+  specH 1   +---+SpecObj 1|
	 *             |  +------------+   +---------+
	 *             |
	 *             |  +------------+   +---------+
	 *             +--+  specH 2   +---+SpecObj 1|
	 *             |  +-+----------+   +---------+
	 *             |    |
	 *             |    | +------------+
	 *             |    +-+  specH 3   |
	 *             |      +------------+
	 *             |
	 *             |   +------------+
	 *             +---+  specH 4   |
	 *                 +------------+
	 * 
	 * 
	 * </pre>
	 * 
	 * @param sh
	 */

	private SpecHierarchy[] createSpecHierarchies() {
		SpecHierarchy[] sh = new SpecHierarchy[5];

		sh[0] = specHierarchy;
		sh[1] = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		sh[2] = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		sh[3] = ReqIF10Factory.eINSTANCE.createSpecHierarchy();

		sh[4] = ReqIF10Factory.eINSTANCE.createSpecHierarchy();

		sh[0].setDesc("specH 0");
		sh[1].setDesc("specH 1");
		sh[2].setDesc("specH 2");
		sh[3].setDesc("specH 3");
		sh[4].setDesc("specH 4");

		SpecObject specObj = ReqIF10Factory.eINSTANCE.createSpecObject();

		specObject.setDesc("specObj 0");
		specObj.setDesc("specObj 1");

		sh[1].setObject(specObj);
		sh[2].setObject(specObj);

		reqif.getCoreContent().getSpecObjects().add(specObj);

		specification.getChildren().add(sh[1]);
		specification.getChildren().add(sh[2]);

		specification.getChildren().get(2).getChildren().add(sh[3]);
		specification.getChildren().add(sh[4]);

		return sh;
	}

	private SpecRelation[] createSpecRelations() {
		SpecRelation[] sr = new SpecRelation[3];

		sr[0] = ReqIF10Factory.eINSTANCE.createSpecRelation();
		sr[1] = ReqIF10Factory.eINSTANCE.createSpecRelation();
		sr[2] = ReqIF10Factory.eINSTANCE.createSpecRelation();

		sr[0].setDesc("SpecRel 0");
		sr[1].setDesc("SpecRel 1");
		sr[2].setDesc("SpecRel 2");
		
		SpecHierarchy[] sh = createSpecHierarchies();

		sr[0].setSource(sh[0].getObject());
		sr[0].setTarget(sh[0].getObject());
		sr[1].setSource(sh[1].getObject());
		sr[2].setSource(sh[2].getObject());

		reqif.getCoreContent().getSpecRelations().add(sr[0]);
		reqif.getCoreContent().getSpecRelations().add(sr[1]);
		reqif.getCoreContent().getSpecRelations().add(sr[2]);

		contentProvider.setShowSpecRelations(true);
		assertTrue(contentProvider.getShowSpecRelations());
		return sr;
	}

}
