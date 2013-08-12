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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;

public class XMLPersistenceMappingExtendedMetaDataImpl extends BasicExtendedMetaData implements XMLPersistenceMappingExtendedMetaData {
	static final String WRAPPER_NAME = "wrapperName"; //$NON-NLS-1$
	static final String CLASSIFIER_NAME_SUFFIX = "classifierNameSuffix"; //$NON-NLS-1$

	static final String FEATURE_WRAPPER_ELEMENT = "featureWrapperElement"; //$NON-NLS-1$
	static final String FEATURE_ELEMENT = "featureElement"; //$NON-NLS-1$
	static final String CLASSIFIER_WRAPPER_ELEMENT = "classifierWrapperElement"; //$NON-NLS-1$
	static final String CLASSIFIER_ELEMENT = "classifierElement"; //$NON-NLS-1$

	static final int FEATURE_WRAPPER_ELEMENT_MASK = 8;
	static final int FEATURE_ELEMENT_MASK = 4;
	static final int CLASSIFIER_WRAPPER_ELEMENT_MASK = 2;
	static final int CLASSIFIER_ELEMENT_MASK = 1;

	protected EPackage.Registry registry;

	protected int[] fallbackSerializationConfiguration = {
			SERIALIZATION_STRUCTURE__0000__NONE /* 0000 */,
			// SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0001 */,
			SERIALIZATION_STRUCTURE__0001__CLASSIFIER_ELEMENT /* 0001 */,
			// SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0010 */,
			SERIALIZATION_STRUCTURE__0010__CLASSIFIER_WRAPPER_ELEMENT /* 0010 */,
			// SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0011 */,
			SERIALIZATION_STRUCTURE__0011__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0011 */,
			SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT /* 0100 */,
			SERIALIZATION_STRUCTURE__0101__FEATURE_ELEMENT__CLASSIFIER_ELEMENT/* 0101 */,
			// SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0110 */,
			SERIALIZATION_STRUCTURE__0110__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT/* 0110 */,
			// SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0111 */,
			SERIALIZATION_STRUCTURE__0111__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT /* 0111 */,
			SERIALIZATION_STRUCTURE__1000__FEATURE_WRAPPER_ELEMENT /* 1000 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1001 */,
			SERIALIZATION_STRUCTURE__1010__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT/* 1010 */,
			SERIALIZATION_STRUCTURE__1011__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1011 */,
			SERIALIZATION_STRUCTURE__1100__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT/* 1100_ */,
			SERIALIZATION_STRUCTURE__1101__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_ELEMENT /* 1101 */,
			SERIALIZATION_STRUCTURE__1110__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT/* 1110 */,
			SERIALIZATION_STRUCTURE__1111__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT /* 1111 */
	};

	static final String PLURAL_EXTENSION = "s"; //$NON-NLS-1$

	protected Map<EModelElement, Object> extendedMetaDataCache = new HashMap<EModelElement, Object>();
	protected Map<EModelElement, EAnnotation> annotationCache = new HashMap<EModelElement, EAnnotation>();

	public static interface XMLPersistenceMappingEPackageExtendedMetaData {
		EClassifier getType(String name);

		EClassifier getType(String name, EStructuralFeature feature);

		EClassifier getTypeByWrapperName(String wrapperName);

		void renameToXMLName(EClassifier eClassifier, String newName);

		void renameToXMLWrapperName(EClassifier eClassifier, String newName);
	}

	public class XMLPersistenceMappingEPackageExtendedMetaDataImpl implements XMLPersistenceMappingEPackageExtendedMetaData {
		protected EPackage ePackage;
		protected boolean isInitialized;
		protected boolean isQualified;
		protected Map<String, EClassifier> xmlNameToClassifierMap = new HashMap<String, EClassifier>();
		protected Map<String, EClassifier> xmlWrapperNameToClassifierMap = new HashMap<String, EClassifier>();

		public XMLPersistenceMappingEPackageExtendedMetaDataImpl(EPackage ePackage) {
			this.ePackage = ePackage;
		}

