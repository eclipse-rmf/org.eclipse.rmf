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
package org.eclipse.rmf.emf.ecore.converter;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.AnyType;

/**
 * Converts a XSD Model to its equivalent domain Ecore Model
 * 
 * @author Nirmal Sasidharan
 *
 */
public class XML2EcoreConverter extends EcoreConverter {

	private static final long serialVersionUID = 8532574382047209635L;

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getTarget(org.eclipse.emf.ecore.EStructuralFeature, org.eclipse.emf.ecore.EClass)
	 */
	@Override
	protected EStructuralFeature getTarget(
			EStructuralFeature sourceEStructuralFeature, EClass targetEClass) {

		for (int i = 0, size = targetEClass.getFeatureCount(); i < size; ++i) {

			EStructuralFeature targetEStructuralFeature = targetEClass
					.getEStructuralFeature(i);

			if (targetEStructuralFeature.isChangeable()
					&& !targetEStructuralFeature.isDerived()) {
				if (targetEStructuralFeature instanceof EAttribute
						&& (targetEStructuralFeature.getName())
								.equalsIgnoreCase(sourceEStructuralFeature
										.getName())) {
					return targetEStructuralFeature;
				} else if (targetEStructuralFeature instanceof EReference
						&& (targetEStructuralFeature.getName())
								.equalsIgnoreCase(sourceEStructuralFeature
										.getName())) {
					return targetEStructuralFeature;
				}
			}
		}

		return null;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getContainer(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected EObject getContainer(EObject eObject) {
		/*
		 * Returns the parent of the element. By default the immediate parent is
		 * returned. For elements which are of type XSDType, the parent of
		 * parent is returned
		 */
		EObject parent = super.getContainer(eObject);

		if (parent != null && isXSDType(parent.eClass()))
			return parent.eContainer();

		return parent;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getReferenceByType(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected EReference getReferenceByType(EObject eObject, EObject container) {

		// TODO: Optimize getting reference by type
		if (!uriEquals(eObject, container)) {
			return eObject.eContainmentFeature();
		}

		for (int i = 0, isize = container.eClass().getFeatureCount(); i < isize; ++i) {

			EStructuralFeature eStructuralFeature = container.eClass()
					.getEStructuralFeature(i);

			if (eStructuralFeature.isChangeable()) {

				if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference) eStructuralFeature;

					if (isXSDType((EClass) eReference.getEType())) {
						for (int j = 0, jsize = ((EClass) eReference.getEType())
								.getFeatureCount(); j < jsize; ++j) {
							EStructuralFeature xsdTypeEStructuralFeature = ((EClass) eReference
									.getEType()).getEStructuralFeature(j);
							if (xsdTypeEStructuralFeature instanceof EReference) {
								EReference xsdTypeEReference = (EReference) xsdTypeEStructuralFeature;
								if (xsdTypeEReference.getEType().equals(
										eObject.eClass())
										|| ((EClass) xsdTypeEReference
												.getEType())
												.isSuperTypeOf(eObject.eClass()))
									return eReference;
							}

						}
					}
					if (eReference.getEType().equals(eObject.eClass())
							|| ((EClass) eReference.getEType())
									.isSuperTypeOf(eObject.eClass())

					)
						return eReference;

				}
			}

		}

		return null;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#canCopyAttribute(org.eclipse.emf.ecore.EAttribute, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected boolean canCopyAttribute(EAttribute eAttribute, EObject source) {
		return super.canCopyAttribute(eAttribute, source)
				&& !(source instanceof AnyType)
				&& !(eAttribute.getEAttributeType().getName()
						.equals("EFeatureMapEntry"));
	}
	
	@Override
	protected EObject getReferencedEObject(EObject eObject,
			EReference eReference) {

		EObject referencedEObject = null;

		if (isXSDReference(eObject.eClass())) {

			eObject = eObject.eCrossReferences().get(0);

			if (eObject != null)
				referencedEObject = super.getReferencedEObject(eObject,
						eReference);
		}
		return referencedEObject;
	}
	
	@Override
	protected List<EObject> getAllReferencedEObjects(EObject eObject,
			EReference eReference) {

		EObject referencedEObject = null;
		
		List<EObject> referencedEObjects = new ArrayList<EObject>();

		if (isXSDReference(eObject.eClass())) {
			for (EObject sourceEObject : eObject.eCrossReferences()) {
				referencedEObject = super.getReferencedEObject(sourceEObject,
						eReference);
				referencedEObjects.add(referencedEObject);
			}
		}

		return referencedEObjects;
	}
	
	@Override
	protected void copyReference(EReference sourceEReference,
			EObject sourceEObject, EObject targetEObject) {

		if (canCopyReference(sourceEReference, sourceEObject)) {

			// Get the target EReference
			EReference targetEReference = (EReference) getTarget(
					sourceEReference, targetEObject.eClass());
			
			if (targetEReference != null){
				
				if (!(sourceEReference.isContainment() && targetEReference
						.isContainment())) {

					if (sourceEReference.isMany())
						copyManyReference(sourceEReference, targetEReference,
								sourceEObject, targetEObject);
					else
						copySingleReference(sourceEReference, targetEReference,
								sourceEObject, targetEObject);

				}	
				
			}
			
		}
	}

}
