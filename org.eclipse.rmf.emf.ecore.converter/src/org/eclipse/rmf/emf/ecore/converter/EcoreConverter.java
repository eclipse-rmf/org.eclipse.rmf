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

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public class EcoreConverter extends EObjectConverter {

	private static final long serialVersionUID = 9037195980640743838L;
	public static final String EXTENDED_METADATA = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";

	@Override
	protected boolean canAddToContainer(EReference eReference) {
		return true;
	}

	/**
	 * Checks if the {@link EClass} is an XSD type class. An XSD type class has
	 * an extended metadata annotation with name as "&lt;name&gt;_._type"
	 * 
	 * @param eClass
	 *            {@link EClass} which needs to be checked if it is of type
	 *            XSDType
	 * @return true if XSDType, else false
	 */
	protected boolean isXSDType(EClass eClass) {

		EAnnotation eAnnotation = eClass.getEAnnotation(EXTENDED_METADATA);
		if (eAnnotation != null) {
			String name = eAnnotation.getDetails().get("name");
			if (name != null && name.length() != 0 && name.length() > 5) {
				if (name.substring(name.length() - 5, name.length()).equals(
						"_type"))
					return true;
			}
		}
		return false;
	}

	/**
	 * Checks if the {@link EClass} is an XSD container type class. An XSD
	 * container type is an XSD type with atleast one containment reference
	 * 
	 * @param eClass
	 *            {@link EClass} which needs to be checked if it is of type XSD
	 *            Container type
	 * @return true if XSD container type, else false
	 */
	protected boolean isXSDContainer(EClass eClass) {
		if (isXSDType(eClass) && hasContainments(eClass))
			return true;
			
		return false;
	}
	
	/**
	 * Checks if the {@link EClass} is an XSD reference type class. An XSD
	 * reference type is an XSD type with atleast one reference
	 * 
	 * @param eClass
	 *            {@link EClass} which needs to be checked if it is of type XSD
	 *            reference type
	 * @return true if XSD reference type, else false
	 */
	protected boolean isXSDReference(EClass eClass) {
		if (isXSDType(eClass) && hasReferences(eClass))
			return true;
		return false;
	}
	
	protected boolean hasContainments(EClass eClass) {
		for (EReference eReference : eClass.getEReferences()) {
			if (eReference.isContainment())
				return true;
		}
		return false;
	}
	
	private boolean hasReferences(EClass eClass) {
		return  eClass.eCrossReferences().size() > 0;
	}
	

	/**
	 * Returns the extended {@link EClass} name. The name is stored as extended
	 * metadata annotation. For example, an {@link EClass}
	 * ATTRIBUTEDEFINITIONSIMPLE, could have the extended name stored in
	 * extended metadata as ATTRIBUTE-DEFINITION-SIMPLE
	 * 
	 * @param eClass
	 *            {@link EClass} for which the extended {@link EClass} name is
	 *            required
	 * @return the extended {@link EClass} name
	 */
	protected String getExtendedEClassName(EClass eClass) {

		EAnnotation eAnnotation = eClass.getEAnnotation(EXTENDED_METADATA);
		if (eAnnotation != null) {
			String name = eAnnotation.getDetails().get("name");
			if (name.indexOf("_") != -1)
				name = name.substring(0, name.indexOf("_"));
			return name;
		}
		return null;
	}
	
	protected String getExtendedEClassName(EEnum eClass) {

		EAnnotation eAnnotation = eClass.getEAnnotation(EXTENDED_METADATA);
		if (eAnnotation != null) {
			String name = eAnnotation.getDetails().get("name");
			if (name.indexOf("_") != -1)
				name = name.substring(0, name.indexOf("_"));
			return name;
		}
		return null;
	}

	/**
	 * Checks if both {@link EObject}s come from the same {@link EPackage}
	 * 
	 * @param eObject1
	 *            {@link EObject}
	 * @param eObject2
	 *            {@link EObject}
	 * @return true, if both {@link EObject}s belong to the same
	 *         {@link EPackage}, else false
	 */
	protected boolean uriEquals(EObject eObject1, EObject eObject2) {
		return eObject1.eClass().getEPackage().getNsURI()
				.equals(eObject2.eClass().getEPackage().getNsURI());

	}

	/**
	 * Checks if an {@link EObject}s belongs to a {@link EPackage}
	 * 
	 * @param eObject
	 *            {@link EObject}
	 * @param eObject
	 *            {@link EPackage}
	 * @return true, if {@link EObject}s belong to the {@link EPackage}, else
	 *         false
	 */
	protected boolean uriEquals(EObject eObject, EPackage ePackage) {
		return eObject.eClass().getEPackage().getNsURI()
				.equals(ePackage.getNsURI());

	}

}
