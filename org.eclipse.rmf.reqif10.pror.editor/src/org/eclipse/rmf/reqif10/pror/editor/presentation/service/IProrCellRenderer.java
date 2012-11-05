/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.editor.presentation.service;

import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;

/**
 * An Interface for Presentations
 * 
 * @author jastram
 */
public interface IProrCellRenderer {
	
	/**
	 * Draws the value provided and returns the height of the row.
	 * 
	 * @return The height of the row.
	 */
	int doDrawCellContent(GC gc, Rectangle rect, Object value);

	/**
	 * Renders the given value as HTML. Any supporting resources (e.g. images)
	 * can be stored in the provided folder. Note that the system doesn't
	 * prevent naming colisions. We recommend to create a subfolder in the
	 * folder named after the presentation plugin.
	 * 
	 * @return the HTML representing the value.
	 */
	String doDrawHtmlContent(AttributeValue value);

}
