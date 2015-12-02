/*******************************************************************************
 * Copyright (c) 2015 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ingo Weigelt - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.agilegrid;

import org.eclipse.rmf.reqif10.SpecRelation;

/**
 * Simple wrapper for SpecRelations to pass additional data to the cellRenderer
 * via the contentProvider
 * 
 * Currently there is only one additional data: Whether the SpecRelation is
 * rendered as an incoming or outgoing link.
 * 
 * @author iweigelt
 */
public class WrappedSpecRelation {

	private SpecRelation specRelation;
	private Boolean isSource;

	public WrappedSpecRelation(SpecRelation specRelation, boolean source){
		this.specRelation = specRelation;
		this.isSource = source;
	}
	
	@SuppressWarnings("unused")
	private WrappedSpecRelation(){}

	public SpecRelation getSpecRelation() {
		return specRelation;
	}

	public Boolean isSource() {
		return this.isSource;
	}

	
	

}
