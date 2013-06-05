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

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.presentation.headline.HeadlinePackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.serialization.ReqIFResourceFactoryImpl;
import org.eclipse.rmf.serialization.ReqIFResourceImpl;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

@SuppressWarnings("nls")
public abstract class AbstractTestCase {
	private static final String WORKING_DIRECTORY = "work";
	static Map<String, Object> backupRegistry = null;

	static final DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
	static final DateFormat timeFormat = new SimpleDateFormat("HHmm");

	public class Input implements LSInput {

		private String publicId;

		private String systemId;

		public String getPublicId() {
			return publicId;
		}

		public void setPublicId(String publicId) {
			this.publicId = publicId;
		}

		public String getBaseURI() {
			return null;
		}

		public InputStream getByteStream() {
			return null;
		}

		public boolean getCertifiedText() {
			return false;
		}

		public Reader getCharacterStream() {
			return null;
		}

		public String getEncoding() {
			return null;
		}

		public String getStringData() {
			synchronized (inputStream) {
				try {
					byte[] input = new byte[inputStream.available()];
					inputStream.read(input);
					String contents = new String(input);
					return contents;
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("Exception " + e);
					return null;
				}
			}
		}

		public void setBaseURI(String baseURI) {
		}

		public void setByteStream(InputStream byteStream) {
		}

		public void setCertifiedText(boolean certifiedText) {
		}

		public void setCharacterStream(Reader characterStream) {
		}

		public void setEncoding(String encoding) {
		}

		public void setStringData(String stringData) {
		}

		public String getSystemId() {
			return systemId;
		}

		public void setSystemId(String systemId) {
			this.systemId = systemId;
		}

		public BufferedInputStream getInputStream() {
			return inputStream;
		}

		public void setInputStream(BufferedInputStream inputStream) {
			this.inputStream = inputStream;
		}

		private BufferedInputStream inputStream;

