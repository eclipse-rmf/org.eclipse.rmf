/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   itemis AG - initial API and implementation
 */
package org.eclipse.rmf.serialization;

import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.XMLResource;

public interface XMLPersistenceMappingResource extends XMLResource {

	/**
	 * This option allows you to tailor the XML serialization of objects. You should provide an RMFExtendedMetaData as
	 * the value of this option.
	 * 
	 * @see org.eclipse.rmf.serialization.RMFExtendedMetaData
	 */
	public static final String HREF = "_href"; //$NON-NLS-1$
	public static final String OPTION_PROGRESS_MONITOR = "progress monitor"; //$NON-NLS-1$
	public static final String OPTION_NAMEPSACE_TO_PREFIX_MAP = "prefix map"; //$NON-NLS-1$

	public Collection<EPackage> getCreateIdForPackageSet();

}
