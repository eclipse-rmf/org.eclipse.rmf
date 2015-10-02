/**
 * Copyright (c) 2015 Formal Mind GmbH
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ingo Weigelt
 *
 */
package org.eclipse.rmf.tests.reqif10.constraints;

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.ReqIF10Factory;

@SuppressWarnings("nls")
public class C20_AttributeDefinitionExistenceOfDatatypeDefinitionConstraintTests extends
		AbstractAttributeDefinitionDatatypeDefinitionExistenceConstraintTests {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.C2.0";
	}

	@Override
	protected AttributeDefinition createAttributeDefinition() {
		return ReqIF10Factory.eINSTANCE.createAttributeDefinitionBoolean();
	}

	@Override
	protected AttributeDefinition createValidModel() {
		AttributeDefinition attributeDefinition = createAttributeDefinition();
		DatatypeDefinitionBoolean datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionBoolean();
		((AttributeDefinitionBoolean) attributeDefinition).setType(datatypeDefinitionString);
		return attributeDefinition;
	}

}
