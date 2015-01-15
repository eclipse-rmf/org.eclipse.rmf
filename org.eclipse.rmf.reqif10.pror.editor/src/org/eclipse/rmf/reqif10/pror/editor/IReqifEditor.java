/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.ui.IEditorPart;

/**
 * This interface must be implemented by all editors for ReqIF files.
 * 
 * @author jastram
 */
public interface IReqifEditor extends IEditorPart, IEditingDomainProvider, ISelectionProvider {

	public ReqIF getReqif();
	
	public AdapterFactory getAdapterFactory();
	
	public EditingDomainActionBarContributor getActionBarContributor();
}
