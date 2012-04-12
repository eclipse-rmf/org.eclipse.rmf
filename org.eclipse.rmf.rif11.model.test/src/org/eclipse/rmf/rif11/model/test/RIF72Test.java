/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.rif11.model.test;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.Test;

public class RIF72Test extends Rif11ResourceTestBase{

	@Test
	public void testSpecObject() {

		String filename1 = "testdata/his/rif72.rif";
		String filename2 = "testdata/output/rif72.rif";
		Resource rifResource = loadRif(filename1);
		saveRif(rifResource, filename2);
		compareModels(filename1, filename2);

	}

}
