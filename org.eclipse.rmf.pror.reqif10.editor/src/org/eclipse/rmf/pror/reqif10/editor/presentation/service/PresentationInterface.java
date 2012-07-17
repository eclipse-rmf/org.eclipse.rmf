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
package org.eclipse.rmf.pror.reqif10.editor.presentation.service;

import java.util.Collection;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.edit.presentation.service.PresentationEditInterface;
import org.eclipse.rmf.reqif10.DatatypeDefinition;
import org.eclipse.rmf.reqif10.ReqIF;

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
 * and {@link PresentationEditorInterface}, which are separated as the reside in
 * two different plugins (the former does not require andy GUI libraries, the
 * later does).
 * 
 * @author jastram
 * 
 */
public interface PresentationInterface extends PresentationEditorInterface,
		PresentationEditInterface {
}
