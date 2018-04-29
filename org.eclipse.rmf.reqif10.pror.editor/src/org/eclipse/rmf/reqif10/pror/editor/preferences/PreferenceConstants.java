/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
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
 * @author Ingo Weigelt
 */
public final class PreferenceConstants {

	public static final String P_STOP_IS_SIMPLIFIED_WARNING = "stop_is_simplified_warning";
	
	public static final String P_VALIDATE_ON_SAVE = "validate_on_save";

	public static final String P_NEW_ID_ON_SAVE = "new_id_on_save";

	public static final String P_TOOL_EXTENSIONS_IN_FILE = "tool_extensions_in_file";

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

	// Constants for SpecificationWebPrintAction
	public static final String P_WEB_EXPORT_INLUDE_OUTGOING_SPEC_RELATIONS = "p_web_export_print_outgoing_links";
	public static final String P_WEB_EXPORT_INLUDE_INCOMING_SPEC_RELATIONS = "p_web_export_print_incoming_inks";
	public static final String P_WEB_EXPORT_ALWAYS_ASK_FOR_SPEC_RELATIONS = "p_web_export_always_ask_for_if_links_should_be_printed";

}
