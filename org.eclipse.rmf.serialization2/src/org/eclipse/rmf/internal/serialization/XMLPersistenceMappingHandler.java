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
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.ClassNotFoundException;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler;
import org.eclipse.rmf.serialization.XMLPersistenceMappingExtendedMetaData;
import org.eclipse.rmf.serialization.XMLPersistenceMappingExtendedMetaDataImpl;

public class XMLPersistenceMappingHandler extends SAXXMLHandler {
	String xsiType;

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
		public static int STATE_DELEGATE_SIBLING_NEEDED = -3;

		void startElement(String namespace, String xmlName);

		void endElement(String namespace, String xmlName);

		boolean needsDelegateChild();

		boolean needsDelegateSibling();

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

		public boolean needsDelegateSibling() {
			return currentState == STATE_DELEGATE_SIBLING_NEEDED;
		}

	}

	class LoadPatternContained0001Impl extends AbstractLoadPatternImpl {
		String classifierName = null;

		public LoadPatternContained0001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				classifierName = xmlName;
				createRMFObject(anchorEObject, feature, namespace, xmlName);
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				if (xmlName.equals(classifierName)) {
					currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
					createRMFObject(anchorEObject, feature, namespace, xmlName);
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
				// this happens if there are no nested structures
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// this happens if there are nested structures
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternContained0100Impl extends AbstractLoadPatternImpl {
		String featureName;

		public LoadPatternContained0100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				featureName = xmlName;
				// This puts the newly created eObject onto the objects stack
				createObject(anchorEObject, feature);
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				if (featureName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
					createObject(anchorEObject, feature);
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}

				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternAttribute0100Impl extends AbstractLoadPatternImpl {
		String featureName = null;;

		public LoadPatternAttribute0100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				featureName = xmlName;
				types.push(feature);
				if (!isNull()) {
					text = new StringBuffer();
				}
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				if (featureName.equals(xmlName)) {
					text = new StringBuffer(); // record all strings
					currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
					// wait to read contained text
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
				if (isNull()) {
					setFeatureValue(anchorEObject, feature, null);
				} else {
					setFeatureValue(anchorEObject, feature, text == null ? null : text.toString());
				}
				text = null;
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternAttribute1000Impl extends AbstractLoadPatternImpl {
		String featureWrapperName = null;

		public LoadPatternAttribute1000Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				featureWrapperName = xmlName;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				if (featureWrapperName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
					text = new StringBuffer(); // record all strings
					// wait to read contained text
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
				if (null == text) {
					setFeatureValue(anchorEObject, feature, null);
				} else {
					String svalues = text.toString();
					StringTokenizer st = new StringTokenizer(svalues);
					String svalue;
					while (st.hasMoreTokens()) {
						svalue = st.nextToken();
						setFeatureValue(anchorEObject, feature, svalue);
					}
				}
				text = null;
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternAttribute1100Impl extends AbstractLoadPatternImpl {
		String featureWrapperName = null;

		public LoadPatternAttribute1100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureWrapperName = xmlName;
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
				if (featureWrapperName == xmlName) {
					currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
			case STATE_DELEGATE_SIBLING_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;

			default:
				// TODO: handle error
			}
		}
	}

	class LoadPatternContained0101Impl extends AbstractLoadPatternImpl {
		String featureName = null;

		public LoadPatternContained0101Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureName = xmlName;
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
				if (featureName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_PARENT_NEEDED:
				// TODO handle error. something was wrong with delegate handshake
				break;
			case STATE_DELEGATE_SIBLING_NEEDED:
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
				// only the feature element was available => consider it as a null value;

				if (feature.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> values = (EList<EObject>) anchorEObject.eGet(feature);
					values.clear();
				} else {
					setFeatureValue(anchorEObject, feature, null);
				}
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				handleEndCreateObjectElement();
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
		String featureWrapperName = null;

		public LoadPatternContained1001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureWrapperName = xmlName;
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
				if (featureWrapperName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				// nothing todo
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
				// only the feature element was available => consider it as a null value;
				if (feature.isMany()) {
					@SuppressWarnings("unchecked")
					EList<EObject> values = (EList<EObject>) anchorEObject.eGet(feature);
					values.clear();
				} else {
					setFeatureValue(anchorEObject, feature, null);
				}
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				handleEndCreateObjectElement();
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_DELEGATE_CHILD_NEEDED:
				handleEndCreateObjectElement();
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

	class LoadPatternReferenced0100Impl extends AbstractLoadPatternImpl {
		String featureName = null;
		InternalEObject proxy;

		public LoadPatternReferenced0100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				createObject(anchorEObject, feature);
				proxy = (InternalEObject) objects.peekEObject();
				text = new StringBuffer(); // record all strings
				featureName = xmlName;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				if (featureName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
					createObject(anchorEObject, feature);
					proxy = (InternalEObject) objects.peekEObject();
					text = new StringBuffer(); // record all strings
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
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
				// TODO: Use uri converter instead
				if (null != proxy) {
					handleProxy(proxy, resourceURI.toString() + "#" + text.toString());
					objects.pop();
				}
				text = null;
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
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

	class LoadPatternReferenced1100Impl extends AbstractLoadPatternImpl {
		String featureWrapperName = null;
		EObject proxy;

		public LoadPatternReferenced1100Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureWrapperName = xmlName;
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				createObject(anchorEObject, feature);
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				// TODO handle error. no further elements expected here
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				if (featureWrapperName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				createObject(anchorEObject, feature);
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
				if (null != proxy) {
					handleProxy((InternalEObject) objects.peekEObject(), resourceURI.toString() + "#" + text.toString());
					objects.pop();
				}
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

	class LoadPatternReferenced0101Impl extends AbstractLoadPatternImpl {
		String featureName = null;
		InternalEObject proxy = null;

		public LoadPatternReferenced0101Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureName = xmlName;
				currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				proxy = (InternalEObject) createRMFObject(anchorEObject, feature, namespace, xmlName);
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				// for robustness: we allow multiple classifier elements in a feature element. a warning should be
				// created
				proxy = (InternalEObject) createRMFObject(anchorEObject, feature, namespace, xmlName);
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_END_FEATURE_ELEMENT:
				if (featureName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
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
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				// TODO: Use uri converter instead
				if (null != proxy) {
					handleProxy(proxy, resourceURI.toString() + "#" + text.toString());
					objects.pop();
				} else {
					// TODO: handle error: could not create object
				}
				text = null;
				currentState = STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				currentState = STATE_HAS_SEEN_END_FEATURE_ELEMENT;
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

	class LoadPatternReferenced1001Impl extends AbstractLoadPatternImpl {
		InternalEObject proxy = null;
		String featureWrapperName = null;

		public LoadPatternReferenced1001Impl(EObject anchorEObject, EStructuralFeature feature) {
			super(anchorEObject, feature);
		}

		public void startElement(String namespace, String xmlName) {
			switch (currentState) {
			case STATE_READY:
				featureWrapperName = xmlName;
				currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				break;
			case STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT:
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				proxy = (InternalEObject) createRMFObject(anchorEObject, feature, namespace, xmlName);
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				currentState = STATE_DELEGATE_CHILD_NEEDED;
				break;
			case STATE_HAS_SEEN_END_CLASSIFIER_ELEMENT:
				// for robustness: we allow multiple classiefier elements in a feature element. a warning should be
				// created
				currentState = STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT;
				proxy = (InternalEObject) createRMFObject(anchorEObject, feature, namespace, xmlName);
				text = new StringBuffer(); // record all strings
				break;
			case STATE_HAS_SEEN_END_FEATURE_WRAPPER_ELEMENT:
				if (featureWrapperName.equals(xmlName)) {
					currentState = STATE_HAS_SEEN_START_FEATURE_WRAPPER_ELEMENT;
				} else {
					currentState = STATE_DELEGATE_SIBLING_NEEDED;
				}
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
				currentState = STATE_DELEGATE_PARENT_NEEDED;
				break;
			case STATE_HAS_SEEN_START_CLASSIFIER_ELEMENT:
				// TODO: Use uri converter instead
				if (null != proxy) {
					objects.pop();
					handleProxy(proxy, resourceURI.toString() + "#" + text.toString());
				}

				text = null;
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

		EClassifier eClassifier = rmfExtendedMetaData.getTypeByXMLName(namespace, typeXMLName, feature);
		EFactory eFactory = rmfExtendedMetaData.getPackage(namespace).getEFactoryInstance();

		if (null != eClassifier) {
			EObject obj = createObject(eFactory, eClassifier, false);
			obj = validateCreateObjectFromFactory(eFactory, typeXMLName, obj, feature);
			if (obj != null) {
				if (contextFeature == null) {
					setFeatureValue(peekObject, feature, obj);
				} else {
					contextFeature = null;
				}
			}
			processObject(obj);
			return obj;
		} else {
			error(new ClassNotFoundException(typeXMLName, eFactory, getLocation(), getLineNumber(), getColumnNumber()));
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
		xsiType = null;

	}

	@Override
	public void characters(char[] ch, int start, int length) {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		if (null != rmfExtendedMetaData) {
			elements.pop();

			// from super.endElement()
			Object type = types.pop();

			/*
			 * if (type == OBJECT_TYPE) { if (text == null) { objects.pop(); mixedTargets.pop(); } else { EObject object
			 * = objects.popEObject(); if (mixedTargets.peek() != null && (object.eContainer() != null ||
			 * suppressDocumentRoot || recordUnknownFeature && (eObjectToExtensionMap.containsValue(object) ||
			 * ((InternalEObject) object).eDirectResource() != null))) { handleMixedText(); mixedTargets.pop(); } else {
			 * if (text.length() != 0) { handleProxy((InternalEObject) object, text.toString().trim()); }
			 * mixedTargets.pop(); text = null; } } } else if (isIDREF) { objects.pop(); mixedTargets.pop(); if (text !=
			 * null) { setValueFromId(objects.peekEObject(), (EReference) type, text.toString()); text = null; } isIDREF
			 * = false; } else if (isTextFeatureValue(type)) { EObject eObject = objects.popEObject();
			 * mixedTargets.pop(); if (eObject == null) { eObject = objects.peekEObject(); } setFeatureValue(eObject,
			 * (EStructuralFeature) type, text == null ? null : text.toString()); text = null; } if (isSimpleFeature) {
			 * types.pop(); objects.pop(); mixedTargets.pop(); isSimpleFeature = false; }
			 */
			helper.popContext(prefixesToFactories);

			// end from super.endElement

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
			// TODO: why do we need the prefix indirection?
			String namespace = helper.getNamespaceURI(prefix);
			LoadPattern activeDeserializationRule = deserializationRuleStack.peek();
			if (null == activeDeserializationRule) {
				activeDeserializationRule = getLoadPattern(peekObject, prefix, name);
				if (null != activeDeserializationRule) {
					deserializationRuleStack.push(activeDeserializationRule);
				} else {
					// TODO: handle error
					System.out.println("Could not find deserialization rule for " + prefix + ":" + name + " in context of "
							+ peekObject.eClass().getName());
				}
			}

			if (null != activeDeserializationRule) {
				// TODO: use prefix instead of namespace
				activeDeserializationRule.startElement(namespace, name);
				if (activeDeserializationRule.needsDelegateChild()) {
					activeDeserializationRule = getLoadPattern(peekObject, prefix, name);
					if (null != activeDeserializationRule) {
						deserializationRuleStack.push(activeDeserializationRule);
						activeDeserializationRule.startElement(namespace, name);
					} else {
						System.out.println("could not find load pattern for " + name + " in context of " + peekObject.eClass().getName());
					}
				} else if (activeDeserializationRule.needsDelegateSibling()) {
					activeDeserializationRule = getLoadPattern(peekObject, prefix, name);
					if (null != activeDeserializationRule) {
						deserializationRuleStack.pop();
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
						// child object is put on top of objects stack
						// if an error occured, then types.peek is ERROR
						//
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
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__UNDEFINED:
						deserializationRule = new LoadPatternContained0100Impl(eObject, feature);
						break;
					default:
						deserializationRule = new LoadPatternContained1001Impl(eObject, feature);
						break;
					}
				} else {
					switch (featureSerializationStructure) {
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT:
						deserializationRule = new LoadPatternReferenced0100Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0101__FEATURE_ELEMENT__CLASSIFIER_ELEMENT:
						deserializationRule = new LoadPatternReferenced0101Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT:
						deserializationRule = new LoadPatternReferenced1001Impl(eObject, feature);
						break;
					case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__UNDEFINED:
						deserializationRule = new LoadPatternReferenced0100Impl(eObject, feature);
						break;
					default:
						deserializationRule = new LoadPatternReferenced1001Impl(eObject, feature);
						break;
					}
				}
			} else {
				// feature is an EAttribute
				switch (featureSerializationStructure) {
				case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT:
					deserializationRule = new LoadPatternAttribute0100Impl(eObject, feature);
					break;
				case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__1000__FEATURE_WRAPPER_ELEMENT:
					deserializationRule = new LoadPatternAttribute1000Impl(eObject, feature);
					break;
				case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__1100__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT:
					deserializationRule = new LoadPatternAttribute1100Impl(eObject, feature);
					break;
				case XMLPersistenceMappingExtendedMetaData.SERIALIZATION_STRUCTURE__UNDEFINED:
					deserializationRule = new LoadPatternAttribute0100Impl(eObject, feature);
					break;

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
		// enforce use of new methods
		useNewMethods = true;
		xsiType = null;
	}

	// TODO:
	@Override
	protected String getXSIType() {
		if (xsiType != null) {
			return xsiType;
		} else {
			return super.getXSIType();
		}
	}

	protected void handleEndCreateObjectElement() {
		if (text == null) {
			objects.pop();
			mixedTargets.pop();
		} else {
			EObject object = objects.popEObject();
			if (mixedTargets.peek() != null
					&& (object.eContainer() != null || suppressDocumentRoot || recordUnknownFeature
							&& (eObjectToExtensionMap.containsValue(object) || ((InternalEObject) object).eDirectResource() != null))) {
				handleMixedText();
				mixedTargets.pop();
			}
		}

	}

}