		public EClassifier getType(String name) {
			EClassifier result = null;
			if (xmlNameToClassifierMap != null) {
				result = xmlNameToClassifierMap.get(name);
			}
			if (result == null) {
				List<EClassifier> eClassifiers = ePackage.getEClassifiers();
				int size = eClassifiers.size();
				if (xmlNameToClassifierMap == null || xmlNameToClassifierMap.size() != size) {
					Map<String, EClassifier> nameToClassifierMap = new HashMap<String, EClassifier>();
					if (xmlNameToClassifierMap != null) {
						nameToClassifierMap.putAll(xmlNameToClassifierMap);
					}

					// For demand created created packages we allow the list of classifiers to grow
					// so this should handle those additional instances.
					//
					int originalMapSize = nameToClassifierMap.size();
					for (int i = originalMapSize; i < size; ++i) {
						EClassifier eClassifier = eClassifiers.get(i);
						String eClassifierName = getXMLName(eClassifier);
						EClassifier conflictingEClassifier = nameToClassifierMap.put(eClassifierName, eClassifier);
						if (conflictingEClassifier != null && conflictingEClassifier != eClassifier) {
							nameToClassifierMap.put(eClassifierName, conflictingEClassifier);
						}
					}

					if (nameToClassifierMap.size() != size) {
						for (int i = 0; i < originalMapSize; ++i) {
							EClassifier eClassifier = eClassifiers.get(i);
							String eClassifierName = getXMLName(eClassifier);
							EClassifier conflictingEClassifier = nameToClassifierMap.put(eClassifierName, eClassifier);
							if (conflictingEClassifier != null && conflictingEClassifier != eClassifier) {
								nameToClassifierMap.put(eClassifierName, conflictingEClassifier);
							}
						}
					}
					result = nameToClassifierMap.get(name);
					xmlNameToClassifierMap = nameToClassifierMap;
				}
			}

			return result;
		}

		public EClassifier getType(String name, EStructuralFeature feature) {
			// TODO optimize implementation for performance
			String classifierNameSuffix = getXMLPersistenceMappingExtendedMetaData(feature).getXMLClassiferNameSuffix();
			EClassifier classifier;
			int classifierNameSuffixLength = classifierNameSuffix.length();
			if (0 == classifierNameSuffixLength) {
				classifier = getType(name);
			} else {
				if (name.endsWith(classifierNameSuffix)) {
					String classfierName = name.substring(0, name.length() - classifierNameSuffixLength);
					classifier = getType(classfierName);
				} else {
					classifier = null;
				}
			}

			return classifier;
		}

		public EClassifier getTypeByWrapperName(String name) {
			EClassifier result = null;
			if (xmlWrapperNameToClassifierMap != null) {
				result = xmlWrapperNameToClassifierMap.get(name);
			}
			if (result == null) {
				List<EClassifier> eClassifiers = ePackage.getEClassifiers();
				int size = eClassifiers.size();
				if (xmlWrapperNameToClassifierMap == null || xmlWrapperNameToClassifierMap.size() != size) {
					Map<String, EClassifier> wrapperNameToClassifierMap = new HashMap<String, EClassifier>();
					if (xmlWrapperNameToClassifierMap != null) {
						wrapperNameToClassifierMap.putAll(xmlWrapperNameToClassifierMap);
					}

					// For demand created created packages we allow the list of classifiers to grow
					// so this should handle those additional instances.
					//
					int originalMapSize = wrapperNameToClassifierMap.size();
					for (int i = originalMapSize; i < size; ++i) {
						EClassifier eClassifier = eClassifiers.get(i);
						String eClassifierWrapperName = getXMLWrapperName(eClassifier);
						EClassifier conflictingEClassifier = wrapperNameToClassifierMap.put(eClassifierWrapperName, eClassifier);
						if (conflictingEClassifier != null && conflictingEClassifier != eClassifier) {
							wrapperNameToClassifierMap.put(eClassifierWrapperName, conflictingEClassifier);
						}
					}

					if (wrapperNameToClassifierMap.size() != size) {
						for (int i = 0; i < originalMapSize; ++i) {
							EClassifier eClassifier = eClassifiers.get(i);
							String eClassifierWrapperName = getXMLWrapperName(eClassifier);
							EClassifier conflictingEClassifier = wrapperNameToClassifierMap.put(eClassifierWrapperName, eClassifier);
							if (conflictingEClassifier != null && conflictingEClassifier != eClassifier) {
								wrapperNameToClassifierMap.put(eClassifierWrapperName, conflictingEClassifier);
							}
						}
					}
					result = wrapperNameToClassifierMap.get(name);
					xmlWrapperNameToClassifierMap = wrapperNameToClassifierMap;
				}
			}

			return result;
		}

