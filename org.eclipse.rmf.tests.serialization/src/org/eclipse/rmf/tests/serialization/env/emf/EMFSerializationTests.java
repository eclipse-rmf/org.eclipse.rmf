package org.eclipse.rmf.tests.serialization.env.emf;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
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
import org.eclipse.rmf.tests.serialization.internal.Activator;
import org.junit.Test;

@SuppressWarnings("nls")
public class EMFSerializationTests extends AbstractEMFTestCase {
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

	class MustHavePrefixResourceFactoryImpl extends EcoreResourceFactoryImpl {
		@Override
		public Resource createResource(URI uri) {
			XMLResource result = new XMIResourceImpl(uri) {
				@Override
				protected boolean useIDs() {

					return eObjectToIDMap != null || idToEObjectMap != null;
				}

				@Override
				protected XMLHelper createXMLHelper() {
					XMLHelper helper = new XMLHelperImpl(this) {
						String previousNS = null;

						// TODO: qualified references should be implemented via ExtendedMetadata
						@Override
						public String getQName(EStructuralFeature feature) {
							if (extendedMetaData != null) {
								String namespace = extendedMetaData.getNamespace(feature);
								String name = extendedMetaData.getName(feature);

								EPackage ePackage;
								if (null == namespace) {
									if (null == previousNS) {
										EClass eClass = feature.getEContainingClass();
										ePackage = eClass.getEPackage();
										namespace = ePackage.getNsURI();
									} else {
										namespace = previousNS;
									}
								}

								ePackage = extendedMetaData.getPackage(namespace);
								if (ePackage == null) {
									ePackage = extendedMetaData.demandPackage(namespace);
								}

								previousNS = namespace;

								String result = getQName(ePackage, name);

								return result;
							}

							return feature.getName();
						}

					};

					return helper;
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
	public void testDefaultNamespacePrefixWithoutDocumentRootSerialization() throws Exception {
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
		// extended metadata required in order to properly write the namespace prefix before the elements
		saveWorkingFile(fileName, ePackage, new MustHavePrefixResourceFactoryImpl(), options);

		// validate
		String resourceAsString = loadWorkingFileAsString(fileName);
		assertTrue(resourceAsString.contains("<ecore:EPackage "));
		assertTrue(resourceAsString.contains("<ecore:eClassifiers "));
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

	@Override
	protected Plugin getTestPlugin() {
		return new Activator.Implementation();
	}
}
