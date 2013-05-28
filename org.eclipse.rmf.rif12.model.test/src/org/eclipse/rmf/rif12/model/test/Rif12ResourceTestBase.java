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

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.diff.metamodel.DiffElement;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.metamodel.ModelElementChangeLeftTarget;
import org.eclipse.emf.compare.diff.metamodel.ReferenceOrderChange;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import org.eclipse.rmf.rif12.resource.Rif12ResourceFactoryImpl;
import org.eclipse.rmf.rif12.xsd.DocumentRoot;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.impl.DocumentRootImpl;
import org.eclipse.rmf.rif12.xsd.util.RifResourceFactoryImpl;

public class Rif12ResourceTestBase {

	protected ResourceSet rifResourceSet;
	protected ResourceSet rifXSDResourceSet;

	@Before
	public void setup() {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"rif", new Rif12ResourceFactoryImpl());
		rifResourceSet = new ResourceSetImpl();

		rifXSDResourceSet = new ResourceSetImpl();
		rifXSDResourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("rif", new RifResourceFactoryImpl());
		rifXSDResourceSet.getResourceFactoryRegistry()
				.getProtocolToFactoryMap()
				.put(RifPackage.eNS_URI, RifPackage.eINSTANCE);

	}

	@After
	public void tearDown() throws Exception {
	}

	public Resource loadRif(String filename) {
		ResourceSet rifResourceSet = new ResourceSetImpl();

		Resource rifResource = rifResourceSet.getResource(
				URI.createFileURI(new File(filename).getAbsolutePath()), true);
		return rifResource;
	}

	public void saveRif(EObject rootEObject, String filename) {
		ResourceSet rifResourceSet = new ResourceSetImpl();

		try {
			Resource resource = rifResourceSet.createResource(
					URI.createFileURI(new File(filename).getAbsolutePath()));
			resource.getContents().add(rootEObject);
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			fail(e.getMessage());
		}

	}

	@SuppressWarnings("unchecked")
	public void compareModels(String filename1, String filename2) {

		Resource rifXSDResourceInput = rifXSDResourceSet.getResource(
				URI.createFileURI(new File(filename1).getAbsolutePath()), true);

		Resource rifXSDResourceOutput = rifXSDResourceSet.getResource(
				URI.createFileURI(new File(filename2).getAbsolutePath()), true);

		try {

			MatchModel match = MatchService.doMatch(
					(DocumentRootImpl) rifXSDResourceOutput.getContents()
							.get(0), rifXSDResourceInput.getContents().get(0),
					(Map<String, Object>) new HashMap<String, Object>().put(
							MatchOptions.OPTION_IGNORE_XMI_ID, Boolean.TRUE));
			DiffModel diff = DiffService.doDiff(match, false);

			ArrayList<DiffElement> differences = null;

			if (!diff.getDifferences().isEmpty()) {
				differences = getValidDifferences(diff);
				printDifferences(differences);
			}
			
			Assert.assertTrue((differences != null ? differences.size() : "")
					+ " Difference(s) found between loaded and saved models",
					differences == null || differences.isEmpty());
		} catch (InterruptedException e) {
			fail(e.getMessage());
		}
	}

	protected void printDifferences(List<DiffElement> diffElements) {
		for (DiffElement diffElement : diffElements){
			System.out.println(diffElement);
		}
	}
	
	protected ArrayList<DiffElement> getValidDifferences(DiffModel diff) {

		ArrayList<DiffElement> differences = new ArrayList<DiffElement>();

		for (DiffElement diffElement : diff.getDifferences()) {
			
			boolean relatedToDocumentRootAddMapping = (diffElement instanceof ModelElementChangeLeftTarget) && ((ModelElementChangeLeftTarget)diffElement).getLeftElement().eContainer() instanceof DocumentRoot;
			boolean relatedToDocumentRootOrderOfAttributes = (diffElement instanceof ReferenceOrderChange && ((ReferenceOrderChange) diffElement).getLeftElement() instanceof DocumentRoot);
			

			if (!relatedToDocumentRootAddMapping && !relatedToDocumentRootOrderOfAttributes) {
				differences.add(diffElement);
			}
		}
		return differences;
	}
}
