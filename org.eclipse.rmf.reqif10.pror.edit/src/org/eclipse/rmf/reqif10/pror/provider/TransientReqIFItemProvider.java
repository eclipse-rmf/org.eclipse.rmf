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
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.DragAndDropFeedback;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.rmf.reqif10.Identifiable;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;

/**
 * Taken from the EMF-Book. This is the basis for a virtual node object for
 * structuring the Outline.
 * 
 * @author jastram
 * 
 */
public abstract class TransientReqIFItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {

	public TransientReqIFItemProvider(AdapterFactory adapterFactory,
			ReqIFContent reqifContent) {
		super(adapterFactory);
		reqifContent.eAdapters().add(this);
	}

	@Override
	public Collection<?> getChildren(Object object) {
		
		return target != null ? super.getChildren(target) : Collections.EMPTY_LIST;
	}

	@Override
	public Object getParent(Object object) {
		return target;
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object,
			EditingDomain editingDomain, Object sibling) {
		return super.getNewChildDescriptors(target, editingDomain, sibling);
	}

	@Override
	public Command createCommand(Object object, EditingDomain domain,
			Class<? extends Command> commandClass,
			CommandParameter commandParameter) {
		commandParameter.setOwner(target);
		return super.createCommand(target, domain, commandClass, commandParameter);
	}
	
	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection) {
		return createWrappedCommand(
				super.createRemoveCommand(domain, owner, feature, collection),
				owner);
	}

	/**
	 * Modified to ensure that we don't end up with duplicate IDs.
	 */
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Collection<?> collection, int index) {
		
		// Ensure that the ID is unique if it's a copy operation.
		for (Object object : collection) {
			if (object instanceof Identifiable)
				ReqIF10Util.ensureIdIsUnique(owner.eResource(),
						(Identifiable) object);
		}

		return createWrappedCommand(super.createAddCommand(domain, owner,
				feature, collection, index), owner);
	}
	
	@Override
	protected Command createDragAndDropCommand(EditingDomain domain,
			Object owner, float location, int operations, int operation,
			Collection<?> collection) {
		
		if (operations == DragAndDropFeedback.DROP_COPY && owner instanceof EObject) {
			// We must create a copy, as the collection is not detached from the model yet.
			collection = EcoreUtil.copyAll(collection);
			for (Object object : collection) {
				if (object instanceof Identifiable)
					ReqIF10Util.ensureIdIsUnique(((EObject)owner).eResource(),
							(Identifiable) object);
			}			
		}

		return super.createDragAndDropCommand(domain, owner, location, operations,
				operation, collection);
	}

	protected Command createWrappedCommand(Command command, final EObject owner) {
		return new CommandWrapper(command) {
			@Override
			public Collection<?> getAffectedObjects() {
				Collection<?> affected = super.getAffectedObjects();
				if (affected.contains(owner)) {
					affected = Collections
							.singleton(TransientReqIFItemProvider.this);
				}
				return affected;
			}
		};
	}

	@Override
	public ResourceLocator getResourceLocator() {
		return Reqif10EditPlugin.INSTANCE;
	}

	/**
	 * Missing from the book. Without this, the GUI won't refresh upon adding or
	 * removing children.
	 */
	@Override
	public void notifyChanged(Notification msg) {
		fireNotifyChanged(new ViewerNotification(msg));
	}

}
