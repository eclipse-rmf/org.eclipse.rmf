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
package org.eclipse.rmf.reqif10.pror.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecType;

/**
 * Virtual node for grouping {@link SpecType}s together.
 * <p>
 * 
 */
public class VirtualSpecTypeItemProvider extends
		TransientReqIFItemProvider {

	public VirtualSpecTypeItemProvider(AdapterFactory adapterFactory,
			ReqIFContent content) {
		super(adapterFactory, content);
	}

	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES);
		}
		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "SpecTypes";
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/VirtualSpecType.png"));
	}
	
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, target);		
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecObjectType()));
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecificationType()));
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createSpecRelationType()));
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_TYPES,
				ReqIF10Factory.eINSTANCE.createRelationGroupType()));
	}

}
