/**
 * <copyright>
 *
 * Copyright (c) 2008-2014 itemis and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     itemis - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.rmf.internal.reqif10.ide;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryRegistryImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.sphinx.emf.workspace.domain.factory.ExtendedWorkspaceEditingDomainFactory;


/**
 * Customized {@link ExtendedWorkspaceEditingDomainFactory editing domain factory} implementation for UML2.
 * <p>
 * Adds an entry to the extension to factory map of the {@link ResourceFactoryRegistryImpl resource factory registry} on
 * the {@link TransactionalEditingDomain editing domain}'s underlying {@link ResourceSet resource set} making sure that
 * the {@link ExtendedReqIFResourceFactoryImpl extended UML2 resource factory} provided by Sphinx will be used to create
 * {@link Resource resource}s for *.uml files.
 * </p>
 * <p>
 * This would normally be done by contributing the {@link ExtendedReqIFResourceFactoryImpl} to the
 * <code>org.eclipse.emf.ecore.extension_parser</code> extension point. However, in the present case, the Eclipse UML2
 * project contributes already the standard {@link UMLResourceFactoryImpl} for *.uml files to the very same extension
 * point. In order to avoid conflicting contributions of multiple {@link ResourceFactoryImpl resource factory}
 * implementations for the same file extension, we have to go this way and leverage the fact that the
 * {@link ResourceSetImpl resource set}'s own {@link ResourceFactoryRegistryImpl resource factory registry} takes always
 * precedence over the static {@link Resource.Factory.Registry#INSTANCE} where all contributed
 * {@link ResourceFactoryImpl resource factory} implementations end up.
 * </p>
 */
@SuppressWarnings("restriction")
public class ReqIFWorkspaceEditingDomainFactory extends ExtendedWorkspaceEditingDomainFactory {

	@Override
	protected ResourceSet createResourceSet() {
		ResourceSet resourceSet = super.createResourceSet();

		// Register extended UML resource factory for all *.uml files that are loaded by Sphinx
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("reqif", new ExtendedReqIFResourceFactoryImpl());

		return resourceSet;
	}
}
