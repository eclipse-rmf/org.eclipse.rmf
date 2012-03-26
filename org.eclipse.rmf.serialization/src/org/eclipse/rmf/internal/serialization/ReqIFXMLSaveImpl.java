/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Bršrkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.internal.serialization;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.rmf.reqif10.XhtmlContent;

/**
 * TODO: write down assumptions as asserts
 * 
 * @author broerkens
 * 
 */

public class ReqIFXMLSaveImpl extends XMLSaveImpl {
	boolean reqIfFormat = true;

	public ReqIFXMLSaveImpl(XMLHelper xmlHelper) {
		super(xmlHelper);
	}

	/**
	 * write the role wrapper
	 */
	@Override
	protected void saveContainedSingle(EObject o, EStructuralFeature f) {
		if (!reqIfFormat) {
			super.saveContainedSingle(o, f);
		} else {
			if (!toDOM) {
				String name = helper.getQName(f);
				doc.startElement(name);
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}

			super.saveContainedSingle(o, f);

			if (!toDOM) {
				doc.endElement();
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}
		}
	}

	/**
	 * write the role wrapper
	 */
	@Override
	protected void saveContainedMany(EObject o, EStructuralFeature f) {
		if (!reqIfFormat) {
			super.saveContainedMany(o, f);
		} else {
			if (!toDOM) {
				String name = helper.getQName(f);
				doc.startElement(name);
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}

			super.saveContainedMany(o, f);

			if (!toDOM) {
				doc.endElement();
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}
		}

	}

	/**
	 * avoid writing xsi:type. write XML element name instead
	 */
	protected void saveElement(EObject o, EStructuralFeature f) {
		if (!reqIfFormat) {
			super.saveElement(o,f);
		} else {
		if (o instanceof XhtmlContent) {
			reqIfFormat = false;
			XhtmlContent xhtmlContent = (XhtmlContent) o;
			for (EReference reference : xhtmlContent.eClass()
					.getEAllReferences()) {
				if (xhtmlContent.eIsSet(reference)) {
					super.saveContainedSingle(xhtmlContent, reference);
				}
			}
			reqIfFormat = true;
		} else {

			EClass eClass = o.eClass();

			if (map != null) {
				XMLResource.XMLInfo info = map.getInfo(eClass);
				if (info != null
						&& info.getXMLRepresentation() == XMLResource.XMLInfo.ELEMENT) {
					if (!toDOM) {
						String elementName = helper.getQName(eClass);
						doc.startElement(elementName);
					} else {
						helper.populateNameInfo(nameInfo, eClass);
						if (currentNode == null) {
							currentNode = document.createElementNS(
									nameInfo.getNamespaceURI(),
									nameInfo.getQualifiedName());
							document.appendChild(currentNode);
							handler.recordValues(currentNode, o.eContainer(),
									f, o);
						} else {
							currentNode = currentNode.appendChild(document
									.createElementNS(
											nameInfo.getNamespaceURI(),
											nameInfo.getQualifiedName()));
							handler.recordValues(currentNode, o.eContainer(),
									f, o);
						}
					}
					saveElementID(o);
					return;
				}
			}
			boolean isAnyType = false;
			if (o instanceof AnyType) {
				isAnyType = true;
				helper.pushContext();
				for (FeatureMap.Entry entry : ((AnyType) o).getAnyAttribute()) {
					if (ExtendedMetaData.XMLNS_URI.equals(extendedMetaData
							.getNamespace(entry.getEStructuralFeature()))) {
						String uri = (String) entry.getValue();
						helper.addPrefix(extendedMetaData.getName(entry
								.getEStructuralFeature()), uri == null ? ""
								: uri);
					}
				}
			}

			if (!toDOM) {
				String featureName = helper.getQName(eClass);
				doc.startElement(featureName);
			} else {
				helper.populateNameInfo(nameInfo, eClass);
				if (currentNode == null) {
					// this is a root element
					currentNode = document.createElementNS(
							nameInfo.getNamespaceURI(),
							nameInfo.getQualifiedName());
					document.appendChild(currentNode);
					handler.recordValues(currentNode, o.eContainer(), f, o);
				} else {
					currentNode = currentNode.appendChild(document
							.createElementNS(nameInfo.getNamespaceURI(),
									nameInfo.getQualifiedName()));
					handler.recordValues(currentNode, o.eContainer(), f, o);
				}
			}

			saveElementID(o);
			if (isAnyType) {
				helper.popContext();
			}
		}
		}
	}

	/**
	 * avoid saving nil values
	 */
	@Override
	protected void saveNil(EStructuralFeature f) {
		// intentionally do nothing here
	}

	protected void saveElementReference(EObject remote, EStructuralFeature f) {
		if (!reqIfFormat) {
			super.saveElementReference(remote, f);
		} else {
			String href = helper.getHREF(remote);
			if (href != null) {
				href = convertURI(href);
				EClass eClass = remote.eClass();

				if (!toDOM) {
					doc.startElement(helper.getQName(f));
					doc.startElement(helper.getQName(eClass) + "-REF");
				} else {
					// TODO
					throw new UnsupportedOperationException();
				}

				if (!toDOM) {
					doc.endContentElement(href);
					doc.endElement();
				} else {
					// TODO
					throw new UnsupportedOperationException();
				}
			}
		}
	}
}
