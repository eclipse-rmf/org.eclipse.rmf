/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.rif11.ExchangeFile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData;
import org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue;
import org.eclipse.rmf.rif11.ExchangeFile.EnumValue;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.Identifiable;
import org.eclipse.rmf.rif11.ExchangeFile.RIF;
import org.eclipse.rmf.rif11.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot;
import org.eclipse.rmf.rif11.ExchangeFile.SpecObject;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage
 * @generated
 */
public class ExchangeFileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExchangeFilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExchangeFileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExchangeFilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExchangeFileSwitch<Adapter> modelSwitch =
		new ExchangeFileSwitch<Adapter>() {
			@Override
			public Adapter caseSpecHierarchyRoot(SpecHierarchyRoot object) {
				return createSpecHierarchyRootAdapter();
			}
			@Override
			public Adapter caseSpecElementWithUserDefinedAttributes(SpecElementWithUserDefinedAttributes object) {
				return createSpecElementWithUserDefinedAttributesAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseSpecType(SpecType object) {
				return createSpecTypeAdapter();
			}
			@Override
			public Adapter caseAttributeDefinition(AttributeDefinition object) {
				return createAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseSpecHierarchy(SpecHierarchy object) {
				return createSpecHierarchyAdapter();
			}
			@Override
			public Adapter caseSpecObject(SpecObject object) {
				return createSpecObjectAdapter();
			}
			@Override
			public Adapter caseSpecGroup(SpecGroup object) {
				return createSpecGroupAdapter();
			}
			@Override
			public Adapter caseRelationGroup(RelationGroup object) {
				return createRelationGroupAdapter();
			}
			@Override
			public Adapter caseSpecRelation(SpecRelation object) {
				return createSpecRelationAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinition(DatatypeDefinition object) {
				return createDatatypeDefinitionAdapter();
			}
			@Override
			public Adapter caseAccessPolicy(AccessPolicy object) {
				return createAccessPolicyAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionComplex(AttributeDefinitionComplex object) {
				return createAttributeDefinitionComplexAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionComplex(DatatypeDefinitionComplex object) {
				return createDatatypeDefinitionComplexAdapter();
			}
			@Override
			public Adapter caseAttributeValueComplex(AttributeValueComplex object) {
				return createAttributeValueComplexAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionEnumeration(AttributeDefinitionEnumeration object) {
				return createAttributeDefinitionEnumerationAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionEnumeration(DatatypeDefinitionEnumeration object) {
				return createDatatypeDefinitionEnumerationAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter caseEmbeddedValue(EmbeddedValue object) {
				return createEmbeddedValueAdapter();
			}
			@Override
			public Adapter caseAttributeValueEnumeration(AttributeValueEnumeration object) {
				return createAttributeValueEnumerationAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionSimple(AttributeDefinitionSimple object) {
				return createAttributeDefinitionSimpleAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionSimple(DatatypeDefinitionSimple object) {
				return createDatatypeDefinitionSimpleAdapter();
			}
			@Override
			public Adapter caseAttributeValueSimple(AttributeValueSimple object) {
				return createAttributeValueSimpleAdapter();
			}
			@Override
			public Adapter caseAttributeValueEmbeddedDocument(AttributeValueEmbeddedDocument object) {
				return createAttributeValueEmbeddedDocumentAdapter();
			}
			@Override
			public Adapter caseAttributeValueEmbeddedFile(AttributeValueEmbeddedFile object) {
				return createAttributeValueEmbeddedFileAdapter();
			}
			@Override
			public Adapter caseAttributeValueFileReference(AttributeValueFileReference object) {
				return createAttributeValueFileReferenceAdapter();
			}
			@Override
			public Adapter caseAttributeValueXmlData(AttributeValueXmlData object) {
				return createAttributeValueXmlDataAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionBinaryFile(DatatypeDefinitionBinaryFile object) {
				return createDatatypeDefinitionBinaryFileAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionBoolean(DatatypeDefinitionBoolean object) {
				return createDatatypeDefinitionBooleanAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionDate(DatatypeDefinitionDate object) {
				return createDatatypeDefinitionDateAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionDocument(DatatypeDefinitionDocument object) {
				return createDatatypeDefinitionDocumentAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionInteger(DatatypeDefinitionInteger object) {
				return createDatatypeDefinitionIntegerAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionReal(DatatypeDefinitionReal object) {
				return createDatatypeDefinitionRealAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionString(DatatypeDefinitionString object) {
				return createDatatypeDefinitionStringAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionXmlData(DatatypeDefinitionXmlData object) {
				return createDatatypeDefinitionXmlDataAdapter();
			}
			@Override
			public Adapter caseRIF(RIF object) {
				return createRIFAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot <em>Spec Hierarchy Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot
	 * @generated
	 */
	public Adapter createSpecHierarchyRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes <em>Spec Element With User Defined Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecElementWithUserDefinedAttributes
	 * @generated
	 */
	public Adapter createSpecElementWithUserDefinedAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecType
	 * @generated
	 */
	public Adapter createSpecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinition
	 * @generated
	 */
	public Adapter createAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy <em>Spec Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy
	 * @generated
	 */
	public Adapter createSpecHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecObject
	 * @generated
	 */
	public Adapter createSpecObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup <em>Spec Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecGroup
	 * @generated
	 */
	public Adapter createSpecGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup
	 * @generated
	 */
	public Adapter createRelationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation <em>Spec Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecRelation
	 * @generated
	 */
	public Adapter createSpecRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinition
	 * @generated
	 */
	public Adapter createDatatypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy <em>Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AccessPolicy
	 * @generated
	 */
	public Adapter createAccessPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex <em>Attribute Definition Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionComplex
	 * @generated
	 */
	public Adapter createAttributeDefinitionComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex <em>Datatype Definition Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionComplex
	 * @generated
	 */
	public Adapter createDatatypeDefinitionComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex <em>Attribute Value Complex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueComplex
	 * @generated
	 */
	public Adapter createAttributeValueComplexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionEnumeration
	 * @generated
	 */
	public Adapter createAttributeDefinitionEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionEnumeration
	 * @generated
	 */
	public Adapter createDatatypeDefinitionEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue <em>Embedded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.EmbeddedValue
	 * @generated
	 */
	public Adapter createEmbeddedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEnumeration
	 * @generated
	 */
	public Adapter createAttributeValueEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple
	 * @generated
	 */
	public Adapter createAttributeDefinitionSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple
	 * @generated
	 */
	public Adapter createDatatypeDefinitionSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple <em>Attribute Value Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple
	 * @generated
	 */
	public Adapter createAttributeValueSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument <em>Attribute Value Embedded Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedDocument
	 * @generated
	 */
	public Adapter createAttributeValueEmbeddedDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile <em>Attribute Value Embedded File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueEmbeddedFile
	 * @generated
	 */
	public Adapter createAttributeValueEmbeddedFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference <em>Attribute Value File Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference
	 * @generated
	 */
	public Adapter createAttributeValueFileReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData <em>Attribute Value Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.AttributeValueXmlData
	 * @generated
	 */
	public Adapter createAttributeValueXmlDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile <em>Datatype Definition Binary File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile
	 * @generated
	 */
	public Adapter createDatatypeDefinitionBinaryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBoolean
	 * @generated
	 */
	public Adapter createDatatypeDefinitionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate <em>Datatype Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDate
	 * @generated
	 */
	public Adapter createDatatypeDefinitionDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument <em>Datatype Definition Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionDocument
	 * @generated
	 */
	public Adapter createDatatypeDefinitionDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionInteger
	 * @generated
	 */
	public Adapter createDatatypeDefinitionIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionReal
	 * @generated
	 */
	public Adapter createDatatypeDefinitionRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionString
	 * @generated
	 */
	public Adapter createDatatypeDefinitionStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData <em>Datatype Definition Xml Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData
	 * @generated
	 */
	public Adapter createDatatypeDefinitionXmlDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.rif11.ExchangeFile.RIF <em>RIF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RIF
	 * @generated
	 */
	public Adapter createRIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExchangeFileAdapterFactory
