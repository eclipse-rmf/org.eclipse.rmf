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

package org.eclipse.rmf.internal.serialization;

import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.rmf.serialization.XMLPersistenceMappingExtendedMetaData;
import org.eclipse.rmf.serialization.XMLPersistenceMappingExtendedMetaDataImpl;

public class XMLPersistenceMappingHandler extends SAXXMLHandler {
	interface LoadPattern {
		public static int STATE_READY = 0;
		public static int STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT = 1;
		public static int STATE_HAS_SEEN_START_FEATURE_ELEMENT = 2;
		public static int STATE_HAS_SEEN_START_CLASSIFIER_WRAPPER_ELEMENT = 3;
		public static int STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT = 4;
		public static int STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT = 5;
		public static int STATE_HAS_SEEN_END_FEATURE_ELEMENT = 6;
		public static int STATE_HAS_SEEN_END_CLASSIFIER_WRAPPER_ELEMENT = 7;
		public static int STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT = 8;
		public static int STATE_DELEGATE_CHILD_NEEDED = -1;
		public static int STATE_DELEGATE_PARENT_NEEDED = -2;

		void startElement(String namespace, String xmlName);

		void endElement(String namespace, String xmlName);

		boolean needsDelegateChild();

		boolean needsDelegateParent();

	}

	abstract class AbstractLoadPatternImpl implements LoadPattern {
		final EObject anchorEObject;
		final EStructuralFeature feature;
		int currentState;

		public AbstractLoadPatternImpl(EObject anchorEObject, EStructuralFeature feature) {
			this.anchorEObject = anchorEObject;
			this.feature = feature;
			currentState = STATE_READY;
		}

		public boolean needsDelegateChild() {
			return currentState == STATE_DELEGATE_CHILD_NEEDED;
		}

		public boolean needsDelegateParent() {
			return currentState == STATE_DELEGATE_PARENT_NEEDED;
		}

	}

	class LoadPatternContained0001Impl extends AbstractLoadPatternImpl {

