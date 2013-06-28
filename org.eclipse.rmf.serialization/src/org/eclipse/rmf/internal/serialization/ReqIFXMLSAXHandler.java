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
package org.eclipse.rmf.internal.serialization;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.emf.ecore.xmi.impl.XMLHandler;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.util.Activator;
import org.eclipse.rmf.serialization.ReqIFResourceSetImpl;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ReqIFXMLSAXHandler extends SAXXMLHandler implements IReqIFSerializationConstants {
	private static final int OUT_OF_XHTML = -1;

	private SerializationStrategy serializationStrategy = SerializationStrategy.REQIF;
	private String previousElement = ""; //$NON-NLS-1$
	private int previousLevel = -1;;
	int xhtmlLevel = OUT_OF_XHTML;
	int toolExtensionsLevel = OUT_OF_XHTML;
	private String schemaURL;

	protected XMLHandler.MyStack<EStructuralFeature> deferredFeatures = new MyStack<EStructuralFeature>();

	// Used for the monitor
	private int monitorCurrentLine = 0;
	private String monitorCurrentPrefix;

	protected int level = 0;

	public ReqIFXMLSAXHandler(XMLResource xmiResource, XMLHelper helper, Map<?, ?> options) {
		super(xmiResource, helper, options);

		// TODO: find a more generic approach that contributes the schemaURL without adding dependencies to specific
		// metamodels
		schemaURL = Activator.INSTANCE.getBaseURL() + "schema/"; //$NON-NLS-1$

		IProgressMonitor monitor = getMonitor();
		if (monitor != null) {
			int lines = countLines(xmiResource);
			monitor.beginTask("Reading " + xmiResource, lines); //$NON-NLS-1$
		}
	}

	@Override
	public void reset() {
		super.reset();
		deferredFeatures.clear();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		IProgressMonitor monitor = getMonitor();
		if (monitor != null) {
			int line = getLineNumber();
			int progress = line - monitorCurrentLine;
			if (progress > 0) {
				monitor.worked(progress);
			}
			monitorCurrentLine = line;
		}

		previousLevel = level;
		level++;
		super.startElement(uri, localName, qName, attributes);
		previousElement = qName;
	}

	@Override
	protected void processElement(String name, String prefix, String localName) {
		if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			if (isRoot) {
				isRoot = false;
				recordHeaderInformation();
			}
			if (isError()) {
				types.push(ERROR_TYPE);
			} else {
				if (objects.isEmpty()) {
					// root object
					createTopObject(prefix, localName);
				} else {
					if (isFeatureExpected()) {
						handleFeature(prefix, localName);
					} else {
						if (localName.endsWith(REF)) {
							handleReference(prefix, localName.substring(0, localName.length() - 4));
						} else {
							handleObject(prefix, localName);
						}
					}
				}
			}
		} else {
			super.processElement(name, prefix, localName);
		}
	}

	@Override
	protected void createObject(EObject peekObject, EStructuralFeature feature) {
		super.createObject(peekObject, feature);

	}

	protected void handleReference(String prefix, String localName) {
		handleObject(prefix, localName);
		text = new StringBuffer(); // if text is not null, endDocument will make this object a proxy
	}

	@Override
	protected void handleProxy(InternalEObject proxy, String uriLiteral) {
		URI resourceURI = xmlResource.getURI();
		URI proxyURI;
		if (null == resourceURI) {
			// this only happens if the resource is e.g. loaded from a stream without assigning any URI
			proxyURI = URI.createURI("#" + uriLiteral); //$NON-NLS-1$
		} else {
			proxyURI = resourceURI.appendFragment(uriLiteral);
		}
		proxy.eSetProxyURI(proxyURI);
	}

	protected void handleObject(String prefix, String localName) {
		assert null != deferredFeatures.peek();
		EObject peekObject = objects.peekEObject();
		assert null != peekObject;

		EFactory eFactory = getFactoryForPrefix(prefix);

		// TODO: check why do we need to check for empty namespace prefix?
		if (eFactory == null && prefix.equals("") && helper.getURI(prefix) == null) { //$NON-NLS-1$
			// handle anonymous namespace
			EPackage ePackage = handleMissingPackage(null);
			if (ePackage == null) {
				error(new PackageNotFoundException(null, getLocation(), getLineNumber(), getColumnNumber()));
			} else {
				eFactory = ePackage.getEFactoryInstance();
			}
		}

		EObject obj = createObject(eFactory, helper.getType(eFactory, localName), false);

		// this happens if we find an element that is nested in ReqIFToolExtensions
		if (null == deferredFeatures.peek()) {
			deferredFeatures.pop();
			EStructuralFeature feature = getFeature(peekObject, obj.eClass().getEPackage().getNsPrefix(), "root", true); //$NON-NLS-1$
			deferredFeatures.push(feature);
		}

		obj = validateCreateObjectFromFactory(eFactory, localName, obj, deferredFeatures.peek());

		if (obj != null) {
			setFeatureValue(peekObject, deferredFeatures.peek(), obj);
		}

		// checking for instanceof ReqIFToolExtension doesn't work here since we would get all subclasses of
		// reqIFToolExtension as well
		// TODO: improve robustness of this algorithm
		if (obj.eClass().equals(ReqIF10Package.eINSTANCE.getReqIFToolExtension())) {
			serializationStrategy = SerializationStrategy.TOOL_EXTENSION;
			deferredFeatures.push(null);
			// mixedTargets.push((FeatureMap) obj.eGet(ReqIF10Package.eINSTANCE.getReqIFToolExtension_Any()));
			toolExtensionsLevel = level;
		}

		processObject(obj);

	}

	/**
	 * The XML element represents a feature. There are two cases to handle: 1. The feature has a type that is a
	 * datatype. 2. The feature has a type that is a class.
	 */
	@Override
	protected void handleFeature(String prefix, String name) {
		if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			EObject peekObject = objects.peekEObject();

			// This happens when processing an element with simple content that has
			// elements content even though it shouldn't.
			//
			if (peekObject == null) {
				types.push(ERROR_TYPE);
				error(new FeatureNotFoundException(name, null, getLocation(), getLineNumber(), getColumnNumber()));
				return;
			}

			EStructuralFeature feature = getFeature(peekObject, prefix, name, true);
			if (feature != null) {

				deferredFeatures.push(feature);

				int kind = helper.getFeatureKind(feature);
				if (kind == XMLHelper.DATATYPE_SINGLE || kind == XMLHelper.DATATYPE_IS_MANY) {
					objects.push(null);
					mixedTargets.push(null);
					types.push(feature);
					if (!isNull()) {
						text = new StringBuffer();
					}
				} else if (extendedMetaData != null) {
					EReference eReference = (EReference) feature;
					boolean isContainment = eReference.isContainment();
					if (!isContainment && !eReference.isResolveProxies()
							&& extendedMetaData.getFeatureKind(feature) != ExtendedMetaData.UNSPECIFIED_FEATURE) {
						isIDREF = true;
						objects.push(null);
						mixedTargets.push(null);
						types.push(feature);
						text = new StringBuffer();
					} else if (feature == ReqIF10Package.eINSTANCE.getAttributeValueXHTML_TheValue()
							|| feature == ReqIF10Package.eINSTANCE.getAttributeValueXHTML_TheOriginalValue()) {
						createObject(peekObject, feature);
						serializationStrategy = SerializationStrategy.XHTML;
						xhtmlLevel = level;
					} else {
						objects.push(peekObject);
						types.push(OBJECT_TYPE);

					}
				} else {
					assert false;
					// we assume that extended metadata is not null
				}

			} else {
				handleUnknownFeature(prefix, name, true, peekObject, null);

			}
		} else {
			super.handleFeature(prefix, name);
		}
	}

	// TODO: cleanup algorithm for hand-over between different serialization strategies
	/**
	 * Pop the appropriate stacks and set features whose values are in the content of XML elements.
	 */
	@Override
	public void endElement(String uri, String localName, String name) {
		// make sure that the feature is set if we have seen a feature element without having created an object
		if ((SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy)
				&& isEmptyFeature(uri, localName, name)) {
			// we are walking this path in order to call the elist.clear() function which explicitly sets isSet of this
			// feature to true
			setFeatureValue(objects.peek(), deferredFeatures.peek(), null, -2);
		}
		super.endElement(uri, localName, name);

		if (SerializationStrategy.TOOL_EXTENSION == serializationStrategy && level - 1 <= toolExtensionsLevel) {
			// we finished reading tool extensions
			serializationStrategy = SerializationStrategy.REQIF;
			if (isFeatureExpected()) {
				deferredFeatures.pop();
			}
		} else if (SerializationStrategy.REQIF == serializationStrategy || SerializationStrategy.TOOL_EXTENSION == serializationStrategy) {
			if (isFeatureExpected()) {
				deferredFeatures.pop();
			}
		} else if (SerializationStrategy.XHTML == serializationStrategy && level - 1 <= xhtmlLevel) {
			// we finished reading xhtml
			serializationStrategy = SerializationStrategy.REQIF;
			// required in case of empty xhtml content
			if (level - 1 < xhtmlLevel) {
				if (isFeatureExpected()) {
					deferredFeatures.pop();
				}
			}
		}
		previousLevel = level;
		level--;
		previousElement = name;

	}

	protected boolean isEmptyFeature(String uri, String localName, String name) {
		// name.equals(previousElement): two xml elements with same name followed each other
		// previousLevel + 1 == level: the xml elements belong to the same hierarchical level
		if (name.equals(previousElement) && previousLevel + 1 == level && isFeatureExpected()) {
			EStructuralFeature feature = deferredFeatures.peek();
			if (null != feature && feature instanceof EReference) {
				EReference reference = (EReference) feature;
				return reference.isContainment();
				// return false;
			}
		}
		return false;
	}

	// a feature is expected if level is even
	protected boolean isFeatureExpected() {
		if (SerializationStrategy.REQIF == serializationStrategy) {
			return level % 2 == 0 ? true : false;
		} else {
			return level % 2 == 0 ? false : true;
		}
	}

	@Override
	protected void handleObjectAttribs(EObject obj) {

		if (attribs != null) {
			InternalEObject internalEObject = (InternalEObject) obj;
			for (int i = 0, size = attribs.getLength(); i < size; ++i) {
				String name = attribs.getQName(i);
				if (name.equals(idAttribute)) {
					xmlResource.setID(internalEObject, attribs.getValue(i));
				} else if (name.equals(hrefAttribute) && (!recordUnknownFeature || types.peek() != UNKNOWN_FEATURE_TYPE || obj.eClass() != anyType)) {
					handleProxy(internalEObject, attribs.getValue(i));
				} else if (!name.startsWith(XMLResource.XML_NS) && !notFeatures.contains(name)) {
					setAttribValue(obj, name, attribs.getValue(i));
				}
			}
		}

	}

	/**
	 * Create a feature with the given name for the given object with the given values.
	 */
	@Override
	protected void setAttribValue(EObject object, String name, String value) {
		if (SerializationStrategy.REQIF != serializationStrategy && SerializationStrategy.TOOL_EXTENSION != serializationStrategy) {
			super.setAttribValue(object, name, value);
		} else {
			int index = name.indexOf(':', 0);

			// is considered to have the null target namespace...
			// TODO: make sure that we correctly handle the null namespace case
			String prefix = null;
			String localName = name;
			if (index != -1) {
				prefix = name.substring(0, index);
				localName = name.substring(index + 1);
			}
			EStructuralFeature feature = getFeature(object, prefix, localName, false);
			if (feature == null) {
				handleUnknownFeature(prefix, localName, false, object, value);
			} else {
				int kind = helper.getFeatureKind(feature);

				if (kind == XMLHelper.DATATYPE_SINGLE || kind == XMLHelper.DATATYPE_IS_MANY) {
					setFeatureValue(object, feature, value, -2);
				} else {
					setValueFromId(object, (EReference) feature, value);
				}
			}
		}
	}

	/**
	 * Overridden to update the monitor.
	 */
	@Override
	protected EFactory getFactoryForPrefix(String prefix) {
		IProgressMonitor monitor = getMonitor();
		if (monitor != null && prefix != null && !prefix.equals(monitorCurrentPrefix)) {
			monitor.setTaskName("Processing namespace: " + helper.getURI(prefix) + "..."); //$NON-NLS-1$ //$NON-NLS-2$
			monitorCurrentPrefix = prefix;
		}
		return super.getFactoryForPrefix(prefix);
	}

	/**
	 * Attempts to get an IProgressMonitor from the ResourceSet-Options, stored in
	 * {@link ReqIFResourceSetImpl#PROGRESS_MONITOR}.
	 * 
	 * @return the monitor or null, if none.
	 */
	private IProgressMonitor getMonitor() {
		Object monitor = resourceSet.getLoadOptions().get(ReqIFResourceSetImpl.PROGRESS_MONITOR);
		if (monitor instanceof IProgressMonitor) {
			return (IProgressMonitor) monitor;
		} else {
			return null;
		}
	}

	/**
	 * Counts the number of lines in the given resource, as line count is the only useful metric provided by the SAX
	 * parser. This method is fast, so counting the lines beforehand should not slow things down.
	 * <p>
	 * If there is a problem, the method returns {@link IProgressMonitor#UNKNOWN}.
	 */
	private int countLines(XMLResource xmiResource) {
		int lines = IProgressMonitor.UNKNOWN;
		try {
			URIConverter converter = new ExtensibleURIConverterImpl();
			InputStream is = converter.createInputStream(xmiResource.getURI());
			LineNumberReader lnr = new LineNumberReader(new InputStreamReader(is));
			lnr.skip(Long.MAX_VALUE);
			lines = lnr.getLineNumber();
			lnr.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}

	/**
	 * This method is called to load referenced entities such as referenced schemas. Note: The schema location that is
	 * identified in the reqif file using the schemLocation hint is resolved by the EntityResolver that can be defined
	 * using the XMLResource.OPTION_URI_HANDLER parser property
	 */
	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws SAXException {

		InputSource inputSource = null;

		// try to find using xmlCatalogResolver
		if (null != systemId && systemId.endsWith(".xsd")) { //$NON-NLS-1$
			if (systemId.endsWith("reqif.xsd")) { //$NON-NLS-1$
				systemId = schemaURL + "reqif.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/2001/xml.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xml.xsd"; //$NON-NLS-1$
			} else if ("http://www.omg.org/spec/ReqIF/20110402/driver.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "driver.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-datatypes-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-datatypes-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-framework-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-framework-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-text-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-text-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-blkphras-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-blkphras-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-attribs-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-attribs-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-blkstruct-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-blkstruct-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-inlphras-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-inlphras-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-hypertext-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-hypertext-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-list-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-list-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-edit-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-edit-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-pres-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-pres-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-blkpres-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-blkpres-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-inlpres-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-inlpres-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-inlstyle-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-inlstyle-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-object-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-object-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-param-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-param-1.xsd"; //$NON-NLS-1$
			} else if ("http://www.w3.org/TR/xhtml-modularization/SCHEMA/xhtml-table-1.xsd".equals(systemId)) { //$NON-NLS-1$
				systemId = schemaURL + "xhtml-table-1.xsd"; //$NON-NLS-1$
			}
		}

		inputSource = super.resolveEntity(publicId, systemId);

		return inputSource;
	}

}
