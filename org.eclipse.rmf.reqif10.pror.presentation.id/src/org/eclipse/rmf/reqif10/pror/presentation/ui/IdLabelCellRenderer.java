/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 *     Kay Münch       - vertical alignment of the spec objects id
 ******************************************************************************/
package org.eclipse.rmf.reqif10.pror.presentation.ui;

import org.eclipse.rmf.reqif10.AttributeDefinitionString;
import org.eclipse.rmf.reqif10.AttributeValue;
import org.eclipse.rmf.reqif10.AttributeValueString;
import org.eclipse.rmf.reqif10.DatatypeDefinitionString;
import org.eclipse.rmf.reqif10.common.util.ReqIF10Util;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.editor.presentation.service.IProrCellRenderer;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdConfiguration;
import org.eclipse.rmf.reqif10.pror.presentation.id.IdVerticalAlign;
import org.eclipse.rmf.reqif10.pror.util.ConfigurationUtil;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;

public class IdLabelCellRenderer implements IProrCellRenderer {

	public IdLabelCellRenderer() {
		
	}

 	public int doDrawCellContent(GC gc, Rectangle rect, Object value) {
 		if (value instanceof AttributeValueString) {
 			Object text = ReqIF10Util.getTheValue((AttributeValue) value);
 			if (text != null) {
 	 			IdVerticalAlign align = getAlignment((AttributeValueString) value);
 				Point extend = gc.textExtent(value.toString());
				int y = rect.y + 1;
				if (IdVerticalAlign.CENTER.equals(align)) {
					y = rect.y + rect.height / 2 - extend.y / 2;
				}
				gc.drawText(text.toString(), rect.x + 1, y);
 				return extend.y + 2;
 			}
 		}

		// Default
		return 16;
	}


	/**
	 * Finds the corresponding configuration element and extracts the alignment
	 * information from it.
	 * 
	 * @return either the configured alignment or the default alignment, never null.
	 */
	private IdVerticalAlign getAlignment(AttributeValueString av) {
		AttributeDefinitionString ad = av.getDefinition();
		if (ad != null) {
			DatatypeDefinitionString dd = ad.getType();
			if (dd != null) {
				ProrPresentationConfiguration config = ConfigurationUtil.getPresentationConfiguration(dd);
				if (config instanceof IdConfiguration) {
					return ((IdConfiguration) config).getVerticalAlign();
				}
			}
		}
		return IdVerticalAlign.CENTER;
	}

	public String doDrawHtmlContent(AttributeValue value) {
		AttributeValueString av = (AttributeValueString) value;
		return av.getTheValue();
	}

}
