package org.eclipse.rmf.tests.ext.prostep.serializaion;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.rmf.ext.prostep.ExchangeConversation;
import org.eclipse.rmf.ext.prostep.ProstepFactory;
import org.eclipse.rmf.ext.prostep.ProstepPackage;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.common.util.ReqIFToolExtensionUtil;
import org.eclipse.rmf.reqif10.serialization.ReqIF10ResourceFactoryImpl;
import org.eclipse.sphinx.emf.serialization.XMLPersistenceMappingResourceSetImpl;
import org.eclipse.rmf.tests.reqif10.serialization.util.AbstractTestCase;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SerializationTests extends AbstractTestCase {
	
	@BeforeClass
	public static void setupOnce() throws Exception {
		// globally register packages (global registry required since the generated EMF code
		// doesn't handle local registries during handling of xsd any types)
		// backup the registry
		backupRegistry = new HashMap<String, Object>();
		backupRegistry.putAll(EPackage.Registry.INSTANCE);
		// System.out.println("BeforeClass: Initial package registry: " + EPackage.Registry.INSTANCE.keySet());
		EPackage.Registry.INSTANCE.clear();
		EPackage.Registry.INSTANCE.put(ReqIF10Package.eNS_URI, ReqIF10Package.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ProstepPackage.eNS_URI, ProstepPackage.eINSTANCE);

		loadXMLPersistenceMappingResourceSet = new XMLPersistenceMappingResourceSetImpl();
		loadXMLPersistenceMappingResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIF10ResourceFactoryImpl());

		saveXMLPersistenceMappingResourceSet = new XMLPersistenceMappingResourceSetImpl();
		saveXMLPersistenceMappingResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIF10ResourceFactoryImpl());
	}
	

	@Test
	public void test() throws IOException {
		String fileName = getWorkingFileName("minimalExchangeConversation.reqif");
		String identifier = "_6ced3339-9916-44f7-b9f0";
		
		
		// create minimal model that contains tool extension
		ReqIF reqIF = ReqIF10Factory.eINSTANCE.createReqIF();
		ExchangeConversation exchangeConversation = ProstepFactory.eINSTANCE.createExchangeConversation();
		exchangeConversation.setIdentifier(identifier);
		ReqIFToolExtensionUtil.addToolExtension(reqIF,exchangeConversation);
		
		// save the model
		saveReqIFFile(reqIF, fileName);
		
		// load file
		ReqIF loadedReqIF = loadReqIFFile(fileName);
		List<EObject> loadedExtensions = ReqIFToolExtensionUtil.getToolExtensionsByNsURI(loadedReqIF, ProstepPackage.eNS_URI);
		
		Assert.assertSame(1, loadedExtensions.size());
		EObject loadedExtension = loadedExtensions.get(0);
		Assert.assertTrue(loadedExtension instanceof ExchangeConversation);
		ExchangeConversation loadedExchangeConversation = (ExchangeConversation)loadedExtension;
		Assert.assertEquals(identifier, loadedExchangeConversation.getIdentifier());
		
		
		
	}

}
