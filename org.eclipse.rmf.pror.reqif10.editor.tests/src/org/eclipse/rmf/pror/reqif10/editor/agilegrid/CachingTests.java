/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Said Salem - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.pror.reqif10.editor.agilegrid;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

import org.eclipse.rmf.pror.reqif10.configuration.Column;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigurationFactory;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.util.ConfigurationUtil;
import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.SpecObjectType;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;
import org.junit.Test;

/**
 * Tests {@link ProrRow}
 * 
 * @author salem
 */
public class CachingTests extends AbstractContentProviderTests {


	@Test
	public void testPerformance() {
		int row = 100000;
		long startTime = System.currentTimeMillis();
		createReqIF(row);
		long endTime = System.currentTimeMillis();

		long duration = endTime - startTime;
		System.out.println("Duration for createReqIF(" + row + "): " + duration + " ms");

//		no caching
//		Duration for createReqIF(100000): 1617 ms
//		Duration for getContentAt(9999): 180 ms
//		simple caching
//		Duration for createReqIF(100000): 1581 ms
//		First call: Duration for getContentAt(99999): 186 ms
//		Second call: Duration for getContentAt(99999): 0 ms
		
	}

	@Test
	public void testPerformanceCP() {
		int row = 100000;
		ReqIF reqif = createReqIF(row);
		Specification spec = reqif.getCoreContent().getSpecifications().get(0);
		ProrAgileGridContentProvider cp = new ProrAgileGridContentProvider(
				spec, ConfigurationUtil.createSpecViewConfiguration(spec,
						editingDomain));
		long startTime = System.currentTimeMillis();
		cp.getContentAt((row - 1), 0);
		long endTime = System.currentTimeMillis();

		long duration = endTime - startTime;
		System.out.println("First call: Duration for getContentAt(" + (row - 1) + "): "
				+ duration + " ms");
		
		startTime = System.currentTimeMillis();
		cp.getContentAt((row - 1), 0);
		endTime = System.currentTimeMillis();

		duration = endTime - startTime;
		System.out.println("Second call: Duration for getContentAt(" + (row - 1) + "): "
				+ duration + " ms");
	}

	@Test
	public void testAssignSpecHierarchy() {
		SpecHierarchy specH = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		SpecObject specObj = ReqIF10Factory.eINSTANCE.createSpecObject();
		specH.setObject(specObj);

		contentProvider.getContentAt(0, 0);
		specification.getChildren().set(0, specH);

		assertEquals(specObj, contentProvider.getContentAt(0, 0));
	}

	@Test
	public void testAssignSpecObject() {
		SpecObject specObj = ReqIF10Factory.eINSTANCE.createSpecObject();

		contentProvider.getContentAt(0, 0);
		specHierarchy.setObject(specObj);
		assertEquals(specObj, contentProvider.getContentAt(0, 0));
	}

	@Test
	public void testSetShowSpecRelations() {
		SpecObject specObj = ReqIF10Factory.eINSTANCE.createSpecObject();
		SpecHierarchy specH1 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		SpecHierarchy specH2 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		SpecHierarchy specH3 = ReqIF10Factory.eINSTANCE.createSpecHierarchy();
		
		specH1.setObject(specObject);
		specH2.setObject(specObj);
		specH3.setObject(specObject);
		
		SpecRelation specRelation = ReqIF10Factory.eINSTANCE.createSpecRelation();
		
		reqif.getCoreContent().getSpecObjects().add(specObj);
		

		specification.getChildren().add(specH1);
		specification.getChildren().add(specH2);
		specification.getChildren().add(specH3);
		

		specRelation.setSource(specObj);
		specRelation.setTarget(specObject);
		reqif.getCoreContent().getSpecRelations().add(specRelation);
		
		assertEquals(specH3.getObject(), contentProvider.getContentAt(3, 0));
		contentProvider.setShowSpecRelations(true);
		assertEquals(specRelation, contentProvider.getContentAt(3, 0));
	}	
	
	
	
	private ReqIF createReqIF(int numRows) {

		ReqIF root = ReqIF10Factory.eINSTANCE.createReqIF();

		ReqIFContent content = ReqIF10Factory.eINSTANCE.createReqIFContent();
		root.setCoreContent(content);

		// Add a DatatypeDefinition
		DatatypeDefinitionString ddString = ReqIF10Factory.eINSTANCE
				.createDatatypeDefinitionString();
		ddString.setLongName("T_String32k");
		ddString.setMaxLength(new BigInteger("32000"));
		content.getDatatypes().add(ddString);

		// Add a SpecObjectType
		SpecObjectType specObjectType = ReqIF10Factory.eINSTANCE
				.createSpecObjectType();
		specObjectType.setLongName("Requirement Type");
		content.getSpecTypes().add(specObjectType);

		// Add an AttributeDefinition
		AttributeDefinitionString ad1 = ReqIF10Factory.eINSTANCE
				.createAttributeDefinitionString();
		ad1.setType(ddString);
		ad1.setLongName("Description");
		specObjectType.getSpecAttributes().add(ad1);

		// Add a Specification
		Specification spec = ReqIF10Factory.eINSTANCE.createSpecification();
		spec.setLongName("Specification Document");
		content.getSpecifications().add(spec);
		ProrSpecViewConfiguration config = ConfigurationUtil
				.createSpecViewConfiguration(spec, editingDomain);
		Column column = ConfigurationFactory.eINSTANCE.createColumn();
		column.setLabel("Description");
		config.getColumns().add(column);

		for (int i = 0; i < numRows; i++) {
			SpecHierarchy specH = ReqIF10Factory.eINSTANCE
					.createSpecHierarchy();
			SpecObject specObj = ReqIF10Factory.eINSTANCE.createSpecObject();
			specObj.setType(specObjectType);
			content.getSpecObjects().add(specObj);

			AttributeValueString value2 = ReqIF10Factory.eINSTANCE
					.createAttributeValueString();
			value2.setTheValue("Value-" + i);
			value2.setDefinition(ad1);
			specObj.getValues().add(value2);

			specH.setObject(specObj);
			spec.getChildren().add(specH);

			// ProrUtil.createAddTypedElementCommand(parent, childFeature,
			// newSpecElement, typeFeature, specType, index, resultIndex,
			// domain, adapterFactory);
		}
		return root;
	}

}
