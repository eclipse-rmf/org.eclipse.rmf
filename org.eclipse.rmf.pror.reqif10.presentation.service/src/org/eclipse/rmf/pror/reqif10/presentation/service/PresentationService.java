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
package org.eclipse.rmf.pror.reqif10.presentation.service;

import java.util.Collection;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.swt.dnd.DND;

/**
 * Interface that Presentation-Plugins must implement to provide relevant
 * information to the System. The application will instantiate one
 * PresentationService per Presentation Plugin.
 * <p>
 * 
 * Upon opening a RIF document, {@link #openRIF(RIF)} is called which allows
 * the Presentation to do stuff (e.g. check the model, hook in listeners, etc.).
 * <p>
 * 
 * Each {@link RIF} may contain any number of configuration elements that are
 * typically associated with {@link DatatypeDefinition}s. This class acts as a
 * factory for those through {@link #getConfigurationInstance()}.
 * <p>
 * 
 * Presentations may support Drag & Drop (in both directions). If the system
 * will ask all Presentations to handle drag & drop until it finds one that
 * returns true on {@link #handleDragAndDrop(Collection, Object, EditingDomain)}.
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
 * 
 * @author jastram
 * 
 */
public interface PresentationService {

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
	 * This method is triggered when a new RIF is opened, giving the
	 * Presentation a chance to interact, e.g. by registering adapters, etc.
	 * <p>
	 * 
	 * Please note that this method may be called multiple times, if the
	 * Presentation is associated with multiple {@link DatatypeDefinition}s.
	 * 
	 * TODO still true?
	 * <p>
	 * 
	 * It is highly recommended - for now - to make sure that the rif has at
	 * least one {@link ProRPresentationConfiguration} element, and if it
	 * doesn't, to create one. Currently there is no other way of creating one
	 * (short of editing the XML).
	 */
	public void openReqif(ReqIf rif);

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
	 * Returns an {@link IProrCellRenderer} appropriate for the
	 * {@link DatatypeDefinition} associated with this configuration. May return
	 * null (then the default renderer is used).
	 * 
	 * @return
	 */
	IProrCellRenderer getCellRenderer(AttributeValue av);

	/**
	 * Returns a label for the given AttributeValue.
	 * 
	 * @param av
	 * @return
	 */
	String getLabel(AttributeValue av);

	/**
	 * Returns the {@link CellEditor} appropriate for the
	 * {@link DatatypeDefinition} associated with this configuration. May return
	 * null (then the default renderer is used).
	 * @param av 
	 * 
	 * @return
	 */
	CellEditor getCellEditor(AgileGrid agileGrid, EditingDomain editingDomain, AttributeValue av);

	/**
	 * Whether the managed {@link AttributeDefinition}s may be modified.
	 */
	boolean canEdit();


}
