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

package org.eclipse.rmf.rif12.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.rmf.rif12.ExchangeFile.util.ExchangeFileResourceFactoryImpl;


/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.omg.spec.reqIf.util.ReqIfResourceImpl
 * @generated
 */
public class Rif12ResourceFactoryImpl extends ExchangeFileResourceFactoryImpl {
	/**
	 * Creates an instance of the resource factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rif12ResourceFactoryImpl() {
		super();
	}

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource(URI uri) {
		Resource result = new Rif12ResourceImpl(uri);
		return result;
	}

} //ReqIfResourceFactoryImpl
