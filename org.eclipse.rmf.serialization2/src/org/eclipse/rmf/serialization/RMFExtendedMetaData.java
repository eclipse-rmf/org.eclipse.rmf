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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

public interface RMFExtendedMetaData extends ExtendedMetaData {

	/**
	 * The URI used as the annotation source: "http:///org/eclipse/rmf/serialization/RMFExtendedMetaData".
	 */
	String RMF_ANNOTATION_URI = "http:///org/eclipse/rmf/serialization/RMFExtendedMetaData"; //$NON-NLS-1$

	/**
	 * Returns the XML name for a classifier. This is the name is used if a classifier XML element is configured.
	 * <p>
	 * details key: "xmlName"
	 */
	String getXMLName(EClassifier eClassifier);

	/**
	 * Sets the XML name for a classifier. This is the name is used if a classifier XML element is configured.
	 * <p>
	 * details key: "xmlName"
	 */
	// void setXMLName(EClassifier eClassifier, String xmlName);

	/**
	 * Returns the XML wrapper name for a classifier. This is the name is used if a classifier wrapper XML element is
	 * configured.
	 * <p>
	 * details key: "xmlWrapperName"
	 */
	String getXMLWrapperName(EClassifier eClassifier);

	/**
	 * Sets the XML wrapper name for a classifier. This is the name is used if a classifier wrapper XML element is
	 * configured.
	 * <p>
	 * details key: "xmlWrapperName"
	 */
	// void setXMLWrapperName(EClassifier eClassifier, String xmlName);

	/**
	 * Returns the XML name for a structural feature. This is the name is used if a feature XML element is configured.
	 * <p>
	 * details key: "xmlName"
	 */
	String getXMLName(EStructuralFeature eStructuralFeature);

	/**
	 * Set the XML name for a structural feature. This is the name is used if a feature XML element is configured.
	 * <p>
	 * details key: "xmlName"
	 */
	// void setXMLName(EStructuralFeature eStructuralFeature, String xmlName);

	/**
	 * Returns the XML name for a structural feature. This is the name is used if a feature wrapper XML element is
	 * configured.
	 * <p>
	 * details key: "xmlWrapperName"
	 */
	String getXMLWrapperName(EStructuralFeature eStructuralFeature);

	/**
	 * Set the XML name for a structural feature. This is the name is used if a feature wrapper XML element is
	 * configured.
	 * <p>
	 * details key: "xmlWrapperName"
	 */
	// void setXMLWrapperName(EStructuralFeature eStructuralFeature, String xmlName);

	/**
	 * Returns the classifier with the given XML name within the package with the given namespace.
	 */
	EClassifier getTypeByXMLName(String namespace, String xmlName);

	/**
	 * Returns the classifier with the given XML wrapper name within the package with the given namespace.
	 */
	EClassifier getTypeByXMLWrapperName(String namespace, String xmlWrapperName);

	/**
	 * Returns the classifier with the given XML name within the given package.
	 */
	EClassifier getTypeByXMLName(EPackage ePackage, String xmlName);

	/**
	 * Returns the classifier with the given XML name within the given package.
	 */
	EClassifier getTypeByXMLWrapperName(EPackage ePackage, String xmlWrapperName);

	/**
	 * Retrieves the package with the specified namespace URI from the package registry associated with this instance.
	 */
	EPackage getPackage(String namespace);

	/**
	 * Returns a structural feature within a class, corresponding to a local attribute with the given namespace and
	 * name, or, failing that, a document root feature corresponding to a global attribute with the given namespace and
	 * name that is {@link #getAffiliation(EClass, EStructuralFeature) affiliated} with a feature in the class.
	 */
	EStructuralFeature getAttribute(EClass eClass, String namespace, String name);

	/**
	 * Returns a structural feature within a class, corresponding to a local element with the given namespace and name,
	 * or, failing that, a document root feature corresponding to a global element with the given namespace and name
	 * that is {@link #getAffiliation(EClass, EStructuralFeature) affiliated} with a feature in the class.
	 */
	EStructuralFeature getFeatureByXMLElementName(EClass eClass, String namespace, String name);

