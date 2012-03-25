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
package org.eclipse.rmf.reqif10.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.rmf.reqif10.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.rmf.reqif10.ReqIF10Package
 * @generated
 */
public class ReqIF10AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqIF10Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIF10AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqIF10Package.eINSTANCE;
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
	protected ReqIF10Switch<Adapter> modelSwitch =
		new ReqIF10Switch<Adapter>() {
			@Override
			public Adapter caseAccessControlledElement(AccessControlledElement object) {
				return createAccessControlledElementAdapter();
			}
			@Override
			public Adapter caseIdentifiable(Identifiable object) {
				return createIdentifiableAdapter();
			}
			@Override
			public Adapter caseAttributeValueXHTML(AttributeValueXHTML object) {
				return createAttributeValueXHTMLAdapter();
			}
			@Override
			public Adapter caseAttributeValue(AttributeValue object) {
				return createAttributeValueAdapter();
			}
			@Override
			public Adapter caseSpecElementWithAttributes(SpecElementWithAttributes object) {
				return createSpecElementWithAttributesAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionXHTML(AttributeDefinitionXHTML object) {
				return createAttributeDefinitionXHTMLAdapter();
			}
			@Override
			public Adapter caseAttributeDefinition(AttributeDefinition object) {
				return createAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecType(SpecType object) {
				return createSpecTypeAdapter();
			}
			@Override
			public Adapter caseReqIFContent(ReqIFContent object) {
				return createReqIFContentAdapter();
			}
			@Override
			public Adapter caseReqIF(ReqIF object) {
				return createReqIFAdapter();
			}
			@Override
			public Adapter caseReqIFHeader(ReqIFHeader object) {
				return createReqIFHeaderAdapter();
			}
			@Override
			public Adapter caseReqIFToolExtension(ReqIFToolExtension object) {
				return createReqIFToolExtensionAdapter();
			}
			@Override
			public Adapter caseSpecObject(SpecObject object) {
				return createSpecObjectAdapter();
			}
			@Override
			public Adapter caseSpecObjectType(SpecObjectType object) {
				return createSpecObjectTypeAdapter();
			}
			@Override
			public Adapter caseSpecification(Specification object) {
				return createSpecificationAdapter();
			}
			@Override
			public Adapter caseSpecificationType(SpecificationType object) {
				return createSpecificationTypeAdapter();
			}
			@Override
			public Adapter caseSpecHierarchy(SpecHierarchy object) {
				return createSpecHierarchyAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinition(DatatypeDefinition object) {
				return createDatatypeDefinitionAdapter();
			}
			@Override
			public Adapter caseSpecRelation(SpecRelation object) {
				return createSpecRelationAdapter();
			}
			@Override
			public Adapter caseSpecRelationType(SpecRelationType object) {
				return createSpecRelationTypeAdapter();
			}
			@Override
			public Adapter caseRelationGroup(RelationGroup object) {
				return createRelationGroupAdapter();
			}
			@Override
			public Adapter caseRelationGroupType(RelationGroupType object) {
				return createRelationGroupTypeAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionXHTML(DatatypeDefinitionXHTML object) {
				return createDatatypeDefinitionXHTMLAdapter();
			}
			@Override
			public Adapter caseAlternativeID(AlternativeID object) {
				return createAlternativeIDAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionBoolean(AttributeDefinitionBoolean object) {
				return createAttributeDefinitionBooleanAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionSimple(AttributeDefinitionSimple object) {
				return createAttributeDefinitionSimpleAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionBoolean(DatatypeDefinitionBoolean object) {
				return createDatatypeDefinitionBooleanAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionSimple(DatatypeDefinitionSimple object) {
				return createDatatypeDefinitionSimpleAdapter();
			}
			@Override
			public Adapter caseAttributeValueBoolean(AttributeValueBoolean object) {
				return createAttributeValueBooleanAdapter();
			}
			@Override
			public Adapter caseAttributeValueSimple(AttributeValueSimple object) {
				return createAttributeValueSimpleAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionDate(AttributeDefinitionDate object) {
				return createAttributeDefinitionDateAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionDate(DatatypeDefinitionDate object) {
				return createDatatypeDefinitionDateAdapter();
			}
			@Override
			public Adapter caseAttributeValueDate(AttributeValueDate object) {
				return createAttributeValueDateAdapter();
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
			public Adapter caseAttributeDefinitionInteger(AttributeDefinitionInteger object) {
				return createAttributeDefinitionIntegerAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionInteger(DatatypeDefinitionInteger object) {
				return createDatatypeDefinitionIntegerAdapter();
			}
			@Override
			public Adapter caseAttributeValueInteger(AttributeValueInteger object) {
				return createAttributeValueIntegerAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionReal(AttributeDefinitionReal object) {
				return createAttributeDefinitionRealAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionReal(DatatypeDefinitionReal object) {
				return createDatatypeDefinitionRealAdapter();
			}
			@Override
			public Adapter caseAttributeValueReal(AttributeValueReal object) {
				return createAttributeValueRealAdapter();
			}
			@Override
			public Adapter caseAttributeDefinitionString(AttributeDefinitionString object) {
				return createAttributeDefinitionStringAdapter();
			}
			@Override
			public Adapter caseDatatypeDefinitionString(DatatypeDefinitionString object) {
				return createDatatypeDefinitionStringAdapter();
			}
			@Override
			public Adapter caseAttributeValueString(AttributeValueString object) {
				return createAttributeValueStringAdapter();
			}
			@Override
			public Adapter caseXhtmlContent(XhtmlContent object) {
				return createXhtmlContentAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AccessControlledElement <em>Access Controlled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AccessControlledElement
	 * @generated
	 */
	public Adapter createAccessControlledElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.Identifiable <em>Identifiable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.Identifiable
	 * @generated
	 */
	public Adapter createIdentifiableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML <em>Attribute Value XHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueXHTML
	 * @generated
	 */
	public Adapter createAttributeValueXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValue
	 * @generated
	 */
	public Adapter createAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes <em>Spec Element With Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecElementWithAttributes
	 * @generated
	 */
	public Adapter createSpecElementWithAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXHTML <em>Attribute Definition XHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionXHTML
	 * @generated
	 */
	public Adapter createAttributeDefinitionXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinition
	 * @generated
	 */
	public Adapter createAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecType
	 * @generated
	 */
	public Adapter createSpecTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.ReqIFContent <em>Req IF Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.ReqIFContent
	 * @generated
	 */
	public Adapter createReqIFContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.ReqIF <em>Req IF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.ReqIF
	 * @generated
	 */
	public Adapter createReqIFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.ReqIFHeader <em>Req IF Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.ReqIFHeader
	 * @generated
	 */
	public Adapter createReqIFHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.ReqIFToolExtension <em>Req IF Tool Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.ReqIFToolExtension
	 * @generated
	 */
	public Adapter createReqIFToolExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecObject <em>Spec Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecObject
	 * @generated
	 */
	public Adapter createSpecObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecObjectType <em>Spec Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecObjectType
	 * @generated
	 */
	public Adapter createSpecObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.Specification
	 * @generated
	 */
	public Adapter createSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecificationType <em>Specification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecificationType
	 * @generated
	 */
	public Adapter createSpecificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecHierarchy <em>Spec Hierarchy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy
	 * @generated
	 */
	public Adapter createSpecHierarchyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinition <em>Datatype Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinition
	 * @generated
	 */
	public Adapter createDatatypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecRelation <em>Spec Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecRelation
	 * @generated
	 */
	public Adapter createSpecRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.SpecRelationType <em>Spec Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.SpecRelationType
	 * @generated
	 */
	public Adapter createSpecRelationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.RelationGroup <em>Relation Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.RelationGroup
	 * @generated
	 */
	public Adapter createRelationGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.RelationGroupType <em>Relation Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.RelationGroupType
	 * @generated
	 */
	public Adapter createRelationGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML <em>Datatype Definition XHTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML
	 * @generated
	 */
	public Adapter createDatatypeDefinitionXHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AlternativeID <em>Alternative ID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AlternativeID
	 * @generated
	 */
	public Adapter createAlternativeIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionBoolean <em>Attribute Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionBoolean
	 * @generated
	 */
	public Adapter createAttributeDefinitionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionSimple <em>Attribute Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionSimple
	 * @generated
	 */
	public Adapter createAttributeDefinitionSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean <em>Datatype Definition Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean
	 * @generated
	 */
	public Adapter createDatatypeDefinitionBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionSimple <em>Datatype Definition Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionSimple
	 * @generated
	 */
	public Adapter createDatatypeDefinitionSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueBoolean <em>Attribute Value Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueBoolean
	 * @generated
	 */
	public Adapter createAttributeValueBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueSimple <em>Attribute Value Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueSimple
	 * @generated
	 */
	public Adapter createAttributeValueSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionDate <em>Attribute Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionDate
	 * @generated
	 */
	public Adapter createAttributeDefinitionDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionDate <em>Datatype Definition Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionDate
	 * @generated
	 */
	public Adapter createDatatypeDefinitionDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueDate <em>Attribute Value Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueDate
	 * @generated
	 */
	public Adapter createAttributeValueDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration <em>Attribute Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration
	 * @generated
	 */
	public Adapter createAttributeDefinitionEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration <em>Datatype Definition Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration
	 * @generated
	 */
	public Adapter createDatatypeDefinitionEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.EmbeddedValue <em>Embedded Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.EmbeddedValue
	 * @generated
	 */
	public Adapter createEmbeddedValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueEnumeration <em>Attribute Value Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueEnumeration
	 * @generated
	 */
	public Adapter createAttributeValueEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger <em>Attribute Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionInteger
	 * @generated
	 */
	public Adapter createAttributeDefinitionIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionInteger <em>Datatype Definition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionInteger
	 * @generated
	 */
	public Adapter createDatatypeDefinitionIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueInteger <em>Attribute Value Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueInteger
	 * @generated
	 */
	public Adapter createAttributeValueIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionReal <em>Attribute Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionReal
	 * @generated
	 */
	public Adapter createAttributeDefinitionRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionReal <em>Datatype Definition Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionReal
	 * @generated
	 */
	public Adapter createDatatypeDefinitionRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueReal <em>Attribute Value Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueReal
	 * @generated
	 */
	public Adapter createAttributeValueRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeDefinitionString <em>Attribute Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionString
	 * @generated
	 */
	public Adapter createAttributeDefinitionStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionString <em>Datatype Definition String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.DatatypeDefinitionString
	 * @generated
	 */
	public Adapter createDatatypeDefinitionStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.AttributeValueString <em>Attribute Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.AttributeValueString
	 * @generated
	 */
	public Adapter createAttributeValueStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.rmf.reqif10.XhtmlContent <em>Xhtml Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.rmf.reqif10.XhtmlContent
	 * @generated
	 */
	public Adapter createXhtmlContentAdapter() {
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

} //ReqIF10AdapterFactory
