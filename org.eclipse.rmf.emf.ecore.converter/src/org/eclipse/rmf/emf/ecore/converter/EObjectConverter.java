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

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * @author Nirmal Sasidharan, itemis
 * 
 * <br/>
 * <br/>
 * 
 *         Converts an input EMF model to an output model. The implementation is
 *         similar to {@link EcoreUtil.Copier}, but differs mainly in the way
 *         how containments are copied. Additionally it provides many hooks for
 *         extension.
 * 
 *         The model conversion is a multi-step process. <br/>
 *         1. Tree navigation and containment copying <br/>
 *         2. Attribute copying <br/>
 *         3. Reference copying <br/>
 * <br/>
 *         <b>1. Tree navigation and containment copying</b> <br/>
 * <br/>
 *         The source tree is navigated in a top down, left to right manner. For
 *         each model element a target element is queried. Clients can decide to
 *         cache the created targets in the {@link EObjectConverter} map<br/>
 *         Each target element created needs to be added to a container. A check
 *         is done to see if the source element has a parent. If yes, an target
 *         element is queried for it as above and the element added as child to
 *         it. If the element has no parent in the source tree, the element is
 *         would not be added to the model and is lost.
 * 
 * <br/>
 * <br/>
 *         <b>2. Attribute copying</b> <br/>
 * <br/>
 * 
 *         After step 1, the target model is ready with all containments but
 *         without any attributes or references. To copy attributes, all
 *         elements in the cache (if cached) are pulled out and attribute values
 *         copied from source tree to target tree <br/>
 * <br/>
 * 
 *         <b>3. Reference copying</b> <br/>
 * <br/>
 *         Similar to step 2, all references are copied by pulling elements out
 *         of the cache. All containment references are ignored during this
 *         step, as they are already created as part of step 1. <br/>
 * <br/>
 *         <b>Important Hints:</b> <br/>
 * <br/>
 *         1. The following are the important methods to be overridden:<br/>
 * <br/>
 *         protected EClassifier getTarget(EClass eClass) : To return the mapped
 *         element. Required<br/>
 *         protected EStructuralFeature getTarget( EStructuralFeature
 *         sourceEStructuralFeature, EClass targetEClass) : To return mapped
 *         features. Required<br/>
 *         protected EObject getParent(EObject eObject): To return the parent in
 *         source tree. Optional. Uses eContainer by default. <br/>
 * <br/>
 *         2. For every element that is mapped and has a parent in source tree,
 *         make sure to provide a mapping for the parent element too. Remember,
 *         every element which is not contained will be lost during
 *         serialization. <br/>
 * <br/>
 *         3. Only concrete elements should be mapped. That is, no interfaces or
 *         abstract elements<br/>
 * <br/>
 * 
 * @param eObjects
 *            The objects to be converted.
 * @return Another representation of the objects.
 */

public class EObjectConverter extends LinkedHashMap<EObject, EObject> {

	private static final long serialVersionUID = 9178885278748174232L;
	protected DiagnosticChain diagnostics;

	/**
	 * Converts the list of {@link EObject}s to a different representation of
	 * {@link EObject}s
	 * 
	 * @param eObjects
	 *            {@link EObject}s to be transformed
	 * @return the transformed {@link EObject}s
	 */
	public Collection<? extends EObject> convert(
			Collection<? extends EObject> eObjects) {

		Collection<EObject> result = new UniqueEList.FastCompare<EObject>();

		for (EObject eObject : eObjects)
			result.add(doConvert(eObject));

		copyFeatures();

		return result;

	}

	/**
	 * Converts {@link EObject} to another form
	 * 
	 * @param sourceEObject
	 *            source {@link EObject} to be converted
	 */
	protected EObject doConvert(EObject sourceEObject) {

		EObject targetEObject = createTarget(sourceEObject);

		// Even if the source doesn't have a mapping to a target, convert
		// its children
		for (EObject sourceEObjectChild : sourceEObject.eContents()) {
			doConvert(sourceEObjectChild);
		}

		return targetEObject;
	}

