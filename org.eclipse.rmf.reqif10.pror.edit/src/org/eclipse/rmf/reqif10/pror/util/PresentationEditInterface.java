/*******************************************************************************
 * Copyright (c) 2012 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.util;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;

/**
 * Interface that Presentation-Plugins must implement to provide relevant
 * information to the System. The application will instantiate exactly one
 * PresentationService per Presentation Plugin.
 * <p>
 * 
 * For your convenience, you can extend {@link AbstractPresentationService},
 * which provides default implementations for most methods.
 * <p>
 * 
 * Upon opening a ReqIF document, {@link #openReqif(ReqIF)} is called which
 * allows the Presentation to do stuff (e.g. check the model, hook in listeners,
 * etc.).
 * <p>
 * 
 * Each {@link ReqIF} may contain any number of configuration elements that are
 * typically associated with {@link DatatypeDefinition}s. This class acts as a
 * factory for those through {@link #getConfigurationInstance()}.
 * <p>
 * 
 * Presentations may support Drag & Drop (into the ReqIF Model). The system will
 * ask all Presentations to handle drag & drop until it finds one that returns
 * true on {@link #handleDragAndDrop(Collection, Object, EditingDomain)}.
 * <p>
 * 
 * The service provides some stateless information about the Presentation,
 * specifically:
 * <ul>
 * <li> {@link #getConfigurationInterface()} returns the Interface for the class
 * that holds the configuration of this Presentation.
 * <li> {@link #isReadOnly()} indicates whether the control for rendering should
 * allow editing as well.
 * </ul>
 * <p>
 * 
 * Note that this interface simply aggregates {@link PresentationEditInterface}
 * and {@link PresentationEditInterface}, which are separated as the reside in
 * two different plugins (the former does not require andy GUI libraries, the
 * later does).
 * 
 * @author jastram
 * 
 */
public interface PresentationEditInterface {

	/**
	 * Will be called when the system can't handle a drag and drop operation by
	 * default. Typically, source contains or target is a {@link SpecHierarchy}.
	 * <p>
	 * 
	 * Most presentations will return null here, unless they integrate with
	 * another data model (e.g. Rodin-ProR-Integration).
	 * <p>
	 * 
	 * @param source
	 *            The drag source
	 * @param target
	 *            The drop target
	 * @param editingDomain
	 *            The {@link EditingDomain}, to manipulate the model
	 * @param operation
	 *            The relevant {@link DND} operation
	 * @return the Command that will perform the drop operation if this
	 *         Presentation will handle the request, otherwise null.
	 */
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation);

	/**
	 * Returns a label for the given AttributeValue.
	 * 
	 * @param av
	 * @return
	 */
	String getLabel(AttributeValue av);

	/**
	 * Whether the managed {@link AttributeDefinition}s may be modified.
	 */
	boolean canEdit();

	/**
	 * This method is triggered when a this configuration element is added to a
	 * {@link ReqIF} model, either because it is created and added, or because
	 * the {@link ReqIF} was opened. This gives the Presentation a chance to
	 * interact, e.g. by registering adapters, etc.
	 */
	void registerPresentationConfiguration(
			ProrPresentationConfiguration config, EditingDomain editingDomain);

	/**
	 * This method is triggered when a this configuration element is removed
	 * from a {@link ReqIF} model, either because it is got removed, or because
	 * the {@link ReqIF} was closed. This gives the Presentation a chance to
	 * interact, e.g. by unregistering adapters, etc.
	 */
	void unregisterPresentationConfiguration(
			ProrPresentationConfiguration config);

}
