/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 */
package org.eclipse.rmf.serialization;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.XMLConstants;

import org.apache.xerces.impl.Constants;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLOptionsImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.rmf.internal.serialization.ReqIFXMLHelperImpl;
import org.eclipse.rmf.internal.serialization.ReqIFXMLLoadImpl;
import org.eclipse.rmf.internal.serialization.ReqIFXMLSaveImpl;

public class ReqIFResourceImpl extends XMLResourceImpl {
	// TODO: let implementation get the value from preferences and set it to false by default
	// This is a temporal HACK
	public boolean enableSchemaValidation = false;

	public ReqIFResourceImpl() {
		super();
		initDefaultOptions();
	}

	public ReqIFResourceImpl(URI uri) {
		super(uri);
		initDefaultOptions();
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new ReqIFXMLHelperImpl(this);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new ReqIFXMLLoadImpl(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new ReqIFXMLSaveImpl(createXMLHelper());
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

	public void initDefaultOptions() {
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

		// ========= default load options ===================
		Map<Object, Object> loadOptions = getDefaultLoadOptions();
		// get XML names and attribute/value information from extended metadata
		loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		// TODO: why do we need this setting?
		loadOptions.put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
		// Use deprecated methods - the default is true. To improve deserialization performance turn this option to
		// false.
		loadOptions.put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.FALSE);
		loadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.FALSE);

		// options for handling unknown tool extensions
		loadOptions.put(XMLResource.OPTION_RECORD_ANY_TYPE_NAMESPACE_DECLARATIONS, Boolean.TRUE);
		loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);

		// Performance enhancement
		loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);

		// Retrieve application-defined XMLReader features (see http://xerces.apache.org/xerces2-j/features.html for
		// available features and their details)
		Map<String, Boolean> parserFeatures = new HashMap<String, Boolean>();

		// Retrieve application-defined XMLReader properties (see http://xerces.apache.org/xerces2-j/properties.html
		// for available properties and their details)
		Map<String, Object> parserProperties = new HashMap<String, Object>();

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

		// Sets the map used to cache the EObject identified by the value of its ID feature.
		// TODO: This is related to https://git.eclipse.org/r/#/c/8251/ and should be reviewed by Mark.
		setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

	}

}
