package org.eclipse.rmf.serialization.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.rmf.serialization2.RMFResourceFactoryImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoadTests {
	static Map<String, Object> backupRegistry = null;

	@BeforeClass
	public static void setupOnce() throws Exception {
		// globally register packages (global registry required since the generated EMF code
		// doesn't handle local registries during handling of xsd any types)
		// backup the registry
		backupRegistry = new HashMap<String, Object>();
		backupRegistry.putAll(EPackage.Registry.INSTANCE);
		// System.out.println("BeforeClass: Initial package registry: " + EPackage.Registry.INSTANCE.keySet());
		EPackage.Registry.INSTANCE.clear();
		EPackage ePackage = (EPackage) loadResource("input/ContainmentReferences/ecore/ContainmentReferences.ecore", new EcoreResourceFactoryImpl())
				.getContents().get(0);
		EPackage.Registry.INSTANCE.put("http://www.eclipse.org/rmf/tests/ContainmentReferences", ePackage);

		// System.out.println("BeforeClass: reset to: " + EPackage.Registry.INSTANCE.keySet());
	}

	@AfterClass
	public static void tearDownOnce() throws Exception {
		if (null != backupRegistry) {
			EPackage.Registry.INSTANCE.clear();
			EPackage.Registry.INSTANCE.putAll(backupRegistry);
		}
		// System.out.println("AfterClass: reset to: " + EPackage.Registry.INSTANCE.keySet());
	}

	@Test
	public void testRootOnly() throws IOException {
		Resource resource = loadResource("input/ContainmentReferences/data/RootOnly.xml", new RMFResourceFactoryImpl());
		resource.load(null);

		assertEquals(0, resource.getErrors().size());
		assertEquals(0, resource.getWarnings().size());

		EList<EObject> contents = resource.getContents();
		assertEquals(1, contents.size());
		EObject eObject = contents.get(0);
		assertEquals("Root", eObject.eClass().getName());
		assertEquals(1, countObjects(resource));
	}

	@Test
	public void testRootWithSingleContainment() throws IOException {
		String fileName = "input/ContainmentReferences/data/RootWithSingleContainment.xml";
		Resource resource = loadResource(fileName, new RMFResourceFactoryImpl());
		resource.load(null);

		saveAsXMI(resource, fileName + ".xmi", new XMIResourceFactoryImpl());
		assertEquals(0, resource.getErrors().size());
		assertEquals(0, resource.getWarnings().size());

		EList<EObject> contents = resource.getContents();
		assertEquals(1, contents.size());

		EObject root = contents.get(0);
		assertEquals("Root", root.eClass().getName());

		assertEquals(2, countObjects(resource));

		EStructuralFeature childFeature = root.eClass().getEStructuralFeature("child");
		assertTrue(root.eIsSet(childFeature));
	}

	protected static Resource loadResource(String fileName, ResourceFactoryImpl factory) throws IOException {
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = factory.createResource(emfURI);
		resource.load(null);

		return resource;
	}

	public static void saveAsXMI(Resource inputResource, String fileName, ResourceFactoryImpl factory) throws IOException {
		URI emfURI = URI.createURI(fileName, true);
		Resource resource = factory.createResource(emfURI);
		resource.getContents().addAll(inputResource.getContents());
		resource.save(null);
	}

	protected static int countObjects(Resource resource) {
		int count;
		if (null == resource) {
			count = -1;
		} else {
			count = 0;
			TreeIterator<EObject> iter = resource.getAllContents();
			while (iter.hasNext()) {
				iter.next();
				count++;
			}
		}
		return count;
	}

}
