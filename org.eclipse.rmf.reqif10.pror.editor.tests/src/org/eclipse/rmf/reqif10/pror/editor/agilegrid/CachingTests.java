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

package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.core.internal.runtime.PrintStackUtil;
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
import org.eclipse.rmf.reqif10.pror.configuration.Column;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationFactory;
import org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrAgileGridContentProvider;
import org.eclipse.rmf.reqif10.pror.editor.agilegrid.ProrRow;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.junit.Test;

/**
 * Tests {@link ProrRow}
 * 
 * @author salem
 */
public class CachingTests extends AbstractContentProviderTests {

	@Test
	public void testPerformance() {
		int milliNano = 100000;
		int row = 100000;
		long startTime = System.nanoTime();
		ReqIF reqif = createReqIF(row);
		long endTime = System.nanoTime();

		long createDuration = endTime - startTime;

		Specification spec = reqif.getCoreContent().getSpecifications().get(0);
		ProrAgileGridContentProvider cp = new ProrAgileGridContentProvider(
				spec, ConfigurationUtil.createSpecViewConfiguration(spec,
						editingDomain));
		startTime = System.nanoTime();
		cp.getContentAt((row - 1), 0);
		endTime = System.nanoTime();
		long fstCallDuration = endTime - startTime;

		startTime = System.nanoTime();
		cp.getContentAt(row - 1, 0);
		endTime = System.nanoTime();
		long sndCallDuration = endTime - startTime;
		
		// using the fibonacci call to validate the meaningfulness of the performance test
		startTime = System.nanoTime();
		fibonacci(40);
		endTime = System.nanoTime();
		long fibDuration = endTime - startTime;

		Date date = new Date(System.currentTimeMillis());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.getTime();

		PrintWriter pw = null;
		BufferedReader br = null;
		try {
			pw = new PrintWriter(
					"stats.txt");
			String sUrl = "https://hudson.eclipse.org/hudson/job/rmf-nightly/lastSuccessfulBuild/artifact/performance-data/stats.txt";
			if (urlExists(sUrl))

			{
			URL url = new URL(sUrl);
			
			br = new BufferedReader(new InputStreamReader(
					url.openStream()));

			String line;
			while ((line = br.readLine()) != null) {
				pw.print(line);
				pw.println();
				
			}}
			pw.print(cal.getTime() +"; ");
			pw.print(createDuration / milliNano +"; ");
			pw.print(fstCallDuration / milliNano + "; ");
			pw.print(sndCallDuration / milliNano + "; ");
			pw.print(fibDuration / milliNano);

			pw.close();
			
		} catch (IOException e) {
			fail(e.getMessage());
		}
		finally{
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					fail(e.getMessage());
				}
			if (pw != null)
				pw.close();
		}

	}

	private int fibonacci(int num){
		 	if (num < 2)
		 		return num;
		 	else
		 		return (fibonacci(num - 2) + fibonacci(num - 1));
	}
	
	private static boolean urlExists(String URLName){
	    try {
	      HttpURLConnection.setFollowRedirects(false);

	      HttpURLConnection con =
	         (HttpURLConnection) new URL(URLName).openConnection();
	      con.setRequestMethod("HEAD");
	      return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
	    }
	    catch (Exception e) {
	       e.printStackTrace();
	       return false;
	    }
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

		SpecRelation specRelation = ReqIF10Factory.eINSTANCE
				.createSpecRelation();

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
