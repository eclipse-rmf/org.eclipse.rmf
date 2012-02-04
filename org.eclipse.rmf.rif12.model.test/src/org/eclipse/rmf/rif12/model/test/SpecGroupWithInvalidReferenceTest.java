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
package org.eclipse.rmf.rif12.model.test;

import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.junit.Test;

public class SpecGroupWithInvalidReferenceTest extends Rif12ResourceTestBase {

	@Test(expected = IllegalValueException.class)
	public void testSpecObject() throws Throwable {

		try {

			String filename = "testdata/reqif-server/specGroupWithInvalidReference.rif";
			loadRif(filename);

		} catch (WrappedException e) {
			throw e.getCause();
		}

	}

}
