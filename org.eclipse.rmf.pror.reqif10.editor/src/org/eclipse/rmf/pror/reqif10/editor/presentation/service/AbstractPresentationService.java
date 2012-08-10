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

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.AttributeValue;

/**
 * This abstract class is provided to make life for Presentation creators
 * easier. Just subclass it and modify where you see fit.
 * 
 * @author jastram
 * 
 */
public abstract class AbstractPresentationService extends AdapterImpl implements PresentationInterface {

	private Class<? extends ProrPresentationConfiguration> configInterface;
	
	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface() {
		if (configInterface == null) {
			configInterface = getConfigurationInstance().getClass();
		}
		return configInterface;
	}

	/* Override, as indicated by the interface's Javadoc */
	public abstract ProrPresentationConfiguration getConfigurationInstance();

	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		return null;
	}

	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		return null;
	}

	public String getLabel(AttributeValue av) {
		return null;
	}

	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AttributeValue attrValue, Object affectedObject) {
		return null;
	}

	public boolean canEdit() {
		return false;
	}

}
