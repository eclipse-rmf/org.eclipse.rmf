/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.tests.reqif10.excel.serialization;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.reqif10.excel.serialization.ExcelResourceImpl;
import org.junit.Test;

public class ExcelResourceImplLoadTests {

	@Test
	public void testLoad() throws IOException {
		URI emfURI = URI.createURI("resources/inputs/empty.xls");
		Resource excelResource = new ExcelResourceImpl(emfURI);
		excelResource.load(null);
	}

}
