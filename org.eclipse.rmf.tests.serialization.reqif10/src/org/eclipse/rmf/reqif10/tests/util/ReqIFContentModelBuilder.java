/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests.util;

import org.eclipse.rmf.reqif10.ReqIF10Factory;
import org.eclipse.rmf.reqif10.ReqIFContent;

public class ReqIFContentModelBuilder extends MinimalModelBuilder {

	public ReqIFContentModelBuilder() throws Exception {
		super();
	}

	@Override
	public final void createReqIFContent() throws Exception {
		ReqIFContent reqIFContent = ReqIF10Factory.eINSTANCE.createReqIFContent();
		getReqIF().setCoreContent(reqIFContent);

		// create types
		createDatatypes();
		createSpecObjectTypes();
		createSpecificationTypes();
		createSpecRelationTypes();
		createRelationGroupTypes();

		// create objects
		createSpecObjects();
		createSpecifications();
		createSpecRelations();
		createRelationGroups();

		// unset if empty
	}

	public void createDatatypes() throws Exception {
	}

	public void createSpecObjectTypes() throws Exception {
	}

	public void createSpecificationTypes() throws Exception {
	}

	public void createRelationGroups() throws Exception {
	}

	public void createRelationGroupTypes() throws Exception {
	}

	public void createSpecifications() throws Exception {
	}

	public void createSpecObjects() throws Exception {
	}

	public void createSpecRelations() throws Exception {
	}

	public void createSpecRelationTypes() throws Exception {
	}

}
