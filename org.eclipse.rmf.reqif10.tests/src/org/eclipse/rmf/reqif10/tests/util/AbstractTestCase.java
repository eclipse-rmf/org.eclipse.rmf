/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests.util;

import java.io.IOException;
import java.util.Map;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;

public class AbstractTestCase {
	
	public void validateAgainstSchema(String filename) throws Exception {
		
		StreamSource[] schemaDocuments = new StreamSource[]{new StreamSource("schema/reqif.xsd")};
		//StreamSource[] schemaDocuments = new StreamSource[]{new StreamSource("http://www.omg.org/spec/ReqIF/20110401/ReqIF.xsd")};
		Source instanceDocument = new StreamSource(filename);

		SchemaFactory sf = SchemaFactory.newInstance(
		    "http://www.w3.org/2001/XMLSchema");
		Schema s = sf.newSchema(schemaDocuments);
		Validator v = s.newValidator();
		v.validate(instanceDocument);
	}
	
	public static void saveReqIFFile(ReqIF reqif, String fileName) throws IOException {
		ReqIFResourceSetImpl resourceSet = getReqIFResourceSet();

		URI emfURI = createEMFURI(fileName);
		Resource resource = resourceSet.createResource(emfURI); 

		resource.getContents().add(reqif);
		resource.save(null);
	}
	
	public static ReqIF loadReqIFFile(String fileName) throws IOException {	
		ReqIFResourceSetImpl resourceSet = getReqIFResourceSet();
		
		URI emfURI = createEMFURI(fileName);
		XMLResource resource = (XMLResource) resourceSet.createResource(emfURI);

		resource.load(null);

        EList<EObject> rootObjects = resource.getContents();

        if (rootObjects.isEmpty()) {
        	return null;
        } else {
        	return (ReqIF)rootObjects.get(0);
        }
	}

	private static ReqIFResourceSetImpl getReqIFResourceSet() {
		ReqIFResourceSetImpl resourceSet = new ReqIFResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIFResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(ReqIF10Package.eNS_URI, ReqIF10Package.eINSTANCE);
		return resourceSet;
	}
	
	private static URI createEMFURI(String fileName) {
		return URI.createURI(fileName, true);
	}

}
