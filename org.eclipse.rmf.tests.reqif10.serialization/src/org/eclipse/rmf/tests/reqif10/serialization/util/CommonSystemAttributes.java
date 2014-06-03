/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
package org.eclipse.rmf.tests.reqif10.serialization.util;

public interface CommonSystemAttributes {
	// common system attributes
	public final String REQIF_FOREIGN_ID = "ReqIF.ForeignID"; //$NON-NLS-1$
	public final String REQIF_NAME = "ReqIF.Name"; //$NON-NLS-1$
	public final String REQIF_FOREIGN_CREATED_BY = "ReqIF.ForeignCreatedBy"; //$NON-NLS-1$
	public final String REQIF_FOREIGN_CREATED_ON = "ReqIF.ForeignCreatedOn"; //$NON-NLS-1$
	public final String REQIF_FOREIGN_MODIFIED_BY = "ReqIF.ForeignModifiedBy"; //$NON-NLS-1$

	// system attributes
	public final String REQIF_REVISION = "ReqIF.Revision"; //$NON-NLS-1$
	public final String REQIF_CHANGE_DESCRIPTION = "ReqIF.ChangeDescription"; //$NON-NLS-1$
}
