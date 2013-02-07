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
package org.eclipse.rmf.reqif10.pror.edit.presentation.service;

import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.util.PresentationEditInterface;

/**
 * Interface that Presentation-Plugins must implement to provide relevant
 * information to the System.
 * <p>
 * 
 * The JavaDoc provides examples on how to implement the few methods of this
 * interface.
 * <p>
 * 
 * The bulk of the presentation information is accessed via
 * {@link PresentationEditInterface}, which should be implemented by the
 * {@link ItemProvider} of the {@link ProrPresentationConfiguration} element.
 * <p>
 * 
 * <b>IMPORTANT:</b> The ItemProvider must be generated as "Stateful". This will
 * result in one provider instance per configuration element.
 * <p>
 * 
 * Optionally, the ItemProvider may implment PresentationEditorInterface (in the
 * editor plugin), allowing the Presentation to provide GUI functionality.
 * <p>
 * 
 * @author jastram
 */
public interface PresentationInterface {

	/**
	 * Returns a new instance of the {@link ProRPresentationConfiguration}. This
	 * can be implemented simply by using the EMF-Factory as follows:
	 * 
	 * <pre>
	 * return ####Factory.eINSTANCE.create####Configuration();
	 * </pre>
	 * 
	 * Substitute the proper names in Factory and method.
	 */
	public ProrPresentationConfiguration getConfigurationInstance();

	/**
	 * Returns the {@link Class} for the subclass of
	 * {@link ProRPresentationConfiguration} that is used to configure this
	 * Presentation.
	 * <p>
	 * 
	 * This can simply be implemented as:
	 * 
	 * <pre>
	 * return IdConfiguration.class;
	 * </pre>
	 */
	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface();

}
