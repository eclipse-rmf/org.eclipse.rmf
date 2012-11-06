/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.SpecificationType;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * Virtual node for grouping {@link Specification}s together.
 * <p>
 * 
 * TODO We explicitly register a Listener for the Outline (in ReqIFEditor), but
 * it would be better if the model would magically refresh itself. It doesn't do
 * this, because this provider isn't a {@link Notifier}.
 */
public class VirtualSpecificationsItemProvider extends
		TransientReqIFItemProvider {

	public VirtualSpecificationsItemProvider(AdapterFactory adapterFactory,
			ReqIFContent content) {
		super(adapterFactory, content);
	}

	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS);
		}
		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "Specifications";
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/VirtualSpecifications.png"));
	}
	
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		
		super.collectNewChildDescriptors(newChildDescriptors, target);
		
		// Allow creation of new untyped Specifications
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS,
				ReqIF10Factory.eINSTANCE.createSpecification()));
		
		// Allow creation of typed Specifications
		ProrUtil.collectNewChildDescriptorsForTypeCreators(newChildDescriptors,
				target,
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS, SpecificationType.class);
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain,
			EObject owner, EStructuralFeature feature, Object value, int index,
			Collection<?> collection) {

		if (value instanceof SpecType) {
			return ProrUtil.createAddTypedElementCommand(owner,
					ReqIF10Package.Literals.REQ_IF_CONTENT__SPECIFICATIONS,
					ReqIF10Factory.eINSTANCE.createSpecification(),
					ReqIF10Package.Literals.SPECIFICATION__TYPE,
					(SpecType) value, index, 0, domain,
					adapterFactory);
		}

		return super.createCreateChildCommand(domain, owner, feature, value,
				index, collection);
	}

	@Override
	public Collection<?> getChildren(Object object) {
		Collection<?> children = super.getChildren(object);
		return children;
	}

}
