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
package org.eclipse.rmf.rif12.resource.converters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.rmf.emf.ecore.converter.Ecore2XMLConverter;
import org.eclipse.rmf.rif12.DataTypes.DataTypesPackage;
import org.eclipse.rmf.rif12.DataTypes.XhtmlContent;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.RIFToolExtension;
import org.eclipse.rmf.rif12.resource.extensions.RifToolExtensionAny;
import org.eclipse.rmf.rif12.resource.extensions.XhtmlContentAny;
import org.eclipse.rmf.rif12.xsd.RIFTOOLEXTENSION;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.XHTMLCONTENT;

/**
 * 
 * Converts RIF Ecore Model to a RIF XML Model
 * 
 * @author Nirmal Sasidharan
 * 
 */
public class Rif2XMLConverter extends Ecore2XMLConverter {

	private static final long serialVersionUID = -8618611743496024185L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * EObjectConverter#getTarget(org.eclipse.
	 * emf.ecore.EObject)
	 */
	@Override
	protected EObject getTarget(EObject sourceEObject) {

		// Check if a target is already created and cached
		EObject targetEObject = super.getTarget(sourceEObject);

		if (targetEObject == null) {

			// If the source object belongs to Rif Ecore model (and not from
			// XHTML or other tool extensions)
			if (uriEquals(sourceEObject, ExchangeFilePackage.eINSTANCE)) {

				EClass targetEClass = (EClass) RifPackage.eINSTANCE
						.getEClassifier(sourceEObject.eClass().getName()
								.toUpperCase());
				if (targetEClass != null)
					targetEObject = EcoreUtil.create(targetEClass);

			} else {

				if (sourceEObject instanceof RIFToolExtension
						|| sourceEObject instanceof XhtmlContent) {
					EClass targetEClass = null;
					if (sourceEObject instanceof RIFToolExtension) {
						targetEClass = (EClass) RifPackage.eINSTANCE
								.getEClassifier(ExchangeFilePackage.eINSTANCE
										.getRIFToolExtension().getName()
										.toUpperCase());
					} else if (sourceEObject instanceof XhtmlContent) {
						targetEClass = (EClass) RifPackage.eINSTANCE
								.getEClassifier(DataTypesPackage.eINSTANCE
										.getXhtmlContent().getName()
										.toUpperCase());
					}

					if (targetEClass != null)
						targetEObject = EcoreUtil.create(targetEClass);

				} else if (sourceEObject.eContainer() instanceof RIFToolExtension
						|| sourceEObject.eContainer() instanceof XhtmlContent) {

					// TODO: Optimize adding to container in this function.
					// Maybe it fits somewhere else

					// Code duplicated as RIFTOOLEXTENSION and XHTMLCONTENT has
					// no common interface from EMF
					if (sourceEObject.eContainer() instanceof RIFToolExtension) {
						RIFTOOLEXTENSION rIFTOOLEXTENSION = (RIFTOOLEXTENSION) super
								.getTarget(sourceEObject.eContainer());
						EStructuralFeature demandedFeature = createFeature(sourceEObject);
						targetEObject = EcoreUtil.copy(sourceEObject);
						rIFTOOLEXTENSION.getAny().add(demandedFeature,
								targetEObject);
					} else if (sourceEObject.eContainer() instanceof XhtmlContent) {
						XHTMLCONTENT xHTMLCONTENT = (XHTMLCONTENT) super
								.getTarget(sourceEObject.eContainer());
						EStructuralFeature demandedFeature = createFeature(sourceEObject);
						targetEObject = EcoreUtil.copy(sourceEObject);
						xHTMLCONTENT.getAny().add(demandedFeature,
								targetEObject);
					}

				}
			}

			if (targetEObject != null)
				put(sourceEObject, targetEObject);

			//Copy contents of XHTML and Tool Extensions
			if (sourceEObject instanceof RifToolExtensionAny) {
				((RIFTOOLEXTENSION) targetEObject).getAny().addAll(
						((RifToolExtensionAny) sourceEObject).getAny());
			} else if (sourceEObject instanceof XhtmlContentAny) {
				((XHTMLCONTENT) targetEObject).getAny().addAll(
						((XhtmlContentAny) sourceEObject).getAny());
			}

		}
		return targetEObject;
	}
	
	@Override
	protected EEnum getTarget(EEnum eEnum) {
		EEnum targetEnum = (EEnum) RifPackage.eINSTANCE
				.getEClassifier(eEnum.getName().toUpperCase());
		return targetEnum;
	}

	protected EStructuralFeature createFeature(EObject eObject) {
		ExtendedMetaData emd = new BasicExtendedMetaData(
				EPackage.Registry.INSTANCE);
		EStructuralFeature demandedFeature = emd.demandFeature(eObject.eClass()
				.getEPackage().getNsURI(), eObject.eContainmentFeature()
				.getName(), true);
		return demandedFeature;
	}
	
	@Override
	protected void copyReference(EReference sourceEReference,
			EObject sourceEObject, EObject targetEObject) {
		if (uriEquals(sourceEObject, ExchangeFilePackage.eINSTANCE))
			super.copyReference(sourceEReference, sourceEObject, targetEObject);
	}

}
