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

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.tests.reqif10.serialization.util.SimpleModelBuilder;

@SuppressWarnings("nls")
public class TC500xS extends SimpleModelBuilder {
	final static String LAST_CHANGE_STRING = "2014-11-01T12:00:00.000+02:00";
	final static String TEST_CASE_ID = "TC500x_S";

	// datatypes
	protected DatatypeDefinitionString datatypeDefinitionString;

	// SpecObjectTypes
	SpecObjectType specObjectType1;
	SpecObjectType specObjectType2;

	// SpecificationTypes
	SpecificationType specificationType;

	// SpecObjects
	SpecObject specObject1;
	SpecObject specObject2;
	SpecObject specObject3;

	/**
	 * @throws Exception
	 */
	public TC500xS() throws Exception {
		super("ID_TC500x_S", "TC 500x 'Various Tricky ReqIF Constructs'");
	}

	@Override
	public void createDatatypes() throws Exception {
		datatypeDefinitionString = ReqIF10Factory.eINSTANCE.createDatatypeDefinitionString();
		datatypeDefinitionString.setIdentifier("ID_TC500x_S_DatatypeDefinitionString");
		datatypeDefinitionString.setLongName("TC500x_S DatatypeDefinitionString");
		datatypeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
		datatypeDefinitionString.setMaxLength(new BigInteger("255"));
		getReqIF().getCoreContent().getDatatypes().add(datatypeDefinitionString);
	}

	@Override
	public void createSpecObjectTypes() throws Exception {
		specObjectType1 = createSpecObjectType(1, 2);
		specObjectType2 = createSpecObjectType(2, 1);
	}

	public SpecObjectType createSpecObjectType(int id, int adCount) throws Exception {
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE.createSpecObjectType();
		specObjectType.setIdentifier("ID_TC500x_S_SpecObjectType" + id);
		specObjectType.setLongName("TC500x_S SpecObjectType" + id);
		specObjectType.setLastChange(toDate(LAST_CHANGE_STRING));

		for (int i = 1; i <= adCount; i++) {
			AttributeDefinitionString attributeDefinitionString = ReqIF10Factory.eINSTANCE.createAttributeDefinitionString();
			attributeDefinitionString.setIdentifier("ID_TC500x_S_SpecType" + id + "_AD" + i);
			attributeDefinitionString.setLongName("AD" + i);
			attributeDefinitionString.setLastChange(toDate(LAST_CHANGE_STRING));
			attributeDefinitionString.setType(datatypeDefinitionString);
			specObjectType.getSpecAttributes().add(attributeDefinitionString);
		}
		getReqIF().getCoreContent().getSpecTypes().add(specObjectType);
		return specObjectType;
	}

	@Override
	public void createSpecificationTypes() throws Exception {
		specificationType = ReqIF10Factory.eINSTANCE.createSpecificationType();
		specificationType.setIdentifier("ID_TC500x_S_SpecificationType");
		specificationType.setLongName("TC500x_S SpecificationType");
		specificationType.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecTypes().add(specificationType);
	}

	@Override
	public void createSpecifications() throws Exception {
		Specification specification = ReqIF10Factory.eINSTANCE.createSpecification();
		specification.setIdentifier("ID_TC500x_S_Specification");
		specification.setType(specificationType);
		specification.setLastChange(toDate(LAST_CHANGE_STRING));
		getReqIF().getCoreContent().getSpecifications().add(specification);

		SpecHierarchy specHierarchy1a = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy1a.setIdentifier("ID_TC500x_S_SpecHierarchy_1a");
		specHierarchy1a.setLongName("TC500x_S SpecHierarchy_1a");
		specHierarchy1a.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy1a.setObject(specObject1);
		specification.getChildren().add(specHierarchy1a);

		SpecHierarchy specHierarchy1b = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy1b.setIdentifier("ID_TC500x_S_SpecHierarchy_1b");
		specHierarchy1b.setLongName("TC500x_S SpecHierarchy_1b");
		specHierarchy1b.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy1b.setObject(specObject1);
		specification.getChildren().add(specHierarchy1b);

		SpecHierarchy specHierarchy2 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		specHierarchy2.setIdentifier("ID_TC500x_S_SpecHierarchy_2");
		specHierarchy2.setLongName("TC500x_S SpecHierarchy_2");
		specHierarchy2.setLastChange(toDate(LAST_CHANGE_STRING));
		specHierarchy2.setObject(specObject2);
		specification.getChildren().add(specHierarchy2);
	}

	/**
	 * creates instances of the following metamodel classes:
	 * <ul>
	 * <li>SpecObject</li>
	 * <li>AlternativeID</li>
	 * <li>AttributeValueBoolean</li>
	 * <li>AttributeValueInteger</li>
	 * <li>AttributeValueString</li>
	 * <li>AttributeValueReal</li>
	 * <li>AttributeValueDate</li>
	 * <li>AttributeValueEnumeration</li>
	 * </ul>
	 * 
	 * @throws Exception
	 */
	@Override
	public void createSpecObjects() throws Exception {
		specObject1 = createSpecObject(1, specObjectType1);
		specObject2 = createSpecObject(2, specObjectType2);
		specObject3 = createSpecObject(3, specObjectType1);
	}

	public SpecObject createSpecObject(int id, SpecObjectType type) throws Exception {
		SpecObject specObject = ReqIF10Factory.eINSTANCE.createSpecObject();
		specObject.setDesc("description");
		specObject.setIdentifier("ID_TC500x_S_SpecObject_" + id);
		specObject.setLastChange(toDate(LAST_CHANGE_STRING));
		specObject.setLongName("TC500x_S SpecObject_" + id);
		specObject.setType(type);

		for (AttributeDefinition ad : type.getSpecAttributes()) {
			AttributeValueString av = ReqIF10Factory.eINSTANCE.createAttributeValueString();
			av.setDefinition((AttributeDefinitionString) ad);
			av.setTheValue("SO" + id + ": Value for " + ad.getIdentifier());
			specObject.getValues().add(av);
			getReqIF().getCoreContent().getSpecObjects().add(specObject);
		}
		return specObject;
	}

}
