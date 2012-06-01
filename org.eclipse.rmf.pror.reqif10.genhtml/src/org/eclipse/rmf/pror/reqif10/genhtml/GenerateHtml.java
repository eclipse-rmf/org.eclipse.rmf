package org.eclipse.rmf.pror.reqif10.genhtml;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.rmf.pror.presentation.headline.util.HeadlineAdapterFactory;
import org.eclipse.rmf.pror.reqif10.configuration.util.ConfigurationAdapterFactory;
import org.eclipse.rmf.pror.reqif10.editor.util.ProrEditorUtil;
import org.eclipse.rmf.pror.reqif10.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.pror.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;

public class GenerateHtml {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException,
			IOException {

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ConfigurationAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReqIF10ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XhtmlItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new HeadlineAdapterFactory());
		
		BasicCommandStack commandStack = new BasicCommandStack();
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack, new ReqIFResourceSetImpl());
		
		// iterate reqif dump folder
		File f = new File("dump/reqif");

		System.out.println("===> ReqIF Dump folder exists? ===> "
				+ f.exists());
		
		if (f.exists()) {

			File[] fileArray = f.listFiles();

			for (File file : fileArray) {

				if (file.getName().endsWith(".reqif")) {

					ReqIF reqif = loadData(file);
					if (reqif != null) {

						for (Specification spec : reqif.getCoreContent()
								.getSpecifications()) {

							String fileName = file.getName();
							int mid = fileName.lastIndexOf(".");
							String fname = fileName.substring(0, mid);
							// String ext = fileName.substring(mid + 1,
							// fileName.length());
							String createHtmlHeader = ProrEditorUtil
									.createHtmlContent(spec, editingDomain);
							File htmlFile = new File("dump/html/" + fname
									+ "_" + spec.getIdentifier() + ".html");
							Writer output = new BufferedWriter(new FileWriter(
									htmlFile));
							output.write(createHtmlHeader);
							output.close();

						}

					}

				}

			}

		}

	}
	
	public static ReqIF loadData(File file) throws FileNotFoundException,
			IOException {
		
		ReqIFResourceSetImpl resourceSet = new ReqIFResourceSetImpl();

		Map<String, Object> extensionToFactoryMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();

		extensionToFactoryMap.put("reqif", new ReqIFResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(ReqIF10Package.eNS_URI,
				ReqIF10Package.eINSTANCE);
		resourceSet.getPackageRegistry().put(
				XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.FALSE);

		URI fileURI = URI.createFileURI(file.getPath());

		ReqIFResourceImpl resource = (ReqIFResourceImpl) resourceSet
				.createResource(fileURI);
		
		resource.load(extensionToFactoryMap);

		return (ReqIF) resource.getContents().get(0);
		
	}

}
