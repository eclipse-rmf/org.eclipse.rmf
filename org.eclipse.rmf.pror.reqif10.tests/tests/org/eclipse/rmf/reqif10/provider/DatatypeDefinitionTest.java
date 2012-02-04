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
package org.eclipse.rmf.reqif10.provider;

import static org.junit.Assert.*;

import java.net.URISyntaxException;

import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.rmf.pror.reqif10.provider.VirtualDatatypeDefinitionItemProvider;
import org.eclipse.rmf.pror.reqif10.util.ProrUtil;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.junit.Test;

/**
 * A test case for the model object '<em><b>Datatype Definition</b></em>'.
 */
public abstract class DatatypeDefinitionTest extends IdentifiableTest {

	/**
	 * Returns the fixture for this Datatype Definition test case.
	 */
	@Override
	protected DatatypeDefinition getFixture() {
		return (DatatypeDefinition)fixture;
	}
	
	@Test
	public void testParentIsVirtual() throws URISyntaxException {
		ReqIf reqif = getTestReqif("simple.reqif");
		// Required for generating the Virtual Element lazily.
		getItemProvider(reqif.getCoreContent()).getChildren(reqif.getCoreContent());
		
		setViaCommand(reqif.getCoreContent(), Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES, getFixture());
		ItemProviderAdapter ip = ProrUtil.getItemProvider(adapterFactory, getFixture());
		assertTrue(ip.getParent(getFixture()) instanceof VirtualDatatypeDefinitionItemProvider);
	}


} //DatatypeDefinitionTest
