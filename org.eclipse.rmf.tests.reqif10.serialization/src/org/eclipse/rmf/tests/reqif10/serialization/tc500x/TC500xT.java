/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Said Salem - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.tests.reqif10.serialization.tc500x;

import java.math.BigInteger;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;
import org.junit.Assert;

@SuppressWarnings("nls")
public class TC500xT extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2014-11-01T12:00:00.000+02:00";
	final static String TEST_CASE_ID = "TC500x_T";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType;
	SpecRelationType specRelationType;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject;

	// SpecRelations
	SpecRelation specRelation10;
	SpecRelation specRelation11;

	/**
	 * @throws Exception
	 */
	public TC500xT() throws Exception {
		super("ID_TC500x_T", "TC 500x 'Cross-File Linking'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC500x_T_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC500x_T DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));
		getReqIF().getCoreContent().getDatatypes().add(datatypeDefinitionString);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC500x_T_SpecObjectType");
		specObjectType.setLongName("TC500x_T SpecObjectType");
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		AttributeDefinitionString attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC500x_T_SpecObjectType_AD");
		attributeDefinitionString.setLongName("AD10");
		attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionString.setType(datatypeDefinitionString);
		specObjectType.getSpecAttributes().add(attributeDefinitionString);
		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);
	}

	@Override
	public void createSpecRelationTypes() throws Exception {
		specRelationType = ReqIF10Factory.eINSTANCE.createSpecRelationType();
		specRelationType.setIdentifier("ID_TC500x_T_SpecRelationType");
		specRelationType.setLongName("TC500x_T SpecRelationType");
		specRelationType.setLastChange(toDate(LAST_CHANGE_STRING));

		AttributeDefinitionString attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
		attributeDefinitionString.setIdentifier("ID_TC500x_T_SpecRelationType_AD");
		attributeDefinitionString.setLongName("AD11");
		attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		attributeDefinitionString.setType(datatypeDefinitionString);
		specRelationType.getSpecAttributes().add(attributeDefinitionString);
		getReqIF().getCoreContent().getSpecTypes().add(specRelationType);
	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC500x_T_SpecificationType");
		specificationType.setLongName("TC500x_T SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC500x_T_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecifications().add(specification);

		SpecHierarchy specHierarchy = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy.setIdentifier("ID_TC500x_T_SpecHierarchy");
		specHierarchy.setLongName("TC500x_T SpecHierarchy_1a");
		specHierarchy.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy.setObject(specObject);
		specification.getChildren().add(specHierarchy);

	}

	@Override
	public void createSpecObjects() throws Exception {
		specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setDesc("description");
		specObject.setIdentifier("ID_TC500x_T_SpecObject");
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setLongName("TC500x_T SpecObject");
		specObject.setType(specObjectType);
		getReqIF().getCoreContent().getSpecObjects().add(specObject);
	}

	@Override
	public void createSpecRelations() throws Exception {
		TC500xS source = new TC500xS();
		SpecObject otherSpecObject = source.getReqIF().getCoreContent().getSpecObjects().get(0);
		Assert.assertEquals("ID_TC500x_S_SpecObject_1", otherSpecObject.getIdentifier());
		specRelation10 = createSpecRelation(10);
		specRelation10.setSource(specObject);
		specRelation10.setTarget(otherSpecObject);

		specRelation11 = createSpecRelation(11);
		specRelation11.setSource(otherSpecObject);
		specRelation11.setTarget(specObject);
	}

	private SpecRelation createSpecRelation(int id) throws Exception {
		SpecRelation sr = ReqIF10Factory.eINSTANCE.createSpecRelation();
		sr.setDesc("description");
		sr.setIdentifier("ID_TC500x_T_SpecRelation" + id);
		sr.setLastChange(toDate(LAST_CHANGE_STRING));
		sr.setLongName("TC500x_T Specrelation" + id);
		sr.setType(specRelationType);
		getReqIF().getCoreContent().getSpecRelations().add(sr);
		return sr;
	}

}