		public Input(String publicId, String sysId, InputStream input) {
			this.publicId = publicId;
			systemId = sysId;
			inputStream = new BufferedInputStream(input);
		}
	}

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
		EPackage.Registry.INSTANCE.put(XhtmlPackage.eNS_URI, XhtmlPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(DatatypesPackage.eNS_URI, DatatypesPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(XMLNamespacePackage.eNS_URI, XMLNamespacePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(ConfigurationPackage.eNS_URI, ConfigurationPackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(HeadlinePackage.eNS_URI, HeadlinePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

		// TODO: me might be able to live without the last package
		EPackage.Registry.INSTANCE.put(XMLTypePackage.eNS_URI, XMLTypePackage.eINSTANCE);
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

	protected static String getWorkingDirectoryFileName() {
		return WORKING_DIRECTORY;
	}

	protected static String getWorkingFileName(String fileName) {
		return WORKING_DIRECTORY + IPath.SEPARATOR + fileName;
	}

	protected void validateAgainstSchema(String filename) throws Exception {
		final String schemaFolderName = "../org.eclipse.rmf.reqif10/schema/";
		File schemaFolder = new File(schemaFolderName);

		StreamSource[] schemaDocuments = new StreamSource[] { new StreamSource("../org.eclipse.rmf.reqif10/schema/reqif.xsd") };
		Source instanceDocument = new StreamSource(filename);

		// the resolver is required to map the schema references to the reqif sub schema files to the local locations
		LSResourceResolver resolver = new LSResourceResolver() {

			public LSInput resolveResource(String type, String namespaceURI, String publicId, String systemId, String baseURI) {

				String schemaFileName;
				if (null != systemId) {
					int slashIndex = systemId.lastIndexOf("/");
					if (-1 == slashIndex) {
						schemaFileName = systemId;
					} else if (slashIndex == systemId.length() + 1) {
						schemaFileName = null;
					} else {
						schemaFileName = systemId.substring(slashIndex);
					}
				} else {
					schemaFileName = null;
				}

				InputStream inputStream;
				try {
					inputStream = new FileInputStream(schemaFolderName + schemaFileName);
				} catch (FileNotFoundException ex) {
					return null;
				}

				return new Input(publicId, systemId, inputStream);
			}
		};

		SchemaFactory sf = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		sf.setResourceResolver(resolver);
		Schema s = sf.newSchema(schemaDocuments);
		Validator v = s.newValidator();
		v.validate(instanceDocument);

	}

	protected static void saveReqIFFile(ReqIF reqif, String fileName) throws IOException {
		ResourceSetImpl resourceSet = getResourceSet();

		URI emfURI = createEMFURI(fileName);
		Resource resource = resourceSet.createResource(emfURI);

		resource.getContents().add(reqif);
		resource.save(null);
	}

	protected static ReqIF loadReqIFFile(String fileName) throws IOException {
		return loadReqIFFile(fileName, false);
	}

	protected static ReqIF loadReqIFFile(String fileName, boolean validateOnLoad) throws IOException {
		ResourceSetImpl resourceSet = getReqIFResourceSet();

		URI emfURI = createEMFURI(fileName);
		ReqIFResourceImpl resource = (ReqIFResourceImpl) resourceSet.createResource(emfURI);
		if (validateOnLoad) {
			resource.enableSchemaValidation = true;
			resource.initDefaultOptions();
			resource.enableSchemaValidation = false;
		}
		resource.load(null);

		EList<EObject> rootObjects = resource.getContents();

		if (rootObjects.isEmpty()) {
			return null;
		} else {
			return (ReqIF) rootObjects.get(0);
		}
	}

	private static ReqIFResourceSetImpl getReqIFResourceSet() {
		ReqIFResourceSetImpl resourceSet = new ReqIFResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIFResourceFactoryImpl());
		return resourceSet;
	}

	private static ResourceSetImpl getResourceSet() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ReqIFResourceFactoryImpl());
		return resourceSet;
	}

	private static URI createEMFURI(String fileName) {
		return URI.createURI(fileName, true);
	}

	/**
	 * Creates the file name of reference test data.
	 * 
	 * The name pattern as defined by the ReqIF Implementor Forum.
	 * #TestCaseID#_E0000_S10_Reference_#yyyyMMdd#_#HHmm#
	 * #NameOfHumanCreator#.<reqif/reqifz>
	 * 
	 *
	 * @param testCaseId
	 * @return
	 */
	protected static String getReferenceDataFileName(String testCaseId, boolean isArchive) {
		return getFileName(testCaseId, 0, 10, "Reference", isArchive);
	}

	/**
	 * Creates the file name of reference test data.
	 * 
	 * The name pattern as defined by the ReqIF Implementor Forum.
	 * #TestCaseID#_E0001_S21_Reference_#yyyyMMdd#_#HHmm#
	 * #NameOfHumanCreator#.<reqif/reqifz>
	 * 
	 *
	 * @param testCaseId
	 * @return
	 */
	protected static String getFirstExportFileName(String testCaseId, boolean isArchive) {
		return getFileName(testCaseId, 1, 21, "EclipseRMF", isArchive);
	}

	/**
	 * Creates the file name according to the ReqIF Implementor Forum naming conventions.
	 * 
	 * The name pattern as defined by the ReqIF Implementor Forum.
	 * #TestCaseID#_E#NumberOfExports#_S#TestStep#_#Tool#_#yyyyMMdd#_#HHmm#_#NameOfHumanCreator#.#reqif/reqifz#
	 * 
	 *
	 * @param testCaseId
	 * @return
	 */
	private static String getFileName(String testCaseId, int numberOfExports, int testStep, String tool, boolean isArchive) {
		Date now = new Date();
		String dateString = dateFormat.format(now);
		String timeString = timeFormat.format(now);
		String creatorName = System.getProperty("user.name");
		if (null == creatorName || "".equals(creatorName)) {
			creatorName = "RMFUser";
		}
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(testCaseId);
		stringBuffer.append("_");
		stringBuffer.append("E");
		stringBuffer.append(String.format("%04d", numberOfExports));
		stringBuffer.append("_");
		stringBuffer.append("S");
		stringBuffer.append(String.format("%02d", testStep));
		stringBuffer.append("_");
		stringBuffer.append(tool);
		stringBuffer.append("_");
		stringBuffer.append(dateString);
		stringBuffer.append("_");
		stringBuffer.append(timeString);
		stringBuffer.append("_");
		stringBuffer.append(creatorName);
		stringBuffer.append(".");
		if (isArchive) {
			stringBuffer.append("reqifz");
		} else {
			stringBuffer.append("reqif");
		}
		return stringBuffer.toString();
	}

	public static List<ReqIF> loadReqIFFromZip(String zipSourceFileName) throws IOException, URISyntaxException {
		ZipFile zipSourceFile = new ZipFile(zipSourceFileName);
		List<ReqIF> reqIFs = new ArrayList<ReqIF>();
		Enumeration<? extends ZipEntry> zipFileEntries = zipSourceFile.entries();
		ReqIFResourceSetImpl resourceSet = getReqIFResourceSet();

		while (zipFileEntries.hasMoreElements()) {
			ZipEntry entry = zipFileEntries.nextElement();

			if (entry.isDirectory() || !entry.getName().endsWith(".reqif")) {
				continue;
			}

			File zipFile = new File(zipSourceFileName);
			String absoluteZipFilePath = zipFile.getAbsolutePath();

			URI uri = URI.createURI("archive:file:" + absoluteZipFilePath + "!/" + entry.getName());

			Resource resource = resourceSet.createResource(uri);
			resource.load(null);

			List<EObject> rootObjects = resource.getContents();
			if (0 < rootObjects.size()) {
				reqIFs.add((ReqIF) rootObjects.get(0));
			}

		}
		return reqIFs;
	}

	public static void saveReqIFsToZip(List<ReqIF> reqIFs, String zipFileName) throws IOException {
		ReqIFResourceSetImpl resourceSet = getReqIFResourceSet();
		for (ReqIF reqIF : reqIFs) {
			XMLResource resource = new ReqIFResourceImpl();
			resource.getContents().add(reqIF);
			resourceSet.getResources().add(resource);
		}

		int lastDotIndex = zipFileName.lastIndexOf(".");
		String entryName = zipFileName;
		if (0 < lastDotIndex) {
			entryName = zipFileName.substring(0, lastDotIndex);
		}
		int lastSlashIndex = entryName.lastIndexOf("/");
		if (0 < lastSlashIndex) {
			entryName = entryName.substring(lastSlashIndex + 1);
		}

		FileOutputStream fileOutputStream = new FileOutputStream(zipFileName);
		ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));

		for (int i = 0; i < resourceSet.getResources().size(); i++) {
			Resource resource = resourceSet.getResources().get(i);
			ZipEntry zipEntry = new ZipEntry(entryName + "_" + i + ".reqif");

			zipOutputStream.putNextEntry(zipEntry);
			resource.save(zipOutputStream, null);
		}

		zipOutputStream.close();
	}

}
