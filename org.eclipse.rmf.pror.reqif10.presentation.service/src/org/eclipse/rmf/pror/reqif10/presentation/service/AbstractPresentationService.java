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
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIf;

public abstract class AbstractPresentationService extends AdapterImpl implements PresentationService {

	@Override
	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface() {
		return getConfigurationInstance().getClass();
	}

	@Override
	public abstract ProrPresentationConfiguration getConfigurationInstance();

	@Override
	public void openReqif(ReqIf rif) {
	}

	@Override
	public Command handleDragAndDrop(Collection<?> source, Object target,
			EditingDomain editingDomain, int operation) {
		return null;
	}

	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		return null;
	}

	@Override
	public String getLabel(AttributeValue av) {
		return null;
	}

	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AttributeValue attrValue) {
		return null;
	}

	@Override
	public boolean canEdit() {
		return false;
	}

}