	int SERIALIZATION_STRUCTURE__UNDEFINED = -1;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   ...
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=false" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0000__NONE = 0;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   	(&lt;ClassifierName&gt; ... &lt;/ClassifierName&gt;)?
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=true" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0001__CLASSIFIER_ELEMENT = 1;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *    &lt;ClassifierWrapperName&gt;
	 *   	( ... )?
	 *    &lt;/ClassifierWrapperName&gt;
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=true"<br/>
	 * details key: "classifierElement=false" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0010__CLASSIFIER_WRAPPER_ELEMENT = 2;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *    &lt;ClassifierWrapperName&gt;
	 *   	(&lt;ClassifierName&gt; ... &lt;/ClassifierName&gt;)?
	 *    &lt;/ClassifierWrapperName&gt;
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=true"<br/>
	 * details key: "classifierElement=true" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0011__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT = 3;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *    (&lt;FeatureName&gt;
	 *   	...
	 *    &lt;/FeatureName&gt;)?
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=true" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=false" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0100__FEATURE_ELEMENT = 4;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   (&lt;FeatureName&gt;
	 *   	&lt;ClassifierName&gt; ... &lt;/ClassifierName&gt;
	 *   &lt;/FeatureName&gt;)?
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=true" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=true" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0101__FEATURE_ELEMENT__CLASSIFIER_ELEMENT = 5;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   (&lt;FeatureName&gt;
	 *   	&lt;ClassifierWrapperName&gt; ... &lt;/ClassifierWrapperName&gt;
	 *   &lt;/FeatureName&gt;)?
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=true" <br/>
	 * details key: "classifierWrapperElement=true"<br/>
	 * details key: "classifierElement=false" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0110__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT = 6;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   (&lt;FeatureName&gt;
	 *   	&lt;ClassifierWrapperName&gt; 
	 *        (&lt;ClassifierName&gt; ... &lt;/ClassifierName&gt;)?
	 *      &lt;/ClassifierWrapperName&gt; 
	 *   &lt;/FeatureName&gt;)?
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=false" <br/>
	 * details key: "featureElement=true" <br/>
	 * details key: "classifierWrapperElement=true"<br/>
	 * details key: "classifierElement=true" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__0111__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT = 7;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   &lt;FeatureWrapperName&gt;
	 *       ( ... )? 
	 *   &lt;/FeatureWrapperName&gt;
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=true" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=false" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__1000__FEATURE_WRAPPER_ELEMENT = 8;

	/**
	 * The feature serialization structure ID for a feature that is serialized using the following XML element
	 * structure:
	 * 
	 * <pre>
	 * &lt;Parent&gt;
	 *   &lt;FeatureWrapperName&gt;
	 *   	(&lt;ClassifierName&gt; ... &lt;/ClassifierName&gt;)?
	 *   &lt;/FeatureWrapperName&gt;
	 * &lt;/Parent&gt;
	 * </pre>
	 * 
	 * details key: "featureWrapperElement=true" <br/>
	 * details key: "featureElement=false" <br/>
	 * details key: "classifierWrapperElement=false"<br/>
	 * details key: "classifierElement=true" <br/>
	 * 
	 * @see #getFeatureSerializationStructure
	 * @see #setFeatureSerializationStructure
	 */
	int SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT = 9;

	int SERIALIZATION_STRUCTURE__1010__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT = 10;

	int SERIALIZATION_STRUCTURE__1011__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT = 11;

	int SERIALIZATION_STRUCTURE__1100__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT = 12;

	int SERIALIZATION_STRUCTURE__1101__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_ELEMENT = 13;

	int SERIALIZATION_STRUCTURE__1110__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT = 14;

	int SERIALIZATION_STRUCTURE__1111__FEATURE_WRAPPER_ELEMENT__FEATURE_ELEMENT__CLASSIFIER_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT = 15;

	/**
	 * Returns the kind of XML structure that should be used to represent the given structural feature.
	 * <p>
	 * details key: "featureElement" <br/>
	 * details key: "featureWrapperElement" <br/>
	 * details key: "classifierElement" <br/>
	 * details key: "classifierWrapperElement"<br/>
	 * 
	 * @param eStructuralFeature
	 * @param featureSerializationKind
	 */
	int getFeatureSerializationStructure(EStructuralFeature eStructuralFeature);

	/**
	 * Sets the kind of XML structure that should be used to represent the given structural feature.
	 * <p>
	 * details key: "featureElement" <br/>
	 * details key: "featureWrapperElement" <br/>
	 * details key: "classifierElement" <br/>
	 * details key: "classifierWrapperElement"<br/>
	 * 
	 * @param eStructuralFeature
	 * @param featureSerializationKind
	 */
	void setFeatureSerializationStructure(EStructuralFeature eStructuralFeature, int serializationStructure);

	/**
	 * The default RMFExtendedMetaData instance.
	 */
	RMFExtendedMetaData INSTANCE = new RMFExtendedMetaDataImpl();

}
