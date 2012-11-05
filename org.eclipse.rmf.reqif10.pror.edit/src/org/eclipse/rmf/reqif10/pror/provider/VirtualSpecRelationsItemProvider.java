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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.SpecRelationType;
import org.eclipse.rmf.reqif10.SpecType;
import org.eclipse.rmf.reqif10.Specification;
import org.eclipse.rmf.reqif10.pror.util.ProrUtil;

/**
 * Virtual node for grouping {@link Specification}s together.
 * <p>
 * 
 */
public class VirtualSpecRelationsItemProvider extends
		TransientReqIFItemProvider {

	public VirtualSpecRelationsItemProvider(AdapterFactory adapterFactory,
			ReqIFContent content) {
		super(adapterFactory, content);
	}

	@Override
	protected Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS);
		}
		return childrenFeatures;
	}

	@Override
	public String getText(Object object) {
		return "SpecRelations";
	}

	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/VirtualSpecRelations.png"));
	}

	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, target);
		
		// Allow creation of new untyped SpecRelations
		newChildDescriptors.add(createChildParameter(
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
				ReqIF10Factory.eINSTANCE.createSpecRelation()));
		
		// Allow creation of typed SpecRelations
		ProrUtil.collectNewChildDescriptorsForTypeCreators(newChildDescriptors,
				target,
				ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS, SpecRelationType.class);
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain,
			EObject owner, EStructuralFeature feature, Object value, int index,
			Collection<?> collection) {

		if (value instanceof SpecType) {
			return ProrUtil.createAddTypedElementCommand(owner,
					ReqIF10Package.Literals.REQ_IF_CONTENT__SPEC_RELATIONS,
					ReqIF10Factory.eINSTANCE.createSpecRelation(),
					ReqIF10Package.Literals.SPEC_RELATION__TYPE,
					(SpecType) value, index, 0, domain,
					adapterFactory);
		}

		return super.createCreateChildCommand(domain, owner, feature, value,
				index, collection);
	}

}
