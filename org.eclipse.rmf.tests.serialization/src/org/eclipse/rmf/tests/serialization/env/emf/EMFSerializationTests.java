package org.eclipse.rmf.tests.serialization.env.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
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
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DocumentRoot;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifFactory;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.util.MyreqifResourceFactoryImpl;
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.eclipse.sphinx.testutils.AbstractTestCase;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class EMFSerializationTests extends AbstractTestCase {
	public static final String RELATIVE_WORK_DIR = "org.eclipse.rmf.tests.serialization.env.emf/EMFSerializationTests/";
	private static HashMap<String, Object> backupRegistry = new HashMap<String, Object>();

	@BeforeClass
	public static void initRegistry() {
		backupRegistry = new HashMap<String, Object>();
		backupRegistry.putAll(EPackage.Registry.INSTANCE);
	}

	@Before
	public void beforeTestCase() {
		EPackage.Registry.INSTANCE.clear();
	}

	@AfterClass
	public static void restorePackageRegistry() {
		EPackage.Registry.INSTANCE.clear();
		EPackage.Registry.INSTANCE.putAll(backupRegistry);
	}

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
		reqif.setLang("en");
		documentRoot.setREQIF(reqif);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);
		HashMap<String, Object> options = new HashMap<String, Object>();
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
		documentRoot.setREQIF(reqif);

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
		documentRoot.setREQIF(reqif);

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		saveWorkingFile(fileName, documentRoot, new MyreqifResourceFactoryImpl(), null);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<myreqif:REQ-IF "));
	}

	@Test
	public void testCustomNamespacePrefixSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testCustomNamespacePrefixSerialization.xml"; //$NON-NLS-1$

		// create model
		DocumentRoot documentRoot = MyreqifFactory.eINSTANCE.createDocumentRoot();
		documentRoot.getXMLNSPrefixMap().put("", MyreqifPackage.eNS_URI);
		REQIF reqif = MyreqifFactory.eINSTANCE.createREQIF();
		documentRoot.setREQIF(reqif);

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
	public void testCustomNamespacePrefixWithoutDocumentRootSerialization() throws Exception {
		String fileName = RELATIVE_WORK_DIR + "testCustomNamespacePrefixWithoutDocumentRootSerialization.xml"; //$NON-NLS-1$

		// create model
		EPackage ePackage = EcoreFactory.eINSTANCE.createEPackage();

		// save model
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(MyreqifPackage.eNS_URI, MyreqifPackage.eINSTANCE);

		saveWorkingFile(fileName, ePackage, new EmptyPrefixResourceFactoryImpl(), null);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<EPackage "));
	}

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}
}
