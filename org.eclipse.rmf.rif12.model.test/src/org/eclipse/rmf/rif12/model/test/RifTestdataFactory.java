/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.rif12.model.test;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.rif12.ExchangeFile.RIF;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;
import org.junit.Test;


public class RifTestdataFactory extends Rif12ResourceTestBase{

	@Test
	public void testSpecObject() {

		String filename1 = "testdata/performance/source.rif";
		String filename2 = "testdata/performance/largefile_32mb.rif";
		Resource rifResource = loadRif(filename1);
		
		EList<SpecObject> specObjects = ((RIF)rifResource.getContents().get(0)).getCoreContent().getSpecObjects();
		SpecObject sourceSpecObject = specObjects.get(0);
		
		
		for (int i = 0; i < 1710 ; i ++){
			SpecObject copiedSpecObject = EcoreUtil.copy(sourceSpecObject);
			copiedSpecObject.setIdentifier(EcoreUtil.generateUUID());
			specObjects.add(copiedSpecObject);
		}
		saveRif(rifResource, filename2);

	}

}