		public void renameToXMLName(EClassifier eClassifier, String newName) {
			if (xmlNameToClassifierMap != null) {
				xmlNameToClassifierMap.values().remove(eClassifier);
				xmlNameToClassifierMap.put(newName, eClassifier);
			}
		}

		public void renameToXMLWrapperName(EClassifier eClassifier, String newName) {
			if (xmlWrapperNameToClassifierMap != null) {
				xmlWrapperNameToClassifierMap.values().remove(eClassifier);
				xmlWrapperNameToClassifierMap.put(newName, eClassifier);
			}
		}
	}

	public static interface XMLPersistenceMappingEClassifierExtendedMetaData {
		String getXMLName();

		void setXMLName(String name);

		String getXMLWrapperName();

		void setXMLWrapperName(String name);

		EStructuralFeature getFeatureByXMLElementName(String namespace, String xmlElementName);

	}

	class XMLPersistenceMappingEDataTypeExtendedMetaDataImpl implements XMLPersistenceMappingEClassifierExtendedMetaData {
		protected static final String UNINITIALIZED_STRING = "uninitialized"; //$NON-NLS-1$
		protected static final int UNINITIALIZED_INT = -2;

		protected EClassifier eClassifier;
		protected String xmlName = UNINITIALIZED_STRING;
		protected String xmlWrapperName = UNINITIALIZED_STRING;

		public XMLPersistenceMappingEDataTypeExtendedMetaDataImpl(EClassifier eClassifier) {
			super();
			this.eClassifier = eClassifier;
		}

