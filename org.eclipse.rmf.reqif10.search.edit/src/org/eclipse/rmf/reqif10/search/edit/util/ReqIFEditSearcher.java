/*******************************************************************************
 * Copyright (c) 2014 Hussein Mhanna
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Hussein Mhanna - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.search.edit.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.search.criteria.Criteria;
import org.eclipse.rmf.reqif10.search.util.ReqIFSearcher;

/**
 * @author Hussein MHANNA
 *
 */
public class ReqIFEditSearcher extends ReqIFSearcher {
	/**
	 * The compound command
	 */
	private CompoundCommand compoundCommand;
	/**
	 * The editing domain
	 */
	private EditingDomain editingDomain;

	/**
	 * The constructor
	 * 
	 * @param editingDomain
	 *            : The editing domain
	 */
	public ReqIFEditSearcher() {
		super();
	}

	public static Map<Resource, Collection<EObject>> find(
			IProgressMonitor monitor, Collection<Resource> resources,
			Collection<Criteria> criterias, boolean replace) {
		ReqIFSearcher searcher = new ReqIFSearcher();
		return searcher.search(monitor, resources, criterias, replace);
	}

	@Override
	protected Collection<EObject> search(IProgressMonitor monitor,
			Resource resource, Collection<Criteria> criterias, boolean replace) {
		Collection<EObject> result = null;
		editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(resource.getContents().get(0));
		if (replace) {
			compoundCommand = new CompoundCommand();
			result = super.search(monitor, resource, criterias, replace);
			executeCommand(editingDomain, compoundCommand);
			compoundCommand = null;
			editingDomain = null;
		} else {
			result = super.search(monitor, resource, criterias, replace);
		}
		return result;
	}

	protected void executeCommand(EditingDomain editingDomain, Command command) {
		if (editingDomain != null) {
			editingDomain.getCommandStack().execute(command);
		}
	}

	@Override
	protected void doSetValue(EObject eObject, EStructuralFeature feature,
			Object value) {
		if (editingDomain != null) {
			Command command = SetCommand.create(editingDomain, eObject,
					feature, value);
			compoundCommand.append(command);
		} else {
			super.doSetValue(eObject, feature, value);
		}
	}

}
