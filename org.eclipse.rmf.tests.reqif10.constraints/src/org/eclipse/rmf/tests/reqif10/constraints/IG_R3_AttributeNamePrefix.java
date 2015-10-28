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

import static org.junit.Assert.assertEquals;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.junit.Test;

@SuppressWarnings("nls")
public class IG_R3_AttributeNamePrefix extends AbstractConstraintTest {

	@Override
	protected String getConstraintID() {
		return "org.eclipse.rmf.reqif10.constraints.IG_R3";
	}

	protected AttributeDefinition createAttributeDefinition(String name) {
		AttributeDefinitionString attributeDefinition = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinition.setLongName(name);
		return attributeDefinition;
	}

	protected SpecObject createSpecObject() {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObject.setType(specObjectType);
		return specObject;
	}

	protected SpecObject createSpecObject(AttributeDefinition ad) {
		SpecObject specObject = createSpecObject();
		specObject.getType().getSpecAttributes().add(ad);
		return specObject;
	}

	protected SpecType createSpecificationType(AttributeDefinition ad) {
		SpecificationType specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.getSpecAttributes().add(ad);
		return specificationType;
	}

	protected SpecType createSpecRelationType(AttributeDefinition ad) {
		SpecRelationType specRelationType = ReqIF10Factory.eINSTANCE.createSpecRelationType();
		specRelationType.getSpecAttributes().add(ad);
		return specRelationType;
	}

	@Test
	public void testInvalid1() throws Exception {
		AttributeDefinition attributeValue = createAttributeDefinition("ReqIF.foo");
		IStatus status = validator.validate(attributeValue);
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}

	@Test
	public void testValidSpecObject() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.Name");
		SpecObject specObject = createSpecObject(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testInvalidSpecObject() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.foo");
		SpecObject specObject = createSpecObject(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}

	@Test
	public void testInvalidSpecObject2() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.Prefix");
		SpecObject specObject = createSpecObject(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}

	@Test
	public void testInvalidSpecification() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.foo");
		createSpecificationType(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}

	@Test
	public void testValidSpecification() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.Name");
		createSpecificationType(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testValidSpecification2() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.Prefix");
		createSpecificationType(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testValidSpecRelation() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.Name");
		createSpecRelationType(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.OK, status.getSeverity());
	}

	@Test
	public void testInvalidSpecRelation() throws Exception {
		AttributeDefinition attributeDefinition = createAttributeDefinition("ReqIF.foo");
		createSpecRelationType(attributeDefinition);
		IStatus status = validator.validate(attributeDefinition);
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}

	@Test
	public void testInvalid2() throws Exception {
		AttributeDefinition attributeValue = createAttributeDefinition("ReqIF.Name");
		IStatus status = validator.validate(attributeValue);
		// should generate Warning because ad is not in a type
		assertEquals(status.getMessage(), IStatus.WARNING, status.getSeverity());
	}
}
