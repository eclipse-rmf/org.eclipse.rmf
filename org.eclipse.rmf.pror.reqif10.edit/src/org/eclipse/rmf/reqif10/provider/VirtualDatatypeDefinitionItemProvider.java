/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.Reqif10Factory;
import org.eclipse.rmf.reqif10.Reqif10Package;

/**
 * Virtual node for grouping {@link DatatypeDefinition}s together.
 * <p>
 */
public class VirtualDatatypeDefinitionItemProvider extends
		TransientReqIFItemProvider {

	public VirtualDatatypeDefinitionItemProvider(AdapterFactory adapterFactory,
			ReqIfContent content) {
		super(adapterFactory, content);
	}

	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES);
		}
		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Datatypes";
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator()
						.getImage("full/obj16/VirtualDatatypes.png"));
	}

	/**
	 * Here, we explicitly add a child descriptor for every type that we allow.
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, target);
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionString()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionBoolean()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionInteger()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionReal()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionDate()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionEnumeration()));
		newChildDescriptors.add(createChildParameter(
				Reqif10Package.Literals.REQ_IF_CONTENT__DATATYPES,
				Reqif10Factory.eINSTANCE.createDatatypeDefinitionXhtml()));
	}

}
