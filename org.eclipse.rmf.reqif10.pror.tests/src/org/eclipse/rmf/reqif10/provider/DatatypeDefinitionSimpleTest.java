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

import org.eclipse.rmf.reqif10.DatatypeDefinitionSimple;

/**
 * A test case for the model object '<em><b>Datatype Definition Simple</b></em>'.
 */
public abstract class DatatypeDefinitionSimpleTest extends DatatypeDefinitionTest {

	/**
	 * Returns the fixture for this Datatype Definition Simple test case.
	 */
	@Override
	protected DatatypeDefinitionSimple getFixture() {
		return (DatatypeDefinitionSimple)fixture;
	}

} //DatatypeDefinitionSimpleTest
