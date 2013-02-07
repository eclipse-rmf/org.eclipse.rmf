/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Lukas Ladenberger - initial API and implementation
 *     Michael Jastram - addition for default presentation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.preferences;

import org.eclipse.rmf.reqif10.DatatypeDefinitionBoolean;
import org.eclipse.rmf.reqif10.DatatypeDefinitionDate;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionInteger;
import org.eclipse.rmf.reqif10.DatatypeDefinitionReal;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionXHTML;

/**
 * @author Lukas Ladenberger
 * @author Michael Jastram
 */
public final class PreferenceConstants {

	public static final String P_STOP_IS_SIMPLIFIED_WARNING = "stop_is_simplified_warning";
	
	// Constants for default presentations
	public static final String P_DEFAULT_PRESENTATION_BUILD_IN = "default_presentation_build_in";
	public static final String P_DEFAULT_PRESENTATION_STRING = DatatypeDefinitionString.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_XHTML = DatatypeDefinitionXHTML.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_BOOLEAN = DatatypeDefinitionBoolean.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_DATE = DatatypeDefinitionDate.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_ENUMERATION = DatatypeDefinitionEnumeration.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_INTEGER = DatatypeDefinitionInteger.class
			.getSimpleName();
	public static final String P_DEFAULT_PRESENTATION_REAL = DatatypeDefinitionReal.class
			.getSimpleName();
}