		public String getXMLName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLName(basicGetName(eClassifier));
			}
			return xmlName;
		}

		public void setXMLName(String xmlName) {
			this.xmlName = xmlName;
		}

		public String getXMLWrapperName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLWrapperName(basicGetWrapperName(eClassifier));
			}
			return xmlWrapperName;
		}

		public void setXMLWrapperName(String xmlWrapperName) {
			this.xmlWrapperName = xmlWrapperName;

		}

		public EStructuralFeature getFeatureByXMLElementName(String namespace, String xmlElementName) {
			throw new UnsupportedOperationException("Can't get a feature of an EDataType"); //$NON-NLS-1$
		}
	}

	class XMLPersistenceMappingEClassExtendedMetaDataImpl implements XMLPersistenceMappingEClassifierExtendedMetaData {
		protected static final String UNINITIALIZED_STRING = "uninitialized"; //$NON-NLS-1$
		protected static final int UNINITIALIZED_INT = -2;

		protected EClass eClass;
		protected String xmlName = UNINITIALIZED_STRING;
		protected String xmlWrapperName = UNINITIALIZED_STRING;

		protected Map<String, EStructuralFeature> xmlNameToEStructuralFeatureMap = new HashMap<String, EStructuralFeature>();

		public XMLPersistenceMappingEClassExtendedMetaDataImpl(EClassifier eClassifier) {
			super();
			assert eClassifier instanceof EClass;
			eClass = (EClass) eClassifier;
		}

		public String getXMLName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLName(basicGetName(eClass));
			}
			return xmlName;
		}

		public void setXMLName(String xmlName) {
			this.xmlName = xmlName;
		}

		public String getXMLWrapperName() {
			if (UNINITIALIZED_STRING == xmlWrapperName) {
				setXMLWrapperName(basicGetWrapperName(eClass));
			}
			return xmlWrapperName;
		}

		public void setXMLWrapperName(String xmlWrapperName) {
			this.xmlWrapperName = xmlWrapperName;

		}

		/**
		 * return first EStructuralFeature that fits to the XML element name TODO: add error handling for ambiguous
		 * features
		 */
		public EStructuralFeature getFeatureByXMLElementName(String namespace, String xmlElementName) {
			// try to find the EStructural feature locally
			// TODO: consider namespace
			EStructuralFeature result = xmlNameToEStructuralFeatureMap.get(xmlElementName);
			if (null == result) {
				Iterator<EStructuralFeature> allFeaturesIter = eClass.getEAllStructuralFeatures().iterator();
				// TODO: we should iterate over features with no kind or
				List<EStructuralFeature> results = new ArrayList<EStructuralFeature>();
				EStructuralFeature possibleResult;

				while (allFeaturesIter.hasNext()) {
					EStructuralFeature feature = allFeaturesIter.next();
					possibleResult = null;
					String xmlWrapperName = getXMLPersistenceMappingExtendedMetaData(feature).getXMLWrapperName();

					// search by feature wrapper
					if (xmlWrapperName.equals(xmlElementName) && isIdentifiedByFeatureWrapper(feature)) {
						if (isIdentifiedByFeatureWrapper(feature)) {
							possibleResult = feature;
						} else {
							// not found, continue with next feature
						}
					}

					if (null == possibleResult) {
						// search by feature name
						String xmlName = getXMLPersistenceMappingExtendedMetaData(feature).getXMLName();
						if (xmlName.equals(xmlElementName)) {
							if (isIdentifiedByFeature(feature)) {
								possibleResult = feature;
							} else {
								// not found, continue with next feature
							}
						}
					}

					if (null == possibleResult) {
						// search by type wrapper (assuming type is type of feature)
						String classifierWrapperXMLName = getXMLPersistenceMappingExtendedMetaData(feature.getEType()).getXMLWrapperName();
						if (classifierWrapperXMLName.equals(xmlElementName)) {
							if (isIdentifiedByClassifierWrapper(feature)) {
								possibleResult = feature;
							} else {
								// not found, continue with next feature
							}
						} else {
							// search by type wrapper name (assuming type not type of feature)
							EClassifier classifier = getTypeByXMLWrapperName(namespace, xmlElementName);
							if (null != classifier) {
								if (feature.getEType().equals(classifier)) {
									if (isIdentifiedByClassifierWrapper(feature)) {
										possibleResult = feature;
									} else {
										// not found, continue with next feature
									}
								} else if (classifier instanceof EClass) {
									EClass eClass = (EClass) classifier;
									// check if the identified is a sub-type of the eType of the reference
									// note: EObject is not listed in EAllSuperTypes
									if (feature.getEType() == EcorePackage.eINSTANCE.getEObject()
											|| eClass.getEAllSuperTypes().contains(feature.getEType())) {
										if (isIdentifiedByClassifierWrapper(feature)) {
											possibleResult = feature;
										} else {
											// not found, continue with next feature
										}
									} else {
										// not found, continue with next feature
									}
								} else {
									// not found, continue with next feature
								}
							}
						}
					}
					if (null == possibleResult) {
						// search by type name (assuming type not type of feature)
						EClassifier classifier = getTypeByXMLName(namespace, xmlElementName);
						if (null != classifier) {
							if (feature.getEType().equals(classifier)) {
								if (isIdentifiedByClassifier(feature)) {
									possibleResult = feature;
								} else if (isEReference_Contained0000(feature)) {
									possibleResult = feature;
								} else {
									// not found, continue with next feature
								}
							} else if (classifier instanceof EClass) {
								EClass eClass = (EClass) classifier;
								// check if the identified is a sub-type of the eType of the reference
								// note: EObject is not listed in EAllSuperTypes
								if (feature.getEType() == EcorePackage.eINSTANCE.getEObject()
										|| eClass.getEAllSuperTypes().contains(feature.getEType())) {
									if (isIdentifiedByClassifier(feature)) {
										possibleResult = feature;
									} else if (isEReference_Contained0000(feature)) {
										possibleResult = feature;
									} else {
										// not found, continue with next feature
									}
								} else if (isEReference_Contained0000(feature)) {
									possibleResult = feature;
								} else {
									// not found, continue with next feature
								}
							} else if (isEReference_Contained0000(feature)) {
								possibleResult = feature;
							} else {
								// not found, continue with next feature
							}
						} else if (isEReference_Contained0000(feature)) {
							possibleResult = feature;
						} else {
							// not found, continue with next feature
						}
					}

					if (null != possibleResult) {
						results.add(possibleResult);
					}
				} // while

				// if there are multiple valid features, we prefer the feature that is many and is not NONE
				int size = results.size();
				if (1 == size) {
					result = results.get(0);
				} else if (0 < size) {
					// rule 1 we like the features that are explicitly selected
					List<EStructuralFeature> identifiedFeatures = new ArrayList<EStructuralFeature>();
					List<EStructuralFeature> noneFeatures = new ArrayList<EStructuralFeature>();
					for (int i = 0; i < size; i++) {
						EStructuralFeature feature = results.get(i);
						if (isNone(feature)) {
							noneFeatures.add(feature);
						} else {
							identifiedFeatures.add(feature);
						}
					}

					if (identifiedFeatures.isEmpty()) {
						// there are none Features only
						results = noneFeatures;
					} else {
						results = identifiedFeatures;
					}

					result = results.get(0);

					// try to find a better features that is many
					for (EStructuralFeature feature : results) {
						if (feature.isMany()) {
							result = feature;
							break;
						}
					}
				}
				xmlNameToEStructuralFeatureMap.put(xmlElementName, result);
			} // if (null == result)

			// TODO: fall back to standard serialization?

			return result;
		}
	}

	public static interface XMLPersistenceMappingEStructuralFeatureExtendedMetaData {
		String getXMLName();

		void setXMLName(String name);

		String getXMLWrapperName();

		void setXMLWrapperName(String name);

		String getXMLClassiferNameSuffix();

		void setXMLClassiferNameSuffix(String suffix);

		boolean isXMLPersistenceMappingEnabled();

		int getFeatureSerializationStructure();

		void setFeatureSerializationStructure(int featureSerializationStructure);
	}

	class XMLPersistenceMappingEStructuralFeatureExtendedMetaDataImpl implements XMLPersistenceMappingEStructuralFeatureExtendedMetaData {
		protected static final String UNINITIALIZED_STRING = "uninitialized"; //$NON-NLS-1$
		protected static final int UNINITIALIZED_INT = -2;

		protected EStructuralFeature eStructuralFeature;
		protected String xmlName = UNINITIALIZED_STRING;
		protected String xmlWrapperName = UNINITIALIZED_STRING;
		protected String xmlClassifierNameSuffix = UNINITIALIZED_STRING;
		protected int featureSerializationStructure = UNINITIALIZED_INT;
		protected Boolean xmlPersistenceMappingEnabled = null;

		public XMLPersistenceMappingEStructuralFeatureExtendedMetaDataImpl(EStructuralFeature eStructuralFeature) {
			super();
			this.eStructuralFeature = eStructuralFeature;
		}

		public String getXMLName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLName(basicGetName(eStructuralFeature));
			}
			return xmlName;
		}

		public void setXMLName(String xmlName) {
			this.xmlName = xmlName;
		}

		public String getXMLWrapperName() {
			if (UNINITIALIZED_STRING == xmlWrapperName) {
				setXMLWrapperName(basicGetWrapperName(eStructuralFeature));
			}
			return xmlWrapperName;
		}

		public void setXMLWrapperName(String xmlWrapperName) {
			this.xmlWrapperName = xmlWrapperName;
		}

		public String getXMLClassiferNameSuffix() {
			if (UNINITIALIZED_STRING == xmlClassifierNameSuffix) {
				setXMLClassiferNameSuffix(basicGetClassifierNameSuffix(eStructuralFeature));
			}
			return xmlClassifierNameSuffix;
		}

		public boolean isXMLPersistenceMappingEnabled() {
			if (null == xmlPersistenceMappingEnabled) {
				setXMLPersistenceMappingEnabled(basicIsXMLPersistenceMappingEnabled(eStructuralFeature));
			}
			return xmlPersistenceMappingEnabled;

		};

		void setXMLPersistenceMappingEnabled(Boolean xmlPersistenceMappingEnabled) {
			this.xmlPersistenceMappingEnabled = xmlPersistenceMappingEnabled;
		};

		public void setXMLClassiferNameSuffix(String suffix) {
			xmlClassifierNameSuffix = suffix;
		}

		public int getFeatureSerializationStructure() {
			if (UNINITIALIZED_INT == featureSerializationStructure) {
				setFeatureSerializationStructure(basicGetFeatureSerializationStructure(eStructuralFeature));
			}
			return featureSerializationStructure;
		}

		public void setFeatureSerializationStructure(int featureSerializationStructure) {
			this.featureSerializationStructure = featureSerializationStructure;
		}

	}

	public XMLPersistenceMappingExtendedMetaDataImpl() {
		this(EPackage.Registry.INSTANCE);
	}

	public XMLPersistenceMappingExtendedMetaDataImpl(EPackage.Registry registry) {
		super();
		this.registry = registry;
	}

	public XMLPersistenceMappingExtendedMetaDataImpl(int[] fallbackSerializations) {
		this();
		int min = 0;
		int max = fallbackSerializationConfiguration.length;
		for (int i = min; i < max && i < fallbackSerializations.length; i++) {
			int newValue = fallbackSerializations[i];
			if (min <= i && i < max) {
				fallbackSerializationConfiguration[i] = newValue;
			}
		}
	}

	public boolean isXMLPersistenceMappingEnabled(EStructuralFeature feature) {
		return null != getRMFAnnotation(feature, false);
	}

	public String getXMLName(EClassifier eClassifier) {
		return getXMLPersistenceMappingExtendedMetaData(eClassifier).getXMLName();
	}

	public String getXMLWrapperName(EClassifier eClassifier) {
		return getXMLPersistenceMappingExtendedMetaData(eClassifier).getXMLWrapperName();
	}

	public String getXMLName(EClassifier eClassifier, EStructuralFeature eStructuralFeature) {
		StringBuffer buffer = new StringBuffer();
		buffer.append(getXMLPersistenceMappingExtendedMetaData(eClassifier).getXMLName());
		buffer.append(getXMLPersistenceMappingExtendedMetaData(eStructuralFeature).getXMLClassiferNameSuffix());
		return buffer.toString();
	}

	public void setXMLWrapperName(EClassifier eClassifier, String xmlWrapperName) {
		EAnnotation eAnnotation = getRMFAnnotation(eClassifier, true);
		eAnnotation.getDetails().put(WRAPPER_NAME, xmlWrapperName);
		getXMLPersistenceMappingExtendedMetaData(eClassifier).setXMLWrapperName(xmlWrapperName);
		EPackage ePackage = eClassifier.getEPackage();
		if (ePackage != null) {
			getXMLPersistenceMappingExtendedMetaData(ePackage).renameToXMLWrapperName(eClassifier, xmlWrapperName);
		}
	}

	public String getXMLName(EStructuralFeature eStructuralFeature) {
		return getXMLPersistenceMappingExtendedMetaData(eStructuralFeature).getXMLName();
	}

	public String getXMLWrapperName(EStructuralFeature eStructuralFeature) {
		return getXMLPersistenceMappingExtendedMetaData(eStructuralFeature).getXMLWrapperName();
	}

	public void setXMLWrapperName(EStructuralFeature eStructuralFeature, String xmlWrapperName) {
		EAnnotation eAnnotation = getRMFAnnotation(eStructuralFeature, true);
		eAnnotation.getDetails().put(WRAPPER_NAME, xmlWrapperName);
		getXMLPersistenceMappingExtendedMetaData(eStructuralFeature).setXMLWrapperName(xmlWrapperName);
	}

	public int getFeatureSerializationStructure(EStructuralFeature eStructuralFeature) {
		return getXMLPersistenceMappingExtendedMetaData(eStructuralFeature).getFeatureSerializationStructure();
	}

	public void setFeatureSerializationStructure(EStructuralFeature eStructuralFeature, int serializationStructure) {
		// TODO Auto-generated method stub

	}

	public EClassifier getTypeByXMLName(String namespace, String xmlName) {
		EPackage ePackage = getPackage(namespace);
		return ePackage == null ? null : getTypeByXMLName(ePackage, xmlName);
	}

	public EClassifier getTypeByXMLName(String namespace, String xmlName, EStructuralFeature feature) {
		EPackage ePackage = getPackage(namespace);
		return ePackage == null ? null : getTypeByXMLName(ePackage, xmlName, feature);
	}

	public EClassifier getTypeByXMLWrapperName(String namespace, String xmlWrapperName) {
		EPackage ePackage = getPackage(namespace);
		return ePackage == null ? null : getTypeByXMLWrapperName(ePackage, xmlWrapperName);
	}

	public EClassifier getTypeByXMLName(EPackage ePackage, String xmlName) {
		return getXMLPersistenceMappingExtendedMetaData(ePackage).getType(xmlName);
	}

	public EClassifier getTypeByXMLName(EPackage ePackage, String xmlName, EStructuralFeature feature) {
		return getXMLPersistenceMappingExtendedMetaData(ePackage).getType(xmlName, feature);
	}

	public EClassifier getTypeByXMLWrapperName(EPackage ePackage, String xmlWrapperName) {
		return getXMLPersistenceMappingExtendedMetaData(ePackage).getTypeByWrapperName(xmlWrapperName);
	}

	@Override
	public EPackage getPackage(String namespace) {
		EPackage ePackage = registry.getEPackage(namespace);
		return ePackage;
	}

	@Override
	public EStructuralFeature getAttribute(EClass eClass, String namespace, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EStructuralFeature getFeatureByXMLElementName(EClass eClass, String namespace, String xmlElementName) {
		return getXMLPersistenceMappingExtendedMetaData(eClass).getFeatureByXMLElementName(namespace, xmlElementName);
	}

	protected boolean basicIsXMLPersistenceMappingEnabled(EStructuralFeature eStructuralFeature) {
		return null != getRMFAnnotation(eStructuralFeature, false);
	}

	protected String basicGetWrapperName(EClassifier eClassifier) {
		EAnnotation eAnnotation = getRMFAnnotation(eClassifier, false);
		String result = null;
		if (eAnnotation != null) {
			result = eAnnotation.getDetails().get(WRAPPER_NAME);
		}
		if (null == result) {
			result = basicGetName(eClassifier) + PLURAL_EXTENSION;
		}
		return result;
	}

	protected String basicGetWrapperName(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getRMFAnnotation(eStructuralFeature, false);
		String result = null;
		if (eAnnotation != null) {
			result = eAnnotation.getDetails().get(WRAPPER_NAME);
		}
		if (null == result) {
			result = basicGetName(eStructuralFeature) + PLURAL_EXTENSION;
		}
		return result;
	}

	protected String basicGetClassifierNameSuffix(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getRMFAnnotation(eStructuralFeature, false);
		String result = null;
		if (eAnnotation != null) {
			result = eAnnotation.getDetails().get(CLASSIFIER_NAME_SUFFIX);
		}
		if (null == result) {
			result = ""; //$NON-NLS-1$
		}
		return result;
	}

	/**
	 * @param eStructuralFeature
	 * @return #SERILIZATION_STRUCTURE__UNDDEFINED, if no annotation is defined
	 */
	protected int basicGetFeatureSerializationStructure(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getRMFAnnotation(eStructuralFeature, false);
		if (eAnnotation != null) {
			String featureWrapperElement = eAnnotation.getDetails().get(FEATURE_WRAPPER_ELEMENT);
			String featureElement = eAnnotation.getDetails().get(FEATURE_ELEMENT);
			String classifierWrapperElement = eAnnotation.getDetails().get(CLASSIFIER_WRAPPER_ELEMENT);
			String classifierElement = eAnnotation.getDetails().get(CLASSIFIER_ELEMENT);

			int result = 0;
			if (null == featureWrapperElement || Boolean.parseBoolean(featureWrapperElement)) {
				// if not explicitly set to false, the feature wrapper element is created
				result += FEATURE_WRAPPER_ELEMENT_MASK;
			}

			if (Boolean.parseBoolean(featureElement)) {
				// if explicitly set to true, the feature element is created
				result += FEATURE_ELEMENT_MASK;
			}

			if (Boolean.parseBoolean(classifierWrapperElement)) {
				// if explicitly set to true, the classifier wrapper element is created
				result += CLASSIFIER_WRAPPER_ELEMENT_MASK;
			}

			if (null == classifierWrapperElement || Boolean.parseBoolean(classifierElement)) {
				// if not explicitly set to false, the classifier element is created
				result += CLASSIFIER_ELEMENT_MASK;
			}

			return fallbackSerializationConfiguration[result];

		} else {
			// default to standard EMF serialization
			return SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT;
		}
	}

	protected XMLPersistenceMappingEStructuralFeatureExtendedMetaData getXMLPersistenceMappingExtendedMetaData(EStructuralFeature eStructuralFeature) {
		XMLPersistenceMappingEStructuralFeatureExtendedMetaData result = (XMLPersistenceMappingEStructuralFeatureExtendedMetaData) extendedMetaDataCache
				.get(eStructuralFeature);
		if (result == null) {
			extendedMetaDataCache.put(eStructuralFeature, result = createRMFEStructuralFeatureExtendedMetaData(eStructuralFeature));
		}
		return result;
	}

	protected XMLPersistenceMappingEClassifierExtendedMetaData getXMLPersistenceMappingExtendedMetaData(EClassifier eClassifier) {
		XMLPersistenceMappingEClassifierExtendedMetaData result = (XMLPersistenceMappingEClassifierExtendedMetaData) extendedMetaDataCache
				.get(eClassifier);
		if (result == null) {
			extendedMetaDataCache.put(eClassifier, result = createRMFEClassifierExtendedMetaData(eClassifier));
		}
		return result;
	}

	protected XMLPersistenceMappingEPackageExtendedMetaData getXMLPersistenceMappingExtendedMetaData(EPackage ePackage) {
		XMLPersistenceMappingEPackageExtendedMetaData result = (XMLPersistenceMappingEPackageExtendedMetaData) extendedMetaDataCache.get(ePackage);
		if (result == null) {
			extendedMetaDataCache.put(ePackage, result = createRMFEPackageExtendedMetaData(ePackage));
		}
		return result;
	}

	protected XMLPersistenceMappingEStructuralFeatureExtendedMetaData createRMFEStructuralFeatureExtendedMetaData(
			EStructuralFeature eStructuralFeature) {
		return new XMLPersistenceMappingEStructuralFeatureExtendedMetaDataImpl(eStructuralFeature);
	}

	protected XMLPersistenceMappingEClassifierExtendedMetaData createRMFEClassifierExtendedMetaData(EClassifier eClassifier) {
		if (eClassifier instanceof EClass) {
			return new XMLPersistenceMappingEClassExtendedMetaDataImpl(eClassifier);
		} else {
			return new XMLPersistenceMappingEDataTypeExtendedMetaDataImpl(eClassifier);
		}
	}

	protected XMLPersistenceMappingEPackageExtendedMetaData createRMFEPackageExtendedMetaData(EPackage ePackage) {
		return new XMLPersistenceMappingEPackageExtendedMetaDataImpl(ePackage);
	}

	protected EAnnotation getRMFAnnotation(EModelElement eModelElement, boolean demandCreate) {
		EAnnotation result = annotationCache.get(eModelElement);
		if (result == null) {
			result = eModelElement.getEAnnotation(XML_PERSISTENCE_MAPPING_ANNOTATION_SOURCE_URI);
		}
		if (result == null && demandCreate) {
			result = EcoreFactory.eINSTANCE.createEAnnotation();
			result.setSource(XML_PERSISTENCE_MAPPING_ANNOTATION_SOURCE_URI);
			annotationCache.put(eModelElement, result);
		}
		return result;
	}

	protected boolean isIdentifiedByFeatureWrapper(EStructuralFeature feature) {
		int featureSerializationStructure = getXMLPersistenceMappingExtendedMetaData(feature).getFeatureSerializationStructure();
		return FEATURE_WRAPPER_ELEMENT_MASK == (featureSerializationStructure & FEATURE_WRAPPER_ELEMENT_MASK);
	}

	protected boolean isIdentifiedByFeature(EStructuralFeature feature) {
		int featureSerializationStructure = getXMLPersistenceMappingExtendedMetaData(feature).getFeatureSerializationStructure();
		return FEATURE_ELEMENT_MASK == (featureSerializationStructure & (FEATURE_WRAPPER_ELEMENT_MASK | FEATURE_ELEMENT_MASK));
	}

	protected boolean isIdentifiedByClassifierWrapper(EStructuralFeature feature) {
		int featureSerializationStructure = getXMLPersistenceMappingExtendedMetaData(feature).getFeatureSerializationStructure();
		return CLASSIFIER_WRAPPER_ELEMENT_MASK == (featureSerializationStructure & (FEATURE_WRAPPER_ELEMENT_MASK | FEATURE_ELEMENT_MASK | CLASSIFIER_WRAPPER_ELEMENT_MASK));
	}

	protected boolean isIdentifiedByClassifier(EStructuralFeature feature) {
		int featureSerializationStructure = getXMLPersistenceMappingExtendedMetaData(feature).getFeatureSerializationStructure();
		return CLASSIFIER_ELEMENT_MASK == featureSerializationStructure;
	}

	protected boolean isNone(EStructuralFeature feature) {
		int featureSerializationStructure = getXMLPersistenceMappingExtendedMetaData(feature).getFeatureSerializationStructure();
		return 0 == featureSerializationStructure;
	}

	protected boolean isEReference_Contained0000(EStructuralFeature feature) {
		boolean isEReference_Contained0000;
		if (feature instanceof EReference) {
			EReference reference = (EReference) feature;
			if (reference.isContainment()) {
				isEReference_Contained0000 = isNone(feature);
			} else {
				isEReference_Contained0000 = false;
			}
		} else {
			isEReference_Contained0000 = false;
		}
		return isEReference_Contained0000;
	}

}
