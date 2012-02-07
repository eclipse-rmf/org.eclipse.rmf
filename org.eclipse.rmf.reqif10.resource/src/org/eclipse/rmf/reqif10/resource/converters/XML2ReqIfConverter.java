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
package org.eclipse.rmf.reqif10.resource.converters;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.rmf.emf.ecore.converter.XML2EcoreConverter;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.datatypes.DatatypesPackage;
import org.eclipse.rmf.reqif10.datatypes.XhtmlContent;
import org.eclipse.rmf.reqif10.resource.extensions.ReqIfToolExtensionAny;
import org.eclipse.rmf.reqif10.resource.extensions.ReqIfToolExtensionConfiguration;
import org.eclipse.rmf.reqif10.resource.extensions.XhtmlContentAny;
import org.eclipse.rmf.reqif10.resource.extensions.XhtmlContentAnyImpl;
import org.eclipse.rmf.reqif10.xsd.REQIFTOOLEXTENSION;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.XHTMLCONTENT;

/**
 * 
 * Converts RIF XML Model to RIF Ecore Model
 * 
 * @author Nirmal Sasidharan
 * 
 */
public class XML2ReqIfConverter extends XML2EcoreConverter {

	private static final long serialVersionUID = 1291249961170321730L;

	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#getTarget(org.eclipse.emf.ecore.EObject)
	 */
	@Override
	protected EObject getTarget(EObject sourceEObject) {

		// Check if a target is already created and cached
		EObject targetEObject = super.getTarget(sourceEObject);

		if (targetEObject == null) {
			// If XSD model
			if (uriEquals(sourceEObject, ReqifPackage.eINSTANCE)) {
				// Do no create target object for XSDType container & references
				if (isXSDContainer(sourceEObject.eClass())
						|| isXSDReference(sourceEObject.eClass()))
					return null;
				else if (sourceEObject instanceof REQIFTOOLEXTENSION) {
					targetEObject = ReqIfToolExtensionConfiguration.INSTANCE
					.getRifToolExtension();
					// TODO: Check if it is necessary to make a copy of source
					// object
					if (targetEObject instanceof ReqIfToolExtensionAny )
						((ReqIfToolExtensionAny) targetEObject).getAny().addAll(
								((REQIFTOOLEXTENSION) sourceEObject).getAny());

				} else if (sourceEObject instanceof XHTMLCONTENT) {
					targetEObject = new XhtmlContentAnyImpl();
					// TODO: Check if it is necessary to make a copy of source
					// object
					((XhtmlContentAny) targetEObject).getAny().addAll(
							((XHTMLCONTENT) sourceEObject).getAny());

				} else {
					EClass targetEClass = (EClass) Reqif10Package.eINSTANCE
							.getEClassifier(makeCamelCase(getExtendedEClassName(sourceEObject
									.eClass())));
					if (targetEClass != null)
						targetEObject = EcoreUtil.create(targetEClass);
				}

				if (targetEObject != null)
					put(sourceEObject, targetEObject);
			}else {
				if (sourceEObject.eContainer() instanceof REQIFTOOLEXTENSION
						|| sourceEObject.eContainer() instanceof XHTMLCONTENT) {
					// Copying without resolving references
					EcoreUtil.Copier copier = new EcoreUtil.Copier(false);
					targetEObject = copier.copy(sourceEObject);
					copier.copyReferences();
					put(sourceEObject, targetEObject);
				}
			}

		}

		return targetEObject;
	}
	
	@Override
	protected EEnum getTarget(EEnum eEnum) {
		EEnum targetEnum = (EEnum) DatatypesPackage.eINSTANCE
				.getEClassifier(makeCamelCase(getExtendedEClassName(eEnum)));
		return targetEnum;
	}

	/**
	 * Creates CamelCase string from a hypen separated string
	 * @param s Hyphen separated string
	 * @return Camelcased string
	 */
	protected String makeCamelCase(String s) {
		return makeProperCase(s.split("-"));
	}

	private String makeProperCase(String s) {
		// RIF string needs special handling. This is a RIF model
		// design bug
		return s.length() != 0 ? s.equals("REQ-IF") ? s.toUpperCase() : s.substring(
				0, 1).toUpperCase()
				+ s.substring(1).toLowerCase() : s;
	}

	private String makeProperCase(String[] s) {

		StringBuffer result = new StringBuffer();
		for (int i = 0; i < s.length; i++)
			result.append(makeProperCase(s[i]));

		return result.toString();

	}
	
	
	@Override
	protected void copyReference(EReference sourceEReference,
			EObject sourceEObject, EObject targetEObject) {
		if (uriEquals(sourceEObject, ReqifPackage.eINSTANCE))
			super.copyReference(sourceEReference, sourceEObject, targetEObject);
	}

	
	/* (non-Javadoc)
	 * @see org.eclipse.rmf.emf.ecore.converter.EObjectConverter#addToContainer(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EReference)
	 */
	@Override
	protected void addToContainer(EObject eObject, EObject container,
			EReference eSourceReference, EReference eTargetReference) {
		if (container instanceof ReqIfToolExtensionAny) {
			ExtendedMetaData emd = new BasicExtendedMetaData(
					EPackage.Registry.INSTANCE);
			EStructuralFeature demandedFeature = emd.demandFeature(eObject
					.eClass().getEPackage().getNsURI(),
					eSourceReference.getName(), true);
			((ReqIfToolExtensionAny) container).getAny().add(demandedFeature,
					eObject);
		} else if (container instanceof XhtmlContent) {
			ExtendedMetaData emd = new BasicExtendedMetaData(
					EPackage.Registry.INSTANCE);
			EStructuralFeature demandedFeature = emd.demandFeature(eObject
					.eClass().getEPackage().getNsURI(),
					eSourceReference.getName(), true);
			((XhtmlContentAny) container).getAny()
					.add(demandedFeature, eObject);
		} else
			super.addToContainer(eObject, container, eSourceReference,
					eTargetReference);
	}
	

}
