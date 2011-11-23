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
package org.eclipse.rmf.pror.presentation.ui;

import org.agilemore.agilegrid.AgileGrid;
import org.agilemore.agilegrid.CellEditor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.rmf.pror.presentation.linewrap.LinewrapFactory;
import org.eclipse.rmf.pror.reqif10.presentation.service.AbstractPresentationService;
import org.eclipse.rmf.pror.reqif10.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.pror.reqif10.presentation.service.PresentationService;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.util.Reqif10Util;

/**
 * A very basic Presentation that handles {@link DatatypeDefinitionString}s and
 * wraps them in the Labels and Editors.
 * 
 * @author jastram
 * 
 */
public class LinewrapPresentationService extends AbstractPresentationService implements PresentationService {

	private final LinewrapCellRenderer linewrapCellRenderer;
	
	public LinewrapPresentationService() {
		linewrapCellRenderer = new LinewrapCellRenderer();
	}
	@Override
	public ProrPresentationConfiguration getConfigurationInstance() {
		return LinewrapFactory.eINSTANCE.createLinewrapConfiguration();
	}


	@Override
	public IProrCellRenderer getCellRenderer(AttributeValue av) {
		return linewrapCellRenderer;
	}

	@Override
	public String getLabel(AttributeValue av) {
		Object value = Reqif10Util.getTheValue(av);
		if (value == null) {
			return "";
		}
		String text = value.toString();
		if (text.indexOf("\n") != -1) {
			text = text.substring(0, text.indexOf("\n"));
		}
		if (text.length() > 15) {
			text = text.substring(0, 13) + "...";
		}
		return text;
	}

	@Override
	public CellEditor getCellEditor(AgileGrid agileGrid,
			EditingDomain editingDomain, AttributeValue av) {
		return new LinewrapCellEditor(agileGrid, editingDomain);
	}

	@Override
	public boolean canEdit() {
		return true;
	}

}
