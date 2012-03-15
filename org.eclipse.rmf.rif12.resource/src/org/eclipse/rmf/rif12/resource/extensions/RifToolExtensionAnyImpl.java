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
package org.eclipse.rmf.rif12.resource.extensions;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.rmf.rif12.ExchangeFile.impl.RIFToolExtensionImpl;


public class RifToolExtensionAnyImpl extends RIFToolExtensionImpl implements RifToolExtensionAny  {
	
	private AnyType anyType ;
	
	public RifToolExtensionAnyImpl() {
		super();
		anyType = XMLTypeFactory.eINSTANCE.createAnyType();
	}

	public FeatureMap getMixed() {
		return anyType.getMixed();
	}

	public FeatureMap getAny() {
		return anyType.getAny();
	}

	public FeatureMap getAnyAttribute() {
		return anyType.getAnyAttribute();
	}

}
