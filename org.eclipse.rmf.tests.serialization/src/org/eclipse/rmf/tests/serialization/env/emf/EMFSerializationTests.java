/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
package org.eclipse.rmf.tests.serialization.env.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifFactory;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.util.MyreqifResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.util.AbstractTestCase;
import org.junit.Test;

@SuppressWarnings("nls")
public class EMFSerializationTests extends AbstractTestCase {
	public static final String RELATIVE_WORK_DIR = "org.eclipse.rmf.tests.serialization.env.emf/EMFSerializationTests/";

	class EmptyPrefixResourceFactoryImpl extends EcoreResourceFactoryImpl {
		@Override
		public Resource createResource(URI uri) {
			XMLResource result = new XMIResourceImpl(uri) {
				@Override
				protected boolean useIDs() {

					return eObjectToIDMap != null || idToEObjectMap != null;
				}

				@Override
				protected XMLSave createXMLSave(Map<?, ?> options) {
					return new XMLSaveImpl(createXMLHelper()) {
						@Override
						protected void init(XMLResource resource, Map<?, ?> options) {
							super.init(resource, options);
							helper.getPrefixToNamespaceMap().put("", EcorePackage.eNS_URI);
						}
					};
				}
			};
			result.setEncoding("UTF-8");
			result.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
			result.getDefaultSaveOptions().put(XMLResource.OPTION_LINE_WIDTH, 80);
			result.getDefaultSaveOptions().put(XMLResource.OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware());
			return result;
		}
	}

	@Test
	public void testReqIFLangSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testReqIFLangSerialization.xml"; //$NON-NLS-1$

		// create model
		DocumentRoot documentRoot = MyreqifFactory.eINSTANCE.createDocumentRoot();
		REQIF reqif = MyreqifFactory.eINSTANCE.createREQIF();
		CORECONTENTType coreContent = MyreqifFactory.eINSTANCE.createCORECONTENTType();
		REQIFCONTENT reqifContent = MyreqifFactory.eINSTANCE.createREQIFCONTENT();

		documentRoot.setREQIF(reqif);
		reqif.setCORECONTENT(coreContent);
		coreContent.setREQIFCONTENT(reqifContent);

		reqif.setLang("en");

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);
		HashMap<String, Object> options = new HashMap<String, Object>();
		// extended metadata required in order to properly write the xml: prefix before the attribute
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveWorkingFile(fileName, documentRoot, new MyreqifResourceFactoryImpl(), options);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("xml:lang=\"en\""));
	}

	@Test
	public void testEcodingSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testEcodingSerialization.xml"; //$NON-NLS-1$

		// create model
		DocumentRoot documentRoot = MyreqifFactory.eINSTANCE.createDocumentRoot();
		REQIF reqif = MyreqifFactory.eINSTANCE.createREQIF();
		CORECONTENTType coreContent = MyreqifFactory.eINSTANCE.createCORECONTENTType();
		REQIFCONTENT reqifContent = MyreqifFactory.eINSTANCE.createREQIFCONTENT();

		documentRoot.setREQIF(reqif);
		reqif.setCORECONTENT(coreContent);
		coreContent.setREQIFCONTENT(reqifContent);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		saveWorkingFile(fileName, documentRoot, new MyreqifResourceFactoryImpl(), options);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("encoding=\"UTF-8\""));
	}

	@Test
	public void testDefaultNamespacePrefixSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testDefaultNamespacePrefixSerialization.xml"; //$NON-NLS-1$

		// create model
		DocumentRoot documentRoot = MyreqifFactory.eINSTANCE.createDocumentRoot();
		REQIF reqif = MyreqifFactory.eINSTANCE.createREQIF();
		CORECONTENTType coreContent = MyreqifFactory.eINSTANCE.createCORECONTENTType();
		REQIFCONTENT reqifContent = MyreqifFactory.eINSTANCE.createREQIFCONTENT();

		documentRoot.setREQIF(reqif);
		reqif.setCORECONTENT(coreContent);
		coreContent.setREQIFCONTENT(reqifContent);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		saveWorkingFile(fileName, documentRoot, new MyreqifResourceFactoryImpl(), null);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<myreqif:REQ-IF "));
		assertTrue(resourceAsString.contains("<myreqif:CORE-CONTENT>"));
		assertTrue(resourceAsString.contains("<myreqif:REQ-IF-CONTENT/>"));
	}

	@Test
	public void testCustomNamespacePrefixSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testCustomNamespacePrefixSerialization.xml"; //$NON-NLS-1$

		// create model
		DocumentRoot documentRoot = MyreqifFactory.eINSTANCE.createDocumentRoot();
		documentRoot.getXMLNSPrefixMap().put("", MyreqifPackage.eNS_URI);
		REQIF reqif = MyreqifFactory.eINSTANCE.createREQIF();
		CORECONTENTType coreContent = MyreqifFactory.eINSTANCE.createCORECONTENTType();
		REQIFCONTENT reqifContent = MyreqifFactory.eINSTANCE.createREQIFCONTENT();

		documentRoot.setREQIF(reqif);
		reqif.setCORECONTENT(coreContent);
		coreContent.setREQIFCONTENT(reqifContent);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		saveWorkingFile(fileName, documentRoot, new MyreqifResourceFactoryImpl(), null);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<REQ-IF "));
	}

	@Test
	public void testDefaultNamespacePrefixWithoutDocumentRootSerialization_noMetadata() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testDefaultNamespacePrefixWithoutDocumentRootSerialization.xml"; //$NON-NLS-1$

		// create model
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		ePackage.getEClassifiers().add(eClass);
		ePackage.setName("the Package");

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		HashMap<String, Object> options = new HashMap<String, Object>();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		saveWorkingFile(fileName, ePackage, new EcoreResourceFactoryImpl(), options);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		// check qualified XML elements
		assertTrue(resourceAsString.contains("<ecore:EPackage "));
		assertTrue(resourceAsString.contains("<eClassifiers "));
		// check unqualified XML attributes
		assertTrue(resourceAsString.contains(" name=\""));
	}

	@Test
	public void testCustomNamespacePrefixWithoutDocumentRootSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testCustomNamespacePrefixWithoutDocumentRootSerialization.xml"; //$NON-NLS-1$

		// create model
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();
		EClass eClass = EcoreFactory.eINSTANCE.createEClass();
		ePackage.getEClassifiers().add(eClass);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		saveWorkingFile(fileName, ePackage, new EmptyPrefixResourceFactoryImpl(), null);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<EPackage "));
	}

}