	/**
	 * Creates a target {@link EObject} for the source {@link EObject}. Also
	 * adds the target to a matching container
	 * 
	 * @param sourceEObject
	 *            {@link EObject} for which a target {@link EObject} needs to be
	 *            created
	 * @return created target {@link EObject}
	 */
	protected EObject createTarget(EObject sourceEObject) {

		// Get an instance of targetEObject
		EObject targetEObject = getTarget(sourceEObject);

		if (targetEObject != null && targetEObject.eContainer() == null) {

			// Get the container for source in the source tree
			EObject sourceContainer = getContainer(sourceEObject);

			if (sourceContainer != null) {

				// Create target container
				EObject targetContainer = createTarget(sourceContainer);

				if (targetContainer != null) {

					// Get the containment EReference in source
					EReference eSourceReference = getReferenceByType(
							sourceEObject, sourceContainer);

					// Get the containment EReference in target
					// TODO: Check the name and type. There could be references
					// in target with same name but difference type
					if (eSourceReference != null) {
						EReference targetEReference = getReferenceByName(
								targetContainer, eSourceReference);
						addToContainer(targetEObject, targetContainer,
								eSourceReference, targetEReference);

					}
				}
			}
		}

		return targetEObject;

	}

	/**
	 * Returns a matching target {@link EObject}. By default a cached target
	 * {@link EObject} is returned. Subclasses may override
	 * 
	 * @param sourceEObject
	 *            {@link EObject} for which a target {@link EObject} needs to be
	 *            returned
	 * @return target {@link EObject}
	 */
	protected EObject getTarget(EObject sourceEObject) {
		return get(sourceEObject);
	}

	/**
	 * Returns a container {@link EObject}. By default the eContainer is
	 * returned. Subclasses may override.
	 * 
	 * @param eObject
	 *            {@link EObject} for which container needs to be returned
	 * @return container {@link EObject}
	 */
	protected EObject getContainer(EObject eObject) {
		return eObject.eContainer();
	}

