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

import java.util.Iterator;
import java.util.LinkedHashMap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * Converts a domain Ecore Model to its XSD Model
 * 
 * @author Nirmal Sasidharan
 *
 */
public class Ecore2XMLConverter extends EcoreConverter {

	private static final long serialVersionUID = 8532574382047209635L;
	private LinkedHashMap<EObject, LinkedHashMap<EObject, EObject>> typeContainer = new LinkedHashMap<EObject, LinkedHashMap<EObject, EObject>>();

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#addToContainer(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EReference)
	 */
	@Override
	protected void addToContainer(EObject eObject, EObject container,
			EReference eSourceReference, EReference eTargetReference) {

		if (eTargetReference != null) {

			if (isXSDType((EClass) eTargetReference.getEType())) {

				EObject xsdTypeEObject = getXSDType(container, eTargetReference);

				EReference targetEReference = null;

				if (xsdTypeEObject != null)
					targetEReference = getReferenceByType(eObject,
							xsdTypeEObject);

				if (targetEReference != null) {
					if (targetEReference.isMany()) {
						@SuppressWarnings("unchecked")
						InternalEList<EObject> targetList = (InternalEList<EObject>) xsdTypeEObject
								.eGet(targetEReference);
						if (targetList != null)
							targetList.add(eObject);

					} else
						xsdTypeEObject.eSet(targetEReference, eObject);

				}

				eObject = xsdTypeEObject;

			}
			if (eTargetReference.isMany()) {
				@SuppressWarnings("unchecked")
				InternalEList<EObject> sourceList = (InternalEList<EObject>) container
						.eGet(eTargetReference);
				if (sourceList != null)
					sourceList.add(eObject);

			} else
				container.eSet(eTargetReference, eObject);

		}
	}
	
	
	/**
	 * Returns the XSDType class
	 * @param eObject {@link EObject} container of XSDType
	 * @param eReference {@link EReference} to XSDType
	 * @return the XSDType
	 */
	protected EObject getXSDType(EObject eObject, EReference eReference) {
	
		EObject eReferenceType = null;
		
		LinkedHashMap<EObject, EObject> types = typeContainer
				.get(eObject);
	
		if (types == null) {
			types = new LinkedHashMap<EObject, EObject>();
			typeContainer.put(eObject, types);
		} else
			eReferenceType = types.get(eReference.getEType());

		if (eReferenceType == null) {
			eReferenceType = EcoreUtil
					.create((EClass)eReference.getEType());
			types.put(eReference.getEType(), eReferenceType);

		}
		
		return eReferenceType;

	}

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getReferenceByType(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected EReference getReferenceByType(EObject eObject, EObject container) {

		EReference eContainmentReference = null;

		for (int i = 0, size = container.eClass().getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = container.eClass()
					.getEStructuralFeature(i);

			if (eStructuralFeature.isChangeable()) {
				if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.getEType().equals(eObject.eClass())
							|| ((EClass) eReference.getEType())
									.isSuperTypeOf(eObject.eClass())

					)
						eContainmentReference = eReference;

				}
			}

		}

		return eContainmentReference;

	}

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
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getReferencedEObject(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference)
	 */
	@Override
	protected EObject getReferencedEObject(EObject eObject,
			EReference eReference) {
		EObject referencedEObject = super.getReferencedEObject(eObject,
				eReference);
		if (referencedEObject != null
				&& !referencedEObject.eClass().equals(eReference.getEType())) {
			
			//TODO: What about caching?
			EObject targetEObject = EcoreUtil.create((EClass) eReference
					.getEType());

			for (int i = 0, size = targetEObject.eClass().getFeatureCount(); i < size; ++i) {

				EStructuralFeature targetEStructuralFeature = targetEObject
						.eClass().getEStructuralFeature(i);

				if (targetEStructuralFeature.isChangeable()
						&& !targetEStructuralFeature.isDerived()) {
					if (targetEStructuralFeature instanceof EReference
							&& (((EReference) targetEStructuralFeature)
									.getEType().getName())
									.equalsIgnoreCase(referencedEObject
											.eClass().getName())) {
						targetEObject.eSet(targetEStructuralFeature,
								referencedEObject);
						return targetEObject;
					}
				}
			}

		}
		return referencedEObject;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#copyManyReference(org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	protected void copyManyReference(EReference sourceEReference,
			EReference targetEReference, EObject sourceEObject,
			EObject targetEObject) {

		InternalEList<EObject> sourceList = (InternalEList<EObject>) sourceEObject
				.eGet(sourceEReference);
		InternalEList<EObject> targetList = null;

		EObject targetXSDType = getXSDType(targetEObject,
				(EReference) targetEReference);

		if (targetXSDType != null) {

			targetEObject.eSet(targetEReference, targetXSDType);

			for (int i = 0, size = targetXSDType.eClass().getFeatureCount(); i < size; ++i) {

				EStructuralFeature targetEStructuralFeature = targetXSDType
						.eClass().getEStructuralFeature(i);

				if (targetEStructuralFeature instanceof EReference
						&& (((EReference) targetEStructuralFeature).getEType()
								.getName()).equalsIgnoreCase(sourceEReference
								.getEType().getName())) {

					targetList = (InternalEList<EObject>) targetXSDType
							.eGet(targetEStructuralFeature);
				}
			}
		}

		if (sourceList != null && targetList != null) {
			if (sourceList.isEmpty())
				targetList.clear();
			else {
				boolean isBidirectional = sourceEReference.getEOpposite() != null;
				int index = 0;
				for (Iterator<EObject> k = sourceList.iterator(); k.hasNext();) {
					EObject referencedEObject = k.next();
					EObject copyReferencedEObject = get(referencedEObject);
					if (copyReferencedEObject != null) {
						if (isBidirectional) {
							int position = targetList
									.indexOf(copyReferencedEObject);
							if (position == -1) {
								targetList.addUnique(index,
										copyReferencedEObject);
							} else if (index != position) {
								targetList.move(index, copyReferencedEObject);
							}
						} else {
							targetList.addUnique(index, copyReferencedEObject);
						}
						++index;
					}
				}
			}
		}
	}

}
