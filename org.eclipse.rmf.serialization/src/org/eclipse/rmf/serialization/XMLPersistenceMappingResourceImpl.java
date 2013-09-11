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
package org.eclipse.rmf.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;

import org.apache.xerces.impl.Constants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.rmf.internal.serialization.XMLPersistenceMappingHelperImpl;
import org.eclipse.rmf.internal.serialization.XMLPersistenceMappingLoadImpl;
import org.eclipse.rmf.internal.serialization.XMLPersistenceMappingSaveImpl;

public class XMLPersistenceMappingResourceImpl extends XMLResourceImpl implements XMLPersistenceMappingResource {
	// TODO: let implementation get the value from preferences and set it to false by default
	// This is a temporal HACK
	public boolean enableSchemaValidation = false;
	protected Collection<EPackage> createIdForPackages;

	class ResourceHandlerImpl implements ResourceHandler {

		ResourceHandlerImpl(Resource resource) {
			super();
		}

		public void preLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
			// NOP
		}

		public void postLoad(XMLResource resource, InputStream inputStream, Map<?, ?> options) {
			// NOP
		}

		public void preSave(XMLResource resource, OutputStream outputStream, Map<?, ?> options) {
			// NOP

		}

		public void postSave(XMLResource resource, OutputStream outputStream, Map<?, ?> options) {
			// NOP

		}

	}

	public XMLPersistenceMappingResourceImpl() {
		super();
		initDefaultOptions();
	}

	public XMLPersistenceMappingResourceImpl(URI uri) {
		super(uri);
		initDefaultOptions();
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMLPersistenceMappingHelperImpl(this);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new XMLPersistenceMappingLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new XMLPersistenceMappingSaveImpl(createXMLHelper());
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		super.save(options);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		EObject object = getEObjectByID(uriFragment);
		if (null == object) {
			object = super.getEObject(uriFragment);
		}
		return object;
	}

	/**
	 * Initializes the resource. Is called by the constructors of XMLResourceImpl
	 */
	@Override
	protected void init() {
		encoding = "UTF-8"; //$NON-NLS-1$
		xmlVersion = "1.0"; //$NON-NLS-1$

	}

	public void initDefaultOptions() {
		ResourceHandler resourceHandler = new ResourceHandlerImpl(this);
		// ========= default save options ===================
		Map<Object, Object> saveOptions = getDefaultSaveOptions();
		// set encoding to UTF-8
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		// get XML names and attribute/value information from extended metadata
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		// make sure to write the <?xml version="1.0" encoding="UTF-8"?> header
		saveOptions.put(XMLResource.OPTION_DECLARE_XML, Boolean.TRUE);

		saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, Boolean.FALSE);

		saveOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);

		saveOptions.put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);

		// ========= default load options ===================
		Map<Object, Object> loadOptions = getDefaultLoadOptions();
		// get XML names and attribute/value information from extended metadata
		loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		// comments and CDATA will be preserved in any mixed text processing. Required to support extensions
		loadOptions.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		// Improve deserialization performance
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
		// avoids creation of href attributes for non containment references
		loadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);

		// options for handling unknown tool extensions
		loadOptions.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.FALSE);

		// Performance enhancement
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

		loadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER, resourceHandler);

		// defer attachment of object tree created during load to end of load process.
		// this creating notifications by EContentAdapters that might be registered for the resource or resource set
		// during load
		loadOptions.put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);

		// Retrieve application-defined XMLReader features (see http://xerces.apache.org/xerces2-j/features.html for
		// available features and their details)
		Map<String, Boolean> parserFeatures = new HashMap<String, Boolean>();

		// Retrieve application-defined XMLReader properties (see http://xerces.apache.org/xerces2-j/properties.html
		// for available properties and their details)
		Map<String, Object> parserProperties = new HashMap<String, Object>();

		parserProperties.put(Constants.XERCES_PROPERTY_PREFIX + Constants.BUFFER_SIZE_PROPERTY, 1024 * 8);

		// Perform namespace processing (prefixes will be stripped off element and attribute names and replaced with the
		// corresponding namespace URIs) but do not report attributes used for namespace declarations, and do not report
		// original prefixed names
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACES_FEATURE, true);
		parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.NAMESPACE_PREFIXES_FEATURE, false);

		if (enableSchemaValidation) {
			parserFeatures.put(Constants.SAX_FEATURE_PREFIX + Constants.VALIDATION_FEATURE, true);
			parserFeatures.put(Constants.XERCES_FEATURE_PREFIX + Constants.SCHEMA_VALIDATION_FEATURE, true);
			parserProperties.put(Constants.JAXP_PROPERTY_PREFIX + Constants.SCHEMA_LANGUAGE, XMLConstants.W3C_XML_SCHEMA_NS_URI);
			parserProperties.put(Constants.XERCES_PROPERTY_PREFIX + Constants.SCHEMA_LOCATION,
					"http://www.omg.org/spec/ReqIF/20110401/reqif.xsd reqif.xsd");
		}

		loadOptions.put(XMLResource.OPTION_PARSER_FEATURES, parserFeatures);
		loadOptions.put(XMLResource.OPTION_PARSER_PROPERTIES, parserProperties);

		XMLOptions xmlOptions = new XMLOptionsImpl();

		xmlOptions.setProcessAnyXML(true);

		// xmlOptions.setProcessSchemaLocations(true);

		loadOptions.put(XMLResource.OPTION_XML_OPTIONS, xmlOptions);
	}

}
