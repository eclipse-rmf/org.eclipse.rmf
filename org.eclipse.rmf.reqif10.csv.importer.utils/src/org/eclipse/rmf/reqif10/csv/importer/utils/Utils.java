package org.eclipse.rmf.reqif10.csv.importer.utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.configuration.provider.ConfigurationItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.pror.provider.ReqIF10ItemProviderAdapterFactory;
import org.eclipse.rmf.reqif10.xhtml.provider.XhtmlItemProviderAdapterFactory;
import org.eclipse.rmf.serialization.XMLPersistenceMappingResourceSetImpl;

import au.com.bytecode.opencsv.CSVReader;

public class Utils {

	public static List<String> getColumnIds(String path, char separator,
			boolean header) throws IOException {
		CSVReader reader = new CSVReader(new FileReader(path), separator);
		String[] headerLine = reader.readNext();
		reader.close();
		if (header) {
			return Arrays.asList(headerLine);
		} else {
			List<String> columnIDs = new ArrayList<String>(headerLine.length);
			for (int i = 0; i < headerLine.length; i++) {
				columnIDs.add(String.valueOf(i));
			}
			return columnIDs;
		}
	}

	public static EditingDomain createReqIFEditingDomain() {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReqIF10ItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new XhtmlItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ConfigurationItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		// Create the editing domain with a special command stack.
		//
		EditingDomain editingDomain = new AdapterFactoryEditingDomain(
				adapterFactory, new BasicCommandStack(),
				new XMLPersistenceMappingResourceSetImpl());
		editingDomain
				.getResourceSet()
				.eAdapters()
				.add(new AdapterFactoryEditingDomain.EditingDomainProvider(
						editingDomain));
		return editingDomain;
	}
}
