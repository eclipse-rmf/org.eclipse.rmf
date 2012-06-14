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
import java.util.HashMap;
import java.util.Map;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.ReqIF;

public abstract class AbstractPresentationService extends AdapterImpl implements PresentationService {

	// This map contains all open ReqIF models and the corresponding editing
	// domain. This map is needed for updating changed keywords.
	protected final Map<ReqIF, EditingDomain> openReqIfModels = new HashMap<ReqIF, EditingDomain>();

	public Class<? extends ProrPresentationConfiguration> getConfigurationInterface() {
		return getConfigurationInstance().getClass();
	}

	public abstract ProrPresentationConfiguration getConfigurationInstance();

	public void openReqif(ReqIF reqif, EditingDomain domain) {
		openReqIfModels.put(reqif, domain);
	}

	public void closeReqif(ReqIF reqif, EditingDomain domain) {
		openReqIfModels.remove(reqif);
	}

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
