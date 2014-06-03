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
package org.eclipse.rmf.tests.reqif10.constraints;

import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIF10Factory;

@SuppressWarnings("nls")
public class C14_AttributeDefinitionEnumeration_LongNameConstraintTests extends AbstractIdentifiableLongNameConstraintTests {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.C1.4";
	}

	@Override
	protected Identifiable createIdentifiable() {
		return ReqIF10Factory.eINSTANCE.createAttributeDefinitionEnumeration();
	}

}
