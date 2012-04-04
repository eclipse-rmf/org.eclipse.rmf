/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 */
package org.eclipse.rmf.serialization;

import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.rmf.internal.serialization.ReqIFXMLHelperImpl;
import org.eclipse.rmf.internal.serialization.ReqIFXMLLoadImpl;
import org.eclipse.rmf.internal.serialization.ReqIFXMLSaveImpl;

/**
 * Utility class to instantiate classes that specialize the serialization process.
 */
public class ResourceHelperFactory {

	/**
	 * Returns an XMLLoadImpl which can handle Autosar resources.
	 * 
	 * @param resource
	 *            The resource to handle, to which a helper will be associated.
	 * @return A AutosarXMLLoadImpl.
	 */
	public static XMLLoad createXMLLoad(XMLResource resource) {
		return new ReqIFXMLLoadImpl(createXMLHelper(resource));
	}

	/**
	 * Creates a new XMLSaveImpl which can handle Autosar resources.
	 * 
	 * @param resource
	 *            The resource to handle.
	 * @return A AutosarXMLSaveImpl.
	 */
	public static XMLSave createXMLSave(XMLResource resource) {
		return new ReqIFXMLSaveImpl(createXMLHelper(resource));
	}

	/**
	 * Creates an XMLHelper associated with given resource.
	 * 
	 * @param resource
	 *            The resource the XMLHelper acts on.
	 * @return A SpecializedXMLHelper instance.
	 */
	public static XMLHelper createXMLHelper(XMLResource resource) {
		return new ReqIFXMLHelperImpl(resource);
	}
}
