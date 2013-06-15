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
import org.junit.Test;

@SuppressWarnings("nls")
public class RMFExtendedMetaDataTests {
	int[] identitySerializationStructureConfiguration = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // identity
																													// mapping

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
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eNS_URI, "NODE");
		assertSame(NodesPackage.eINSTANCE.getNode(), eClassifier);
	}

	@Test
	public void testGetTypeByXMLName_EPackage_knownType() {
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eINSTANCE, "NODE");
		assertSame(NodesPackage.eINSTANCE.getNode(), eClassifier);
	}

	@Test
	public void testGetTypeByXMLName_EPackage_unKnownType() {
		EPackage.Registry.INSTANCE.put(NodesPackage.eNS_URI, NodesPackage.eINSTANCE);
		RMFExtendedMetaData metadata = new RMFExtendedMetaDataImpl();

		EClassifier eClassifier = metadata.getTypeByXMLName(NodesPackage.eINSTANCE, "Node");
		assertNull(eClassifier);
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