		public LoadPatternContained0001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternContained0100Impl extends AbstractLoadPatternImpl {

		public LoadPatternContained0100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				createObject(anchorEObject, feature);
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				createObject(anchorEObject, feature);
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternAttribute0100Impl extends AbstractLoadPatternImpl {

		public LoadPatternAttribute0100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				// wait to read contained text
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				setFeatureValue(anchorEObject, feature, text == null ? null : text.toString());
				text = null;
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternAttribute1100Impl extends AbstractLoadPatternImpl {

		public LoadPatternAttribute1100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				setFeatureValue(anchorEObject, feature, text == null ? null : text.toString());
				text = null;
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternContained0101Impl extends AbstractLoadPatternImpl {

		public LoadPatternContained0101Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				// for robustness: we allow multiple classiefier elements in a feature element. a warning should be
				// created
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternContained1001Impl extends AbstractLoadPatternImpl {

		public LoadPatternContained1001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternReference1001Impl extends AbstractLoadPatternImpl {

		public LoadPatternReference1001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}

		public void endElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_READY;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	/**
	 * Create an object based on the given feature and attributes.
	 */
	protected EObject createRMFObject(EObject peekObject, EStructuralFeature feature, String namespace, String typeXMLName) {
		assert null != rmfExtendedMetaData;
		assert null != peekObject;
		assert null != feature;
		assert null != namespace;
		assert null != typeXMLName;

		EClassifier eClassifier = rmfExtendedMetaData.getTypeByXMLName(namespace, typeXMLName);
		if (null != eClassifier) {
			EFactory eFactory = eClassifier.getEPackage().getEFactoryInstance();
			EObject obj = helper.createObject(eFactory, eClassifier);
			setFeatureValue(peekObject, feature, obj);
			handleObjectAttribs(obj);
			processObject(obj);
			return obj;
		} else {
			// TODO: error handling
			return null;
		}
	}

	XMLPersistenceMappingExtendedMetaData rmfExtendedMetaData = null;
	MyStack<LoadPattern> deserializationRuleStack = null;

	public XMLPersistenceMappingHandler(XMLResource xmlResource, XMLHelper helper, Map<?, ?> options) {
		super(xmlResource, helper, options);
		Object extendedMetaDataOption = options.get(XMLResource.OPTION_EXTENDED_META_DATA);
		if (extendedMetaDataOption instanceof Boolean) {
			if (extendedMetaDataOption.equals(Boolean.TRUE)) {
				rmfExtendedMetaData = xmlResource == null || xmlResource.getResourceSet() == null ? XMLPersistenceMappingExtendedMetaData.INSTANCE
						: new XMLPersistenceMappingExtendedMetaDataImpl(xmlResource.getResourceSet().getPackageRegistry());
				extendedMetaData = rmfExtendedMetaData;
			}
		} else if (extendedMetaDataOption instanceof XMLPersistenceMappingExtendedMetaData) {
			rmfExtendedMetaData = (XMLPersistenceMappingExtendedMetaData) options.get(XMLResource.OPTION_EXTENDED_META_DATA);
			extendedMetaData = rmfExtendedMetaData;
		}

		deserializationRuleStack = new MyStack<LoadPattern>();

	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		if (null != rmfExtendedMetaData) {
			LoadPattern activeDeserializationRule = deserializationRuleStack.peek();
			if (null != activeDeserializationRule) {
				activeDeserializationRule.endElement(uri, localName);
				if (activeDeserializationRule.needsDelegateParent()) {
					deserializationRuleStack.pop();
					activeDeserializationRule = deserializationRuleStack.peek();
					if (null != activeDeserializationRule) {
						// this happens if we return to the root object
						activeDeserializationRule.endElement(uri, localName);
					}
				}
			}
		} else {
			super.endElement(uri, localName, qName);
		}
	}

	/**
	 * The XML element represents a feature. There are two cases to handle: 1. The feature has a type that is a
	 * datatype. 2. The feature has a type that is a class.
	 */
	@Override
	protected void handleFeature(String prefix, String name) {
		assert useNewMethods == true;
		EObject peekObject = objects.peekEObject();

		// This happens when processing an element with simple content that has elements content even though it
		// shouldn't.
		//
		if (peekObject == null) {
			types.push(ERROR_TYPE);
			error(new FeatureNotFoundException(name, null, getLocation(), getLineNumber(), getColumnNumber()));
			return;
		}

		if (null != rmfExtendedMetaData) {
			// why do we need the prefix indirection?
			String namespace = helper.getNamespaceURI(prefix);
			LoadPattern activeDeserializationRule = deserializationRuleStack.peek();
			if (null == activeDeserializationRule) {
				activeDeserializationRule = getLoadPattern(peekObject, prefix, name);
				if (null != activeDeserializationRule) {
					deserializationRuleStack.push(activeDeserializationRule);
				} else {
					// TODO: handle error
				}
			}

			if (null != activeDeserializationRule) {
				activeDeserializationRule.startElement(namespace, name);
				if (activeDeserializationRule.needsDelegateChild()) {
					activeDeserializationRule = getLoadPattern(peekObject, prefix, name);
					if (null != activeDeserializationRule) {
						deserializationRuleStack.push(activeDeserializationRule);
						activeDeserializationRule.startElement(namespace, name);
					} else {
						// TODO: handle error
					}
				}

			}

		} else {
			EStructuralFeature feature = getFeature(peekObject, prefix, name, true);
			if (feature != null) {
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
					} else {
						createObject(peekObject, feature);
						EObject childObject = objects.peekEObject();
						if (childObject != null) {
							if (isContainment) {
								EStructuralFeature simpleFeature = extendedMetaData.getSimpleFeature(childObject.eClass());
								if (simpleFeature != null) {
									isSimpleFeature = true;
									isIDREF = simpleFeature instanceof EReference;
									objects.push(null);
									mixedTargets.push(null);
									types.push(simpleFeature);
									text = new StringBuffer();
								}
							} else if (!childObject.eIsProxy()) {
								text = new StringBuffer();
							}
						}
					}
				} else {
					createObject(peekObject, feature);
				}
			} else {
				// Try to get a general-content feature.
				// Use a pattern that's not possible any other way.
				//
				if (xmlMap != null && (feature = getFeature(peekObject, null, "", true)) != null) { //$NON-NLS-1$

					EFactory eFactory = getFactoryForPrefix(prefix);

					// This is for the case for a local unqualified element that has been bound.
					//
					if (eFactory == null) {
						eFactory = feature.getEContainingClass().getEPackage().getEFactoryInstance();
					}

					EObject newObject = null;
					newObject = createObject(eFactory, helper.getType(eFactory, name), false);
					newObject = validateCreateObjectFromFactory(eFactory, name, newObject, feature);
					if (newObject != null) {
						setFeatureValue(peekObject, feature, newObject);
					}
					processObject(newObject);
				} else {
					// This handles the case of a substitution group.
					//
					if (xmlMap != null) {
						EFactory eFactory = getFactoryForPrefix(prefix);
						EObject newObject = createObjectFromFactory(eFactory, name);
						validateCreateObjectFromFactory(eFactory, name, newObject);
						if (newObject != null) {
							for (EReference eReference : peekObject.eClass().getEAllReferences()) {
								if (eReference.getEType().isInstance(newObject)) {
									setFeatureValue(peekObject, eReference, newObject);
									processObject(newObject);
									return;
								}
							}
						}
					}

					handleUnknownFeature(prefix, name, true, peekObject, null);
				}
			}
		}
	}

	protected LoadPattern getLoadPattern(EObject eObject, String prefix, String name) {
		assert null != rmfExtendedMetaData;

		LoadPattern deserializationRule = null;

		EStructuralFeature feature = getFeature(eObject, prefix, name, true);
		if (null != feature) {
			int featureSerializationStructure = rmfExtendedMetaData.getFeatureSerializationStructure(feature);
			if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (reference.isContainment()) {
					switch (featureSerializationStructure) {
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0001__CLASSIFIER_ELEMENT:
						deserializationRule = new LoadPatternContained0001Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT:
						deserializationRule = new LoadPatternContained0100Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0101__FEATURE_ELEMENT__CLASSIFIER_ELEMENT:
						deserializationRule = new LoadPatternContained0101Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT:
						deserializationRule = new LoadPatternContained1001Impl(eObject, feature);
						break;
					default:
						deserializationRule = new LoadPatternContained1001Impl(eObject, feature);
						break;
					}
				} else {
					switch (featureSerializationStructure) {
					default:
						deserializationRule = new LoadPatternReference1001Impl(eObject, feature);
						break;
					}
				}
			} else {
				// feature is an EAttribute
				switch (featureSerializationStructure) {
				default:
					deserializationRule = new LoadPatternAttribute0100Impl(eObject, feature);
					break;
				}

			}
		} else {
			// handle error, feature not found
		}

		return deserializationRule;

	}

	@Override
	protected EStructuralFeature getFeature(EObject object, String prefix, String name, boolean isElement) {
		assert null != object;
		assert null != prefix;
		assert null != name;
		EStructuralFeature result = null;
		if (isElement && null != rmfExtendedMetaData) {
			String namespace = helper.getNamespaceURI(prefix);
			result = rmfExtendedMetaData.getFeatureByXMLElementName(object.eClass(), namespace, name);
		} else {
			result = super.getFeature(object, prefix, name, isElement);
		}
		return result;
	}

	@Override
	public void reset() {
		super.reset();
		deserializationRuleStack = null;
	};

	@Override
	public void prepare(XMLResource resource, XMLHelper helper, Map<?, ?> options) {
		super.prepare(resource, helper, options);
		deserializationRuleStack = new MyStack<LoadPattern>();
	}

}
