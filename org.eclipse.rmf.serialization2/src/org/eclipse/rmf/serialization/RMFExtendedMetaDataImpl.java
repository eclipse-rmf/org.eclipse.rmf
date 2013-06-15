package org.eclipse.rmf.serialization;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class RMFExtendedMetaDataImpl implements RMFExtendedMetaData {
	static final String XML_NAME = "xmlName"; //$NON-NLS-1$
	static final String XML_WRAPPER_NAME = "xmlWrapperName"; //$NON-NLS-1$
	static final String FEATURE_WRAPPER_ELEMENT = "featureWrapperElement"; //$NON-NLS-1$
	static final String FEATURE_ELEMENT = "featureElement"; //$NON-NLS-1$
	static final String CLASSIFIER_WRAPPER_ELEMENT = "classifierWrapperElement"; //$NON-NLS-1$
	static final String CLASSIFIER_ELEMENT = "classifierElement"; //$NON-NLS-1$

	static final int FEATURE_WRAPPER_ELEMENT_MASK = 8;
	static final int FEATURE_ELEMENT_MASK = 4;
	static final int CLASSIFIER_WRAPPER_ELEMENT_MASK = 2;
	static final int CLASSIFIER_ELEMENT_MASK = 1;

	protected EPackage.Registry registry;

	protected int[] fallbackSerializationConfiguration = { SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT /* 0000 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0001 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0010 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0011 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0100 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0101 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0110 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 0111 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1000 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1001 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1010 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1011 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1100_ */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1101 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT/* 1110 */,
			SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT /* 1111 */
	};

	static final String PLURAL_EXTENSION = "s"; //$NON-NLS-1$

	protected Map<EModelElement, Object> extendedMetaDataCache = new HashMap<EModelElement, Object>();
	protected Map<EModelElement, EAnnotation> annotationCache = new HashMap<EModelElement, EAnnotation>();

	public static interface EPackageExtendedMetaData {
		EClassifier getType(String name);

		void renameToXMLName(EClassifier eClassifier, String newName);

		void renameToXMLWrapperName(EClassifier eClassifier, String newName);
	}

	public class EPackageExtendedMetaDataImpl implements EPackageExtendedMetaData {
		protected EPackage ePackage;
		protected boolean isInitialized;
		protected boolean isQualified;
		protected Map<String, EClassifier> xmlNameToClassifierMap;
		protected Map<String, EClassifier> xmlWrapperNameToClassifierMap;

		public EPackageExtendedMetaDataImpl(EPackage ePackage) {
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

	public static interface EClassifierExtendedMetaData {
		String getXMLName();

		void setXMLName(String name);

		String getXMLWrapperName();

		void setXMLWrapperName(String name);
	}

	class EClassifierExtendedMetaDataImpl implements EClassifierExtendedMetaData {
		protected static final String UNINITIALIZED_STRING = "uninitialized"; //$NON-NLS-1$
		protected static final int UNINITIALIZED_INT = -2;

		protected EClassifier eClassifier;
		protected String xmlName = UNINITIALIZED_STRING;
		protected String xmlWrapperName = UNINITIALIZED_STRING;

		public EClassifierExtendedMetaDataImpl(EClassifier eClassifier) {
			super();
			this.eClassifier = eClassifier;
		}

		public String getXMLName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLName(basicGetXMLName(eClassifier));
			}
			return xmlName;
		}

		public void setXMLName(String xmlName) {
			this.xmlName = xmlName;
		}

		public String getXMLWrapperName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLWrapperName(basicGetXMLWrapperName(eClassifier));
			}
			return xmlWrapperName;
		}

		public void setXMLWrapperName(String xmlWrapperName) {
			this.xmlWrapperName = xmlWrapperName;

		}

	}

	public static interface EStructuralFeatureExtendedMetaData {
		String getXMLName();

		void setXMLName(String name);

		String getXMLWrapperName();

		void setXMLWrapperName(String name);

		int getFeatureSerializationStructure();

		void setFeatureSerializationStructure(int featureSerializationStructure);
	}

	class EStructuralFeatureExtendedMetaDataImpl implements EStructuralFeatureExtendedMetaData {
		protected static final String UNINITIALIZED_STRING = "uninitialized"; //$NON-NLS-1$
		protected static final int UNINITIALIZED_INT = -2;

		protected EStructuralFeature eStructuralFeature;
		protected String xmlName = UNINITIALIZED_STRING;
		protected String xmlWrapperName = UNINITIALIZED_STRING;
		protected int featureSerializationStructure = UNINITIALIZED_INT;

		public EStructuralFeatureExtendedMetaDataImpl(EStructuralFeature eStructuralFeature) {
			super();
			this.eStructuralFeature = eStructuralFeature;
		}

		public String getXMLName() {
			if (UNINITIALIZED_STRING == xmlName) {
				setXMLName(basicGetXMLName(eStructuralFeature));
			}
			return xmlName;
		}

		public void setXMLName(String xmlName) {
			this.xmlName = xmlName;
		}

		public String getXMLWrapperName() {
			if (UNINITIALIZED_STRING == xmlWrapperName) {
				setXMLName(basicGetXMLWrapperName(eStructuralFeature));
			}
			return xmlName;
		}

		public void setXMLWrapperName(String xmlWrapperName) {
			this.xmlWrapperName = xmlWrapperName;

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

	public RMFExtendedMetaDataImpl() {
		this(EPackage.Registry.INSTANCE);
	}

	public RMFExtendedMetaDataImpl(EPackage.Registry registry) {
		super();
		this.registry = registry;
	}

	public RMFExtendedMetaDataImpl(int[] fallbackSerializations) {
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

	public String getXMLName(EClassifier eClassifier) {
		return getExtendedMetaData(eClassifier).getXMLName();
	}

	public void setXMLName(EClassifier eClassifier, String xmlName) {
		EAnnotation eAnnotation = getAnnotation(eClassifier, true);
		eAnnotation.getDetails().put(XML_NAME, xmlName);
		getExtendedMetaData(eClassifier).setXMLName(xmlName);
		EPackage ePackage = eClassifier.getEPackage();
		if (ePackage != null) {
			getExtendedMetaData(ePackage).renameToXMLName(eClassifier, xmlName);
		}
	}

	public String getXMLWrapperName(EClassifier eClassifier) {
		return getExtendedMetaData(eClassifier).getXMLWrapperName();
	}

	public void setXMLWrapperName(EClassifier eClassifier, String xmlWrapperName) {
		EAnnotation eAnnotation = getAnnotation(eClassifier, true);
		eAnnotation.getDetails().put(XML_WRAPPER_NAME, xmlWrapperName);
		getExtendedMetaData(eClassifier).setXMLWrapperName(xmlWrapperName);
		EPackage ePackage = eClassifier.getEPackage();
		if (ePackage != null) {
			getExtendedMetaData(ePackage).renameToXMLWrapperName(eClassifier, xmlWrapperName);
		}
	}

	public String getXMLName(EStructuralFeature eStructuralFeature) {
		return getExtendedMetaData(eStructuralFeature).getXMLName();
	}

	public void setXMLName(EStructuralFeature eStructuralFeature, String xmlName) {
		EAnnotation eAnnotation = getAnnotation(eStructuralFeature, true);
		eAnnotation.getDetails().put(XML_NAME, xmlName);
		getExtendedMetaData(eStructuralFeature).setXMLName(xmlName);
	}

	public String getXMLWrapperName(EStructuralFeature eStructuralFeature) {
		return getExtendedMetaData(eStructuralFeature).getXMLWrapperName();
	}

	public void setXMLWrapperName(EStructuralFeature eStructuralFeature, String xmlWrapperName) {
		EAnnotation eAnnotation = getAnnotation(eStructuralFeature, true);
		eAnnotation.getDetails().put(XML_WRAPPER_NAME, xmlWrapperName);
		getExtendedMetaData(eStructuralFeature).setXMLWrapperName(xmlWrapperName);
	}

	public EStructuralFeature getAttribute(String namespace, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EStructuralFeature getElement(String namespace, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EStructuralFeature getAttribute(EClass eClass, String namespace, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public EStructuralFeature getElement(EClass eClass, String namespace, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getFeatureSerializationStructure(EStructuralFeature eStructuralFeature) {
		return getExtendedMetaData(eStructuralFeature).getFeatureSerializationStructure();
	}

	public void setFeatureSerializationStructure(EStructuralFeature eStructuralFeature, int serializationStructure) {
		// TODO Auto-generated method stub

	}

	public EClassifier getTypeByXMLName(String namespace, String xmlName) {
		EPackage ePackage = getPackage(namespace);
		return ePackage == null ? null : getTypeByXMLName(ePackage, xmlName);
	}

	public EClassifier getTypeByXMLWrapperName(String namespace, String xmlWrapperName) {
		// TODO Auto-generated method stub
		return null;
	}

	public EClassifier getTypeByXMLName(EPackage ePackage, String xmlName) {
		return getExtendedMetaData(ePackage).getType(xmlName);
	}

	public EClassifier getTypeByXMLWrapperName(EPackage ePackage, String xmlWrapperName) {
		// TODO Auto-generated method stub
		return null;
	}

	public EPackage getPackage(String namespace) {
		EPackage ePackage = registry.getEPackage(namespace);
		return ePackage;
	}

	protected String basicGetXMLName(EClassifier eClassifier) {
		EAnnotation eAnnotation = getAnnotation(eClassifier, false);
		if (eAnnotation != null) {
			String result = eAnnotation.getDetails().get(XML_NAME);
			if (result != null) {
				return result;
			}
		}
		return eClassifier.getName();
	}

	protected String basicGetXMLName(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getAnnotation(eStructuralFeature, false);
		if (eAnnotation != null) {
			String result = eAnnotation.getDetails().get(XML_NAME);
			if (result != null) {
				return result;
			}
		}
		return eStructuralFeature.getName();
	}

	protected String basicGetXMLWrapperName(EClassifier eClassifier) {
		EAnnotation eAnnotation = getAnnotation(eClassifier, false);
		if (eAnnotation != null) {
			String result = eAnnotation.getDetails().get(XML_WRAPPER_NAME);
			if (result != null) {
				return result;
			}
		}
		return eClassifier.getName() + PLURAL_EXTENSION;
	}

	protected String basicGetXMLWrapperName(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getAnnotation(eStructuralFeature, false);
		if (eAnnotation != null) {
			String result = eAnnotation.getDetails().get(XML_WRAPPER_NAME);
			if (result != null) {
				return result;
			}
		}
		return eStructuralFeature.getName() + PLURAL_EXTENSION;
	}

	/**
	 * @param eStructuralFeature
	 * @return #SERILIZATION_STRUCTURE__UNDDEFINED, if no annotation is defined
	 */
	protected int basicGetFeatureSerializationStructure(EStructuralFeature eStructuralFeature) {
		EAnnotation eAnnotation = getAnnotation(eStructuralFeature, false);
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
			return SERIALIZATION_STRUCTURE__UNDEFINED;
		}
	}

	protected EStructuralFeatureExtendedMetaData getExtendedMetaData(EStructuralFeature eStructuralFeature) {
		EStructuralFeatureExtendedMetaData result = (EStructuralFeatureExtendedMetaData) extendedMetaDataCache.get(eStructuralFeature);
		if (result == null) {
			extendedMetaDataCache.put(eStructuralFeature, result = createEStructuralFeatureExtendedMetaData(eStructuralFeature));
		}
		return result;
	}

	protected EClassifierExtendedMetaData getExtendedMetaData(EClassifier eClassifier) {
		EClassifierExtendedMetaData result = (EClassifierExtendedMetaData) extendedMetaDataCache.get(eClassifier);
		if (result == null) {
			extendedMetaDataCache.put(eClassifier, result = createEClassifierExtendedMetaData(eClassifier));
		}
		return result;
	}

	protected EPackageExtendedMetaData getExtendedMetaData(EPackage ePackage) {
		EPackageExtendedMetaData result = (EPackageExtendedMetaData) extendedMetaDataCache.get(ePackage);
		if (result == null) {
			extendedMetaDataCache.put(ePackage, result = createEPackageExtendedMetaData(ePackage));
		}
		return result;
	}

	protected EStructuralFeatureExtendedMetaData createEStructuralFeatureExtendedMetaData(EStructuralFeature eStructuralFeature) {
		return new EStructuralFeatureExtendedMetaDataImpl(eStructuralFeature);
	}

	protected EClassifierExtendedMetaData createEClassifierExtendedMetaData(EClassifier eClassifier) {
		return new EClassifierExtendedMetaDataImpl(eClassifier);
	}

	protected EPackageExtendedMetaData createEPackageExtendedMetaData(EPackage ePackage) {
		return new EPackageExtendedMetaDataImpl(ePackage);
	}

	protected EAnnotation getAnnotation(EModelElement eModelElement, boolean demandCreate) {
		EAnnotation result = annotationCache.get(eModelElement);
		if (result == null) {
			result = eModelElement.getEAnnotation(ANNOTATION_URI);
		}
		if (result == null && demandCreate) {
			result = EcoreFactory.eINSTANCE.createEAnnotation();
			result.setSource(ANNOTATION_URI);
			annotationCache.put(eModelElement, result);
		}
		return result;
	}

}
