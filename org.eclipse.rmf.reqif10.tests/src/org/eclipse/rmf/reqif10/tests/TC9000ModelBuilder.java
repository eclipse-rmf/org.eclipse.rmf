/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Bršrkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.tests;

import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.rmf.reqif10.SpecObject;

public class TC9000ModelBuilder extends TC1000ModelBuilder {

	final int numberOfSpecObjects;
	
	public TC9000ModelBuilder(Date lastChangeDate, String identifier, String longName, int numberOfSpecObjects) {
		super (lastChangeDate, identifier, longName);
		this.numberOfSpecObjects = numberOfSpecObjects;
	}
	

	@Override
	public void createSpecObjects() throws DatatypeConfigurationException {
		for (int i=0 ; i<numberOfSpecObjects ; i++) {
			
		SpecObject specObject = createTC1000SpecObject("ID_TC1000_SpecObject"+i, getLastChangeDate(), true, false,new BigInteger("5000"), "Plain", 1234.5, getLastChangeDate(), enumValueYellow );
				
		getReqIF().getCoreContent().getSpecObjects().add(specObject);
		}
	}

	@Override
	public void createSpecRelations() {
		// TODO Auto-generated method stub
		super.createSpecRelations();
	}



}
