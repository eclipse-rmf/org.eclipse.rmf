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

package org.eclipse.rmf.rif12.xsd.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.rmf.rif12.xsd.util.RifResourceFactoryImpl
 * @generated
 */
public class RifResourceImpl extends XMLResourceImpl {
	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated
	 */
	public RifResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected XMLLoad createXMLLoad() {
		return new RifXMLLoad(createXMLHelper());
	}

	@Override
	protected XMLSave createXMLSave() {
		return new RifXMLSave(createXMLHelper());
	}

	@Override
	protected XMLHelper createXMLHelper() {
		return new XMLHelperImpl(this) {
			@Override
			protected String getPrefix(EPackage ePackage, boolean mustHavePrefix) {
				if (ePackage instanceof RifPackage)
					return "";
				else
					return super.getPrefix(ePackage, mustHavePrefix);
			}

			@Override
			public String getURI(String prefix) {
				if (prefix != null && prefix.length() == 0)
					return RifPackage.eNS_URI;
				else
					return super.getURI(prefix);
			}
		};
	}

} // RifResourceImpl
