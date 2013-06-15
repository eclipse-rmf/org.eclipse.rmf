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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.rmf.serialization.RMFExtendedMetaData;
import org.eclipse.rmf.serialization.RMFExtendedMetaDataImpl;
import org.eclipse.rmf.serialization.RMFResource;

/**
 * TODO: write down assumptions as asserts
 * 
 * @author broerkens
 */
public class RMFXMLSaveImpl extends XMLSaveImpl {
	RMFExtendedMetaData rmfExtendedMetaData = null;

	public RMFXMLSaveImpl(XMLHelper helper) {
		super(helper);
	}

	@Override
	protected void saveContainedMany(EObject o, EStructuralFeature f) {
		assert f.isMany();

		if (null != rmfExtendedMetaData && null != extendedMetaData) {
			// RMF serialization enabled
			@SuppressWarnings("unchecked")
			List<? extends InternalEObject> values = ((InternalEList<? extends InternalEObject>) helper.getValue(o, f)).basicList();
			if (null != values && !values.isEmpty()) {
				int featureSerializationStructure = rmfExtendedMetaData.getFeatureSerializationStructure(f);

				switch (featureSerializationStructure) {
				case RMFExtendedMetaData.SERIALIZATION_STRUCTURE__0000__NONE:
					saveContainment0000Many(values, f);
					break;
				case RMFExtendedMetaData.SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT:
					saveContainment1001Many(values, f);
					break;
				default:
					saveContainment1001Many(values, f);
					break;
				}

			}

		} else {
			super.saveContainedMany(o, f);
		}
	}

	protected void saveContainment0000Many(List<? extends InternalEObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		for (EObject value : values) {
			saveFeatures(value);
		}
	}

	protected void saveContainment0001Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		for (EObject value : values) {
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.startElement(getClassifierQName(value.eClass()));
		}
	}

	protected void saveContainment0010Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getClassifierQName(f.getEType()));
		for (EObject value : values) {
			saveFeatures(value);
		}
		doc.startElement(getClassifierQName(f.getEType()));
	}

	protected void saveContainment0011Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getClassifierQName(f.getEType()));
		for (EObject value : values) {
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.startElement(getClassifierQName(value.eClass()));
		}
		doc.startElement(getClassifierQName(f.getEType()));
	}

	protected void saveContainment0100Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			saveFeatures(value);
			doc.startElement(getFeatureQName(f));
		}
	}

	protected void saveContainment0101Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
		}
	}

	protected void saveContainment0110Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
		}
	}

	protected void saveContainment0111Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
			doc.endElement();
		}
	}

	protected void saveContainment1000Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			saveFeatures(value);
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1001Many(List<? extends InternalEObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			// doc.endElement();
		}
		doc.endElement();
	}

	protected void saveContainment1010Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			saveFeatures(value);
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1011Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1100Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			saveFeatures(value);
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1101Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1110Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected void saveContainment1111Many(EList<EObject> values, EStructuralFeature f) {
		assert null != values;
		assert !values.isEmpty();
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;

		doc.startElement(getFeatureWrapperQName(f));
		for (EObject value : values) {
			doc.startElement(getFeatureQName(f));
			doc.startElement(getClassifierWrapperQName(f.getEType()));
			doc.startElement(getClassifierQName(value.eClass()));
			saveFeatures(value);
			doc.endElement();
			doc.endElement();
			doc.endElement();
		}
		doc.endElement();
		// last end is written by caller
	}

	protected String getFeatureQName(EStructuralFeature eStructuralFeature) {
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;
		String featureXMLName = rmfExtendedMetaData.getXMLName(eStructuralFeature);
		EPackage ePackage = eStructuralFeature.getEContainingClass().getEPackage();
		String prefix = helper.getPrefix(ePackage);
		return getQName(prefix, featureXMLName);
	}

	protected String getFeatureWrapperQName(EStructuralFeature eStructuralFeature) {
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;
		String featureWrapperXMLName = rmfExtendedMetaData.getXMLWrapperName(eStructuralFeature);
		EPackage ePackage = eStructuralFeature.getEContainingClass().getEPackage();
		String prefix = helper.getPrefix(ePackage);
		return getQName(prefix, featureWrapperXMLName);
	}

	protected String getClassifierQName(EClassifier eClassifier) {
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;
		String classifierXMLName = rmfExtendedMetaData.getXMLName(eClassifier);
		EPackage ePackage = eClassifier.getEPackage();
		String prefix = helper.getPrefix(ePackage);
		return getQName(prefix, classifierXMLName);
	}

	protected String getClassifierWrapperQName(EClassifier eClassifier) {
		assert null != rmfExtendedMetaData;
		assert null != extendedMetaData;
		String classifierWrapperXMLName = rmfExtendedMetaData.getXMLWrapperName(eClassifier);
		EPackage ePackage = eClassifier.getEPackage();
		String prefix = helper.getPrefix(ePackage);
		return getQName(prefix, classifierWrapperXMLName);
	}

	protected String getQName(String prefix, String name) {
		if (null == prefix || 0 == prefix.length()) {
			return name;
		} else {
			return prefix + ":" + name; //$NON-NLS-1$
		}
	}

	@Override
	protected void init(XMLResource resource, Map<?, ?> options) {
		super.init(resource, options);
		Object rmfExtendedMetaDataOption = options.get(RMFResource.OPTION_RMF_EXTENDED_META_DATA);
		if (rmfExtendedMetaDataOption instanceof Boolean) {
			if (rmfExtendedMetaDataOption.equals(Boolean.TRUE)) {
				rmfExtendedMetaData = resource == null || resource.getResourceSet() == null ? RMFExtendedMetaData.INSTANCE
						: new RMFExtendedMetaDataImpl(resource.getResourceSet().getPackageRegistry());
			}
		} else {
			rmfExtendedMetaData = (RMFExtendedMetaData) options.get(RMFResource.OPTION_RMF_EXTENDED_META_DATA);
		}
	}

}