	/**
	 * Returns the {@link EReference} on container which contains the eObject
	 * 
	 * @param referencedEObject
	 *            the {@link EObject} whose matching container
	 *            {@link EReference} is queried
	 * @param referrerEObject
	 *            the container {@link EObject}
	 * @return the {@link EReference} on container which holds eObject
	 */
	protected EReference getReferenceByType(EObject referencedEObject,
			EObject referrerEObject) {

		for (int i = 0, size = referrerEObject.eClass().getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = referrerEObject.eClass()
					.getEStructuralFeature(i);
			if (eStructuralFeature.isChangeable()) {
				if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReference.getEType()
							.equals(referencedEObject.eClass())
							|| ((EClass) eReference.getEType())
									.isSuperTypeOf(referencedEObject.eClass())

					)
						return eReference;

				}
			}

		}

		return null;

	}

	/**
	 * Returns the {@link EReference} on eObject which matches eReferenceMatch
	 * by name
	 * 
	 * @param referrerEObject
	 *            the {@link EObject} whose matching {@link EReference} is
	 *            queried
	 * @param eReferenceMatch
	 *            the matching {@link EReference} to be looked up in eObject
	 * @return the {@link EReference} on eObject which matches eReferenceMatch
	 *         by name
	 */
	protected EReference getReferenceByName(EObject referrerEObject,
			EReference eReferenceMatch) {

		for (int i = 0, size = referrerEObject.eClass().getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = referrerEObject.eClass()
					.getEStructuralFeature(i);
			if (eStructuralFeature.isChangeable()) {
				if (eStructuralFeature instanceof EReference) {
					EReference eReference = (EReference) eStructuralFeature;
					if (eReferenceMatch != null
							&& eReference.getName().equalsIgnoreCase(
									eReferenceMatch.getName()))
						return eReference;

				}
			}

		}

		return null;

	}

	/**
	 * Add object to a container. Subclasses my override
	 * 
	 * @param eObject
	 *            {@link EObject} to be add to a container
	 * @param container
	 *            Container {@link EObject} which will hold the object
	 * @param eSourceReference
	 *            TODO
	 * @param eTargetReference
	 *            the container {@link EReference}. Not used in default
	 *            implementation. Subclasses my reuse
	 */

	protected void addToContainer(EObject eObject, EObject container,
			EReference eSourceReference, EReference eTargetReference) {

		if (eTargetReference != null) {
			if (eTargetReference.isMany()) {
				@SuppressWarnings("unchecked")
				InternalEList<EObject> sourceList = (InternalEList<EObject>) container
						.eGet(eTargetReference);
				sourceList.add(eObject);

			} else
				container.eSet(eTargetReference, eObject);
		}
	}

	/**
	 * Copy features of all converted and cached elements
	 * 
	 */
	protected void copyFeatures() {

		for (Map.Entry<EObject, EObject> entry : entrySet()) {

			EObject source = entry.getKey();
			EObject target = entry.getValue();

			if (canCopyFeature(source)) {
				copyFeature(source, target);
			}
		}

	}

	/**
	 * Copy features of source element to target
	 * 
	 * @param sourceEObject
	 *            Source {@link EObject}
	 * @param targetEObject
	 *            Target {@link EObject}
	 */
	protected void copyFeature(EObject sourceEObject, EObject targetEObject) {

		EClass sourceEClass = sourceEObject.eClass();

		for (int i = 0, size = sourceEClass.getFeatureCount(); i < size; ++i) {
			EStructuralFeature eStructuralFeature = sourceEClass
					.getEStructuralFeature(i);
			if (eStructuralFeature.isChangeable()
					&& !eStructuralFeature.isDerived()) {
				if (eStructuralFeature instanceof EAttribute)
					copyAttribute((EAttribute) eStructuralFeature,
							sourceEObject, targetEObject);
				else if (eStructuralFeature instanceof EReference)
					copyReference((EReference) eStructuralFeature,
							sourceEObject, targetEObject);
			}
		}
	}

	/**
	 * Copy references from source object into target object
	 * 
	 * @param sourceEReference
	 *            {@link EReference} to be copied
	 * @param sourceEObject
	 *            Source {@link EObject}
	 * @param targetEObject
	 *            Target {@link EObject}
	 */
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

	/**
	 * Copy references of type many from source object into target object
	 * 
	 * @param sourceEReference
	 *            {@link EReference} to be copied
	 * @param sourceEObject
	 *            Source {@link EObject}
	 * @param targetEObject
	 *            Target {@link EObject}
	 * @param targetEObject2
	 */
	protected void copyManyReference(EReference sourceEReference,
			EReference targetEReference, EObject sourceEObject,
			EObject targetEObject) {

		@SuppressWarnings("unchecked")
		InternalEList<EObject> sourceList = (InternalEList<EObject>) sourceEObject
				.eGet(sourceEReference);

		@SuppressWarnings("unchecked")
		InternalEList<EObject> targetList = (InternalEList<EObject>) targetEObject
				.eGet(targetEReference);

		if (sourceList != null && targetList != null) {
			if (sourceList.isEmpty())
				targetList.clear();
			else {
				boolean isBidirectional = sourceEReference.getEOpposite() != null;
				int index = 0;
				for (Iterator<EObject> k = sourceList.iterator(); k.hasNext();) {
					EObject sourceReferenceEObject = k.next();
					EObject targetReferenceEObject = get(sourceReferenceEObject);
					if (targetReferenceEObject != null) {
						if (isBidirectional) {
							int position = targetList
									.indexOf(targetReferenceEObject);
							if (position == -1) {
								targetList.addUnique(index,
										targetReferenceEObject);
							} else if (index != position) {
								targetList.move(index, targetReferenceEObject);
							}
						} else 
								targetList.addUnique(index,
										targetReferenceEObject);
						++index;
					}
				}
			}
		}
	}

	/**
	 * Copy references of type single from source object into target object
	 * 
	 * @param sourceEReference
	 *            {@link EReference} to be copied
	 * @param sourceEObject
	 *            Source {@link EObject}
	 * @param targetEObject
	 *            Target {@link EObject}
	 */
	protected void copySingleReference(EReference sourceEReference,
			EReference targetEReference, EObject sourceEObject,
			EObject targetEObject) {

		Object sourceReferenceEObject = sourceEObject.eGet(sourceEReference);

		if (sourceReferenceEObject != null) {

			if (targetEReference.isMany()) {

				@SuppressWarnings("unchecked")
				InternalEList<EObject> targetList = (InternalEList<EObject>) targetEObject
						.eGet(targetEReference);
				if (targetList != null) {
					List<EObject> targetReferenceEObjects = getAllReferencedEObjects(
							(EObject) sourceReferenceEObject,
							(EReference) targetEReference);

					if (targetReferenceEObjects != null) {
						for (EObject targetReferenceEObject : targetReferenceEObjects)
							targetList.add(targetReferenceEObject);
					}
				}

			} else {
				Object targetReferenceEObject = getReferencedEObject(
						(EObject) sourceReferenceEObject,
						(EReference) targetEReference);
				if (targetReferenceEObject != null)
					targetEObject
							.eSet(targetEReference, targetReferenceEObject);
			}
		}
	}

	protected List<EObject> getAllReferencedEObjects(EObject sourceEObject,
			EReference eReference) {
		return null;
	}

	/**
	 * Returns target {@link EObject} referred by eReference. By default the
	 * cached target {@link EObject} is returned. Subclasses may override
	 * 
	 * @param sourceEObject
	 *            EObject referred by eReference
	 * @param eReference
	 *            the {@link EReference} whose target is required
	 * @return target {@link EObject} referred by eReference
	 */
	protected EObject getReferencedEObject(EObject sourceEObject,
			EReference eReference) {
		return get(sourceEObject);
	}

	/**
	 * Copy attributes of source object into target object
	 * 
	 * @param eAttribute
	 *            {@link EAttribute} to be copied
	 * @param sourceEObject
	 *            Source {@link EObject}
	 * @param targetEObject
	 *            Target {@link EObject}
	 */
	protected void copyAttribute(EAttribute eAttribute, EObject sourceEObject,
			EObject targetEObject) {

		if (canCopyAttribute(eAttribute, sourceEObject)) {

			if (eAttribute.isMany()) {

				List<?> sourceList = (List<?>) sourceEObject.eGet(eAttribute);
				@SuppressWarnings("unchecked")
				List<Object> targetList = (List<Object>) targetEObject
						.eGet(getTarget(eAttribute, targetEObject.eClass()));

				if (sourceList != null && targetList != null) {
					if (sourceList.isEmpty())
						targetList.clear();
					else
						targetList.addAll(sourceList);
				}
			} else {

				EStructuralFeature targetEStructuralFeature = getTarget(
						eAttribute, targetEObject.eClass());
				
				if (targetEStructuralFeature != null) {

					Object value = null;

					if (eAttribute.getEType() instanceof EEnum) {
						EEnum targetEnum = getTarget((EEnum) eAttribute
								.getEType());
						if (targetEnum != null)
							value = ((EEnum) targetEnum).getEEnumLiteral(
									((Enumerator) sourceEObject
											.eGet(eAttribute)).getValue())
									.getInstance();
					} else
						value = sourceEObject.eGet(eAttribute);
					
					if (value != null)
						targetEObject.eSet(targetEStructuralFeature, value);
				}

			}
		}

	}

	/**
	 * Return the target {@link EStructuralFeature}
	 * 
	 * @param sourceEStructuralFeature
	 *            Source {@link EStructuralFeature}
	 * @param targetEClass
	 *            Target {@link EClass}
	 * @return Target {@link EStructuralFeature}
	 */
	protected EStructuralFeature getTarget(
			EStructuralFeature sourceEStructuralFeature, EClass targetEClass) {

		for (int i = 0, size = targetEClass.getFeatureCount(); i < size; ++i) {

			EStructuralFeature targetEStructuralFeature = targetEClass
					.getEStructuralFeature(i);

			if (targetEStructuralFeature.isChangeable()
					&& !targetEStructuralFeature.isDerived()) {
				if (targetEStructuralFeature instanceof EAttribute
						&& (targetEStructuralFeature.getName())
								.equals(sourceEStructuralFeature.getName())) {
					return targetEStructuralFeature;
				} else if (targetEStructuralFeature instanceof EReference
						&& (targetEStructuralFeature.getName())
								.equals(sourceEStructuralFeature.getName())) {
					return targetEStructuralFeature;
				}
			}
		}

		return null;

	}

	protected EEnum getTarget(EEnum eEnum) {
		return null;
	}

	/**
	 * Checks if the {@link EReference} can be used as a container reference
	 * 
	 * @param eReference
	 *            {@link EReference} container
	 * @return true, if {@link EReference} is a container, else false
	 */
	protected boolean canAddToContainer(EReference eReference) {
		return eReference.isContainment();
	}

	/**
	 * Checks if features of {@link EObject} source can be copied
	 * 
	 * @param source
	 *            {@link EObject} source
	 * @return true, if features on {@link EObject} can be copied, else false
	 */
	protected boolean canCopyFeature(EObject source) {
		return !(source instanceof EClass);
	}

	/**
	 * Checks if {@link EAttribute} of {@link EObject} source can be copied
	 * 
	 * @param eAttribute
	 *            {@link EAttribute} to be copied
	 * @param source
	 *            {@link EObject} source
	 * @return true, if {@link EAttribute} on {@link EObject} can be copied,
	 *         else false
	 */
	protected boolean canCopyAttribute(EAttribute eAttribute, EObject source) {
		return source.eIsSet(eAttribute);
	}

	/**
	 * Checks if {@link EReference} of {@link EObject} source can be copied
	 * 
	 * @param eReference
	 *            {@link EReference} to be copied
	 * @param source
	 *            {@link EObject} source
	 * @return true, if {@link EReference} on {@link EObject} can be copied,
	 *         else false
	 */
	protected boolean canCopyReference(EReference eReference, EObject source) {
		return source.eIsSet(eReference);
	}

}
