/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import static org.junit.Assert.fail;

import java.net.URISyntaxException;

import org.eclipse.rmf.pror.reqif10.configuration.ConfigurationFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.testframework.AbstractItemProviderTest;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.Specification;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests {@link ProrAgileGridContentProvider}
 * @author jastram
 */
public class TestProrAgileGridContentProvider extends AbstractItemProviderTest {

	protected ProrAgileGridContentProvider contentProvider;
	protected Specification specification;
	protected ProrSpecViewConfiguration specViewConfig;
	protected ReqIF reqif;

	@Before
	public void setup() throws URISyntaxException {
		reqif = this.getTestReqif("simple.reqif");
		specification = reqif.getCoreContent().getSpecifications().get(0);
		specViewConfig = ConfigurationUtil.getSpecViewConfiguration(specification, editingDomain);
		contentProvider = new ProrAgileGridContentProvider(specification, specViewConfig);
	}

	@Test
	public void testInitialRowCount() {
		Assert.assertEquals(1, contentProvider.getRowCount());
	}

}
