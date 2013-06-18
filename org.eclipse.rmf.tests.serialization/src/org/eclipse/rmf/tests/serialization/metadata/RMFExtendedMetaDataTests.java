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
package org.eclipse.rmf.tests.serialization.metadata;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.serialization.RMFExtendedMetaData;
import org.eclipse.rmf.serialization.RMFExtendedMetaDataImpl;
import org.eclipse.rmf.tests.serialization.model.nodes.NodesPackage;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("nls")
public class RMFExtendedMetaDataTests {
	int[] identitySerializationStructureConfiguration = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // identity
																													// mapping

	@BeforeClass
	public static void setup() {
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
	}

	@Test
	public void testMetadataIsSingleton() {
		RMFExtendedMetaData metadata1 = RMFExtendedMetaData.INSTANCE;
		RMFExtendedMetaData metadata2 = RMFExtendedMetaData.INSTANCE;
		assertSame(metadata1, metadata2);
	}

	@Test
	public void testGetFeatureSerializationStructure_Single() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		for (int i = 0; i < identitySerializationStructureConfiguration.length; i++) {
			String featureName = "featureWithSerialization" + toBinaryString(i) + "_Single";
			EStructuralFeature feature = nodeEClass.getEStructuralFeature(featureName);
			assertNotNull("feature '" + featureName + "' not found", feature);

			int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
			assertSame(i, featureSerializationStructure);
		}
	}

	@Test
	public void testGetFeatureSerializationStructure_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		for (int i = 0; i < identitySerializationStructureConfiguration.length; i++) {
			String featureName = "featureWithSerialization" + toBinaryString(i) + "_Multi";
			EStructuralFeature feature = nodeEClass.getEStructuralFeature(featureName);
			assertNotNull("feature '" + featureName + "' not found", feature);

			int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
			assertSame(i, featureSerializationStructure);
		}
	}

	@Test
	public void testGetFeatureSerializationStructure_EmptyAnnotation_Single() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EStructuralFeature feature = NodesPackage.eINSTANCE.getNode_FeatureEmptyAnnotation_Single();
		int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
		assertSame(RMFExtendedMetaData.SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT, featureSerializationStructure);
	}

	@Test
	public void testGetFeatureSerializationStructure_NoAnnotation_Single() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EStructuralFeature feature = NodesPackage.eINSTANCE.getNode_FeatureNoAnnotation_Single();
		int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
		assertSame(RMFExtendedMetaData.SERIALIZATION_STRUCTURE__UNDEFINED, featureSerializationStructure);
	}

	@Test
	public void testGetFeatureSerializationStructure_EmptyAnnotation_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EStructuralFeature feature = NodesPackage.eINSTANCE.getNode_FeatureEmptyAnnotation_Multi();
		int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
		assertSame(RMFExtendedMetaData.SERIALIZATION_STRUCTURE__1001__FEATURE_WRAPPER_ELEMENT__CLASSIFIER_ELEMENT, featureSerializationStructure);
	}

	@Test
	public void testGetFeatureSerializationStructure_NoAnnotation_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EStructuralFeature feature = NodesPackage.eINSTANCE.getNode_FeatureNoAnnotation_Multi();
		int featureSerializationStructure = metadata.getFeatureSerializationStructure(feature);
		assertSame(RMFExtendedMetaData.SERIALIZATION_STRUCTURE__UNDEFINED, featureSerializationStructure);
	}

	@Test
	public void testGetTypeByXMLName_Namespace_knownType() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eNS_URI, "NODE");
		assertSame(NodesPackage.eINSTANCE.getNode(), eClassifier);
	}

	@Test
	public void testGetTypeByXMLName_EPackage_knownType() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eINSTANCE, "NODE");
		assertSame(NodesPackage.eINSTANCE.getNode(), eClassifier);
	}

	@Test
	public void testGetTypeByXMLName_EPackage_unKnownType() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eINSTANCE, "Node");
		assertNull(eClassifier);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0000_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "ATTRIBUTE-FROM-NESTED-CLASS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0000_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0001_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "NODE");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0001_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0010_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "NODES");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0010_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0011_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "NODES");
		// we assume 0010 here since there is no look ahead implemented to avoid ambiguity
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0010_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0100_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-0100-MULTI");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0100_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0101_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-0101-MULTI");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0101_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0110_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-0110-MULTI");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0110_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization0111_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-0111-MULTI");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization0111_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1000_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1000-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1000_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1001_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1001-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1001_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1010_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1010-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1010_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1011_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1011-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1011_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1100_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1100-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1100_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1101_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1101-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1101_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1110_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1110-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1110_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureWithSerialization1111_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "FEATURE-WITH-SERIALIZATION-1111-MULTIS");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureWithSerialization1111_Multi(), feature);
	}

	@Test
	public void testGetElement_class_namespace_name_featureNoAnnotation_Multi() {
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl(identitySerializationStructureConfiguration);

		EClass nodeEClass = NodesPackage.eINSTANCE.getNode();
		EStructuralFeature feature = metadata.getFeatureByXMLElementName(nodeEClass, NodesPackage.eNS_URI, "featureNoAnnotation_Multis");
		assertSame(NodesPackage.eINSTANCE.getNode_FeatureNoAnnotation_Multi(), feature);
	}

	private String toBinaryString(int serializationStructure) {
		StringBuffer buffer = new StringBuffer();

		buffer.append(getBinaryString(serializationStructure, 8));
		buffer.append(getBinaryString(serializationStructure, 4));
		buffer.append(getBinaryString(serializationStructure, 2));
		buffer.append(getBinaryString(serializationStructure, 1));

		return buffer.toString();
	}

	private String getBinaryString(int serializationStructure, int mask) {
		if (mask == (serializationStructure & mask)) {
			return "1";
		} else {
			return "0";
		}
	}

}
