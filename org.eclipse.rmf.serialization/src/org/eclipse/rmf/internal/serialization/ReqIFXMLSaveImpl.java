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
package org.eclipse.rmf.internal.serialization;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.XhtmlContent;

/**
 * TODO: write down assumptions as asserts
 * 
 * @author broerkens
 */
public class ReqIFXMLSaveImpl extends XMLSaveImpl implements IReqIFSerializationConstants {
	private static final String EMPTY_URI = ""; //$NON-NLS-1$

	private SerializationStrategy serializationStrategy = SerializationStrategy.REQIF;

	public ReqIFXMLSaveImpl(XMLHelper xmlHelper) {
		super(xmlHelper);
	}

	/**
	 * write the role wrapper
	 */
	@Override
	protected void saveContainedSingle(EObject o, EStructuralFeature f) {
		if (SerializationStrategy.REQIF != serializationStrategy) {
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
		if (SerializationStrategy.REQIF == serializationStrategy) {
			boolean isReqIFToolExtensionFeature = o instanceof ReqIF && ReqIF10Package.REQ_IF__TOOL_EXTENSIONS == f.getFeatureID();
			if (!toDOM) {
				String name = helper.getQName(f);
				doc.startElement(name);
				if (isReqIFToolExtensionFeature) {
					serializationStrategy = SerializationStrategy.TOOL_EXTENSION_IGNORE_ELEMENT;
					String typeName = helper.getQName(ReqIF10Package.eINSTANCE.getReqIFToolExtension());
					doc.startElement(typeName);
				}
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}

			super.saveContainedMany(o, f);

			if (!toDOM) {
				if (isReqIFToolExtensionFeature) {
					doc.endElement();
					serializationStrategy = SerializationStrategy.REQIF;
				}
				doc.endElement();
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}

		} else {
			super.saveContainedMany(o, f);
		}

	}

	/**
	 * avoid writing xsi:type. write XML element name instead
	 */
	@Override
	protected void saveElement(EObject o, EStructuralFeature f) {
		if (SerializationStrategy.REQIF == serializationStrategy) {
			if (o instanceof XhtmlContent) {
				serializationStrategy = SerializationStrategy.XHTML;
				XhtmlContent xhtmlContent = (XhtmlContent) o;
				for (EReference reference : xhtmlContent.eClass().getEAllReferences()) {
					if (xhtmlContent.eIsSet(reference)) {
						super.saveContainedSingle(xhtmlContent, reference);
					}
				}
				serializationStrategy = SerializationStrategy.REQIF;
			} else {

				EClass eClass = o.eClass();

				if (!toDOM) {
					String featureName = helper.getQName(eClass);
					doc.startElement(featureName);
				} else {
					helper.populateNameInfo(nameInfo, eClass);
					if (currentNode == null) {
						// this is a root element
						currentNode = document.createElementNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName());
						document.appendChild(currentNode);
						handler.recordValues(currentNode, o.eContainer(), f, o);
					} else {
						currentNode = currentNode.appendChild(document.createElementNS(nameInfo.getNamespaceURI(), nameInfo.getQualifiedName()));
						handler.recordValues(currentNode, o.eContainer(), f, o);
					}
				}

				saveElementID(o);

			}
		} else if (SerializationStrategy.TOOL_EXTENSION_IGNORE_ELEMENT == serializationStrategy) {
			serializationStrategy = SerializationStrategy.REQIF;
			super.writeTopObject(o);
		} else {
			super.saveElement(o, f);
		}
	}

	/**
	 * avoid saving nil values
	 */
	@Override
	protected void saveNil(EStructuralFeature f) {
		// intentionally do nothing here
	}

	@Override
	protected void saveElementReferenceSingle(EObject o, EStructuralFeature f) {
		if (SerializationStrategy.REQIF != serializationStrategy) {
			super.saveElementReferenceMany(o, f);
		} else {
			EObject value = (EObject) helper.getValue(o, f);
			if (value != null) {
				if (!toDOM) {
					doc.startElement(helper.getQName(f));
					saveElementReference(value, f);
					doc.endElement();
				} else {
					// TODO
					throw new UnsupportedOperationException();
				}
			}
		}
	}

	@Override
	protected void saveElementReferenceMany(EObject o, EStructuralFeature f) {
		if (SerializationStrategy.REQIF != serializationStrategy) {
			super.saveElementReferenceMany(o, f);
		} else {
			@SuppressWarnings("unchecked")
			InternalEList<? extends EObject> values = (InternalEList<? extends EObject>) helper.getValue(o, f);
			int size = values.size();

			if (!toDOM) {
				doc.startElement(helper.getQName(f));
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}

			for (int i = 0; i < size; i++) {
				saveElementReference(values.basicGet(i), f);
			}

			if (!toDOM) {
				doc.endElement();
			} else {
				// TODO
				throw new UnsupportedOperationException();
			}
		}

	}

	@Override
	protected void saveElementReference(EObject remote, EStructuralFeature f) {
		if (SerializationStrategy.REQIF != serializationStrategy) {
			super.saveElementReference(remote, f);
		} else {
			String href = helper.getHREF(remote);
			if (href != null) {
				href = convertURI(href);
				EClass eClass = remote.eClass();

				if (!toDOM) {
					doc.startElement(helper.getQName(eClass) + REF);
				} else {
					// TODO
					throw new UnsupportedOperationException();
				}

				if (!toDOM) {
					doc.endContentElement(href);
				} else {
					// TODO
					throw new UnsupportedOperationException();
				}
			}
		}
	}
}
